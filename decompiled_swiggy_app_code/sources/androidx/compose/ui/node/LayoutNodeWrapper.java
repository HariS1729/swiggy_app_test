package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import f1.b0;
import f1.c0;
import i1.a0;
import i1.d0;
import i1.e0;
import i1.m;
import i1.n;
import i1.r;
import i1.u;
import i1.w;
import java.util.LinkedHashMap;
import java.util.Map;
import k1.b;
import k1.o;
import k1.q;
import k1.s;
import k1.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.j;
import t0.f;
import t0.g;
import t0.h;
import u0.d1;
import u0.e1;
import u0.j0;
import u0.t0;
import u0.x;

/* compiled from: LayoutNodeWrapper.kt */
public abstract class LayoutNodeWrapper extends e0 implements r, m, k1.r, l<x, k> {
    /* access modifiers changed from: private */
    public static final d<s, b0, c0> A = new a();
    /* access modifiers changed from: private */
    public static final d<n1.k, n1.k, n1.l> B = new b();

    /* renamed from: w  reason: collision with root package name */
    public static final c f6866w = new c((i) null);

    /* renamed from: x  reason: collision with root package name */
    private static final l<LayoutNodeWrapper, k> f6867x = LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1.f6883a;

    /* renamed from: y  reason: collision with root package name */
    private static final l<LayoutNodeWrapper, k> f6868y = LayoutNodeWrapper$Companion$onCommitAffectingLayer$1.f6882a;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final e1 f6869z = new e1();

    /* renamed from: e  reason: collision with root package name */
    private final LayoutNode f6870e;

    /* renamed from: f  reason: collision with root package name */
    private LayoutNodeWrapper f6871f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6872g;

    /* renamed from: h  reason: collision with root package name */
    private l<? super j0, k> f6873h;

    /* renamed from: i  reason: collision with root package name */
    private e f6874i;
    private LayoutDirection j;
    private float k = 0.8f;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6875l;

    /* renamed from: m  reason: collision with root package name */
    private u f6876m;
    private Map<i1.a, Integer> n;

    /* renamed from: o  reason: collision with root package name */
    private long f6877o = d2.l.f14010b.a();

    /* renamed from: p  reason: collision with root package name */
    private float f6878p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private t0.d f6879r;

    /* renamed from: s  reason: collision with root package name */
    private final k1.i<?, ?>[] f6880s = k1.b.l((k1.i[]) null, 1, (i) null);
    private final lp0.a<k> t = new LayoutNodeWrapper$invalidateParentLayer$1(this);

    /* renamed from: u  reason: collision with root package name */
    private boolean f6881u;
    private o v;

    /* compiled from: LayoutNodeWrapper.kt */
    public static final class a implements d<s, b0, c0> {
        a() {
        }

        public int b() {
            return k1.b.f15323a.d();
        }

        public void c(LayoutNode layoutNode, long j, k1.c<b0> cVar, boolean z11, boolean z12) {
            p.j(layoutNode, "layoutNode");
            p.j(cVar, "hitTestResult");
            layoutNode.D0(j, cVar, z11, z12);
        }

        public boolean e(LayoutNode layoutNode) {
            p.j(layoutNode, "parentLayoutNode");
            return true;
        }

        /* renamed from: f */
        public b0 a(s sVar) {
            p.j(sVar, "entity");
            return ((c0) sVar.c()).q0();
        }

        /* renamed from: g */
        public boolean d(s sVar) {
            p.j(sVar, "entity");
            return ((c0) sVar.c()).q0().P();
        }
    }

    /* compiled from: LayoutNodeWrapper.kt */
    public static final class b implements d<n1.k, n1.k, n1.l> {
        b() {
        }

        public int b() {
            return k1.b.f15323a.f();
        }

        public void c(LayoutNode layoutNode, long j, k1.c<n1.k> cVar, boolean z11, boolean z12) {
            p.j(layoutNode, "layoutNode");
            p.j(cVar, "hitTestResult");
            layoutNode.F0(j, cVar, z11, z12);
        }

        public boolean e(LayoutNode layoutNode) {
            j j;
            p.j(layoutNode, "parentLayoutNode");
            n1.k j11 = androidx.compose.ui.semantics.a.j(layoutNode);
            boolean z11 = false;
            if (!(j11 == null || (j = j11.j()) == null || !j.k())) {
                z11 = true;
            }
            return !z11;
        }

