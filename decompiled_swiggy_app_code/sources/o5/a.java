package o5;

public class a {
    private static int a(byte[] bArr, int i11, int i12, boolean z11) {
        int i13;
        if (z11) {
            i11 += i12 - 1;
            i13 = -1;
        } else {
            i13 = 1;
        }
        byte b11 = 0;
        while (true) {
            int i14 = i12 - 1;
            if (i12 <= 0) {
                return b11;
            }
            b11 = (bArr[i11] & 255) | (b11 << 8);
            i11 += i13;
            i12 = i14;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (r3 <= 8) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        r2 = a(r10, r1, 4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r2 == 1229531648) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        if (r2 == 1296891946) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0071, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r2 != 1229531648) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0077, code lost:
        r4 = a(r10, r1 + 4, 4, r2) + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0080, code lost:
        if (r4 < 10) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (r4 <= r3) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0085, code lost:
        r1 = r1 + r4;
        r3 = r3 - r4;
        r4 = a(r10, r1 - 2, 2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        r8 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008f, code lost:
        if (r4 <= 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (r3 < 12) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (a(r10, r1, 2, r2) != 274) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        r10 = a(r10, r1 + 8, 2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a2, code lost:
        if (r10 == 1) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a4, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a5, code lost:
        if (r10 == 3) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a7, code lost:
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a8, code lost:
        if (r10 == 6) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00aa, code lost:
        if (r10 == 8) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ac, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ad, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ae, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00af, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b0, code lost:
        r1 = r1 + 12;
        r3 = r3 - 12;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b6, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(byte[] r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
        L_0x0005:
            int r2 = r1 + 3
            int r3 = r10.length
            r4 = 4
            r5 = 1
            r6 = 8
            r7 = 2
            if (r2 >= r3) goto L_0x0060
            int r2 = r1 + 1
            byte r1 = r10[r1]
            r3 = 255(0xff, float:3.57E-43)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x005f
            byte r1 = r10[r2]
            r1 = r1 & r3
            if (r1 != r3) goto L_0x001e
            goto L_0x005d
        L_0x001e:
            int r2 = r2 + 1
            r3 = 216(0xd8, float:3.03E-43)
            if (r1 == r3) goto L_0x005d
            if (r1 != r5) goto L_0x0027
            goto L_0x005d
        L_0x0027:
            r3 = 217(0xd9, float:3.04E-43)
            if (r1 == r3) goto L_0x005f
            r3 = 218(0xda, float:3.05E-43)
            if (r1 != r3) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            int r3 = a(r10, r2, r7, r0)
            if (r3 < r7) goto L_0x005c
            int r8 = r2 + r3
            int r9 = r10.length
            if (r8 <= r9) goto L_0x003c
            goto L_0x005c
        L_0x003c:
            r9 = 225(0xe1, float:3.15E-43)
            if (r1 != r9) goto L_0x005a
            if (r3 < r6) goto L_0x005a
            int r1 = r2 + 2
            int r1 = a(r10, r1, r4, r0)
            r9 = 1165519206(0x45786966, float:3974.5874)
            if (r1 != r9) goto L_0x005a
            int r1 = r2 + 6
            int r1 = a(r10, r1, r7, r0)
            if (r1 != 0) goto L_0x005a
            int r1 = r2 + 8
            int r3 = r3 + -8
            goto L_0x0061
        L_0x005a:
            r1 = r8
            goto L_0x0005
        L_0x005c:
            return r0
        L_0x005d:
            r1 = r2
            goto L_0x0005
        L_0x005f:
            r1 = r2
        L_0x0060:
            r3 = 0
        L_0x0061:
            if (r3 <= r6) goto L_0x00b6
            int r2 = a(r10, r1, r4, r0)
            r8 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r8) goto L_0x0072
            r9 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r2 == r9) goto L_0x0072
            return r0
        L_0x0072:
            if (r2 != r8) goto L_0x0076
            r2 = 1
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            int r8 = r1 + 4
            int r4 = a(r10, r8, r4, r2)
            int r4 = r4 + r7
            r8 = 10
            if (r4 < r8) goto L_0x00b6
            if (r4 <= r3) goto L_0x0085
            goto L_0x00b6
        L_0x0085:
            int r1 = r1 + r4
            int r3 = r3 - r4
            int r4 = r1 + -2
            int r4 = a(r10, r4, r7, r2)
        L_0x008d:
            int r8 = r4 + -1
            if (r4 <= 0) goto L_0x00b6
            r4 = 12
            if (r3 < r4) goto L_0x00b6
            int r4 = a(r10, r1, r7, r2)
            r9 = 274(0x112, float:3.84E-43)
            if (r4 != r9) goto L_0x00b0
            int r1 = r1 + r6
            int r10 = a(r10, r1, r7, r2)
            if (r10 == r5) goto L_0x00af
            r1 = 3
            if (r10 == r1) goto L_0x00ae
            r1 = 6
            if (r10 == r1) goto L_0x00ae
            if (r10 == r6) goto L_0x00ad
            return r0
        L_0x00ad:
            return r6
        L_0x00ae:
            return r1
        L_0x00af:
            return r5
        L_0x00b0:
            int r1 = r1 + 12
            int r3 = r3 + -12
            r4 = r8
            goto L_0x008d
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.a.b(byte[]):int");
    }
}
