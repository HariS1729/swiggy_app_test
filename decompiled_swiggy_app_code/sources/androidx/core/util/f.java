package androidx.core.util;

/* compiled from: Pools */
public class f<T> extends Pools$SimplePool<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f9418c = new Object();

    public f(int i11) {
        super(i11);
    }

    public boolean a(T t) {
        boolean a11;
        synchronized (this.f9418c) {
            a11 = super.a(t);
        }
        return a11;
    }

    public T b() {
        T b11;
        synchronized (this.f9418c) {
            b11 = super.b();
        }
        return b11;
    }
}
