package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import d2.b;
import d2.l;
import f0.e;
import i1.e0;
import i1.r;
import k1.j;
import k1.q;
import kotlin.jvm.internal.p;
import u0.j0;

/* compiled from: OuterMeasurablePlaceable.kt */
public final class OuterMeasurablePlaceable extends e0 implements r {

    /* renamed from: e  reason: collision with root package name */
    private final LayoutNode f6920e;

    /* renamed from: f  reason: collision with root package name */
    private LayoutNodeWrapper f6921f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6922g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6923h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6924i;
    private long j = l.f14010b.a();
    private lp0.l<? super j0, k> k;

    /* renamed from: l  reason: collision with root package name */
    private float f6925l;

    /* renamed from: m  reason: collision with root package name */
    private Object f6926m;

    /* compiled from: OuterMeasurablePlaceable.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6927a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6928b;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            f6927a = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            f6928b = iArr2;
        }
    }

    public OuterMeasurablePlaceable(LayoutNode layoutNode, LayoutNodeWrapper layoutNodeWrapper) {
        p.j(layoutNode, "layoutNode");
        p.j(layoutNodeWrapper, "outerWrapper");
        this.f6920e = layoutNode;
        this.f6921f = layoutNodeWrapper;
    }

    private final void M0() {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode.k1(this.f6920e, false, 1, (Object) null);
        LayoutNode u02 = this.f6920e.u0();
        if (u02 != null && this.f6920e.e0() == LayoutNode.UsageByParent.NotUsed) {
            LayoutNode layoutNode = this.f6920e;
            int i11 = a.f6927a[u02.g0().ordinal()];
            if (i11 == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i11 != 2) {
                usageByParent = u02.e0();
            } else {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.q1(usageByParent);
        }
    }

    /* access modifiers changed from: private */
    public final void N0(long j11, float f11, lp0.l<? super j0, k> lVar) {
        e0.a.C0133a aVar = e0.a.f14880a;
        if (lVar == null) {
            aVar.k(this.f6921f, j11, f11);
        } else {
            aVar.w(this.f6921f, j11, f11, lVar);
        }
    }

    public int A(i1.a aVar) {
        p.j(aVar, "alignmentLine");
        LayoutNode u02 = this.f6920e.u0();
        LayoutNode.LayoutState layoutState = null;
        if ((u02 != null ? u02.g0() : null) == LayoutNode.LayoutState.Measuring) {
            this.f6920e.U().s(true);
        } else {
            LayoutNode u03 = this.f6920e.u0();
            if (u03 != null) {
                layoutState = u03.g0();
            }
            if (layoutState == LayoutNode.LayoutState.LayingOut) {
                this.f6920e.U().r(true);
            }
        }
        this.f6924i = true;
        int A = this.f6921f.A(aVar);
        this.f6924i = false;
        return A;
    }

    /* access modifiers changed from: protected */
    public void D0(long j11, float f11, lp0.l<? super j0, k> lVar) {
        this.j = j11;
        this.f6925l = f11;
        this.k = lVar;
        LayoutNodeWrapper s12 = this.f6921f.s1();
        if (s12 != null && s12.B1()) {
            N0(j11, f11, lVar);
            return;
        }
        this.f6923h = true;
        this.f6920e.U().p(false);
        j.a(this.f6920e).getSnapshotObserver().b(this.f6920e, new OuterMeasurablePlaceable$placeAt$1(this, j11, f11, lVar));
    }

    public final boolean I0() {
        return this.f6924i;
    }

    public int J(int i11) {
        M0();
        return this.f6921f.J(i11);
    }

    public final b J0() {
        if (this.f6922g) {
            return b.b(z0());
        }
        return null;
    }

    public int K(int i11) {
        M0();
        return this.f6921f.K(i11);
    }

    public final LayoutNodeWrapper K0() {
        return this.f6921f;
    }

    public int L(int i11) {
        M0();
        return this.f6921f.L(i11);
    }

    public final void L0(boolean z11) {
        LayoutNode u02;
        LayoutNode u03 = this.f6920e.u0();
        LayoutNode.UsageByParent e02 = this.f6920e.e0();
        if (u03 != null && e02 != LayoutNode.UsageByParent.NotUsed) {
            while (u03.e0() == e02 && (u02 = u03.u0()) != null) {
                u03 = u02;
            }
            int i11 = a.f6928b[e02.ordinal()];
            if (i11 == 1) {
                u03.j1(z11);
            } else if (i11 == 2) {
                u03.h1(z11);
            } else {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }
    }

    public e0 N(long j11) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode u02 = this.f6920e.u0();
        if (u02 != null) {
            if (this.f6920e.l0() == LayoutNode.UsageByParent.NotUsed || this.f6920e.V()) {
                LayoutNode layoutNode = this.f6920e;
                int i11 = a.f6927a[u02.g0().ordinal()];
                if (i11 == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i11 == 2) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + u02.g0());
                }
                layoutNode.r1(usageByParent);
            } else {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.f6920e.l0() + ". Parent state " + u02.g0() + '.').toString());
            }
        } else {
            this.f6920e.r1(LayoutNode.UsageByParent.NotUsed);
        }
        P0(j11);
        return this;
    }

    public final void O0() {
        this.f6926m = this.f6921f.p();
    }

    public final boolean P0(long j11) {
        q a11 = j.a(this.f6920e);
        LayoutNode u02 = this.f6920e.u0();
        LayoutNode layoutNode = this.f6920e;
        boolean z11 = true;
        layoutNode.o1(layoutNode.V() || (u02 != null && u02.V()));
        if (this.f6920e.i0() || !b.g(z0(), j11)) {
            this.f6920e.U().q(false);
            e<LayoutNode> A0 = this.f6920e.A0();
            int m11 = A0.m();
            if (m11 > 0) {
                Object[] l11 = A0.l();
                int i11 = 0;
                do {
                    ((LayoutNode) l11[i11]).U().s(false);
                    i11++;
                } while (i11 < m11);
            }
            this.f6922g = true;
            long a12 = this.f6921f.a();
            G0(j11);
            this.f6920e.Z0(j11);
            if (d2.p.e(this.f6921f.a(), a12) && this.f6921f.A0() == A0() && this.f6921f.e0() == e0()) {
                z11 = false;
            }
            F0(d2.q.a(this.f6921f.A0(), this.f6921f.e0()));
            return z11;
        }
        a11.k(this.f6920e);
        this.f6920e.m1();
        return false;
    }

    public final void Q0() {
        if (this.f6923h) {
            D0(this.j, this.f6925l, this.k);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void R0(LayoutNodeWrapper layoutNodeWrapper) {
        p.j(layoutNodeWrapper, "<set-?>");
        this.f6921f = layoutNodeWrapper;
    }

    public int f0() {
        return this.f6921f.f0();
    }

    public Object p() {
        return this.f6926m;
    }

    public int q0() {
        return this.f6921f.q0();
    }

    public int x(int i11) {
        M0();
        return this.f6921f.x(i11);
    }
}
