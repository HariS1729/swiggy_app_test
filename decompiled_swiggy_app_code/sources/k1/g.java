package k1;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import f0.e;
import i1.a;
import i1.h;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: LayoutNodeAlignmentLines.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f15345a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15346b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15347c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15348d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15349e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15350f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15351g;

    /* renamed from: h  reason: collision with root package name */
    private LayoutNode f15352h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<a, Integer> f15353i = new HashMap();

    public g(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        this.f15345a = layoutNode;
    }

    private static final void k(g gVar, a aVar, int i11, LayoutNodeWrapper layoutNodeWrapper) {
        int i12;
        float f11 = (float) i11;
        long a11 = t0.g.a(f11, f11);
        while (true) {
            a11 = layoutNodeWrapper.S1(a11);
            layoutNodeWrapper = layoutNodeWrapper.s1();
            p.g(layoutNodeWrapper);
            if (p.e(layoutNodeWrapper, gVar.f15345a.c0())) {
                break;
            } else if (layoutNodeWrapper.k1().a().containsKey(aVar)) {
                float A = (float) layoutNodeWrapper.A(aVar);
                a11 = t0.g.a(A, A);
            }
        }
        if (aVar instanceof h) {
            i12 = c.c(f.n(a11));
        } else {
            i12 = c.c(f.m(a11));
        }
        Map<a, Integer> map = gVar.f15353i;
        if (map.containsKey(aVar)) {
            i12 = AlignmentLineKt.c(aVar, ((Number) x.g(gVar.f15353i, aVar)).intValue(), i12);
        }
        map.put(aVar, Integer.valueOf(i12));
    }

    public final boolean a() {
        return this.f15346b;
    }

    public final Map<a, Integer> b() {
        return this.f15353i;
    }

    public final boolean c() {
        return this.f15349e;
    }

    public final boolean d() {
        return this.f15347c || this.f15349e || this.f15350f || this.f15351g;
    }

    public final boolean e() {
        l();
        return this.f15352h != null;
    }

    public final boolean f() {
        return this.f15351g;
    }

    public final boolean g() {
        return this.f15350f;
    }

    public final boolean h() {
        return this.f15348d;
    }

    public final boolean i() {
        return this.f15347c;
    }

    public final void j() {
        this.f15353i.clear();
        e<LayoutNode> A0 = this.f15345a.A0();
        int m11 = A0.m();
        if (m11 > 0) {
            Object[] l11 = A0.l();
            int i11 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.g()) {
                    if (layoutNode.U().f15346b) {
                        layoutNode.M0();
                    }
                    for (Map.Entry next : layoutNode.U().f15353i.entrySet()) {
                        k(this, (a) next.getKey(), ((Number) next.getValue()).intValue(), layoutNode.c0());
                    }
                    LayoutNodeWrapper s12 = layoutNode.c0().s1();
                    p.g(s12);
                    while (!p.e(s12, this.f15345a.c0())) {
                        for (a aVar : s12.k1().a().keySet()) {
                            k(this, aVar, s12.A(aVar), s12);
                        }
                        s12 = s12.s1();
                        p.g(s12);
                    }
                }
                i11++;
            } while (i11 < m11);
        }
        this.f15353i.putAll(this.f15345a.c0().k1().a());
        this.f15346b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r0 = r0.U();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            if (r0 == 0) goto L_0x0009
            androidx.compose.ui.node.LayoutNode r0 = r2.f15345a
            goto L_0x0053
        L_0x0009:
            androidx.compose.ui.node.LayoutNode r0 = r2.f15345a
            androidx.compose.ui.node.LayoutNode r0 = r0.u0()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            k1.g r0 = r0.U()
            androidx.compose.ui.node.LayoutNode r0 = r0.f15352h
            if (r0 == 0) goto L_0x0025
            k1.g r1 = r0.U()
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0025
            goto L_0x0053
        L_0x0025:
            androidx.compose.ui.node.LayoutNode r0 = r2.f15352h
            if (r0 == 0) goto L_0x0055
            k1.g r1 = r0.U()
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0034
            goto L_0x0055
        L_0x0034:
            androidx.compose.ui.node.LayoutNode r1 = r0.u0()
            if (r1 == 0) goto L_0x0043
            k1.g r1 = r1.U()
            if (r1 == 0) goto L_0x0043
            r1.l()
        L_0x0043:
            androidx.compose.ui.node.LayoutNode r0 = r0.u0()
            if (r0 == 0) goto L_0x0052
            k1.g r0 = r0.U()
            if (r0 == 0) goto L_0x0052
            androidx.compose.ui.node.LayoutNode r0 = r0.f15352h
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r2.f15352h = r0
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.g.l():void");
    }

    public final void m() {
        this.f15346b = true;
        this.f15347c = false;
        this.f15349e = false;
        this.f15348d = false;
        this.f15350f = false;
        this.f15351g = false;
        this.f15352h = null;
    }

    public final void n(boolean z11) {
        this.f15346b = z11;
    }

    public final void o(boolean z11) {
        this.f15349e = z11;
    }

    public final void p(boolean z11) {
        this.f15351g = z11;
    }

    public final void q(boolean z11) {
        this.f15350f = z11;
    }

    public final void r(boolean z11) {
        this.f15348d = z11;
    }

    public final void s(boolean z11) {
        this.f15347c = z11;
    }
}
