package androidx.constraintlayout.core;

/* compiled from: Pools */
class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f8062a;

    /* renamed from: b  reason: collision with root package name */
    private int f8063b;

    f(int i11) {
        if (i11 > 0) {
            this.f8062a = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(T t) {
        int i11 = this.f8063b;
        Object[] objArr = this.f8062a;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = t;
        this.f8063b = i11 + 1;
        return true;
    }

    public T b() {
        int i11 = this.f8063b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        T[] tArr = this.f8062a;
        T t = tArr[i12];
        tArr[i12] = null;
        this.f8063b = i11 - 1;
        return t;
    }

    public void c(T[] tArr, int i11) {
        if (i11 > tArr.length) {
            i11 = tArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            T t = tArr[i12];
            int i13 = this.f8063b;
            Object[] objArr = this.f8062a;
            if (i13 < objArr.length) {
                objArr[i13] = t;
                this.f8063b = i13 + 1;
            }
        }
    }
}
