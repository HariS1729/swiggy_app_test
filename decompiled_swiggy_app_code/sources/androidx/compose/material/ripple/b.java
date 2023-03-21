package androidx.compose.material.ripple;

import e0.d1;
import kotlin.jvm.internal.p;
import s.i;
import u.h;
import u.n;
import w0.f;
import wp0.j0;

/* compiled from: Ripple.kt */
public abstract class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private final StateLayer f5864a;

    public b(boolean z11, d1<d0.b> d1Var) {
        p.j(d1Var, "rippleAlpha");
        this.f5864a = new StateLayer(z11, d1Var);
    }

    public abstract void c(n nVar, j0 j0Var);

    public final void d(f fVar, float f11, long j) {
        p.j(fVar, "$receiver");
        this.f5864a.b(fVar, f11, j);
    }

    public abstract void e(n nVar);

    public final void h(h hVar, j0 j0Var) {
        p.j(hVar, "interaction");
        p.j(j0Var, "scope");
        this.f5864a.c(hVar, j0Var);
    }
}
