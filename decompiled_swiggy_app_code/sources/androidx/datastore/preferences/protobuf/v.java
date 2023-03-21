package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList */
final class v extends c<Integer> implements w.g, RandomAccess, t0 {

    /* renamed from: d  reason: collision with root package name */
    private static final v f10113d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f10114b;

    /* renamed from: c  reason: collision with root package name */
    private int f10115c;

    static {
        v vVar = new v(new int[0], 0);
        f10113d = vVar;
        vVar.makeImmutable();
    }

    v() {
        this(new int[10], 0);
    }

    private void f(int i11, int i12) {
        int i13;
        c();
        if (i11 < 0 || i11 > (i13 = this.f10115c)) {
            throw new IndexOutOfBoundsException(i(i11));
        }
        int[] iArr = this.f10114b;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
        } else {
            int[] iArr2 = new int[(((i13 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f10114b, i11, iArr2, i11 + 1, this.f10115c - i11);
            this.f10114b = iArr2;
        }
        this.f10114b[i11] = i12;
        this.f10115c++;
        this.modCount++;
    }

    private void g(int i11) {
        if (i11 < 0 || i11 >= this.f10115c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f10115c;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        w.a(collection);
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i11 = vVar.f10115c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10115c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.f10114b;
            if (i13 > iArr.length) {
                this.f10114b = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(vVar.f10114b, 0, this.f10114b, this.f10115c, vVar.f10115c);
            this.f10115c = i13;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addInt(int i11) {
        c();
        int i12 = this.f10115c;
        int[] iArr = this.f10114b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f10114b = iArr2;
        }
        int[] iArr3 = this.f10114b;
        int i13 = this.f10115c;
        this.f10115c = i13 + 1;
        iArr3[i13] = i11;
    }

    /* renamed from: d */
    public void add(int i11, Integer num) {
        f(i11, num.intValue());
    }

    /* renamed from: e */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f10115c != vVar.f10115c) {
            return false;
        }
        int[] iArr = vVar.f10114b;
        for (int i11 = 0; i11 < this.f10115c; i11++) {
            if (this.f10114b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i11) {
        g(i11);
        return this.f10114b[i11];
    }

    /* renamed from: h */
    public Integer get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f10115c; i12++) {
            i11 = (i11 * 31) + this.f10114b[i12];
        }
        return i11;
    }

    /* renamed from: k */
    public w.g mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f10115c) {
            return new v(Arrays.copyOf(this.f10114b, i11), this.f10115c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public Integer remove(int i11) {
        c();
        g(i11);
        int[] iArr = this.f10114b;
        int i12 = iArr[i11];
        int i13 = this.f10115c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f10115c--;
        this.modCount++;
        return Integer.valueOf(i12);
    }

    /* renamed from: m */
    public Integer set(int i11, Integer num) {
        return Integer.valueOf(setInt(i11, num.intValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i11, int i12) {
        c();
        if (i12 >= i11) {
            int[] iArr = this.f10114b;
            System.arraycopy(iArr, i12, iArr, i11, this.f10115c - i12);
            this.f10115c -= i12 - i11;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int setInt(int i11, int i12) {
        c();
        g(i11);
        int[] iArr = this.f10114b;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    public int size() {
        return this.f10115c;
    }

    private v(int[] iArr, int i11) {
        this.f10114b = iArr;
        this.f10115c = i11;
    }

    public boolean remove(Object obj) {
        c();
        for (int i11 = 0; i11 < this.f10115c; i11++) {
            if (obj.equals(Integer.valueOf(this.f10114b[i11]))) {
                int[] iArr = this.f10114b;
                System.arraycopy(iArr, i11 + 1, iArr, i11, (this.f10115c - i11) - 1);
                this.f10115c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
