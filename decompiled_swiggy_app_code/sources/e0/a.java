package e0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Applier.kt */
public abstract class a<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f14159a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f14160b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private T f14161c;

    public a(T t) {
        this.f14159a = t;
        this.f14161c = t;
    }

    public T a() {
        return this.f14161c;
    }

    public /* synthetic */ void c() {
        d.b(this);
    }

    public final void clear() {
        this.f14160b.clear();
        l(this.f14159a);
        k();
    }

    public /* synthetic */ void d() {
        d.a(this);
    }

    public void h(T t) {
        this.f14160b.add(a());
        l(t);
    }

    public void i() {
        if (!this.f14160b.isEmpty()) {
            List<T> list = this.f14160b;
            l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final T j() {
        return this.f14159a;
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    /* access modifiers changed from: protected */
    public void l(T t) {
        this.f14161c = t;
    }
}
