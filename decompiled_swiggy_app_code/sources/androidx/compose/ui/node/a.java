package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import d2.e;
import i1.e0;
import i1.w;
import k1.j;
import k1.q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.j0;
import u0.t0;
import u0.u0;
import u0.x;

/* compiled from: InnerPlaceable.kt */
public final class a extends LayoutNodeWrapper implements e {
    public static final C0023a D = new C0023a((i) null);
    private static final t0 E;
    private final /* synthetic */ w C;

    /* renamed from: androidx.compose.ui.node.a$a  reason: collision with other inner class name */
    /* compiled from: InnerPlaceable.kt */
    public static final class C0023a {
        private C0023a() {
        }

        public /* synthetic */ C0023a(i iVar) {
            this();
        }
    }

    static {
        t0 a11 = u0.i.a();
        a11.h(d0.f16756b.d());
        a11.o(1.0f);
        a11.n(u0.f16890a.b());
        E = a11;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(LayoutNode layoutNode) {
        super(layoutNode);
        p.j(layoutNode, "layoutNode");
        this.C = layoutNode.k0();
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
            j1().X0();
        }
    }

    public int J(int i11) {
        return j1().d0().d(i11);
    }

    public int K(int i11) {
        return j1().d0().e(i11);
    }

    public void K1(x xVar) {
        p.j(xVar, "canvas");
        q a11 = j.a(j1());
        f0.e<LayoutNode> z02 = j1().z0();
        int m11 = z02.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = z02.l();
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.g()) {
                    layoutNode.S(xVar);
                }
                i11++;
            } while (i11 < m11);
        }
        if (a11.getShowLayoutBounds()) {
            Z0(xVar, E);
        }
    }

    public int L(int i11) {
        return j1().d0().b(i11);
    }

    public float M(float f11) {
        return this.C.M(f11);
    }

    public e0 N(long j) {
        G0(j);
        f0.e<LayoutNode> A0 = j1().A0();
        int m11 = A0.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = A0.l();
            do {
                ((LayoutNode) l11[i11]).r1(LayoutNode.UsageByParent.NotUsed);
                i11++;
            } while (i11 < m11);
        }
        j1().B0(j1().j0().d(j1().k0(), j1().W(), j));
        H1();
        return this;
    }

    public long S(long j) {
        return this.C.S(j);
    }

    public int U0(i1.a aVar) {
        p.j(aVar, "alignmentLine");
        Integer num = j1().G().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public float getDensity() {
        return this.C.getDensity();
    }

    public int j0(float f11) {
        return this.C.j0(f11);
    }

    public float k(int i11) {
        return this.C.k(i11);
    }

    public w l1() {
        return j1().k0();
    }

    public float m0(long j) {
        return this.C.m0(j);
    }

    public long o(long j) {
        return this.C.o(j);
    }

    public long q(int i11) {
        return this.C.q(i11);
    }

    public float u0() {
        return this.C.u0();
    }

    public float v0(float f11) {
        return this.C.v0(f11);
    }

    public int x(int i11) {
        return j1().d0().a(i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[EDGE_INSN: B:35:0x00a0->B:34:0x00a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends k1.i<T, M>, C, M extends p0.d> void x1(androidx.compose.ui.node.LayoutNodeWrapper.d<T, C, M> r20, long r21, k1.c<C> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            java.lang.String r1 = "hitTestSource"
            kotlin.jvm.internal.p.j(r8, r1)
            java.lang.String r1 = "hitTestResult"
            kotlin.jvm.internal.p.j(r11, r1)
            androidx.compose.ui.node.LayoutNode r1 = r19.j1()
            boolean r1 = r8.e(r1)
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0046
            boolean r1 = r0.V1(r9)
            if (r1 == 0) goto L_0x0028
            r14 = r25
            r1 = 1
            goto L_0x0049
        L_0x0028:
            if (r24 == 0) goto L_0x0046
            long r1 = r19.m1()
            float r1 = r0.X0(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L_0x0040
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0040
            r1 = 1
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1 = 1
            r14 = 0
            goto L_0x0049
        L_0x0046:
            r14 = r25
            r1 = 0
        L_0x0049:
            if (r1 == 0) goto L_0x00a3
            int r15 = r23.f15332c
            androidx.compose.ui.node.LayoutNode r1 = r19.j1()
            f0.e r1 = r1.z0()
            int r2 = r1.m()
            if (r2 <= 0) goto L_0x00a0
            int r2 = r2 - r13
            java.lang.Object[] r16 = r1.l()
            r17 = r2
        L_0x0064:
            r1 = r16[r17]
            r18 = r1
            androidx.compose.ui.node.LayoutNode r18 = (androidx.compose.ui.node.LayoutNode) r18
            boolean r1 = r18.g()
            if (r1 == 0) goto L_0x0099
            r1 = r20
            r2 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r14
            r1.c(r2, r3, r5, r6, r7)
            boolean r1 = r23.l()
            if (r1 != 0) goto L_0x0086
        L_0x0084:
            r1 = 1
            goto L_0x0095
        L_0x0086:
            androidx.compose.ui.node.LayoutNodeWrapper r1 = r18.s0()
            boolean r1 = r1.Q1()
            if (r1 == 0) goto L_0x0094
            r23.c()
            goto L_0x0084
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r1 != 0) goto L_0x0099
            r1 = 1
            goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            if (r1 != 0) goto L_0x00a0
            int r17 = r17 + -1
            if (r17 >= 0) goto L_0x0064
        L_0x00a0:
            r11.f15332c = r15
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.x1(androidx.compose.ui.node.LayoutNodeWrapper$d, long, k1.c, boolean, boolean):void");
    }

    public int y0(long j) {
        return this.C.y0(j);
    }
}
