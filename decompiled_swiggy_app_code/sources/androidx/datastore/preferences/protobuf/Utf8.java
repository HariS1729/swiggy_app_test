package androidx.datastore.preferences.protobuf;

final class Utf8 {

    /* renamed from: a  reason: collision with root package name */
    private static final b f9941a = ((!d.e() || d.c()) ? new c() : new d());

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    private static class a {
        /* access modifiers changed from: private */
        public static void h(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (m(b12) || (((b11 << 28) + (b12 + 112)) >> 30) != 0 || m(b13) || m(b14)) {
                throw InvalidProtocolBufferException.c();
            }
            int r11 = ((b11 & 7) << 18) | (r(b12) << 12) | (r(b13) << 6) | r(b14);
            cArr[i11] = l(r11);
            cArr[i11 + 1] = q(r11);
        }

        /* access modifiers changed from: private */
        public static void i(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        /* access modifiers changed from: private */
        public static void j(byte b11, byte b12, byte b13, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (m(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || m(b13)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i11] = (char) (((b11 & 15) << 12) | (r(b12) << 6) | r(b13));
        }

        /* access modifiers changed from: private */
        public static void k(byte b11, byte b12, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (b11 < -62 || m(b12)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | r(b12));
        }

        private static char l(int i11) {
            return (char) ((i11 >>> 10) + 55232);
        }

        private static boolean m(byte b11) {
            return b11 > -65;
        }

        /* access modifiers changed from: private */
        public static boolean n(byte b11) {
            return b11 >= 0;
        }

        /* access modifiers changed from: private */
        public static boolean o(byte b11) {
            return b11 < -16;
        }

        /* access modifiers changed from: private */
        public static boolean p(byte b11) {
            return b11 < -32;
        }

        private static char q(int i11) {
            return (char) ((i11 & 1023) + 56320);
        }

        private static int r(byte b11) {
            return b11 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException;

        /* access modifiers changed from: package-private */
        public abstract int b(CharSequence charSequence, byte[] bArr, int i11, int i12);

        /* access modifiers changed from: package-private */
        public final boolean c(byte[] bArr, int i11, int i12) {
            return d(0, bArr, i11, i12) == 0;
        }

        /* access modifiers changed from: package-private */
        public abstract int d(int i11, byte[] bArr, int i12, int i13);
    }

    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return f(bArr, i11, i12);
        }

        private static int f(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    } else if (b11 < -16) {
                        if (i13 >= i12 - 1) {
                            return Utf8.l(bArr, i13, i12);
                        }
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                            i11 = i14 + 1;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    } else if (i13 >= i12 - 2) {
                        return Utf8.l(bArr, i13, i12);
                    } else {
                        int i15 = i13 + 1;
                        byte b13 = bArr[i13];
                        if (b13 <= -65 && (((b11 << 28) + (b13 + 112)) >> 30) == 0) {
                            int i16 = i15 + 1;
                            if (bArr[i15] <= -65) {
                                i13 = i16 + 1;
                                if (bArr[i16] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i11 = i13;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
                int i13 = i11 + i12;
                char[] cArr = new char[i12];
                int i14 = 0;
                while (r13 < i13) {
                    byte b11 = bArr[r13];
                    if (!a.n(b11)) {
                        break;
                    }
                    i11 = r13 + 1;
                    a.i(b11, cArr, i14);
                    i14++;
                }
                int i15 = i14;
                while (r13 < i13) {
                    int i16 = r13 + 1;
                    byte b12 = bArr[r13];
                    if (a.n(b12)) {
                        int i17 = i15 + 1;
                        a.i(b12, cArr, i15);
                        while (i16 < i13) {
                            byte b13 = bArr[i16];
                            if (!a.n(b13)) {
                                break;
                            }
                            i16++;
                            a.i(b13, cArr, i17);
                            i17++;
                        }
                        r13 = i16;
                        i15 = i17;
                    } else if (a.p(b12)) {
                        if (i16 < i13) {
                            a.k(b12, bArr[i16], cArr, i15);
                            r13 = i16 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (a.o(b12)) {
                        if (i16 < i13 - 1) {
                            int i18 = i16 + 1;
                            a.j(b12, bArr[i16], bArr[i18], cArr, i15);
                            r13 = i18 + 1;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (i16 < i13 - 2) {
                        int i19 = i16 + 1;
                        byte b14 = bArr[i16];
                        int i21 = i19 + 1;
                        a.h(b12, b14, bArr[i19], bArr[i21], cArr, i15);
                        r13 = i21 + 1;
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)}));
        }

        /* access modifiers changed from: package-private */
        public int b(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            int i15;
            char charAt;
            int length = charSequence.length();
            int i16 = i12 + i11;
            int i17 = 0;
            while (i17 < length && (i15 = i17 + i11) < i16 && (charAt = charSequence.charAt(i17)) < 128) {
                bArr[i15] = (byte) charAt;
                i17++;
            }
            if (i17 == length) {
                return i11 + length;
            }
            int i18 = i11 + i17;
            while (i17 < length) {
                char charAt2 = charSequence.charAt(i17);
                if (charAt2 < 128 && i18 < i16) {
                    i14 = i18 + 1;
                    bArr[i18] = (byte) charAt2;
                } else if (charAt2 < 2048 && i18 <= i16 - 2) {
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) ((charAt2 >>> 6) | 960);
                    i18 = i19 + 1;
                    bArr[i19] = (byte) ((charAt2 & '?') | 128);
                    i17++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i18 <= i16 - 3) {
                    int i21 = i18 + 1;
                    bArr[i18] = (byte) ((charAt2 >>> 12) | 480);
                    int i22 = i21 + 1;
                    bArr[i21] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i14 = i22 + 1;
                    bArr[i22] = (byte) ((charAt2 & '?') | 128);
                } else if (i18 <= i16 - 4) {
                    int i23 = i17 + 1;
                    if (i23 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i23);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i24 = i18 + 1;
                            bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                            int i25 = i24 + 1;
                            bArr[i24] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i26 = i25 + 1;
                            bArr[i25] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i18 = i26 + 1;
                            bArr[i26] = (byte) ((codePoint & 63) | 128);
                            i17 = i23;
                            i17++;
                        } else {
                            i17 = i23;
                        }
                    }
                    throw new UnpairedSurrogateException(i17 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i17 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i18);
                } else {
                    throw new UnpairedSurrogateException(i17, length);
                }
                i18 = i14;
                i17++;
            }
            return i18;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0082
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0082
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = androidx.datastore.preferences.protobuf.Utf8.j(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x005d
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005b
                int r7 = androidx.datastore.preferences.protobuf.Utf8.j(r0, r1)
                return r7
            L_0x005b:
                r9 = r7
                goto L_0x0060
            L_0x005d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0060:
                if (r4 != 0) goto L_0x006e
                int r7 = r9 + 1
                byte r4 = r8[r9]
                if (r7 < r10) goto L_0x006d
                int r7 = androidx.datastore.preferences.protobuf.Utf8.k(r0, r1, r4)
                return r7
            L_0x006d:
                r9 = r7
            L_0x006e:
                if (r1 > r3) goto L_0x0081
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x0081
                if (r4 > r3) goto L_0x0081
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0081:
                return r2
            L_0x0082:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.c.d(int, byte[], int, int):int");
        }
    }

    static final class d extends b {
        d() {
        }

        static boolean e() {
            return i1.C() && i1.D();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int f(byte[] r8, long r9, int r11) {
            /*
                int r0 = g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = androidx.datastore.preferences.protobuf.i1.s(r8, r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.i1.s(r8, r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = h(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.i1.s(r8, r9)
                if (r9 > r4) goto L_0x0063
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r9 = androidx.datastore.preferences.protobuf.i1.s(r8, r6)
                if (r9 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r11 >= r0) goto L_0x006c
                int r8 = h(r8, r1, r9, r11)
                return r8
            L_0x006c:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.i1.s(r8, r9)
                if (r9 > r4) goto L_0x008e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008e
                long r9 = r6 + r2
                byte r0 = androidx.datastore.preferences.protobuf.i1.s(r8, r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.i1.s(r8, r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.d.f(byte[], long, int):int");
        }

        private static int g(byte[] bArr, long j, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            while (i12 < i11) {
                long j11 = 1 + j;
                if (i1.s(bArr, j) < 0) {
                    return i12;
                }
                i12++;
                j = j11;
            }
            return i11;
        }

        private static int h(byte[] bArr, int i11, long j, int i12) {
            if (i12 == 0) {
                return Utf8.i(i11);
            }
            if (i12 == 1) {
                return Utf8.j(i11, i1.s(bArr, j));
            }
            if (i12 == 2) {
                return Utf8.k(i11, i1.s(bArr, j), i1.s(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) >= 0) {
                int i13 = i11 + i12;
                char[] cArr = new char[i12];
                int i14 = 0;
                while (r13 < i13) {
                    byte s11 = i1.s(bArr, (long) r13);
                    if (!a.n(s11)) {
                        break;
                    }
                    i11 = r13 + 1;
                    a.i(s11, cArr, i14);
                    i14++;
                }
                int i15 = i14;
                while (r13 < i13) {
                    int i16 = r13 + 1;
                    byte s12 = i1.s(bArr, (long) r13);
                    if (a.n(s12)) {
                        int i17 = i15 + 1;
                        a.i(s12, cArr, i15);
                        while (i16 < i13) {
                            byte s13 = i1.s(bArr, (long) i16);
                            if (!a.n(s13)) {
                                break;
                            }
                            i16++;
                            a.i(s13, cArr, i17);
                            i17++;
                        }
                        r13 = i16;
                        i15 = i17;
                    } else if (a.p(s12)) {
                        if (i16 < i13) {
                            int i18 = i16 + 1;
                            a.k(s12, i1.s(bArr, (long) i16), cArr, i15);
                            r13 = i18;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (a.o(s12)) {
                        if (i16 < i13 - 1) {
                            int i19 = i16 + 1;
                            int i21 = i19 + 1;
                            a.j(s12, i1.s(bArr, (long) i16), i1.s(bArr, (long) i19), cArr, i15);
                            r13 = i21;
                            i15++;
                        } else {
                            throw InvalidProtocolBufferException.c();
                        }
                    } else if (i16 < i13 - 2) {
                        int i22 = i16 + 1;
                        byte s14 = i1.s(bArr, (long) i16);
                        int i23 = i22 + 1;
                        a.h(s12, s14, i1.s(bArr, (long) i22), i1.s(bArr, (long) i23), cArr, i15);
                        r13 = i23 + 1;
                        i15 = i15 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.c();
                    }
                }
                return new String(cArr, 0, i15);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)}));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                androidx.datastore.preferences.protobuf.i1.H(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004b
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004b
                long r14 = r4 + r11
                byte r13 = (byte) r13
                androidx.datastore.preferences.protobuf.i1.H(r1, r4, r13)
                r4 = r11
                r12 = r14
            L_0x0047:
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fb
            L_0x004b:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0075
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x0075
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.i1.H(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.i1.H(r1, r14, r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto L_0x00fb
            L_0x0075:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007f
                if (r3 >= r13) goto L_0x00ae
            L_0x007f:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00ae
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.i1.H(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.i1.H(r1, r14, r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.i1.H(r1, r3, r5)
                r12 = r18
                r4 = 1
                goto L_0x0047
            L_0x00ae:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                androidx.datastore.preferences.protobuf.i1.H(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                androidx.datastore.preferences.protobuf.i1.H(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                androidx.datastore.preferences.protobuf.i1.H(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                androidx.datastore.preferences.protobuf.i1.H(r1, r14, r2)
                r2 = r3
            L_0x00fb:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.d.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
            if (androidx.datastore.preferences.protobuf.i1.s(r13, r2) > -65) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
            if (androidx.datastore.preferences.protobuf.i1.s(r13, r2) > -65) goto L_0x00a0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00a8
                long r2 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto L_0x00a1
                int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r0 < 0) goto L_0x0011
                return r12
            L_0x0011:
                byte r0 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r0 >= r4) goto L_0x002b
                r12 = -62
                if (r0 < r12) goto L_0x002a
                long r7 = r7 + r2
                byte r12 = androidx.datastore.preferences.protobuf.i1.s(r13, r2)
                if (r12 <= r6) goto L_0x0027
                goto L_0x002a
            L_0x0027:
                r2 = r7
                goto L_0x00a1
            L_0x002a:
                return r5
            L_0x002b:
                r9 = -16
                if (r0 >= r9) goto L_0x005f
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0045
                long r9 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.i1.s(r13, r2)
                int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r1 < 0) goto L_0x0044
                int r12 = androidx.datastore.preferences.protobuf.Utf8.j(r0, r12)
                return r12
            L_0x0044:
                r2 = r9
            L_0x0045:
                if (r12 > r6) goto L_0x005e
                r1 = -96
                if (r0 != r4) goto L_0x004d
                if (r12 < r1) goto L_0x005e
            L_0x004d:
                r4 = -19
                if (r0 != r4) goto L_0x0053
                if (r12 >= r1) goto L_0x005e
            L_0x0053:
                long r0 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.i1.s(r13, r2)
                if (r12 <= r6) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r2 = r0
                goto L_0x00a1
            L_0x005e:
                return r5
            L_0x005f:
                int r4 = r12 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0076
                long r9 = r2 + r7
                byte r4 = androidx.datastore.preferences.protobuf.i1.s(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x0074
                int r12 = androidx.datastore.preferences.protobuf.Utf8.j(r0, r4)
                return r12
            L_0x0074:
                r2 = r9
                goto L_0x0079
            L_0x0076:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L_0x0079:
                if (r1 != 0) goto L_0x008b
                long r9 = r2 + r7
                byte r1 = androidx.datastore.preferences.protobuf.i1.s(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x008a
                int r12 = androidx.datastore.preferences.protobuf.Utf8.k(r0, r4, r1)
                return r12
            L_0x008a:
                r2 = r9
            L_0x008b:
                if (r4 > r6) goto L_0x00a0
                int r12 = r0 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00a0
                if (r1 > r6) goto L_0x00a0
                long r0 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.i1.s(r13, r2)
                if (r12 <= r6) goto L_0x005c
            L_0x00a0:
                return r5
            L_0x00a1:
                long r14 = r14 - r2
                int r12 = (int) r14
                int r12 = f(r13, r2, r12)
                return r12
            L_0x00a8:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.d.d(int, byte[], int, int):int");
        }
    }

    static String e(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
        return f9941a.a(bArr, i11, i12);
    }

    static int f(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return f9941a.b(charSequence, bArr, i11, i12);
    }

    static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = charSequence.charAt(i11);
                if (charAt >= 2048) {
                    i12 += h(charSequence, i11);
                    break;
                }
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) >= 65536) {
                        i11++;
                    } else {
                        throw new UnpairedSurrogateException(i11, length);
                    }
                }
            }
            i11++;
        }
        return i12;
    }

    /* access modifiers changed from: private */
    public static int i(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public static int j(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* access modifiers changed from: private */
    public static int k(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    /* access modifiers changed from: private */
    public static int l(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            return i(b11);
        }
        if (i13 == 1) {
            return j(b11, bArr[i11]);
        }
        if (i13 == 2) {
            return k(b11, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f9941a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i11, int i12) {
        return f9941a.c(bArr, i11, i12);
    }
}
