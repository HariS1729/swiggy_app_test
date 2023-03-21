package androidx.compose.runtime;

import kotlin.jvm.internal.p;

/* compiled from: Composer.kt */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final RecomposeScopeImpl f6123a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6124b;

    /* renamed from: c  reason: collision with root package name */
    private f0.c<Object> f6125c;

    public c(RecomposeScopeImpl recomposeScopeImpl, int i11, f0.c<Object> cVar) {
        p.j(recomposeScopeImpl, "scope");
        this.f6123a = recomposeScopeImpl;
        this.f6124b = i11;
        this.f6125c = cVar;
    }

    public final f0.c<Object> a() {
        return this.f6125c;
    }

    public final int b() {
        return this.f6124b;
    }

    public final RecomposeScopeImpl c() {
        return this.f6123a;
    }

    public final boolean d() {
        return this.f6123a.v(this.f6125c);
    }

    public final void e(f0.c<Object> cVar) {
        this.f6125c = cVar;
    }
}
