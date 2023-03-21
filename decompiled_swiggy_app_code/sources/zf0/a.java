package zf0;

import java.util.HashSet;

/* compiled from: ScreenObservable.kt */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<T> f20064a = new HashSet<>();

    public final void c() {
        this.f20064a.clear();
    }

    public final HashSet<T> f() {
        return this.f20064a;
    }

    public final void g(T t) {
        this.f20064a.add(t);
    }

    public final void j(T t) {
        this.f20064a.remove(t);
    }
}
