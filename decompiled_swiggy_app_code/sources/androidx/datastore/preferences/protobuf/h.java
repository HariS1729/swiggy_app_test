package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.fontbox.ttf.GlyfDescript;

/* compiled from: CodedInputStream */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    int f10014a;

    /* renamed from: b  reason: collision with root package name */
    int f10015b;

    /* renamed from: c  reason: collision with root package name */
    int f10016c;

    /* renamed from: d  reason: collision with root package name */
    i f10017d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10018e;

    /* compiled from: CodedInputStream */
    private static final class b extends h {

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f10019f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f10020g;

        /* renamed from: h  reason: collision with root package name */
        private int f10021h;

        /* renamed from: i  reason: collision with root package name */
        private int f10022i;
        private int j;
        private int k;

        /* renamed from: l  reason: collision with root package name */
        private int f10023l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f10024m;
        private int n;

        private void M() {
            int i11 = this.f10021h + this.f10022i;
            this.f10021h = i11;
            int i12 = i11 - this.k;
            int i13 = this.n;
            if (i12 > i13) {
                int i14 = i12 - i13;
                this.f10022i = i14;
                this.f10021h = i11 - i14;
                return;
            }
            this.f10022i = 0;
        }

        private void P() throws IOException {
            if (this.f10021h - this.j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws IOException {
            int i11 = 0;
            while (i11 < 10) {
                byte[] bArr = this.f10019f;
                int i12 = this.j;
                this.j = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void R() throws IOException {
            int i11 = 0;
            while (i11 < 10) {
                if (F() < 0) {
                    i11++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public String A() throws IOException {
            int J = J();
            if (J > 0) {
                int i11 = this.f10021h;
                int i12 = this.j;
                if (J <= i11 - i12) {
                    String e11 = Utf8.e(this.f10019f, i12, J);
                    this.j += J;
                    return e11;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        public int B() throws IOException {
            if (e()) {
                this.f10023l = 0;
                return 0;
            }
            int J = J();
            this.f10023l = J;
            if (WireFormat.a(J) != 0) {
                return this.f10023l;
            }
            throw InvalidProtocolBufferException.b();
        }

        public int C() throws IOException {
            return J();
        }

        public long D() throws IOException {
            return K();
        }

        public boolean E(int i11) throws IOException {
            int b11 = WireFormat.b(i11);
            if (b11 == 0) {
                P();
                return true;
            } else if (b11 == 1) {
                O(8);
                return true;
            } else if (b11 == 2) {
                O(J());
                return true;
            } else if (b11 == 3) {
                N();
                a(WireFormat.c(WireFormat.a(i11), 4));
                return true;
            } else if (b11 == 4) {
                return false;
            } else {
                if (b11 == 5) {
                    O(4);
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
        }

        public byte F() throws IOException {
            int i11 = this.j;
            if (i11 != this.f10021h) {
                byte[] bArr = this.f10019f;
                this.j = i11 + 1;
                return bArr[i11];
            }
            throw InvalidProtocolBufferException.l();
        }

        public byte[] G(int i11) throws IOException {
            if (i11 > 0) {
                int i12 = this.f10021h;
                int i13 = this.j;
                if (i11 <= i12 - i13) {
                    int i14 = i11 + i13;
                    this.j = i14;
                    return Arrays.copyOfRange(this.f10019f, i13, i14);
                }
            }
            if (i11 > 0) {
                throw InvalidProtocolBufferException.l();
            } else if (i11 == 0) {
                return w.f10121c;
            } else {
                throw InvalidProtocolBufferException.g();
            }
        }

        public int H() throws IOException {
            int i11 = this.j;
            if (this.f10021h - i11 >= 4) {
                byte[] bArr = this.f10019f;
                this.j = i11 + 4;
                return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << GlyfDescript.X_DUAL);
            }
            throw InvalidProtocolBufferException.l();
        }

        public long I() throws IOException {
            int i11 = this.j;
            if (this.f10021h - i11 >= 8) {
                byte[] bArr = this.f10019f;
                this.j = i11 + 8;
                return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.l();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int J() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.j
                int r1 = r5.f10021h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f10019f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.L()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.J():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long K() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.j
                int r1 = r11.f10021h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f10019f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.L()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.K():long");
        }

        /* access modifiers changed from: package-private */
        public long L() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte F = F();
                j11 |= ((long) (F & Byte.MAX_VALUE)) << i11;
                if ((F & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void N() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.N():void");
        }

        public void O(int i11) throws IOException {
            if (i11 >= 0) {
                int i12 = this.f10021h;
                int i13 = this.j;
                if (i11 <= i12 - i13) {
                    this.j = i13 + i11;
                    return;
                }
            }
            if (i11 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        public void a(int i11) throws InvalidProtocolBufferException {
            if (this.f10023l != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public int d() {
            return this.j - this.k;
        }

        public boolean e() throws IOException {
            return this.j == this.f10021h;
        }

        public void k(int i11) {
            this.n = i11;
            M();
        }

        public int l(int i11) throws InvalidProtocolBufferException {
            if (i11 >= 0) {
                int d11 = i11 + d();
                int i12 = this.n;
                if (d11 <= i12) {
                    this.n = d11;
                    M();
                    return i12;
                }
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean m() throws IOException {
            return K() != 0;
        }

        public ByteString n() throws IOException {
            ByteString byteString;
            int J = J();
            if (J > 0) {
                int i11 = this.f10021h;
                int i12 = this.j;
                if (J <= i11 - i12) {
                    if (!this.f10020g || !this.f10024m) {
                        byteString = ByteString.h(this.f10019f, i12, J);
                    } else {
                        byteString = ByteString.H(this.f10019f, i12, J);
                    }
                    this.j += J;
                    return byteString;
                }
            }
            if (J == 0) {
                return ByteString.f9898b;
            }
            return ByteString.G(G(J));
        }

        public double o() throws IOException {
            return Double.longBitsToDouble(I());
        }

        public int p() throws IOException {
            return J();
        }

        public int q() throws IOException {
            return H();
        }

        public long r() throws IOException {
            return I();
        }

        public float s() throws IOException {
            return Float.intBitsToFloat(H());
        }

        public int t() throws IOException {
            return J();
        }

        public long u() throws IOException {
            return K();
        }

        public int v() throws IOException {
            return H();
        }

        public long w() throws IOException {
            return I();
        }

        public int x() throws IOException {
            return h.b(J());
        }

        public long y() throws IOException {
            return h.c(K());
        }

        public String z() throws IOException {
            int J = J();
            if (J > 0) {
                int i11 = this.f10021h;
                int i12 = this.j;
                if (J <= i11 - i12) {
                    String str = new String(this.f10019f, i12, J, w.f10119a);
                    this.j += J;
                    return str;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.l();
        }

        private b(byte[] bArr, int i11, int i12, boolean z11) {
            super();
            this.n = Integer.MAX_VALUE;
            this.f10019f = bArr;
            this.f10021h = i12 + i11;
            this.j = i11;
            this.k = i11;
            this.f10020g = z11;
        }
    }

    /* compiled from: CodedInputStream */
    private static final class c extends h {

        /* renamed from: f  reason: collision with root package name */
        private final InputStream f10025f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f10026g;

        /* renamed from: h  reason: collision with root package name */
        private int f10027h;

        /* renamed from: i  reason: collision with root package name */
        private int f10028i;
        private int j;
        private int k;

        /* renamed from: l  reason: collision with root package name */
        private int f10029l;

        /* renamed from: m  reason: collision with root package name */
        private int f10030m;
        private a n;

        /* compiled from: CodedInputStream */
        private interface a {
            void onRefill();
        }

        private ByteString F(int i11) throws IOException {
            byte[] I = I(i11);
            if (I != null) {
                return ByteString.g(I);
            }
            int i12 = this.j;
            int i13 = this.f10027h;
            int i14 = i13 - i12;
            this.f10029l += i13;
            this.j = 0;
            this.f10027h = 0;
            List<byte[]> J = J(i11 - i14);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f10026g, i12, bArr, 0, i14);
            for (byte[] next : J) {
                System.arraycopy(next, 0, bArr, i14, next.length);
                i14 += next.length;
            }
            return ByteString.G(bArr);
        }

        private byte[] H(int i11, boolean z11) throws IOException {
            byte[] I = I(i11);
            if (I != null) {
                return z11 ? (byte[]) I.clone() : I;
            }
            int i12 = this.j;
            int i13 = this.f10027h;
            int i14 = i13 - i12;
            this.f10029l += i13;
            this.j = 0;
            this.f10027h = 0;
            List<byte[]> J = J(i11 - i14);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f10026g, i12, bArr, 0, i14);
            for (byte[] next : J) {
                System.arraycopy(next, 0, bArr, i14, next.length);
                i14 += next.length;
            }
            return bArr;
        }

        private byte[] I(int i11) throws IOException {
            if (i11 == 0) {
                return w.f10121c;
            }
            if (i11 >= 0) {
                int i12 = this.f10029l;
                int i13 = this.j;
                int i14 = i12 + i13 + i11;
                if (i14 - this.f10016c <= 0) {
                    int i15 = this.f10030m;
                    if (i14 <= i15) {
                        int i16 = this.f10027h - i13;
                        int i17 = i11 - i16;
                        if (i17 >= 4096 && i17 > this.f10025f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i11];
                        System.arraycopy(this.f10026g, this.j, bArr, 0, i16);
                        this.f10029l += this.f10027h;
                        this.j = 0;
                        this.f10027h = 0;
                        while (i16 < i11) {
                            int read = this.f10025f.read(bArr, i16, i11 - i16);
                            if (read != -1) {
                                this.f10029l += read;
                                i16 += read;
                            } else {
                                throw InvalidProtocolBufferException.l();
                            }
                        }
                        return bArr;
                    }
                    S((i15 - i12) - i13);
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.g();
        }

        private List<byte[]> J(int i11) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i11 > 0) {
                int min = Math.min(i11, 4096);
                byte[] bArr = new byte[min];
                int i12 = 0;
                while (i12 < min) {
                    int read = this.f10025f.read(bArr, i12, min - i12);
                    if (read != -1) {
                        this.f10029l += read;
                        i12 += read;
                    } else {
                        throw InvalidProtocolBufferException.l();
                    }
                }
                i11 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i11 = this.f10027h + this.f10028i;
            this.f10027h = i11;
            int i12 = this.f10029l + i11;
            int i13 = this.f10030m;
            if (i12 > i13) {
                int i14 = i12 - i13;
                this.f10028i = i14;
                this.f10027h = i11 - i14;
                return;
            }
            this.f10028i = 0;
        }

        private void Q(int i11) throws IOException {
            if (X(i11)) {
                return;
            }
            if (i11 > (this.f10016c - this.f10029l) - this.j) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.l();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f10025f.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void T(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f10029l
                int r1 = r8.j
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f10030m
                if (r2 > r3) goto L_0x008d
                androidx.datastore.preferences.protobuf.h$c$a r2 = r8.n
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f10029l = r0
                int r0 = r8.f10027h
                int r0 = r0 - r1
                r8.f10027h = r3
                r8.j = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f10025f     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f10025f     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f10029l
                int r0 = r0 + r3
                r8.f10029l = r0
                r8.P()
                throw r9
            L_0x0067:
                int r0 = r8.f10029l
                int r0 = r0 + r3
                r8.f10029l = r0
                r8.P()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f10027h
                int r1 = r8.j
                int r1 = r0 - r1
                r8.j = r0
                r0 = 1
                r8.Q(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f10027h
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.j = r3
                r8.Q(r0)
                goto L_0x007d
            L_0x008a:
                r8.j = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.S(r3)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.l()
                throw r9
            L_0x0097:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.g()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.T(int):void");
        }

        private void U() throws IOException {
            if (this.f10027h - this.j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws IOException {
            int i11 = 0;
            while (i11 < 10) {
                byte[] bArr = this.f10026g;
                int i12 = this.j;
                this.j = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void W() throws IOException {
            int i11 = 0;
            while (i11 < 10) {
                if (G() < 0) {
                    i11++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private boolean X(int i11) throws IOException {
            int i12 = this.j;
            if (i12 + i11 > this.f10027h) {
                int i13 = this.f10016c;
                int i14 = this.f10029l;
                if (i11 > (i13 - i14) - i12 || i14 + i12 + i11 > this.f10030m) {
                    return false;
                }
                a aVar = this.n;
                if (aVar != null) {
                    aVar.onRefill();
                }
                int i15 = this.j;
                if (i15 > 0) {
                    int i16 = this.f10027h;
                    if (i16 > i15) {
                        byte[] bArr = this.f10026g;
                        System.arraycopy(bArr, i15, bArr, 0, i16 - i15);
                    }
                    this.f10029l += i15;
                    this.f10027h -= i15;
                    this.j = 0;
                }
                InputStream inputStream = this.f10025f;
                byte[] bArr2 = this.f10026g;
                int i17 = this.f10027h;
                int read = inputStream.read(bArr2, i17, Math.min(bArr2.length - i17, (this.f10016c - this.f10029l) - i17));
                if (read == 0 || read < -1 || read > this.f10026g.length) {
                    throw new IllegalStateException(this.f10025f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f10027h += read;
                    P();
                    if (this.f10027h >= i11) {
                        return true;
                    }
                    return X(i11);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i11 + " bytes were already available in buffer");
            }
        }

        public String A() throws IOException {
            byte[] bArr;
            int M = M();
            int i11 = this.j;
            int i12 = this.f10027h;
            if (M <= i12 - i11 && M > 0) {
                bArr = this.f10026g;
                this.j = i11 + M;
            } else if (M == 0) {
                return "";
            } else {
                if (M <= i12) {
                    Q(M);
                    bArr = this.f10026g;
                    this.j = M + 0;
                } else {
                    bArr = H(M, false);
                }
                i11 = 0;
            }
            return Utf8.e(bArr, i11, M);
        }

        public int B() throws IOException {
            if (e()) {
                this.k = 0;
                return 0;
            }
            int M = M();
            this.k = M;
            if (WireFormat.a(M) != 0) {
                return this.k;
            }
            throw InvalidProtocolBufferException.b();
        }

        public int C() throws IOException {
            return M();
        }

        public long D() throws IOException {
            return N();
        }

        public boolean E(int i11) throws IOException {
            int b11 = WireFormat.b(i11);
            if (b11 == 0) {
                U();
                return true;
            } else if (b11 == 1) {
                S(8);
                return true;
            } else if (b11 == 2) {
                S(M());
                return true;
            } else if (b11 == 3) {
                R();
                a(WireFormat.c(WireFormat.a(i11), 4));
                return true;
            } else if (b11 == 4) {
                return false;
            } else {
                if (b11 == 5) {
                    S(4);
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
        }

        public byte G() throws IOException {
            if (this.j == this.f10027h) {
                Q(1);
            }
            byte[] bArr = this.f10026g;
            int i11 = this.j;
            this.j = i11 + 1;
            return bArr[i11];
        }

        public int K() throws IOException {
            int i11 = this.j;
            if (this.f10027h - i11 < 4) {
                Q(4);
                i11 = this.j;
            }
            byte[] bArr = this.f10026g;
            this.j = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << GlyfDescript.X_DUAL);
        }

        public long L() throws IOException {
            int i11 = this.j;
            if (this.f10027h - i11 < 8) {
                Q(8);
                i11 = this.j;
            }
            byte[] bArr = this.f10026g;
            this.j = i11 + 8;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int M() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.j
                int r1 = r5.f10027h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f10026g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.O()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.M():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long N() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.j
                int r1 = r11.f10027h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f10026g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.O()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.N():long");
        }

        /* access modifiers changed from: package-private */
        public long O() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte G = G();
                j11 |= ((long) (G & Byte.MAX_VALUE)) << i11;
                if ((G & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void R() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.R():void");
        }

        public void S(int i11) throws IOException {
            int i12 = this.f10027h;
            int i13 = this.j;
            if (i11 > i12 - i13 || i11 < 0) {
                T(i11);
            } else {
                this.j = i13 + i11;
            }
        }

        public void a(int i11) throws InvalidProtocolBufferException {
            if (this.k != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public int d() {
            return this.f10029l + this.j;
        }

        public boolean e() throws IOException {
            return this.j == this.f10027h && !X(1);
        }

        public void k(int i11) {
            this.f10030m = i11;
            P();
        }

        public int l(int i11) throws InvalidProtocolBufferException {
            if (i11 >= 0) {
                int i12 = i11 + this.f10029l + this.j;
                int i13 = this.f10030m;
                if (i12 <= i13) {
                    this.f10030m = i12;
                    P();
                    return i13;
                }
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean m() throws IOException {
            return N() != 0;
        }

        public ByteString n() throws IOException {
            int M = M();
            int i11 = this.f10027h;
            int i12 = this.j;
            if (M <= i11 - i12 && M > 0) {
                ByteString h11 = ByteString.h(this.f10026g, i12, M);
                this.j += M;
                return h11;
            } else if (M == 0) {
                return ByteString.f9898b;
            } else {
                return F(M);
            }
        }

        public double o() throws IOException {
            return Double.longBitsToDouble(L());
        }

        public int p() throws IOException {
            return M();
        }

        public int q() throws IOException {
            return K();
        }

        public long r() throws IOException {
            return L();
        }

        public float s() throws IOException {
            return Float.intBitsToFloat(K());
        }

        public int t() throws IOException {
            return M();
        }

        public long u() throws IOException {
            return N();
        }

        public int v() throws IOException {
            return K();
        }

        public long w() throws IOException {
            return L();
        }

        public int x() throws IOException {
            return h.b(M());
        }

        public long y() throws IOException {
            return h.c(N());
        }

        public String z() throws IOException {
            int M = M();
            if (M > 0) {
                int i11 = this.f10027h;
                int i12 = this.j;
                if (M <= i11 - i12) {
                    String str = new String(this.f10026g, i12, M, w.f10119a);
                    this.j += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M > this.f10027h) {
                return new String(H(M, false), w.f10119a);
            }
            Q(M);
            String str2 = new String(this.f10026g, this.j, M, w.f10119a);
            this.j += M;
            return str2;
        }

        private c(InputStream inputStream, int i11) {
            super();
            this.f10030m = Integer.MAX_VALUE;
            this.n = null;
            w.b(inputStream, "input");
            this.f10025f = inputStream;
            this.f10026g = new byte[i11];
            this.f10027h = 0;
            this.j = 0;
            this.f10029l = 0;
        }
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static h g(InputStream inputStream, int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return h(w.f10121c);
        } else {
            return new c(inputStream, i11);
        }
    }

    public static h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static h i(byte[] bArr, int i11, int i12) {
        return j(bArr, i11, i12, false);
    }

    static h j(byte[] bArr, int i11, int i12, boolean z11) {
        b bVar = new b(bArr, i11, i12, z11);
        try {
            bVar.l(i12);
            return bVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public abstract String A() throws IOException;

    public abstract int B() throws IOException;

    public abstract int C() throws IOException;

    public abstract long D() throws IOException;

    public abstract boolean E(int i11) throws IOException;

    public abstract void a(int i11) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void k(int i11);

    public abstract int l(int i11) throws InvalidProtocolBufferException;

    public abstract boolean m() throws IOException;

    public abstract ByteString n() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract float s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract String z() throws IOException;

    private h() {
        this.f10015b = 100;
        this.f10016c = Integer.MAX_VALUE;
        this.f10018e = false;
    }
}
