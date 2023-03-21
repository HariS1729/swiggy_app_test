package androidx.compose.material.ripple;

import d0.b;
import e0.d1;
import e0.g;
import e0.u;
import fp0.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import s.h;
import u0.d0;

/* compiled from: Ripple.kt */
public abstract class Ripple implements h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5809a;

    /* renamed from: b  reason: collision with root package name */
    private final float f5810b;

    /* renamed from: c  reason: collision with root package name */
    private final d1<d0> f5811c;

    private Ripple(boolean z11, float f11, d1<d0> d1Var) {
        this.f5809a = z11;
        this.f5810b = f11;
        this.f5811c = d1Var;
    }

    public /* synthetic */ Ripple(boolean z11, float f11, d1 d1Var, i iVar) {
        this(z11, f11, d1Var);
    }

    public final s.i a(u.i iVar, g gVar, int i11) {
        long j;
        p.j(iVar, "interactionSource");
        gVar.E(-1524341239);
        d0.i iVar2 = (d0.i) gVar.z(RippleThemeKt.d());
        gVar.E(-1524341038);
        if (this.f5811c.getValue().v() != d0.f16756b.f()) {
            j = this.f5811c.getValue().v();
        } else {
            j = iVar2.b(gVar, 0);
        }
        gVar.P();
        b b11 = b(iVar, this.f5809a, this.f5810b, androidx.compose.runtime.g.m(d0.h(j), gVar, 0), androidx.compose.runtime.g.m(iVar2.a(gVar, 0), gVar, 0), gVar, (i11 & 14) | (458752 & (i11 << 12)));
        u.d(b11, iVar, new Ripple$rememberUpdatedInstance$1(iVar, b11, (c<? super Ripple$rememberUpdatedInstance$1>) null), gVar, ((i11 << 3) & 112) | 8);
        gVar.P();
        return b11;
    }

    public abstract b b(u.i iVar, boolean z11, float f11, d1<d0> d1Var, d1<b> d1Var2, g gVar, int i11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.f5809a == ripple.f5809a && d2.h.p(this.f5810b, ripple.f5810b) && p.e(this.f5811c, ripple.f5811c);
    }

    public int hashCode() {
        return (((a0.h.a(this.f5809a) * 31) + d2.h.q(this.f5810b)) * 31) + this.f5811c.hashCode();
    }
}
