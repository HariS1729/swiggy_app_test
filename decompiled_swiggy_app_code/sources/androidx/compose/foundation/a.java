package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.d;
import r0.f;
import t0.l;
import u0.c1;
import u0.d0;
import u0.e0;
import u0.j1;
import u0.r0;
import u0.s0;
import u0.u;
import w0.c;
import w0.e;
import w0.g;

/* compiled from: Background.kt */
final class a extends o0 implements f {

    /* renamed from: b  reason: collision with root package name */
    private final d0 f3171b;

    /* renamed from: c  reason: collision with root package name */
    private final u f3172c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3173d;

    /* renamed from: e  reason: collision with root package name */
    private final j1 f3174e;

    /* renamed from: f  reason: collision with root package name */
    private l f3175f;

    /* renamed from: g  reason: collision with root package name */
    private LayoutDirection f3176g;

    /* renamed from: h  reason: collision with root package name */
    private r0 f3177h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d0 d0Var, u uVar, float f11, j1 j1Var, lp0.l lVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : d0Var, (i11 & 2) != 0 ? null : uVar, (i11 & 4) != 0 ? 1.0f : f11, j1Var, lVar, (i) null);
    }

    public /* synthetic */ a(d0 d0Var, u uVar, float f11, j1 j1Var, lp0.l lVar, i iVar) {
        this(d0Var, uVar, f11, j1Var, lVar);
    }

    private final void c(c cVar) {
        r0 r0Var;
        if (!l.e(cVar.d(), this.f3175f) || cVar.getLayoutDirection() != this.f3176g) {
            r0Var = this.f3174e.a(cVar.d(), cVar.getLayoutDirection(), cVar);
        } else {
            r0Var = this.f3177h;
            p.g(r0Var);
        }
        d0 d0Var = this.f3171b;
        if (d0Var != null) {
            d0Var.v();
            s0.e(cVar, r0Var, this.f3171b.v(), 0.0f, (g) null, (e0) null, 0, 60, (Object) null);
        }
        u uVar = this.f3172c;
        if (uVar != null) {
            s0.c(cVar, r0Var, uVar, this.f3173d, (g) null, (e0) null, 0, 56, (Object) null);
        }
        this.f3177h = r0Var;
        this.f3175f = l.c(cVar.d());
    }

    private final void d(c cVar) {
        d0 d0Var = this.f3171b;
        if (d0Var != null) {
            e.n(cVar, d0Var.v(), 0, 0, 0.0f, (g) null, (e0) null, 0, 126, (Object) null);
        }
        u uVar = this.f3172c;
        if (uVar != null) {
            e.m(cVar, uVar, 0, 0, this.f3173d, (g) null, (e0) null, 0, 118, (Object) null);
        }
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public void b(c cVar) {
        p.j(cVar, "<this>");
        if (this.f3174e == c1.a()) {
            d(cVar);
        } else {
            c(cVar);
        }
        cVar.V();
    }

    public boolean equals(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null || !p.e(this.f3171b, aVar.f3171b) || !p.e(this.f3172c, aVar.f3172c)) {
            return false;
        }
        if (!(this.f3173d == aVar.f3173d) || !p.e(this.f3174e, aVar.f3174e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        d0 d0Var = this.f3171b;
        int i11 = 0;
        int t = (d0Var != null ? d0.t(d0Var.v()) : 0) * 31;
        u uVar = this.f3172c;
        if (uVar != null) {
            i11 = uVar.hashCode();
        }
        return ((((t + i11) * 31) + Float.floatToIntBits(this.f3173d)) * 31) + this.f3174e.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public String toString() {
        return "Background(color=" + this.f3171b + ", brush=" + this.f3172c + ", alpha = " + this.f3173d + ", shape=" + this.f3174e + ')';
    }

    public /* synthetic */ boolean x(lp0.l lVar) {
        return p0.e.a(this, lVar);
    }

    private a(d0 d0Var, u uVar, float f11, j1 j1Var, lp0.l<? super n0, k> lVar) {
        super(lVar);
        this.f3171b = d0Var;
        this.f3172c = uVar;
        this.f3173d = f11;
        this.f3174e = j1Var;
    }
}
