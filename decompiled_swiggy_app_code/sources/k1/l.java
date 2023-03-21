package k1;

import androidx.compose.ui.node.DepthSortedSet;
import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d2.b;
import f0.e;
import java.util.ArrayList;
import java.util.List;
import k1.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: MeasureAndLayoutDelegate.kt */
public final class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f15363a;

    /* renamed from: b  reason: collision with root package name */
    private final DepthSortedSet f15364b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15365c;

    /* renamed from: d  reason: collision with root package name */
    private final n f15366d = new n();

    /* renamed from: e  reason: collision with root package name */
    private final e<q.b> f15367e = new e<>(new q.b[16], 0);

    /* renamed from: f  reason: collision with root package name */
    private long f15368f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final List<LayoutNode> f15369g;

    /* renamed from: h  reason: collision with root package name */
    private b f15370h;

    /* renamed from: i  reason: collision with root package name */
    private final k f15371i;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15372a;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 3;
            f15372a = iArr;
        }
    }

    public l(LayoutNode layoutNode) {
        p.j(layoutNode, "root");
        this.f15363a = layoutNode;
        q.a aVar = q.f15382g0;
        DepthSortedSet depthSortedSet = new DepthSortedSet(aVar.a());
        this.f15364b = depthSortedSet;
        ArrayList arrayList = new ArrayList();
        this.f15369g = arrayList;
        this.f15371i = aVar.a() ? new k(layoutNode, depthSortedSet, arrayList) : null;
    }

    private final void c() {
        e<q.b> eVar = this.f15367e;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = eVar.l();
            do {
                ((q.b) l11[i11]).h();
                i11++;
            } while (i11 < m11);
        }
        this.f15367e.g();
    }

    public static /* synthetic */ void e(l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        lVar.d(z11);
    }

    private final boolean f(LayoutNode layoutNode, b bVar) {
        boolean z11;
        if (bVar != null) {
            z11 = layoutNode.c1(bVar);
        } else {
            z11 = LayoutNode.d1(layoutNode, (b) null, 1, (Object) null);
        }
        LayoutNode u02 = layoutNode.u0();
        if (z11 && u02 != null) {
            if (layoutNode.l0() == LayoutNode.UsageByParent.InMeasureBlock) {
                s(this, u02, false, 2, (Object) null);
            } else if (layoutNode.l0() == LayoutNode.UsageByParent.InLayoutBlock) {
                q(this, u02, false, 2, (Object) null);
            }
        }
        return z11;
    }

    private final boolean h(LayoutNode layoutNode) {
        return layoutNode.i0() && (layoutNode.l0() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.U().e());
    }

    /* access modifiers changed from: private */
    public final boolean o(LayoutNode layoutNode) {
        boolean z11;
        b bVar;
        if (!layoutNode.g() && !h(layoutNode) && !layoutNode.U().e()) {
            return false;
        }
        if (layoutNode.i0()) {
            if (layoutNode == this.f15363a) {
                bVar = this.f15370h;
                p.g(bVar);
            } else {
                bVar = null;
            }
            z11 = f(layoutNode, bVar);
        } else {
            z11 = false;
        }
        if (layoutNode.f0() && layoutNode.g()) {
            if (layoutNode == this.f15363a) {
                layoutNode.a1(0, 0);
            } else {
                layoutNode.g1();
            }
            this.f15366d.c(layoutNode);
            k kVar = this.f15371i;
            if (kVar != null) {
                kVar.a();
            }
        }
        if (!this.f15369g.isEmpty()) {
            List<LayoutNode> list = this.f15369g;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutNode layoutNode2 = list.get(i11);
                if (layoutNode2.L0()) {
                    s(this, layoutNode2, false, 2, (Object) null);
                }
            }
            this.f15369g.clear();
        }
        return z11;
    }

    public static /* synthetic */ boolean q(l lVar, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return lVar.p(layoutNode, z11);
    }

    public static /* synthetic */ boolean s(l lVar, LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return lVar.r(layoutNode, z11);
    }

    public final void d(boolean z11) {
        if (z11) {
            this.f15366d.d(this.f15363a);
        }
        this.f15366d.a();
    }

    public final void g(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        if (!this.f15364b.d()) {
            if (!this.f15365c) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!layoutNode.i0()) {
                e<LayoutNode> A0 = layoutNode.A0();
                int m11 = A0.m();
                if (m11 > 0) {
                    int i11 = 0;
                    Object[] l11 = A0.l();
                    do {
                        LayoutNode layoutNode2 = (LayoutNode) l11[i11];
                        if (layoutNode2.i0() && this.f15364b.f(layoutNode2)) {
                            o(layoutNode2);
                        }
                        if (!layoutNode2.i0()) {
                            g(layoutNode2);
                        }
                        i11++;
                    } while (i11 < m11);
                }
                if (layoutNode.i0() && this.f15364b.f(layoutNode)) {
                    o(layoutNode);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public final boolean i() {
        return !this.f15364b.d();
    }

    public final long j() {
        if (this.f15365c) {
            return this.f15368f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* JADX INFO: finally extract failed */
    public final boolean k(lp0.a<k> aVar) {
        boolean z11;
        if (!this.f15363a.L0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f15363a.g()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f15365c) {
            boolean z12 = false;
            if (this.f15370h != null) {
                this.f15365c = true;
                try {
                    if (!this.f15364b.d()) {
                        DepthSortedSet depthSortedSet = this.f15364b;
                        z11 = false;
                        while (!depthSortedSet.d()) {
                            LayoutNode e11 = depthSortedSet.e();
                            boolean b11 = o(e11);
                            if (e11 == this.f15363a && b11) {
                                z11 = true;
                            }
                        }
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        z11 = false;
                    }
                    this.f15365c = false;
                    k kVar = this.f15371i;
                    if (kVar != null) {
                        kVar.a();
                    }
                    z12 = z11;
                } catch (Throwable th2) {
                    this.f15365c = false;
                    throw th2;
                }
            }
            c();
            return z12;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public final void l(LayoutNode layoutNode, long j) {
        p.j(layoutNode, "layoutNode");
        if (!(!p.e(layoutNode, this.f15363a))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f15363a.L0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f15363a.g()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f15365c) {
            if (this.f15370h != null) {
                this.f15365c = true;
                try {
                    this.f15364b.f(layoutNode);
                    f(layoutNode, b.b(j));
                    if (layoutNode.f0() && layoutNode.g()) {
                        layoutNode.g1();
                        this.f15366d.c(layoutNode);
                    }
                    this.f15365c = false;
                    k kVar = this.f15371i;
                    if (kVar != null) {
                        kVar.a();
                    }
                } catch (Throwable th2) {
                    this.f15365c = false;
                    throw th2;
                }
            }
            c();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void m(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
        this.f15364b.f(layoutNode);
    }

    public final void n(q.b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f15367e.b(bVar);
    }

    public final boolean p(LayoutNode layoutNode, boolean z11) {
        p.j(layoutNode, "layoutNode");
        int i11 = a.f15372a[layoutNode.g0().ordinal()];
        if (i11 == 1 || i11 == 2) {
            k kVar = this.f15371i;
            if (kVar != null) {
                kVar.a();
            }
        } else if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        } else if ((layoutNode.i0() || layoutNode.f0()) && !z11) {
            k kVar2 = this.f15371i;
            if (kVar2 != null) {
                kVar2.a();
            }
        } else {
            layoutNode.N0();
            if (layoutNode.g()) {
                LayoutNode u02 = layoutNode.u0();
                if (!(u02 != null && u02.f0())) {
                    if (!(u02 != null && u02.i0())) {
                        this.f15364b.a(layoutNode);
                    }
                }
            }
            if (!this.f15365c) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(LayoutNode layoutNode, boolean z11) {
        p.j(layoutNode, "layoutNode");
        int i11 = a.f15372a[layoutNode.g0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                this.f15369g.add(layoutNode);
                k kVar = this.f15371i;
                if (kVar != null) {
                    kVar.a();
                }
            } else if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            } else if (!layoutNode.i0() || z11) {
                layoutNode.O0();
                if (layoutNode.g() || h(layoutNode)) {
                    LayoutNode u02 = layoutNode.u0();
                    if (!(u02 != null && u02.i0())) {
                        this.f15364b.a(layoutNode);
                    }
                }
                if (!this.f15365c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void t(long j) {
        b bVar = this.f15370h;
        if (bVar == null ? false : b.g(bVar.t(), j)) {
            return;
        }
        if (!this.f15365c) {
            this.f15370h = b.b(j);
            this.f15363a.O0();
            this.f15364b.a(this.f15363a);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
