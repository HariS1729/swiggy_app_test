package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList */
final class f extends c<Boolean> implements w.a, RandomAccess, t0 {

    /* renamed from: d  reason: collision with root package name */
    private static final f f10005d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f10006b;

    /* renamed from: c  reason: collision with root package name */
    private int f10007c;

    static {
        f fVar = new f(new boolean[0], 0);
        f10005d = fVar;
        fVar.makeImmutable();
    }

    f() {
        this(new boolean[10], 0);
    }

    private void f(int i11, boolean z11) {
        int i12;
        c();
        if (i11 < 0 || i11 > (i12 = this.f10007c)) {
            throw new IndexOutOfBoundsException(i(i11));
        }
        boolean[] zArr = this.f10006b;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[(((i12 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.f10006b, i11, zArr2, i11 + 1, this.f10007c - i11);
            this.f10006b = zArr2;
        }
        this.f10006b[i11] = z11;
        this.f10007c++;
        this.modCount++;
    }

    private void g(int i11) {
        if (i11 < 0 || i11 >= this.f10007c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f10007c;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        w.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i11 = fVar.f10007c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10007c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            boolean[] zArr = this.f10006b;
            if (i13 > zArr.length) {
                this.f10006b = Arrays.copyOf(zArr, i13);
            }
            System.arraycopy(fVar.f10006b, 0, this.f10006b, this.f10007c, fVar.f10007c);
            this.f10007c = i13;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addBoolean(boolean z11) {
        c();
        int i11 = this.f10007c;
        boolean[] zArr = this.f10006b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.f10006b = zArr2;
        }
        boolean[] zArr3 = this.f10006b;
        int i12 = this.f10007c;
        this.f10007c = i12 + 1;
        zArr3[i12] = z11;
    }

    /* renamed from: d */
    public void add(int i11, Boolean bool) {
        f(i11, bool.booleanValue());
    }

    /* renamed from: e */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f10007c != fVar.f10007c) {
            return false;
        }
        boolean[] zArr = fVar.f10006b;
        for (int i11 = 0; i11 < this.f10007c; i11++) {
            if (this.f10006b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(int i11) {
        g(i11);
        return this.f10006b[i11];
    }

    /* renamed from: h */
    public Boolean get(int i11) {
        return Boolean.valueOf(getBoolean(i11));
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f10007c; i12++) {
            i11 = (i11 * 31) + w.c(this.f10006b[i12]);
        }
        return i11;
    }

    /* renamed from: k */
    public w.a mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f10007c) {
            return new f(Arrays.copyOf(this.f10006b, i11), this.f10007c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public Boolean remove(int i11) {
        c();
        g(i11);
        boolean[] zArr = this.f10006b;
        boolean z11 = zArr[i11];
        int i12 = this.f10007c;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f10007c--;
        this.modCount++;
        return Boolean.valueOf(z11);
    }

    /* renamed from: m */
    public Boolean set(int i11, Boolean bool) {
        return Boolean.valueOf(setBoolean(i11, bool.booleanValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i11, int i12) {
        c();
        if (i12 >= i11) {
            boolean[] zArr = this.f10006b;
            System.arraycopy(zArr, i12, zArr, i11, this.f10007c - i12);
            this.f10007c -= i12 - i11;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public boolean setBoolean(int i11, boolean z11) {
        c();
        g(i11);
        boolean[] zArr = this.f10006b;
        boolean z12 = zArr[i11];
        zArr[i11] = z11;
        return z12;
    }

    public int size() {
        return this.f10007c;
    }

    private f(boolean[] zArr, int i11) {
        this.f10006b = zArr;
        this.f10007c = i11;
    }

    public boolean remove(Object obj) {
        c();
        for (int i11 = 0; i11 < this.f10007c; i11++) {
            if (obj.equals(Boolean.valueOf(this.f10006b[i11]))) {
                boolean[] zArr = this.f10006b;
                System.arraycopy(zArr, i11 + 1, zArr, i11, (this.f10007c - i11) - 1);
                this.f10007c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