        /* renamed from: f */
        public n1.k a(n1.k kVar) {
            p.j(kVar, "entity");
            return kVar;
        }

        /* renamed from: g */
        public boolean d(n1.k kVar) {
            p.j(kVar, "entity");
            return false;
        }
    }

    /* compiled from: LayoutNodeWrapper.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(i iVar) {
            this();
        }

        public final d<s, b0, c0> a() {
            return LayoutNodeWrapper.A;
        }

        public final d<n1.k, n1.k, n1.l> b() {
            return LayoutNodeWrapper.B;
        }
    }

    /* compiled from: LayoutNodeWrapper.kt */
    public interface d<T extends k1.i<T, M>, C, M extends p0.d> {
        C a(T t);

        int b();

        void c(LayoutNode layoutNode, long j, k1.c<C> cVar, boolean z11, boolean z12);

        boolean d(T t);

        boolean e(LayoutNode layoutNode);
    }

    public LayoutNodeWrapper(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        this.f6870e = layoutNode;
        this.f6874i = layoutNode.X();
        this.j = layoutNode.getLayoutDirection();
    }

    private final long D1(long j11) {
        float f11;
        float f12;
        float m11 = f.m(j11);
        if (m11 < 0.0f) {
            f11 = -m11;
        } else {
            f11 = m11 - ((float) q0());
        }
        float max = Math.max(0.0f, f11);
        float n11 = f.n(j11);
        if (n11 < 0.0f) {
            f12 = -n11;
        } else {
            f12 = n11 - ((float) f0());
        }
        return g.a(max, Math.max(0.0f, f12));
    }

