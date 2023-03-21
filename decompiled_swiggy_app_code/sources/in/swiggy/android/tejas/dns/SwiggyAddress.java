package in.swiggy.android.tejas.dns;

import com.xiaomi.mipush.sdk.Constants;
import in.swiggy.android.commons.exceptions.SwiggyUnknownHostException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.AAAARecord;
import org.xbill.DNS.ARecord;
import org.xbill.DNS.Address;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.PTRRecord;
import org.xbill.DNS.Record;
import org.xbill.DNS.ReverseMap;
import org.xbill.DNS.TextParseException;

public final class SwiggyAddress {
    private static final int IPv4 = 1;
    private static final int IPv6 = 2;

    private SwiggyAddress() {
    }

    private static InetAddress addrFromRecord(String str, Record record) throws UnknownHostException {
        InetAddress inetAddress;
        if (record instanceof ARecord) {
            inetAddress = ((ARecord) record).getAddress();
        } else {
            inetAddress = ((AAAARecord) record).getAddress();
        }
        return InetAddress.getByAddress(str, inetAddress.getAddress());
    }

    public static int addressLength(int i11) {
        if (i11 == 1) {
            return 4;
        }
        if (i11 == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int familyOf(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static InetAddress[] getAllByName(String str) throws UnknownHostException {
        try {
            return new InetAddress[]{getByAddress(str)};
        } catch (UnknownHostException unused) {
            Record[] lookupHostName = lookupHostName(str, true);
            InetAddress[] inetAddressArr = new InetAddress[lookupHostName.length];
            for (int i11 = 0; i11 < lookupHostName.length; i11++) {
                inetAddressArr[i11] = addrFromRecord(str, lookupHostName[i11]);
            }
            return inetAddressArr;
        }
    }

    public static InetAddress getByAddress(String str) throws UnknownHostException {
        byte[] byteArray = toByteArray(str, 1);
        if (byteArray != null) {
            return InetAddress.getByAddress(str, byteArray);
        }
        byte[] byteArray2 = toByteArray(str, 2);
        if (byteArray2 != null) {
            return InetAddress.getByAddress(str, byteArray2);
        }
        throw new UnknownHostException("Invalid address: " + str);
    }

    public static InetAddress getByName(String str) throws UnknownHostException {
        try {
            return getByAddress(str);
        } catch (UnknownHostException unused) {
            return addrFromRecord(str, lookupHostName(str, false)[0]);
        }
    }

    public static String getHostName(InetAddress inetAddress) throws UnknownHostException {
        Record[] run = new Lookup(ReverseMap.fromAddress(inetAddress), 12).run();
        if (run != null) {
            return ((PTRRecord) run[0]).getTarget().toString();
        }
        throw new UnknownHostException("unknown address");
    }

    public static boolean isDottedQuad(String str) {
        return Address.toByteArray(str, 1) != null;
    }

    private static Record[] lookupHostName(String str, boolean z11) throws UnknownHostException {
        Record[] run;
        Record[] run2;
        try {
            Lookup lookup = new Lookup(str, 1);
            Record[] run3 = lookup.run();
            if (run3 == null) {
                if (lookup.getResult() == 4 && (run2 = new Lookup(str, 28).run()) != null) {
                    return run2;
                }
                throw new SwiggyUnknownHostException(lookup.getResult());
            } else if (!z11 || (run = new Lookup(str, 28).run()) == null) {
                return run3;
            } else {
                Record[] recordArr = new Record[(run3.length + run.length)];
                System.arraycopy(run3, 0, recordArr, 0, run3.length);
                System.arraycopy(run, 0, recordArr, run3.length, run.length);
                return recordArr;
            }
        } catch (TextParseException unused) {
            throw new UnknownHostException("invalid name");
        }
    }

    private static byte[] parseV4(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char charAt = str.charAt(i14);
            if (charAt < '0' || charAt > '9') {
                if (charAt != '.' || i11 == 3 || i12 == 0) {
                    return null;
                }
                bArr[i11] = (byte) i13;
                i11++;
                i12 = 0;
                i13 = 0;
            } else if (i12 == 3) {
                return null;
            } else {
                if (i12 > 0 && i13 == 0) {
                    return null;
                }
                i12++;
                i13 = (i13 * 10) + (charAt - '0');
                if (i13 > 255) {
                    return null;
                }
            }
        }
        if (i11 != 3 || i12 == 0) {
            return null;
        }
        bArr[i11] = (byte) i13;
        return bArr;
    }

    private static byte[] parseV6(String str) {
        int i11;
        byte[] byteArray;
        byte[] bArr = new byte[16];
        int i12 = -1;
        String[] split = str.split(Constants.COLON_SEPARATOR, -1);
        int length = split.length - 1;
        if (split[0].length() != 0) {
            i11 = 0;
        } else if (length + 0 <= 0 || split[1].length() != 0) {
            return null;
        } else {
            i11 = 1;
        }
        if (split[length].length() == 0) {
            if (length - i11 <= 0 || split[length - 1].length() != 0) {
                return null;
            }
            length--;
        }
        if ((length - i11) + 1 > 8) {
            return null;
        }
        int i13 = 0;
        while (true) {
            if (i11 > length) {
                break;
            }
            if (split[i11].length() == 0) {
                if (i12 >= 0) {
                    return null;
                }
                i12 = i13;
            } else if (split[i11].indexOf(46) < 0) {
                int i14 = 0;
                while (i14 < split[i11].length()) {
                    try {
                        if (Character.digit(split[i11].charAt(i14), 16) < 0) {
                            return null;
                        }
                        i14++;
                    } catch (NumberFormatException unused) {
                    }
                }
                int parseInt = Integer.parseInt(split[i11], 16);
                if (parseInt > 65535) {
                    break;
                } else if (parseInt < 0) {
                    break;
                } else {
                    int i15 = i13 + 1;
                    bArr[i13] = (byte) (parseInt >>> 8);
                    i13 = i15 + 1;
                    bArr[i15] = (byte) (parseInt & 255);
                }
            } else if (i11 < length || i11 > 6 || (byteArray = Address.toByteArray(split[i11], 1)) == null) {
                return null;
            } else {
                int i16 = 0;
                while (i16 < 4) {
                    bArr[i13] = byteArray[i16];
                    i16++;
                    i13++;
                }
            }
            i11++;
        }
        if (i13 < 16 && i12 < 0) {
            return null;
        }
        if (i12 >= 0) {
            int i17 = (16 - i13) + i12;
            System.arraycopy(bArr, i12, bArr, i17, i13 - i12);
            while (i12 < i17) {
                bArr[i12] = 0;
                i12++;
            }
        }
        return bArr;
        return null;
    }

    private static int[] toArray(String str, int i11) {
        byte[] byteArray = toByteArray(str, i11);
        if (byteArray == null) {
            return null;
        }
        int[] iArr = new int[byteArray.length];
        for (int i12 = 0; i12 < byteArray.length; i12++) {
            iArr[i12] = byteArray[i12] & 255;
        }
        return iArr;
    }

    public static byte[] toByteArray(String str, int i11) {
        if (i11 == 1) {
            return parseV4(str);
        }
        if (i11 == 2) {
            return parseV6(str);
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String toDottedQuad(byte[] bArr) {
        return (bArr[0] & 255) + "." + (bArr[1] & 255) + "." + (bArr[2] & 255) + "." + (bArr[3] & 255);
    }

    public static InetAddress truncate(InetAddress inetAddress, int i11) {
        int i12;
        int addressLength = addressLength(familyOf(inetAddress)) * 8;
        if (i11 < 0 || i11 > addressLength) {
            throw new IllegalArgumentException("invalid mask length");
        } else if (i11 == addressLength) {
            return inetAddress;
        } else {
            byte[] address = inetAddress.getAddress();
            int i13 = i11 / 8;
            int i14 = i13 + 1;
            while (true) {
                if (i14 >= address.length) {
                    break;
                }
                address[i14] = 0;
                i14++;
            }
            byte b11 = 0;
            for (i12 = 0; i12 < i11 % 8; i12++) {
                b11 |= 1 << (7 - i12);
            }
            address[i13] = (byte) (address[i13] & b11);
            try {
                return InetAddress.getByAddress(address);
            } catch (UnknownHostException unused) {
                throw new IllegalArgumentException("invalid address");
            }
        }
    }

    public static String toDottedQuad(int[] iArr) {
        return iArr[0] + "." + iArr[1] + "." + iArr[2] + "." + iArr[3];
    }

    public static int[] toArray(String str) {
        return toArray(str, 1);
    }

    public static InetAddress getByAddress(String str, int i11) throws UnknownHostException {
        if (i11 == 1 || i11 == 2) {
            byte[] byteArray = toByteArray(str, i11);
            if (byteArray != null) {
                return InetAddress.getByAddress(str, byteArray);
            }
            throw new UnknownHostException("Invalid address: " + str);
        }
        throw new IllegalArgumentException("unknown address family");
    }
}
