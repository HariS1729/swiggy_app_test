package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f9898b = new LiteralByteString(w.f10121c);

    /* renamed from: c  reason: collision with root package name */
    private static final e f9899c = (d.c() ? new h((a) null) : new d((a) null));

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<ByteString> f9900d = new b();

    /* renamed from: a  reason: collision with root package name */
    private int f9901a = 0;

    private static final class BoundedByteString extends LiteralByteString {

        /* renamed from: f  reason: collision with root package name */
        private final int f9902f;

        /* renamed from: g  reason: collision with root package name */
        private final int f9903g;

        BoundedByteString(byte[] bArr, int i11, int i12) {
            super(bArr);
            ByteString.e(i11, i11 + i12, bArr.length);
            this.f9902f = i11;
            this.f9903g = i12;
        }

        /* access modifiers changed from: protected */
        public int K() {
            return this.f9902f;
        }

        public byte c(int i11) {
            ByteString.d(i11, size());
            return this.f9904e[this.f9902f + i11];
        }

        /* access modifiers changed from: protected */
        public void k(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f9904e, K() + i11, bArr, i12, i13);
        }

        /* access modifiers changed from: package-private */
        public byte l(int i11) {
            return this.f9904e[this.f9902f + i11];
        }

        public int size() {
            return this.f9903g;
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }
    }

    private static class LiteralByteString extends LeafByteString {

        /* renamed from: e  reason: collision with root package name */
        protected final byte[] f9904e;

        LiteralByteString(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f9904e = bArr;
        }

        /* access modifiers changed from: protected */
        public final String E(Charset charset) {
            return new String(this.f9904e, K(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void I(g gVar) throws IOException {
            gVar.a(this.f9904e, K(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean J(ByteString byteString, int i11, int i12) {
            if (i12 <= byteString.size()) {
                int i13 = i11 + i12;
                if (i13 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + byteString.size());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.s(i11, i13).equals(s(0, i12));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.f9904e;
                    byte[] bArr2 = literalByteString.f9904e;
                    int K = K() + i12;
                    int K2 = K();
                    int K3 = literalByteString.K() + i11;
                    while (K2 < K) {
                        if (bArr[K2] != bArr2[K3]) {
                            return false;
                        }
                        K2++;
                        K3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i12 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int K() {
            return 0;
        }

        public byte c(int i11) {
            return this.f9904e[i11];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int r11 = r();
            int r12 = literalByteString.r();
            if (r11 == 0 || r12 == 0 || r11 == r12) {
                return J(literalByteString, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void k(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f9904e, i11, bArr, i12, i13);
        }

        /* access modifiers changed from: package-private */
        public byte l(int i11) {
            return this.f9904e[i11];
        }

        public final boolean m() {
            int K = K();
            return Utf8.n(this.f9904e, K, size() + K);
        }

        public final h p() {
            return h.j(this.f9904e, K(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int q(int i11, int i12, int i13) {
            return w.i(i11, this.f9904e, K() + i12, i13);
        }

        public final ByteString s(int i11, int i12) {
            int e11 = ByteString.e(i11, i12, size());
            if (e11 == 0) {
                return ByteString.f9898b;
            }
            return new BoundedByteString(this.f9904e, K() + i11, e11);
        }

        public int size() {
            return this.f9904e.length;
        }
    }

    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f9905a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f9906b;

        a() {
            this.f9906b = ByteString.this.size();
        }

        public boolean hasNext() {
            return this.f9905a < this.f9906b;
        }

        public byte nextByte() {
            int i11 = this.f9905a;
            if (i11 < this.f9906b) {
                this.f9905a = i11 + 1;
                return ByteString.this.l(i11);
            }
            throw new NoSuchElementException();
        }
    }

    static class b implements Comparator<ByteString> {
        b() {
        }

        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            f n = byteString.iterator();
            f n11 = byteString2.iterator();
            while (n.hasNext() && n11.hasNext()) {
                int compare = Integer.compare(ByteString.v(n.nextByte()), ByteString.v(n11.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    static abstract class c implements f {
        c() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements e {
        private d() {
        }

        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private interface e {
        byte[] copyFrom(byte[] bArr, int i11, int i12);
    }

    public interface f extends Iterator<Byte> {
        byte nextByte();
    }

    static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final CodedOutputStream f9908a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f9909b;

        /* synthetic */ g(int i11, a aVar) {
            this(i11);
        }

        public ByteString a() {
            this.f9908a.c();
            return new LiteralByteString(this.f9909b);
        }

        public CodedOutputStream b() {
            return this.f9908a;
        }

        private g(int i11) {
            byte[] bArr = new byte[i11];
            this.f9909b = bArr;
            this.f9908a = CodedOutputStream.g0(bArr);
        }
    }

    private static final class h implements e {
        private h() {
        }

        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    ByteString() {
    }

    static ByteString G(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    static ByteString H(byte[] bArr, int i11, int i12) {
        return new BoundedByteString(bArr, i11, i12);
    }

    static void d(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return;
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
    }

    static int e(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        } else if (i12 < i11) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
        }
    }

    public static ByteString g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static ByteString h(byte[] bArr, int i11, int i12) {
        e(i11, i11 + i12, bArr.length);
        return new LiteralByteString(f9899c.copyFrom(bArr, i11, i12));
    }

    public static ByteString i(String str) {
        return new LiteralByteString(str.getBytes(w.f10119a));
    }

    static g o(int i11) {
        return new g(i11, (a) null);
    }

    /* access modifiers changed from: private */
    public static int v(byte b11) {
        return b11 & 255;
    }

    public final String D(Charset charset) {
        return size() == 0 ? "" : E(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String E(Charset charset);

    public final String F() {
        return D(w.f10119a);
    }

    /* access modifiers changed from: package-private */
    public abstract void I(g gVar) throws IOException;

    public abstract byte c(int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.f9901a;
        if (i11 == 0) {
            int size = size();
            i11 = q(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f9901a = i11;
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public abstract void k(byte[] bArr, int i11, int i12, int i13);

    /* access modifiers changed from: package-private */
    public abstract byte l(int i11);

    public abstract boolean m();

    /* renamed from: n */
    public f iterator() {
        return new a();
    }

    public abstract h p();

    /* access modifiers changed from: protected */
    public abstract int q(int i11, int i12, int i13);

    /* access modifiers changed from: protected */
    public final int r() {
        return this.f9901a;
    }

    public abstract ByteString s(int i11, int i12);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return w.f10121c;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
