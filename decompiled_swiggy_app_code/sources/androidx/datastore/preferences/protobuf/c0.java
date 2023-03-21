package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList */
final class c0 extends c<Long> implements w.h, RandomAccess, t0 {

    /* renamed from: d  reason: collision with root package name */
    private static final c0 f9976d;

    /* renamed from: b  reason: collision with root package name */
    private long[] f9977b;

    /* renamed from: c  reason: collision with root package name */
    private int f9978c;

    static {
        c0 c0Var = new c0(new long[0], 0);
        f9976d = c0Var;
        c0Var.makeImmutable();
    }

    c0() {
        this(new long[10], 0);
    }

    private void f(int i11, long j) {
        int i12;
        c();
        if (i11 < 0 || i11 > (i12 = this.f9978c)) {
            throw new IndexOutOfBoundsException(i(i11));
        }
        long[] jArr = this.f9977b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[(((i12 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.f9977b, i11, jArr2, i11 + 1, this.f9978c - i11);
            this.f9977b = jArr2;
        }
        this.f9977b[i11] = j;
        this.f9978c++;
        this.modCount++;
    }

    private void g(int i11) {
        if (i11 < 0 || i11 >= this.f9978c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f9978c;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        c();
        w.a(collection);
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i11 = c0Var.f9978c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f9978c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.f9977b;
            if (i13 > jArr.length) {
                this.f9977b = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(c0Var.f9977b, 0, this.f9977b, this.f9978c, c0Var.f9978c);
            this.f9978c = i13;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addLong(long j) {
        c();
        int i11 = this.f9978c;
        long[] jArr = this.f9977b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f9977b = jArr2;
        }
        long[] jArr3 = this.f9977b;
        int i12 = this.f9978c;
        this.f9978c = i12 + 1;
        jArr3[i12] = j;
    }

    /* renamed from: d */
    public void add(int i11, Long l11) {
        f(i11, l11.longValue());
    }

    /* renamed from: e */
    public boolean add(Long l11) {
        addLong(l11.longValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f9978c != c0Var.f9978c) {
            return false;
        }
        long[] jArr = c0Var.f9977b;
        for (int i11 = 0; i11 < this.f9978c; i11++) {
            if (this.f9977b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i11) {
        g(i11);
        return this.f9977b[i11];
    }

    /* renamed from: h */
    public Long get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f9978c; i12++) {
            i11 = (i11 * 31) + w.f(this.f9977b[i12]);
        }
        return i11;
    }

    /* renamed from: k */
    public w.h mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f9978c) {
            return new c0(Arrays.copyOf(this.f9977b, i11), this.f9978c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public Long remove(int i11) {
        c();
        g(i11);
        long[] jArr = this.f9977b;
        long j = jArr[i11];
        int i12 = this.f9978c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f9978c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: m */
    public Long set(int i11, Long l11) {
        return Long.valueOf(setLong(i11, l11.longValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i11, int i12) {
        c();
        if (i12 >= i11) {
            long[] jArr = this.f9977b;
            System.arraycopy(jArr, i12, jArr, i11, this.f9978c - i12);
            this.f9978c -= i12 - i11;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public long setLong(int i11, long j) {
        c();
        g(i11);
        long[] jArr = this.f9977b;
        long j11 = jArr[i11];
        jArr[i11] = j;
        return j11;
    }

    public int size() {
        return this.f9978c;
    }

    private c0(long[] jArr, int i11) {
        this.f9977b = jArr;
        this.f9978c = i11;
    }

    public boolean remove(Object obj) {
        c();
        for (int i11 = 0; i11 < this.f9978c; i11++) {
            if (obj.equals(Long.valueOf(this.f9977b[i11]))) {
                long[] jArr = this.f9977b;
                System.arraycopy(jArr, i11 + 1, jArr, i11, (this.f9978c - i11) - 1);
                this.f9978c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
