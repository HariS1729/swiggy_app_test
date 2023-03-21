package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import e0.a1;
import e0.h0;
import i1.e0;
import i1.h;
import i1.q;
import i1.w;
import k1.j;
import k1.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.j0;
import u0.t0;
import u0.u0;
import u0.x;

/* compiled from: ModifiedLayoutNode.kt */
public final class b extends LayoutNodeWrapper {
    public static final a G = new a((i) null);
    private static final t0 H;
    private LayoutNodeWrapper C;
    private q D;
    private boolean E;
    private h0<q> F;

    /* compiled from: ModifiedLayoutNode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        t0 a11 = u0.i.a();
        a11.h(d0.f16756b.b());
        a11.o(1.0f);
        a11.n(u0.f16890a.b());
        H = a11;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(LayoutNodeWrapper layoutNodeWrapper, q qVar) {
        super(layoutNodeWrapper.j1());
        p.j(layoutNodeWrapper, "wrapped");
        p.j(qVar, "modifier");
        this.C = layoutNodeWrapper;
        this.D = qVar;
    }

    private final q Y1() {
        h0<q> h0Var = this.F;
        if (h0Var == null) {
            h0Var = j.e(this.D, (a1) null, 2, (Object) null);
        }
        this.F = h0Var;
        return h0Var.getValue();
    }

    /* access modifiers changed from: protected */
    public void D0(long j, float f11, l<? super j0, k> lVar) {
        super.D0(j, f11, lVar);
        LayoutNodeWrapper s12 = s1();
        boolean z11 = true;
        if (s12 == null || !s12.B1()) {
            z11 = false;
        }
        if (!z11) {
            J1();
            e0.a.C0133a aVar = e0.a.f14880a;
            int g11 = d2.p.g(n0());
            LayoutDirection layoutDirection = l1().getLayoutDirection();
            int z12 = aVar.h();
            LayoutDirection y11 = aVar.g();
            e0.a.f14882c = g11;
            e0.a.f14881b = layoutDirection;
            k1().d();
            e0.a.f14882c = z12;
            e0.a.f14881b = y11;
        }
    }

    public void E1() {
        super.E1();
        r1().P1(this);
    }

    public void I1() {
        super.I1();
        h0<q> h0Var = this.F;
        if (h0Var != null) {
            h0Var.setValue(this.D);
        }
    }

    public int J(int i11) {
        return Y1().n0(l1(), r1(), i11);
    }

    public int K(int i11) {
        return Y1().L(l1(), r1(), i11);
    }

    public void K1(x xVar) {
        p.j(xVar, "canvas");
        r1().Y0(xVar);
        if (j.a(j1()).getShowLayoutBounds()) {
            Z0(xVar, H);
        }
    }

    public int L(int i11) {
        return Y1().p(l1(), r1(), i11);
    }

    public e0 N(long j) {
        G0(j);
        N1(this.D.K(l1(), r1(), j));
        o h12 = h1();
        if (h12 != null) {
            h12.d(n0());
        }
        H1();
        return this;
    }

    public int U0(i1.a aVar) {
        int i11;
        p.j(aVar, "alignmentLine");
        if (k1().a().containsKey(aVar)) {
            Integer num = k1().a().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int A = r1().A(aVar);
        if (A == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        O1(true);
        D0(o1(), t1(), i1());
        O1(false);
        if (aVar instanceof h) {
            i11 = d2.l.k(r1().o1());
        } else {
            i11 = d2.l.j(r1().o1());
        }
        return A + i11;
    }

    public final q W1() {
        return this.D;
    }

    public final boolean X1() {
        return this.E;
    }

    public final void Z1(q qVar) {
        p.j(qVar, "<set-?>");
        this.D = qVar;
    }

    public final void a2(boolean z11) {
        this.E = z11;
    }

    public void b2(LayoutNodeWrapper layoutNodeWrapper) {
        p.j(layoutNodeWrapper, "<set-?>");
        this.C = layoutNodeWrapper;
    }

    public w l1() {
        return r1().l1();
    }

    public LayoutNodeWrapper r1() {
        return this.C;
    }

    public int x(int i11) {
        return Y1().f0(l1(), r1(), i11);
    }
}