    public static /* synthetic */ void M1(LayoutNodeWrapper layoutNodeWrapper, t0.d dVar, boolean z11, boolean z12, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            layoutNodeWrapper.L1(dVar, z11, z12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    private final void R0(LayoutNodeWrapper layoutNodeWrapper, t0.d dVar, boolean z11) {
        if (layoutNodeWrapper != this) {
            LayoutNodeWrapper layoutNodeWrapper2 = this.f6871f;
            if (layoutNodeWrapper2 != null) {
                layoutNodeWrapper2.R0(layoutNodeWrapper, dVar, z11);
            }
            d1(dVar, z11);
        }
    }

    /* access modifiers changed from: private */
    public final <T extends k1.i<T, M>, C, M extends p0.d> void R1(T t11, d<T, C, M> dVar, long j11, k1.c<C> cVar, boolean z11, boolean z12, float f11) {
        d<T, C, M> dVar2 = dVar;
        if (t11 == null) {
            x1(dVar, j11, cVar, z11, z12);
        } else if (dVar.d(t11)) {
            float f12 = f11;
            cVar.q(dVar.a(t11), f12, z12, new LayoutNodeWrapper$speculativeHit$1(this, t11, dVar, j11, cVar, z11, z12, f11));
        } else {
            R1(t11.d(), dVar, j11, cVar, z11, z12, f11);
        }
    }

    private final long S0(LayoutNodeWrapper layoutNodeWrapper, long j11) {
        if (layoutNodeWrapper == this) {
            return j11;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f6871f;
        if (layoutNodeWrapper2 == null || p.e(layoutNodeWrapper, layoutNodeWrapper2)) {
            return c1(j11);
        }
        return c1(layoutNodeWrapper2.S0(layoutNodeWrapper, j11));
    }

    /* access modifiers changed from: private */
    public final void U1() {
        o oVar = this.v;
        if (oVar != null) {
            l<? super j0, k> lVar = this.f6873h;
            if (lVar != null) {
                e1 e1Var = f6869z;
                e1Var.U();
                e1Var.W(this.f6870e.X());
                q1().e(this, f6867x, new LayoutNodeWrapper$updateLayerParameters$1(lVar));
                float D = e1Var.D();
                float I = e1Var.I();
                float b11 = e1Var.b();
                float P = e1Var.P();
                float T = e1Var.T();
                float J = e1Var.J();
                long p11 = e1Var.p();
                long L = e1Var.L();
                e1 e1Var2 = e1Var;
                e1Var2.t();
                oVar.i(D, I, b11, P, T, J, e1Var.x(), e1Var.A(), e1Var.B(), e1Var.r(), e1Var.N(), e1Var.K(), e1Var.s(), (d1) null, p11, L, this.f6870e.getLayoutDirection(), this.f6870e.X());
                this.f6872g = e1Var2.s();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (!(this.f6873h == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.k = f6869z.b();
        q t02 = this.f6870e.t0();
        if (t02 != null) {
            t02.j(this.f6870e);
        }
    }

    /* access modifiers changed from: private */
    public final void a1(x xVar) {
        DrawEntity drawEntity = (DrawEntity) k1.b.n(this.f6880s, k1.b.f15323a.a());
        if (drawEntity == null) {
            K1(xVar);
        } else {
            drawEntity.m(xVar);
        }
    }

    private final void d1(t0.d dVar, boolean z11) {
        float j11 = (float) d2.l.j(this.f6877o);
        dVar.i(dVar.b() - j11);
        dVar.j(dVar.c() - j11);
        float k11 = (float) d2.l.k(this.f6877o);
        dVar.k(dVar.d() - k11);
        dVar.h(dVar.a() - k11);
        o oVar = this.v;
        if (oVar != null) {
            oVar.a(dVar, true);
            if (this.f6872g && z11) {
                dVar.e(0.0f, 0.0f, (float) d2.p.g(a()), (float) d2.p.f(a()));
                dVar.f();
            }
        }
    }

    private final boolean f1() {
        return this.f6876m != null;
    }

    private final Object n1(v<d0> vVar) {
        if (vVar != null) {
            return vVar.c().U(l1(), n1((v) vVar.d()));
        }
        LayoutNodeWrapper r12 = r1();
        if (r12 != null) {
            return r12.p();
        }
        return null;
    }

    private final OwnerSnapshotObserver q1() {
        return k1.j.a(this.f6870e).getSnapshotObserver();
    }

    /* access modifiers changed from: private */
    public final <T extends k1.i<T, M>, C, M extends p0.d> void u1(T t11, d<T, C, M> dVar, long j11, k1.c<C> cVar, boolean z11, boolean z12) {
        if (t11 == null) {
            x1(dVar, j11, cVar, z11, z12);
            return;
        }
        cVar.m(dVar.a(t11), z12, new LayoutNodeWrapper$hit$1(this, t11, dVar, j11, cVar, z11, z12));
    }

    /* access modifiers changed from: private */
    public final <T extends k1.i<T, M>, C, M extends p0.d> void v1(T t11, d<T, C, M> dVar, long j11, k1.c<C> cVar, boolean z11, boolean z12, float f11) {
        if (t11 == null) {
            x1(dVar, j11, cVar, z11, z12);
            return;
        }
        C a11 = dVar.a(t11);
        LayoutNodeWrapper$hitNear$1 layoutNodeWrapper$hitNear$1 = new LayoutNodeWrapper$hitNear$1(this, t11, dVar, j11, cVar, z11, z12, f11);
        cVar.n(a11, f11, z12, layoutNodeWrapper$hitNear$1);
    }

    public final int A(i1.a aVar) {
        int U0;
        p.j(aVar, "alignmentLine");
        if (f1() && (U0 = U0(aVar)) != Integer.MIN_VALUE) {
            return U0 + d2.l.k(Y());
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final boolean A1(long j11) {
        float m11 = f.m(j11);
        float n11 = f.n(j11);
        return m11 >= 0.0f && n11 >= 0.0f && m11 < ((float) q0()) && n11 < ((float) f0());
    }

    public h B(m mVar, boolean z11) {
        p.j(mVar, "sourceCoordinates");
        if (!D()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        } else if (mVar.D()) {
            LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) mVar;
            LayoutNodeWrapper b12 = b1(layoutNodeWrapper);
            t0.d p12 = p1();
            p12.i(0.0f);
            p12.k(0.0f);
            p12.j((float) d2.p.g(mVar.a()));
            p12.h((float) d2.p.f(mVar.a()));
            while (layoutNodeWrapper != b12) {
                M1(layoutNodeWrapper, p12, z11, false, 4, (Object) null);
                if (p12.f()) {
                    return h.f16667e.a();
                }
                layoutNodeWrapper = layoutNodeWrapper.f6871f;
                p.g(layoutNodeWrapper);
            }
            R0(b12, p12, z11);
            return t0.e.a(p12);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + mVar + " is not attached!").toString());
        }
    }

    public final boolean B1() {
        return this.q;
    }

    public final boolean C1() {
        if (this.v != null && this.k <= 0.0f) {
            return true;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f6871f;
        if (layoutNodeWrapper != null) {
            return layoutNodeWrapper.C1();
        }
        return false;
    }

    public final boolean D() {
        if (!this.f6875l || this.f6870e.L0()) {
            return this.f6875l;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: protected */
    public void D0(long j11, float f11, l<? super j0, k> lVar) {
        F1(lVar);
        if (!d2.l.i(this.f6877o, j11)) {
            this.f6877o = j11;
            o oVar = this.v;
            if (oVar != null) {
                oVar.g(j11);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.f6871f;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.y1();
                }
            }
            LayoutNodeWrapper r12 = r1();
            if (!p.e(r12 != null ? r12.f6870e : null, this.f6870e)) {
                this.f6870e.T0();
            } else {
                LayoutNode u02 = this.f6870e.u0();
                if (u02 != null) {
                    u02.T0();
                }
            }
            q t02 = this.f6870e.t0();
            if (t02 != null) {
                t02.j(this.f6870e);
            }
        }
        this.f6878p = f11;
    }

    public void E1() {
        o oVar = this.v;
        if (oVar != null) {
            oVar.invalidate();
        }
    }

    public final void F1(l<? super j0, k> lVar) {
        q t02;
        boolean z11 = (this.f6873h == lVar && p.e(this.f6874i, this.f6870e.X()) && this.j == this.f6870e.getLayoutDirection()) ? false : true;
        this.f6873h = lVar;
        this.f6874i = this.f6870e.X();
        this.j = this.f6870e.getLayoutDirection();
        if (!D() || lVar == null) {
            o oVar = this.v;
            if (oVar != null) {
                oVar.destroy();
                this.f6870e.p1(true);
                this.t.invoke();
                if (D() && (t02 = this.f6870e.t0()) != null) {
                    t02.j(this.f6870e);
                }
            }
            this.v = null;
            this.f6881u = false;
        } else if (this.v == null) {
            o m11 = k1.j.a(this.f6870e).m(this, this.t);
            m11.d(n0());
            m11.g(this.f6877o);
            this.v = m11;
            U1();
            this.f6870e.p1(true);
            this.t.invoke();
        } else if (z11) {
            U1();
        }
    }

    /* access modifiers changed from: protected */
    public void G1(int i11, int i12) {
        o oVar = this.v;
        if (oVar != null) {
            oVar.d(d2.q.a(i11, i12));
        } else {
            LayoutNodeWrapper layoutNodeWrapper = this.f6871f;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper.y1();
            }
        }
        q t02 = this.f6870e.t0();
        if (t02 != null) {
            t02.j(this.f6870e);
        }
        F0(d2.q.a(i11, i12));
        for (k1.i iVar = this.f6880s[k1.b.f15323a.a()]; iVar != null; iVar = iVar.d()) {
            ((DrawEntity) iVar).n();
        }
    }

    public final void H1() {
        androidx.compose.runtime.snapshots.b k11;
        k1.i<?, ?>[] iVarArr = this.f6880s;
        b.a aVar = k1.b.f15323a;
        if (k1.b.m(iVarArr, aVar.e())) {
            androidx.compose.runtime.snapshots.b a11 = androidx.compose.runtime.snapshots.b.f6287e.a();
            try {
                k11 = a11.k();
                for (k1.i iVar = this.f6880s[aVar.e()]; iVar != null; iVar = iVar.d()) {
                    ((i1.b0) ((v) iVar).c()).Y(n0());
                }
                k kVar = k.f22762a;
                a11.r(k11);
                a11.d();
            } catch (Throwable th2) {
                a11.d();
                throw th2;
            }
        }
    }

    public long I(long j11) {
        if (D()) {
            m d11 = n.d(this);
            return r(d11, f.q(k1.j.a(this.f6870e).f(j11), n.e(d11)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public void I1() {
        o oVar = this.v;
        if (oVar != null) {
            oVar.invalidate();
        }
    }

    public final void J1() {
        for (k1.i iVar = this.f6880s[k1.b.f15323a.b()]; iVar != null; iVar = iVar.d()) {
            ((a0) ((v) iVar).c()).J(this);
        }
    }

    public void K1(x xVar) {
        p.j(xVar, "canvas");
        LayoutNodeWrapper r12 = r1();
        if (r12 != null) {
            r12.Y0(xVar);
        }
    }

    public final void L1(t0.d dVar, boolean z11, boolean z12) {
        p.j(dVar, "bounds");
        o oVar = this.v;
        if (oVar != null) {
            if (this.f6872g) {
                if (z12) {
                    long m12 = m1();
                    float i11 = t0.l.i(m12) / 2.0f;
                    float g11 = t0.l.g(m12) / 2.0f;
                    dVar.e(-i11, -g11, ((float) d2.p.g(a())) + i11, ((float) d2.p.f(a())) + g11);
                } else if (z11) {
                    dVar.e(0.0f, 0.0f, (float) d2.p.g(a()), (float) d2.p.f(a()));
                }
                if (dVar.f()) {
                    return;
                }
            }
            oVar.a(dVar, false);
        }
        float j11 = (float) d2.l.j(this.f6877o);
        dVar.i(dVar.b() + j11);
        dVar.j(dVar.c() + j11);
        float k11 = (float) d2.l.k(this.f6877o);
        dVar.k(dVar.d() + k11);
        dVar.h(dVar.a() + k11);
    }

    public final void N1(u uVar) {
        LayoutNode u02;
        p.j(uVar, "value");
        u uVar2 = this.f6876m;
        if (uVar != uVar2) {
            this.f6876m = uVar;
            if (!(uVar2 != null && uVar.getWidth() == uVar2.getWidth() && uVar.getHeight() == uVar2.getHeight())) {
                G1(uVar.getWidth(), uVar.getHeight());
            }
            Map<i1.a, Integer> map = this.n;
            if ((!(map == null || map.isEmpty()) || (!uVar.a().isEmpty())) && !p.e(uVar.a(), this.n)) {
                LayoutNodeWrapper r12 = r1();
                if (p.e(r12 != null ? r12.f6870e : null, this.f6870e)) {
                    LayoutNode u03 = this.f6870e.u0();
                    if (u03 != null) {
                        u03.T0();
                    }
                    if (this.f6870e.U().i()) {
                        LayoutNode u04 = this.f6870e.u0();
                        if (u04 != null) {
                            LayoutNode.k1(u04, false, 1, (Object) null);
                        }
                    } else if (this.f6870e.U().h() && (u02 = this.f6870e.u0()) != null) {
                        LayoutNode.i1(u02, false, 1, (Object) null);
                    }
                } else {
                    this.f6870e.T0();
                }
                this.f6870e.U().n(true);
                Map map2 = this.n;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.n = map2;
                }
                map2.clear();
                map2.putAll(uVar.a());
            }
        }
    }

    public final void O1(boolean z11) {
        this.q = z11;
    }

    public final void P1(LayoutNodeWrapper layoutNodeWrapper) {
        this.f6871f = layoutNodeWrapper;
    }

    public final boolean Q1() {
        s sVar = (s) k1.b.n(this.f6880s, k1.b.f15323a.d());
        if (sVar != null && sVar.j()) {
            return true;
        }
        LayoutNodeWrapper r12 = r1();
        if (r12 != null && r12.Q1()) {
            return true;
        }
        return false;
    }

    public long S1(long j11) {
        o oVar = this.v;
        if (oVar != null) {
            j11 = oVar.c(j11, false);
        }
        return d2.m.c(j11, this.f6877o);
    }

    public void T0() {
        this.f6875l = true;
        F1(this.f6873h);
        for (k1.i iVar : this.f6880s) {
            while (iVar != null) {
                iVar.g();
                iVar = iVar.d();
            }
        }
    }

    public final h T1() {
        if (!D()) {
            return h.f16667e.a();
        }
        m d11 = n.d(this);
        t0.d p12 = p1();
        long V0 = V0(m1());
        p12.i(-t0.l.i(V0));
        p12.k(-t0.l.g(V0));
        p12.j(((float) q0()) + t0.l.i(V0));
        p12.h(((float) f0()) + t0.l.g(V0));
        LayoutNodeWrapper layoutNodeWrapper = this;
        while (layoutNodeWrapper != d11) {
            layoutNodeWrapper.L1(p12, false, true);
            if (p12.f()) {
                return h.f16667e.a();
            }
            layoutNodeWrapper = layoutNodeWrapper.f6871f;
            p.g(layoutNodeWrapper);
        }
        return t0.e.a(p12);
    }

    public abstract int U0(i1.a aVar);

    /* access modifiers changed from: protected */
    public final long V0(long j11) {
        return t0.m.a(Math.max(0.0f, (t0.l.i(j11) - ((float) q0())) / 2.0f), Math.max(0.0f, (t0.l.g(j11) - ((float) f0())) / 2.0f));
    }

    /* access modifiers changed from: protected */
    public final boolean V1(long j11) {
        if (!g.b(j11)) {
            return false;
        }
        o oVar = this.v;
        if (oVar == null || !this.f6872g || oVar.f(j11)) {
            return true;
        }
        return false;
    }

    public void W0() {
        for (k1.i iVar : this.f6880s) {
            while (iVar != null) {
                iVar.h();
                iVar = iVar.d();
            }
        }
        this.f6875l = false;
        F1(this.f6873h);
        LayoutNode u02 = this.f6870e.u0();
        if (u02 != null) {
            u02.I0();
        }
    }

    /* access modifiers changed from: protected */
    public final float X0(long j11, long j12) {
        if (((float) q0()) >= t0.l.i(j12) && ((float) f0()) >= t0.l.g(j12)) {
            return Float.POSITIVE_INFINITY;
        }
        long V0 = V0(j12);
        float i11 = t0.l.i(V0);
        float g11 = t0.l.g(V0);
        long D1 = D1(j11);
        if ((i11 > 0.0f || g11 > 0.0f) && f.m(D1) <= i11 && f.n(D1) <= g11) {
            return f.l(D1);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void Y0(x xVar) {
        p.j(xVar, "canvas");
        o oVar = this.v;
        if (oVar != null) {
            oVar.e(xVar);
            return;
        }
        float j11 = (float) d2.l.j(this.f6877o);
        float k11 = (float) d2.l.k(this.f6877o);
        xVar.c(j11, k11);
        a1(xVar);
        xVar.c(-j11, -k11);
    }

    /* access modifiers changed from: protected */
    public final void Z0(x xVar, t0 t0Var) {
        p.j(xVar, "canvas");
        p.j(t0Var, "paint");
        xVar.g(new h(0.5f, 0.5f, ((float) d2.p.g(n0())) - 0.5f, ((float) d2.p.f(n0())) - 0.5f), t0Var);
    }

    public final long a() {
        return n0();
    }

    public long b(long j11) {
        return k1.j.a(this.f6870e).i(t(j11));
    }

    public final LayoutNodeWrapper b1(LayoutNodeWrapper layoutNodeWrapper) {
        p.j(layoutNodeWrapper, "other");
        LayoutNode layoutNode = layoutNodeWrapper.f6870e;
        LayoutNode layoutNode2 = this.f6870e;
        if (layoutNode == layoutNode2) {
            LayoutNodeWrapper s02 = layoutNode2.s0();
            LayoutNodeWrapper layoutNodeWrapper2 = this;
            while (layoutNodeWrapper2 != s02 && layoutNodeWrapper2 != layoutNodeWrapper) {
                layoutNodeWrapper2 = layoutNodeWrapper2.f6871f;
                p.g(layoutNodeWrapper2);
            }
            return layoutNodeWrapper2 == layoutNodeWrapper ? layoutNodeWrapper : this;
        }
        while (layoutNode.Y() > layoutNode2.Y()) {
            layoutNode = layoutNode.u0();
            p.g(layoutNode);
        }
        while (layoutNode2.Y() > layoutNode.Y()) {
            layoutNode2 = layoutNode2.u0();
            p.g(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.u0();
            layoutNode2 = layoutNode2.u0();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (layoutNode2 == this.f6870e) {
            return this;
        }
        return layoutNode == layoutNodeWrapper.f6870e ? layoutNodeWrapper : layoutNode.c0();
    }

    public long c1(long j11) {
        long b11 = d2.m.b(j11, this.f6877o);
        o oVar = this.v;
        return oVar != null ? oVar.c(b11, true) : b11;
    }

    public final k1.i<?, ?>[] e1() {
        return this.f6880s;
    }

    public final boolean g1() {
        return this.f6881u;
    }

    public final o h1() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public final l<j0, k> i1() {
        return this.f6873h;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        z1((x) obj);
        return k.f22762a;
    }

    public final LayoutNode j1() {
        return this.f6870e;
    }

    public final u k1() {
        u uVar = this.f6876m;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public abstract w l1();

    public final long m1() {
        return this.f6874i.S(this.f6870e.x0().e());
    }

    public boolean o0() {
        return this.v != null;
    }

    public final long o1() {
        return this.f6877o;
    }

    public Object p() {
        return n1((v) k1.b.n(this.f6880s, k1.b.f15323a.c()));
    }

    /* access modifiers changed from: protected */
    public final t0.d p1() {
        t0.d dVar = this.f6879r;
        if (dVar != null) {
            return dVar;
        }
        t0.d dVar2 = new t0.d(0.0f, 0.0f, 0.0f, 0.0f);
        this.f6879r = dVar2;
        return dVar2;
    }

    public long r(m mVar, long j11) {
        p.j(mVar, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) mVar;
        LayoutNodeWrapper b12 = b1(layoutNodeWrapper);
        while (layoutNodeWrapper != b12) {
            j11 = layoutNodeWrapper.S1(j11);
            layoutNodeWrapper = layoutNodeWrapper.f6871f;
            p.g(layoutNodeWrapper);
        }
        return S0(b12, j11);
    }

    public LayoutNodeWrapper r1() {
        return null;
    }

    public final m s() {
        if (D()) {
            return this.f6870e.s0().f6871f;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final LayoutNodeWrapper s1() {
        return this.f6871f;
    }

    public long t(long j11) {
        if (D()) {
            for (LayoutNodeWrapper layoutNodeWrapper = this; layoutNodeWrapper != null; layoutNodeWrapper = layoutNodeWrapper.f6871f) {
                j11 = layoutNodeWrapper.S1(j11);
            }
            return j11;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final float t1() {
        return this.f6878p;
    }

    public final <T extends k1.i<T, M>, C, M extends p0.d> void w1(d<T, C, M> dVar, long j11, k1.c<C> cVar, boolean z11, boolean z12) {
        float f11;
        long j12 = j11;
        k1.c<C> cVar2 = cVar;
        d<T, C, M> dVar2 = dVar;
        p.j(dVar, "hitTestSource");
        p.j(cVar2, "hitTestResult");
        k1.i n11 = k1.b.n(this.f6880s, dVar.b());
        boolean z13 = true;
        if (!V1(j11)) {
            if (z11) {
                float X0 = X0(j11, m1());
                if (Float.isInfinite(X0) || Float.isNaN(X0)) {
                    z13 = false;
                }
                if (z13 && cVar2.o(X0, false)) {
                    v1(n11, dVar, j11, cVar, z11, false, X0);
                }
            }
        } else if (n11 == null) {
            x1(dVar, j11, cVar, z11, z12);
        } else if (A1(j11)) {
            u1(n11, dVar, j11, cVar, z11, z12);
        } else {
            if (!z11) {
                f11 = Float.POSITIVE_INFINITY;
            } else {
                f11 = X0(j11, m1());
            }
            if (Float.isInfinite(f11) || Float.isNaN(f11)) {
                z13 = false;
            }
            boolean z14 = z12;
            if (!z13 || !cVar2.o(f11, z14)) {
                R1(n11, dVar, j11, cVar, z11, z12, f11);
            } else {
                v1(n11, dVar, j11, cVar, z11, z12, f11);
            }
        }
    }

    public <T extends k1.i<T, M>, C, M extends p0.d> void x1(d<T, C, M> dVar, long j11, k1.c<C> cVar, boolean z11, boolean z12) {
        p.j(dVar, "hitTestSource");
        p.j(cVar, "hitTestResult");
        LayoutNodeWrapper r12 = r1();
        if (r12 != null) {
            r12.w1(dVar, r12.c1(j11), cVar, z11, z12);
        }
    }

    public void y1() {
        o oVar = this.v;
        if (oVar != null) {
            oVar.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f6871f;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.y1();
        }
    }

    public void z1(x xVar) {
        p.j(xVar, "canvas");
        if (this.f6870e.g()) {
            q1().e(this, f6868y, new LayoutNodeWrapper$invoke$1(this, xVar));
            this.f6881u = false;
            return;
        }
        this.f6881u = true;
    }
}
