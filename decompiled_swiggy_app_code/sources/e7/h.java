package e7;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static boolean[] f14398a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean[] f14399b;

    static {
        b();
    }

    static boolean a(String str) {
        if (str == null) {
            return false;
        }
        int i11 = 0;
        boolean z11 = true;
        int i12 = 0;
        while (i11 < str.length()) {
            if (str.charAt(i11) == '-') {
                i12++;
                z11 = z11 && (i11 == 8 || i11 == 13 || i11 == 18 || i11 == 23);
            }
            i11++;
        }
        return z11 && 4 == i12 && 36 == i11;
    }

    private static void b() {
        f14399b = new boolean[256];
        f14398a = new boolean[256];
        char c11 = 0;
        while (true) {
            boolean[] zArr = f14399b;
            if (c11 < zArr.length) {
                boolean[] zArr2 = f14398a;
                boolean z11 = true;
                zArr2[c11] = c11 == ':' || ('A' <= c11 && c11 <= 'Z') || c11 == '_' || (('a' <= c11 && c11 <= 'z') || ((192 <= c11 && c11 <= 214) || ((216 <= c11 && c11 <= 246) || (248 <= c11 && c11 <= 255))));
                if (!zArr2[c11] && c11 != '-' && c11 != '.' && (('0' > c11 || c11 > '9') && c11 != 183)) {
                    z11 = false;
                }
                zArr[c11] = z11;
                c11 = (char) (c11 + 1);
            } else {
                return;
            }
        }
    }

    static boolean c(char c11) {
        return ((c11 > 31 && c11 != 127) || c11 == 9 || c11 == 10 || c11 == 13) ? false : true;
    }

    private static boolean d(char c11) {
        return (c11 <= 255 && f14399b[c11]) || e(c11) || (c11 >= 768 && c11 <= 879) || (c11 >= 8255 && c11 <= 8256);
    }

    private static boolean e(char c11) {
        return (c11 <= 255 && f14398a[c11]) || (c11 >= 256 && c11 <= 767) || ((c11 >= 880 && c11 <= 893) || ((c11 >= 895 && c11 <= 8191) || ((c11 >= 8204 && c11 <= 8205) || ((c11 >= 8304 && c11 <= 8591) || ((c11 >= 11264 && c11 <= 12271) || ((c11 >= 12289 && c11 <= 55295) || ((c11 >= 63744 && c11 <= 64975) || ((c11 >= 65008 && c11 <= 65533) || (c11 >= 0 && c11 <= 65535)))))))));
    }

    public static boolean f(String str) {
        if (str.length() > 0 && !e(str.charAt(0))) {
            return false;
        }
        for (int i11 = 1; i11 < str.length(); i11++) {
            if (!d(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(String str) {
        if (str.length() > 0 && (!e(str.charAt(0)) || str.charAt(0) == ':')) {
            return false;
        }
        for (int i11 = 1; i11 < str.length(); i11++) {
            if (!d(str.charAt(i11)) || str.charAt(i11) == ':') {
                return false;
            }
        }
        return true;
    }

    public static String h(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 1;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (charAt != ' ') {
                if (charAt == '-' || charAt == '_') {
                    stringBuffer.append('-');
                    i11++;
                } else {
                    stringBuffer.append(i11 != 2 ? Character.toLowerCase(str.charAt(i12)) : Character.toUpperCase(str.charAt(i12)));
                }
            }
        }
        return stringBuffer.toString();
    }

    static String[] i(String str) {
        int indexOf = str.indexOf(61);
        String substring = str.substring(str.charAt(1) == '?' ? 2 : 1, indexOf);
        int i11 = indexOf + 1;
        char charAt = str.charAt(i11);
        int i12 = i11 + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - indexOf);
        while (i12 < length) {
            stringBuffer.append(str.charAt(i12));
            i12++;
            if (str.charAt(i12) == charAt) {
                i12++;
            }
        }
        return new String[]{substring, stringBuffer.toString()};
    }
}
