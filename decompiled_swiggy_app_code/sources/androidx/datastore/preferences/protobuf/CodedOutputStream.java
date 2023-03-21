package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f9910c = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f9911d = i1.C();

    /* renamed from: a  reason: collision with root package name */
    j f9912a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9913b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        final byte[] f9914e;

        /* renamed from: f  reason: collision with root package name */
        final int f9915f;

        /* renamed from: g  reason: collision with root package name */
        int f9916g;

        /* renamed from: h  reason: collision with root package name */
        int f9917h;

        b(int i11) {
            super();
            if (i11 >= 0) {
                byte[] bArr = new byte[Math.max(i11, 20)];
                this.f9914e = bArr;
                this.f9915f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        public final void b1(byte b11) {
            byte[] bArr = this.f9914e;
            int i11 = this.f9916g;
            this.f9916g = i11 + 1;
            bArr[i11] = b11;
            this.f9917h++;
        }

        /* access modifiers changed from: package-private */
        public final void c1(int i11) {
            byte[] bArr = this.f9914e;
            int i12 = this.f9916g;
            int i13 = i12 + 1;
            this.f9916g = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i13 + 1;
            this.f9916g = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i14 + 1;
            this.f9916g = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.f9916g = i15 + 1;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
            this.f9917h += 4;
        }

        /* access modifiers changed from: package-private */
        public final void d1(long j) {
            byte[] bArr = this.f9914e;
            int i11 = this.f9916g;
            int i12 = i11 + 1;
            this.f9916g = i12;
            bArr[i11] = (byte) ((int) (j & 255));
            int i13 = i12 + 1;
            this.f9916g = i13;
            bArr[i12] = (byte) ((int) ((j >> 8) & 255));
            int i14 = i13 + 1;
            this.f9916g = i14;
            bArr[i13] = (byte) ((int) ((j >> 16) & 255));
            int i15 = i14 + 1;
            this.f9916g = i15;
            bArr[i14] = (byte) ((int) (255 & (j >> 24)));
            int i16 = i15 + 1;
            this.f9916g = i16;
            bArr[i15] = (byte) (((int) (j >> 32)) & 255);
            int i17 = i16 + 1;
            this.f9916g = i17;
            bArr[i16] = (byte) (((int) (j >> 40)) & 255);
            int i18 = i17 + 1;
            this.f9916g = i18;
            bArr[i17] = (byte) (((int) (j >> 48)) & 255);
            this.f9916g = i18 + 1;
            bArr[i18] = (byte) (((int) (j >> 56)) & 255);
            this.f9917h += 8;
        }

        /* access modifiers changed from: package-private */
        public final void e1(int i11) {
            if (i11 >= 0) {
                g1(i11);
            } else {
                h1((long) i11);
            }
        }

        /* access modifiers changed from: package-private */
        public final void f1(int i11, int i12) {
            g1(WireFormat.c(i11, i12));
        }

        /* access modifiers changed from: package-private */
        public final void g1(int i11) {
            if (CodedOutputStream.f9911d) {
                long j = (long) this.f9916g;
                while ((i11 & -128) != 0) {
                    byte[] bArr = this.f9914e;
                    int i12 = this.f9916g;
                    this.f9916g = i12 + 1;
                    i1.H(bArr, (long) i12, (byte) ((i11 & 127) | 128));
                    i11 >>>= 7;
                }
                byte[] bArr2 = this.f9914e;
                int i13 = this.f9916g;
                this.f9916g = i13 + 1;
                i1.H(bArr2, (long) i13, (byte) i11);
                this.f9917h += (int) (((long) this.f9916g) - j);
                return;
            }
            while ((i11 & -128) != 0) {
                byte[] bArr3 = this.f9914e;
                int i14 = this.f9916g;
                this.f9916g = i14 + 1;
                bArr3[i14] = (byte) ((i11 & 127) | 128);
                this.f9917h++;
                i11 >>>= 7;
            }
            byte[] bArr4 = this.f9914e;
            int i15 = this.f9916g;
            this.f9916g = i15 + 1;
            bArr4[i15] = (byte) i11;
            this.f9917h++;
        }

        /* access modifiers changed from: package-private */
        public final void h1(long j) {
            if (CodedOutputStream.f9911d) {
                long j11 = (long) this.f9916g;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9914e;
                    int i11 = this.f9916g;
                    this.f9916g = i11 + 1;
                    i1.H(bArr, (long) i11, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f9914e;
                int i12 = this.f9916g;
                this.f9916g = i12 + 1;
                i1.H(bArr2, (long) i12, (byte) ((int) j));
                this.f9917h += (int) (((long) this.f9916g) - j11);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f9914e;
                int i13 = this.f9916g;
                this.f9916g = i13 + 1;
                bArr3[i13] = (byte) ((((int) j) & 127) | 128);
                this.f9917h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f9914e;
            int i14 = this.f9916g;
            this.f9916g = i14 + 1;
            bArr4[i14] = (byte) ((int) j);
            this.f9917h++;
        }

        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f9918e;

        /* renamed from: f  reason: collision with root package name */
        private final int f9919f;

        /* renamed from: g  reason: collision with root package name */
        private final int f9920g;

        /* renamed from: h  reason: collision with root package name */
        private int f9921h;

        c(byte[] bArr, int i11, int i12) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i13 = i11 + i12;
            if ((i11 | i12 | (bArr.length - i13)) >= 0) {
                this.f9918e = bArr;
                this.f9919f = i11;
                this.f9921h = i11;
                this.f9920g = i13;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)}));
        }

        public final void E0(int i11, int i12) throws IOException {
            W0(i11, 0);
            F0(i12);
        }

        public final void F0(int i11) throws IOException {
            if (i11 >= 0) {
                Y0(i11);
            } else {
                a1((long) i11);
            }
        }

        /* access modifiers changed from: package-private */
        public final void I0(int i11, k0 k0Var, y0 y0Var) throws IOException {
            W0(i11, 2);
            Y0(((a) k0Var).e(y0Var));
            y0Var.a(k0Var, this.f9912a);
        }

        public final void J0(k0 k0Var) throws IOException {
            Y0(k0Var.getSerializedSize());
            k0Var.b(this);
        }

        public final void K0(int i11, k0 k0Var) throws IOException {
            W0(1, 3);
            X0(2, i11);
            c1(3, k0Var);
            W0(1, 4);
        }

        public final void L0(int i11, ByteString byteString) throws IOException {
            W0(1, 3);
            X0(2, i11);
            o0(3, byteString);
            W0(1, 4);
        }

        public final void U0(int i11, String str) throws IOException {
            W0(i11, 2);
            V0(str);
        }

        public final void V0(String str) throws IOException {
            int i11 = this.f9921h;
            try {
                int X = CodedOutputStream.X(str.length() * 3);
                int X2 = CodedOutputStream.X(str.length());
                if (X2 == X) {
                    int i12 = i11 + X2;
                    this.f9921h = i12;
                    int f11 = Utf8.f(str, this.f9918e, i12, i0());
                    this.f9921h = i11;
                    Y0((f11 - i11) - X2);
                    this.f9921h = f11;
                    return;
                }
                Y0(Utf8.g(str));
                this.f9921h = Utf8.f(str, this.f9918e, this.f9921h, i0());
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.f9921h = i11;
                d0(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        public final void W0(int i11, int i12) throws IOException {
            Y0(WireFormat.c(i11, i12));
        }

        public final void X0(int i11, int i12) throws IOException {
            W0(i11, 0);
            Y0(i12);
        }

        public final void Y0(int i11) throws IOException {
            if (!CodedOutputStream.f9911d || d.c() || i0() < 5) {
                while ((i11 & -128) != 0) {
                    byte[] bArr = this.f9918e;
                    int i12 = this.f9921h;
                    this.f9921h = i12 + 1;
                    bArr[i12] = (byte) ((i11 & 127) | 128);
                    i11 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9918e;
                    int i13 = this.f9921h;
                    this.f9921h = i13 + 1;
                    bArr2[i13] = (byte) i11;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9921h), Integer.valueOf(this.f9920g), 1}), e11);
                }
            } else if ((i11 & -128) == 0) {
                byte[] bArr3 = this.f9918e;
                int i14 = this.f9921h;
                this.f9921h = i14 + 1;
                i1.H(bArr3, (long) i14, (byte) i11);
            } else {
                byte[] bArr4 = this.f9918e;
                int i15 = this.f9921h;
                this.f9921h = i15 + 1;
                i1.H(bArr4, (long) i15, (byte) (i11 | 128));
                int i16 = i11 >>> 7;
                if ((i16 & -128) == 0) {
                    byte[] bArr5 = this.f9918e;
                    int i17 = this.f9921h;
                    this.f9921h = i17 + 1;
                    i1.H(bArr5, (long) i17, (byte) i16);
                    return;
                }
                byte[] bArr6 = this.f9918e;
                int i18 = this.f9921h;
                this.f9921h = i18 + 1;
                i1.H(bArr6, (long) i18, (byte) (i16 | 128));
                int i19 = i16 >>> 7;
                if ((i19 & -128) == 0) {
                    byte[] bArr7 = this.f9918e;
                    int i21 = this.f9921h;
                    this.f9921h = i21 + 1;
                    i1.H(bArr7, (long) i21, (byte) i19);
                    return;
                }
                byte[] bArr8 = this.f9918e;
                int i22 = this.f9921h;
                this.f9921h = i22 + 1;
                i1.H(bArr8, (long) i22, (byte) (i19 | 128));
                int i23 = i19 >>> 7;
                if ((i23 & -128) == 0) {
                    byte[] bArr9 = this.f9918e;
                    int i24 = this.f9921h;
                    this.f9921h = i24 + 1;
                    i1.H(bArr9, (long) i24, (byte) i23);
                    return;
                }
                byte[] bArr10 = this.f9918e;
                int i25 = this.f9921h;
                this.f9921h = i25 + 1;
                i1.H(bArr10, (long) i25, (byte) (i23 | 128));
                byte[] bArr11 = this.f9918e;
                int i26 = this.f9921h;
                this.f9921h = i26 + 1;
                i1.H(bArr11, (long) i26, (byte) (i23 >>> 7));
            }
        }

        public final void Z0(int i11, long j) throws IOException {
            W0(i11, 0);
            a1(j);
        }

        public final void a(byte[] bArr, int i11, int i12) throws IOException {
            b1(bArr, i11, i12);
        }

        public final void a1(long j) throws IOException {
            if (!CodedOutputStream.f9911d || i0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9918e;
                    int i11 = this.f9921h;
                    this.f9921h = i11 + 1;
                    bArr[i11] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9918e;
                    int i12 = this.f9921h;
                    this.f9921h = i12 + 1;
                    bArr2[i12] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9921h), Integer.valueOf(this.f9920g), 1}), e11);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f9918e;
                    int i13 = this.f9921h;
                    this.f9921h = i13 + 1;
                    i1.H(bArr3, (long) i13, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f9918e;
                int i14 = this.f9921h;
                this.f9921h = i14 + 1;
                i1.H(bArr4, (long) i14, (byte) ((int) j));
            }
        }

        public final void b1(byte[] bArr, int i11, int i12) throws IOException {
            try {
                System.arraycopy(bArr, i11, this.f9918e, this.f9921h, i12);
                this.f9921h += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9921h), Integer.valueOf(this.f9920g), Integer.valueOf(i12)}), e11);
            }
        }

        public void c0() {
        }

        public final void c1(int i11, k0 k0Var) throws IOException {
            W0(i11, 2);
            J0(k0Var);
        }

        public final int i0() {
            return this.f9920g - this.f9921h;
        }

        public final void j0(byte b11) throws IOException {
            try {
                byte[] bArr = this.f9918e;
                int i11 = this.f9921h;
                this.f9921h = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9921h), Integer.valueOf(this.f9920g), 1}), e11);
            }
        }

        public final void k0(int i11, boolean z11) throws IOException {
            W0(i11, 0);
            j0(z11 ? (byte) 1 : 0);
        }

        public final void n0(byte[] bArr, int i11, int i12) throws IOException {
            Y0(i12);
            b1(bArr, i11, i12);
        }

        public final void o0(int i11, ByteString byteString) throws IOException {
            W0(i11, 2);
            p0(byteString);
        }

        public final void p0(ByteString byteString) throws IOException {
            Y0(byteString.size());
            byteString.I(this);
        }

        public final void u0(int i11, int i12) throws IOException {
            W0(i11, 5);
            v0(i12);
        }

        public final void v0(int i11) throws IOException {
            try {
                byte[] bArr = this.f9918e;
                int i12 = this.f9921h;
                int i13 = i12 + 1;
                this.f9921h = i13;
                bArr[i12] = (byte) (i11 & 255);
                int i14 = i13 + 1;
                this.f9921h = i14;
                bArr[i13] = (byte) ((i11 >> 8) & 255);
                int i15 = i14 + 1;
                this.f9921h = i15;
                bArr[i14] = (byte) ((i11 >> 16) & 255);
                this.f9921h = i15 + 1;
                bArr[i15] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9921h), Integer.valueOf(this.f9920g), 1}), e11);
            }
        }

        public final void w0(int i11, long j) throws IOException {
            W0(i11, 1);
            x0(j);
        }

        public final void x0(long j) throws IOException {
            try {
                byte[] bArr = this.f9918e;
                int i11 = this.f9921h;
                int i12 = i11 + 1;
                this.f9921h = i12;
                bArr[i11] = (byte) (((int) j) & 255);
                int i13 = i12 + 1;
                this.f9921h = i13;
                bArr[i12] = (byte) (((int) (j >> 8)) & 255);
                int i14 = i13 + 1;
                this.f9921h = i14;
                bArr[i13] = (byte) (((int) (j >> 16)) & 255);
                int i15 = i14 + 1;
                this.f9921h = i15;
                bArr[i14] = (byte) (((int) (j >> 24)) & 255);
                int i16 = i15 + 1;
                this.f9921h = i16;
                bArr[i15] = (byte) (((int) (j >> 32)) & 255);
                int i17 = i16 + 1;
                this.f9921h = i17;
                bArr[i16] = (byte) (((int) (j >> 40)) & 255);
                int i18 = i17 + 1;
                this.f9921h = i18;
                bArr[i17] = (byte) (((int) (j >> 48)) & 255);
                this.f9921h = i18 + 1;
                bArr[i18] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9921h), Integer.valueOf(this.f9920g), 1}), e11);
            }
        }
    }

    private static final class d extends b {

        /* renamed from: i  reason: collision with root package name */
        private final OutputStream f9922i;

        d(OutputStream outputStream, int i11) {
            super(i11);
            Objects.requireNonNull(outputStream, "out");
            this.f9922i = outputStream;
        }

        private void i1() throws IOException {
            this.f9922i.write(this.f9914e, 0, this.f9916g);
            this.f9916g = 0;
        }

        private void j1(int i11) throws IOException {
            if (this.f9915f - this.f9916g < i11) {
                i1();
            }
        }

        public void E0(int i11, int i12) throws IOException {
            j1(20);
            f1(i11, 0);
            e1(i12);
        }

        public void F0(int i11) throws IOException {
            if (i11 >= 0) {
                Y0(i11);
            } else {
                a1((long) i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void I0(int i11, k0 k0Var, y0 y0Var) throws IOException {
            W0(i11, 2);
            m1(k0Var, y0Var);
        }

        public void J0(k0 k0Var) throws IOException {
            Y0(k0Var.getSerializedSize());
            k0Var.b(this);
        }

        public void K0(int i11, k0 k0Var) throws IOException {
            W0(1, 3);
            X0(2, i11);
            l1(3, k0Var);
            W0(1, 4);
        }

        public void L0(int i11, ByteString byteString) throws IOException {
            W0(1, 3);
            X0(2, i11);
            o0(3, byteString);
            W0(1, 4);
        }

        public void U0(int i11, String str) throws IOException {
            W0(i11, 2);
            V0(str);
        }

        public void V0(String str) throws IOException {
            int i11;
            int i12;
            try {
                int length = str.length() * 3;
                int X = CodedOutputStream.X(length);
                int i13 = X + length;
                int i14 = this.f9915f;
                if (i13 > i14) {
                    byte[] bArr = new byte[length];
                    int f11 = Utf8.f(str, bArr, 0, length);
                    Y0(f11);
                    a(bArr, 0, f11);
                    return;
                }
                if (i13 > i14 - this.f9916g) {
                    i1();
                }
                int X2 = CodedOutputStream.X(str.length());
                i11 = this.f9916g;
                if (X2 == X) {
                    int i15 = i11 + X2;
                    this.f9916g = i15;
                    int f12 = Utf8.f(str, this.f9914e, i15, this.f9915f - i15);
                    this.f9916g = i11;
                    i12 = (f12 - i11) - X2;
                    g1(i12);
                    this.f9916g = f12;
                } else {
                    i12 = Utf8.g(str);
                    g1(i12);
                    this.f9916g = Utf8.f(str, this.f9914e, this.f9916g, i12);
                }
                this.f9917h += i12;
            } catch (Utf8.UnpairedSurrogateException e11) {
                this.f9917h -= this.f9916g - i11;
                this.f9916g = i11;
                throw e11;
            } catch (ArrayIndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            } catch (Utf8.UnpairedSurrogateException e13) {
                d0(str, e13);
            }
        }

        public void W0(int i11, int i12) throws IOException {
            Y0(WireFormat.c(i11, i12));
        }

        public void X0(int i11, int i12) throws IOException {
            j1(20);
            f1(i11, 0);
            g1(i12);
        }

        public void Y0(int i11) throws IOException {
            j1(5);
            g1(i11);
        }

        public void Z0(int i11, long j) throws IOException {
            j1(20);
            f1(i11, 0);
            h1(j);
        }

        public void a(byte[] bArr, int i11, int i12) throws IOException {
            k1(bArr, i11, i12);
        }

        public void a1(long j) throws IOException {
            j1(10);
            h1(j);
        }

        public void c0() throws IOException {
            if (this.f9916g > 0) {
                i1();
            }
        }

        public void j0(byte b11) throws IOException {
            if (this.f9916g == this.f9915f) {
                i1();
            }
            b1(b11);
        }

        public void k0(int i11, boolean z11) throws IOException {
            j1(11);
            f1(i11, 0);
            b1(z11 ? (byte) 1 : 0);
        }

        public void k1(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.f9915f;
            int i14 = this.f9916g;
            if (i13 - i14 >= i12) {
                System.arraycopy(bArr, i11, this.f9914e, i14, i12);
                this.f9916g += i12;
                this.f9917h += i12;
                return;
            }
            int i15 = i13 - i14;
            System.arraycopy(bArr, i11, this.f9914e, i14, i15);
            int i16 = i11 + i15;
            int i17 = i12 - i15;
            this.f9916g = this.f9915f;
            this.f9917h += i15;
            i1();
            if (i17 <= this.f9915f) {
                System.arraycopy(bArr, i16, this.f9914e, 0, i17);
                this.f9916g = i17;
            } else {
                this.f9922i.write(bArr, i16, i17);
            }
            this.f9917h += i17;
        }

        public void l1(int i11, k0 k0Var) throws IOException {
            W0(i11, 2);
            J0(k0Var);
        }

        /* access modifiers changed from: package-private */
        public void m1(k0 k0Var, y0 y0Var) throws IOException {
            Y0(((a) k0Var).e(y0Var));
            y0Var.a(k0Var, this.f9912a);
        }

        public void n0(byte[] bArr, int i11, int i12) throws IOException {
            Y0(i12);
            k1(bArr, i11, i12);
        }

        public void o0(int i11, ByteString byteString) throws IOException {
            W0(i11, 2);
            p0(byteString);
        }

        public void p0(ByteString byteString) throws IOException {
            Y0(byteString.size());
            byteString.I(this);
        }

        public void u0(int i11, int i12) throws IOException {
            j1(14);
            f1(i11, 5);
            c1(i12);
        }

        public void v0(int i11) throws IOException {
            j1(4);
            c1(i11);
        }

        public void w0(int i11, long j) throws IOException {
            j1(18);
            f1(i11, 1);
            d1(j);
        }

        public void x0(long j) throws IOException {
            j1(8);
            d1(j);
        }
    }

    public static int A(int i11, y yVar) {
        return V(i11) + B(yVar);
    }

    public static int B(y yVar) {
        return C(yVar.b());
    }

    static int C(int i11) {
        return X(i11) + i11;
    }

    public static int D(int i11, k0 k0Var) {
        return (V(1) * 2) + W(2, i11) + E(3, k0Var);
    }

    public static int E(int i11, k0 k0Var) {
        return V(i11) + G(k0Var);
    }

    static int F(int i11, k0 k0Var, y0 y0Var) {
        return V(i11) + H(k0Var, y0Var);
    }

    public static int G(k0 k0Var) {
        return C(k0Var.getSerializedSize());
    }

    static int H(k0 k0Var, y0 y0Var) {
        return C(((a) k0Var).e(y0Var));
    }

    static int I(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    public static int J(int i11, ByteString byteString) {
        return (V(1) * 2) + W(2, i11) + g(3, byteString);
    }

    @Deprecated
    public static int K(int i11) {
        return X(i11);
    }

    public static int L(int i11, int i12) {
        return V(i11) + M(i12);
    }

    public static int M(int i11) {
        return 4;
    }

    public static int N(int i11, long j) {
        return V(i11) + O(j);
    }

    public static int O(long j) {
        return 8;
    }

    public static int P(int i11, int i12) {
        return V(i11) + Q(i12);
    }

    public static int Q(int i11) {
        return X(a0(i11));
    }

    public static int R(int i11, long j) {
        return V(i11) + S(j);
    }

    public static int S(long j) {
        return Z(b0(j));
    }

    public static int T(int i11, String str) {
        return V(i11) + U(str);
    }

    public static int U(String str) {
        int i11;
        try {
            i11 = Utf8.g(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i11 = str.getBytes(w.f10119a).length;
        }
        return C(i11);
    }

    public static int V(int i11) {
        return X(WireFormat.c(i11, 0));
    }

    public static int W(int i11, int i12) {
        return V(i11) + X(i12);
    }

    public static int X(int i11) {
        if ((i11 & -128) == 0) {
            return 1;
        }
        if ((i11 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i11) == 0) {
            return 3;
        }
        return (i11 & -268435456) == 0 ? 4 : 5;
    }

    public static int Y(int i11, long j) {
        return V(i11) + Z(j);
    }

    public static int Z(long j) {
        int i11;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i11 = 6;
            j >>>= 28;
        } else {
            i11 = 2;
        }
        if ((-2097152 & j) != 0) {
            i11 += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i11 + 1 : i11;
    }

    public static int a0(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i11, boolean z11) {
        return V(i11) + e(z11);
    }

    public static int e(boolean z11) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(OutputStream outputStream, int i11) {
        return new d(outputStream, i11);
    }

    public static int g(int i11, ByteString byteString) {
        return V(i11) + h(byteString);
    }

    public static CodedOutputStream g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(ByteString byteString) {
        return C(byteString.size());
    }

    public static CodedOutputStream h0(byte[] bArr, int i11, int i12) {
        return new c(bArr, i11, i12);
    }

    public static int i(int i11, double d11) {
        return V(i11) + j(d11);
    }

    public static int j(double d11) {
        return 8;
    }

    public static int k(int i11, int i12) {
        return V(i11) + l(i12);
    }

    public static int l(int i11) {
        return w(i11);
    }

    public static int m(int i11, int i12) {
        return V(i11) + n(i12);
    }

    public static int n(int i11) {
        return 4;
    }

    public static int o(int i11, long j) {
        return V(i11) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i11, float f11) {
        return V(i11) + r(f11);
    }

    public static int r(float f11) {
        return 4;
    }

    @Deprecated
    static int s(int i11, k0 k0Var, y0 y0Var) {
        return (V(i11) * 2) + u(k0Var, y0Var);
    }

    @Deprecated
    public static int t(k0 k0Var) {
        return k0Var.getSerializedSize();
    }

    @Deprecated
    static int u(k0 k0Var, y0 y0Var) {
        return ((a) k0Var).e(y0Var);
    }

    public static int v(int i11, int i12) {
        return V(i11) + w(i12);
    }

    public static int w(int i11) {
        if (i11 >= 0) {
            return X(i11);
        }
        return 10;
    }

    public static int x(int i11, long j) {
        return V(i11) + y(j);
    }

    public static int y(long j) {
        return Z(j);
    }

    public static int z(int i11, y yVar) {
        return (V(1) * 2) + W(2, i11) + A(3, yVar);
    }

    @Deprecated
    public final void A0(int i11, k0 k0Var) throws IOException {
        W0(i11, 3);
        C0(k0Var);
        W0(i11, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void B0(int i11, k0 k0Var, y0 y0Var) throws IOException {
        W0(i11, 3);
        D0(k0Var, y0Var);
        W0(i11, 4);
    }

    @Deprecated
    public final void C0(k0 k0Var) throws IOException {
        k0Var.b(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void D0(k0 k0Var, y0 y0Var) throws IOException {
        y0Var.a(k0Var, this.f9912a);
    }

    public abstract void E0(int i11, int i12) throws IOException;

    public abstract void F0(int i11) throws IOException;

    public final void G0(int i11, long j) throws IOException {
        Z0(i11, j);
    }

    public final void H0(long j) throws IOException {
        a1(j);
    }

    /* access modifiers changed from: package-private */
    public abstract void I0(int i11, k0 k0Var, y0 y0Var) throws IOException;

    public abstract void J0(k0 k0Var) throws IOException;

    public abstract void K0(int i11, k0 k0Var) throws IOException;

    public abstract void L0(int i11, ByteString byteString) throws IOException;

    public final void M0(int i11, int i12) throws IOException {
        u0(i11, i12);
    }

    public final void N0(int i11) throws IOException {
        v0(i11);
    }

    public final void O0(int i11, long j) throws IOException {
        w0(i11, j);
    }

    public final void P0(long j) throws IOException {
        x0(j);
    }

    public final void Q0(int i11, int i12) throws IOException {
        X0(i11, a0(i12));
    }

    public final void R0(int i11) throws IOException {
        Y0(a0(i11));
    }

    public final void S0(int i11, long j) throws IOException {
        Z0(i11, b0(j));
    }

    public final void T0(long j) throws IOException {
        a1(b0(j));
    }

    public abstract void U0(int i11, String str) throws IOException;

    public abstract void V0(String str) throws IOException;

    public abstract void W0(int i11, int i12) throws IOException;

    public abstract void X0(int i11, int i12) throws IOException;

    public abstract void Y0(int i11) throws IOException;

    public abstract void Z0(int i11, long j) throws IOException;

    public abstract void a(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void a1(long j) throws IOException;

    public final void c() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0() throws IOException;

    /* access modifiers changed from: package-private */
    public final void d0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f9910c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(w.f10119a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        } catch (OutOfSpaceException e12) {
            throw e12;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e0() {
        return this.f9913b;
    }

    public abstract int i0();

    public abstract void j0(byte b11) throws IOException;

    public abstract void k0(int i11, boolean z11) throws IOException;

    public final void l0(boolean z11) throws IOException {
        j0(z11 ? (byte) 1 : 0);
    }

    public final void m0(byte[] bArr) throws IOException {
        n0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void n0(byte[] bArr, int i11, int i12) throws IOException;

    public abstract void o0(int i11, ByteString byteString) throws IOException;

    public abstract void p0(ByteString byteString) throws IOException;

    public final void q0(int i11, double d11) throws IOException {
        w0(i11, Double.doubleToRawLongBits(d11));
    }

    public final void r0(double d11) throws IOException {
        x0(Double.doubleToRawLongBits(d11));
    }

    public final void s0(int i11, int i12) throws IOException {
        E0(i11, i12);
    }

    public final void t0(int i11) throws IOException {
        F0(i11);
    }

    public abstract void u0(int i11, int i12) throws IOException;

    public abstract void v0(int i11) throws IOException;

    public abstract void w0(int i11, long j) throws IOException;

    public abstract void x0(long j) throws IOException;

    public final void y0(int i11, float f11) throws IOException {
        u0(i11, Float.floatToRawIntBits(f11));
    }

    public final void z0(float f11) throws IOException {
        v0(Float.floatToRawIntBits(f11));
    }

    private CodedOutputStream() {
    }
}
