package e7;

import in.swiggy.android.tejas.network.HttpRequest;
import java.io.UnsupportedEncodingException;
import org.apache.fontbox.ttf.GlyfDescript;

public class d {
    public static a a(a aVar) {
        if (!HttpRequest.CHARSET_UTF8.equals(aVar.g())) {
            return aVar;
        }
        byte[] bArr = new byte[8];
        a aVar2 = new a((aVar.h() * 4) / 3);
        int i11 = 0;
        char c11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < aVar.h()) {
            int d11 = aVar.d(i11);
            if (c11 == 11) {
                if (i12 <= 0 || (d11 & 192) != 128) {
                    aVar2.b(b(bArr[0]));
                    i11 -= i13;
                } else {
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) d11;
                    i12--;
                    if (i12 == 0) {
                        aVar2.c(bArr, 0, i14);
                    } else {
                        i13 = i14;
                    }
                }
                c11 = 0;
                i13 = 0;
            } else if (d11 < 127) {
                aVar2.a((byte) d11);
            } else if (d11 >= 192) {
                int i15 = d11;
                i12 = -1;
                while (i12 < 8 && (i15 & 128) == 128) {
                    i12++;
                    i15 <<= 1;
                }
                bArr[i13] = (byte) d11;
                i13++;
                c11 = 11;
            } else {
                aVar2.b(b((byte) d11));
            }
            i11++;
        }
        if (c11 == 11) {
            for (int i16 = 0; i16 < i13; i16++) {
                aVar2.b(b(bArr[i16]));
            }
        }
        return aVar2;
    }

    private static byte[] b(byte b11) {
        byte b12 = b11 & 255;
        if (b12 >= 128) {
            if (b12 == 129 || b12 == 141 || b12 == 143 || b12 == 144 || b12 == 157) {
                return new byte[]{GlyfDescript.Y_DUAL};
            }
            try {
                return new String(new byte[]{b11}, "cp1252").getBytes(HttpRequest.CHARSET_UTF8);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b11};
    }
}
