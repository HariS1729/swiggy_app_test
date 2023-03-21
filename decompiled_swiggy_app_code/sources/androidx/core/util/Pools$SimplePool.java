package androidx.core.util;

public class Pools$SimplePool<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f9414a;

    /* renamed from: b  reason: collision with root package name */
    private int f9415b;

    public Pools$SimplePool(int i11) {
        if (i11 > 0) {
            this.f9414a = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t) {
        for (int i11 = 0; i11 < this.f9415b; i11++) {
            if (this.f9414a[i11] == t) {
                return true;
            }
        }
        return false;
    }

    public boolean a(T t) {
        if (!c(t)) {
            int i11 = this.f9415b;
            Object[] objArr = this.f9414a;
            if (i11 >= objArr.length) {
                return false;
            }
            objArr[i11] = t;
            this.f9415b = i11 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i11 = this.f9415b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        T[] tArr = this.f9414a;
        T t = tArr[i12];
        tArr[i12] = null;
        this.f9415b = i11 - 1;
        return t;
    }
}
