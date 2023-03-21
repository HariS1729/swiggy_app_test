package e0;

import kotlin.jvm.internal.p;

/* compiled from: Composer.kt */
public final class n0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final l<T> f14212a;

    /* renamed from: b  reason: collision with root package name */
    private final T f14213b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14214c;

    public n0(l<T> lVar, T t, boolean z11) {
        p.j(lVar, "compositionLocal");
        this.f14212a = lVar;
        this.f14213b = t;
        this.f14214c = z11;
    }

    public final boolean a() {
        return this.f14214c;
    }

    public final l<T> b() {
        return this.f14212a;
    }

    public final T c() {
        return this.f14213b;
    }
}
