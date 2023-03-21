package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import bp0.h;
import bp0.k;
import e0.a1;
import e0.c1;
import e0.d1;
import e0.e;
import e0.e0;
import e0.f0;
import e0.g;
import e0.g0;
import e0.g1;
import e0.h0;
import e0.j;
import e0.l;
import e0.n0;
import e0.o;
import e0.o0;
import e0.q0;
import e0.r0;
import e0.s0;
import e0.u0;
import e0.v0;
import e0.w;
import e0.x0;
import e0.y;
import g0.g;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.x;
import lp0.q;

/* compiled from: Composer.kt */
public final class ComposerImpl implements g {
    private int A = -1;
    /* access modifiers changed from: private */
    public int B;
    private androidx.compose.runtime.snapshots.b C = SnapshotKt.B();
    private int D;
    private final c1<RecomposeScopeImpl> E = new c1<>();
    private boolean F;
    private boolean G;
    /* access modifiers changed from: private */
    public u0 H;
    private v0 I;
    private x0 J;
    private boolean K;
    private g0.g<l<Object>, ? extends d1<? extends Object>> L;
    private e0.c M;
    private final List<q<e<?>, x0, q0, k>> N;
    private boolean O;
    private int P;
    private int Q;
    private c1<Object> R;
    private int S;
    private boolean T;
    private boolean U;
    private final w V;
    private final c1<q<e<?>, x0, q0, k>> W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f5881a0;

    /* renamed from: b  reason: collision with root package name */
    private final e<?> f5882b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f5883c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final v0 f5884d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<r0> f5885e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<q<e<?>, x0, q0, k>> f5886f;

    /* renamed from: g  reason: collision with root package name */
    private List<q<e<?>, x0, q0, k>> f5887g;

    /* renamed from: h  reason: collision with root package name */
    private final o f5888h;

    /* renamed from: i  reason: collision with root package name */
    private final c1<Pending> f5889i = new c1<>();
    private Pending j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private w f5890l = new w();

    /* renamed from: m  reason: collision with root package name */
    private int f5891m;
    private w n = new w();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int[] f5892o;

    /* renamed from: p  reason: collision with root package name */
    private HashMap<Integer, Integer> f5893p;
    private boolean q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f5894r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5895s;
    private final List<c> t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final w f5896u = new w();
    private g0.g<l<Object>, ? extends d1<? extends Object>> v = g0.a.a();

    /* renamed from: w  reason: collision with root package name */
    private final HashMap<Integer, g0.g<l<Object>, d1<Object>>> f5897w = new HashMap<>();

    /* renamed from: x  reason: collision with root package name */
    private boolean f5898x;

    /* renamed from: y  reason: collision with root package name */
    private final w f5899y = new w();

    /* renamed from: z  reason: collision with root package name */
    private boolean f5900z;

    /* compiled from: Composer.kt */
    private static final class a implements r0 {

        /* renamed from: a  reason: collision with root package name */
        private final b f5901a;

        public a(b bVar) {
            p.j(bVar, "ref");
            this.f5901a = bVar;
        }

        public final b a() {
            return this.f5901a;
        }

        public void b() {
        }

        public void f() {
            this.f5901a.q();
        }

        public void g() {
            this.f5901a.q();
        }
    }

    /* compiled from: Composer.kt */
    private final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5904a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5905b;

        /* renamed from: c  reason: collision with root package name */
        private Set<Set<o0.a>> f5906c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<ComposerImpl> f5907d = new LinkedHashSet();

        /* renamed from: e  reason: collision with root package name */
        private final h0 f5908e = j.e(g0.a.a(), (a1) null, 2, (Object) null);

        public b(int i11, boolean z11) {
            this.f5904a = i11;
            this.f5905b = z11;
        }

        private final g0.g<l<Object>, d1<Object>> r() {
            return (g0.g) this.f5908e.getValue();
        }

        private final void s(g0.g<l<Object>, ? extends d1<? extends Object>> gVar) {
            this.f5908e.setValue(gVar);
        }

        public void a(o oVar, lp0.p<? super g, ? super Integer, k> pVar) {
            p.j(oVar, "composition");
            p.j(pVar, "content");
            ComposerImpl.this.f5883c.a(oVar, pVar);
        }

        public void b(g0 g0Var) {
            p.j(g0Var, "reference");
            ComposerImpl.this.f5883c.b(g0Var);
        }

        public void c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.B = composerImpl.B - 1;
        }

        public boolean d() {
            return this.f5905b;
        }

        public g0.g<l<Object>, d1<Object>> e() {
            return r();
        }

        public int f() {
            return this.f5904a;
        }

        public CoroutineContext g() {
            return ComposerImpl.this.f5883c.g();
        }

        public void h(g0 g0Var) {
            p.j(g0Var, "reference");
            ComposerImpl.this.f5883c.h(g0Var);
        }

        public void i(o oVar) {
            p.j(oVar, "composition");
            ComposerImpl.this.f5883c.i(ComposerImpl.this.B0());
            ComposerImpl.this.f5883c.i(oVar);
        }

        public void j(g0 g0Var, f0 f0Var) {
            p.j(g0Var, "reference");
            p.j(f0Var, CardTypeAdapterFactory.DATA);
            ComposerImpl.this.f5883c.j(g0Var, f0Var);
        }

        public f0 k(g0 g0Var) {
            p.j(g0Var, "reference");
            return ComposerImpl.this.f5883c.k(g0Var);
        }

        public void l(Set<o0.a> set) {
            p.j(set, "table");
            Set set2 = this.f5906c;
            if (set2 == null) {
                set2 = new HashSet();
                this.f5906c = set2;
            }
            set2.add(set);
        }

        public void m(g gVar) {
            p.j(gVar, "composer");
            super.m((ComposerImpl) gVar);
            this.f5907d.add(gVar);
        }

        public void n() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.B = composerImpl.B + 1;
        }

        public void o(g gVar) {
            p.j(gVar, "composer");
            Set<Set<o0.a>> set = this.f5906c;
            if (set != null) {
                for (Set remove : set) {
                    remove.remove(((ComposerImpl) gVar).f5884d);
                }
            }
            x.a(this.f5907d).remove(gVar);
        }

        public void p(o oVar) {
            p.j(oVar, "composition");
            ComposerImpl.this.f5883c.p(oVar);
        }

        public final void q() {
            if (!this.f5907d.isEmpty()) {
                Set<Set<o0.a>> set = this.f5906c;
                if (set != null) {
                    for (ComposerImpl next : this.f5907d) {
                        for (Set<o0.a> remove : set) {
                            remove.remove(next.f5884d);
                        }
                    }
                }
                this.f5907d.clear();
            }
        }

        public final void t(g0.g<l<Object>, ? extends d1<? extends Object>> gVar) {
            p.j(gVar, "scope");
            s(gVar);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        public final int compare(T t, T t11) {
            return b.c(Integer.valueOf(((c) t).b()), Integer.valueOf(((c) t11).b()));
        }
    }

    /* JADX INFO: finally extract failed */
    public ComposerImpl(e<?> eVar, a aVar, v0 v0Var, Set<r0> set, List<q<e<?>, x0, q0, k>> list, List<q<e<?>, x0, q0, k>> list2, o oVar) {
        p.j(eVar, "applier");
        p.j(aVar, "parentContext");
        p.j(v0Var, "slotTable");
        p.j(set, "abandonSet");
        p.j(list, "changes");
        p.j(list2, "lateChanges");
        p.j(oVar, "composition");
        this.f5882b = eVar;
        this.f5883c = aVar;
        this.f5884d = v0Var;
        this.f5885e = set;
        this.f5886f = list;
        this.f5887g = list2;
        this.f5888h = oVar;
        u0 o11 = v0Var.o();
        o11.d();
        this.H = o11;
        v0 v0Var2 = new v0();
        this.I = v0Var2;
        x0 p11 = v0Var2.p();
        p11.F();
        this.J = p11;
        u0 o12 = this.I.o();
        try {
            e0.c a11 = o12.a(0);
            o12.d();
            this.M = a11;
            this.N = new ArrayList();
            this.R = new c1<>();
            this.U = true;
            this.V = new w();
            this.W = new c1<>();
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
        } catch (Throwable th2) {
            o12.d();
            throw th2;
        }
    }

    private final void A1(int i11) {
        z1(i11, (Object) null, false, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void B1(int i11, Object obj) {
        z1(i11, obj, false, (Object) null);
    }

    private final void C1(boolean z11, Object obj) {
        if (z11) {
            this.H.S();
            return;
        }
        if (!(obj == null || this.H.l() == obj)) {
            p1(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, (Object) null);
        }
        this.H.R();
    }

    private final Object D0(u0 u0Var) {
        return u0Var.I(u0Var.s());
    }

    private final void D1() {
        this.H = this.f5884d.o();
        A1(100);
        this.f5883c.n();
        this.v = this.f5883c.e();
        this.f5899y.i(ComposerKt.u(this.f5898x));
        this.f5898x = k(this.v);
        this.L = null;
        if (!this.q) {
            this.q = this.f5883c.d();
        }
        Set set = (Set) v1(InspectionTablesKt.a(), this.v);
        if (set != null) {
            set.add(this.f5884d);
            this.f5883c.l(set);
        }
        A1(this.f5883c.f());
    }

    private final int E0(u0 u0Var, int i11) {
        Object w11;
        if (u0Var.D(i11)) {
            Object A2 = u0Var.A(i11);
            if (A2 == null) {
                return 0;
            }
            if (A2 instanceof Enum) {
                return ((Enum) A2).ordinal();
            }
            if (A2 instanceof e0) {
                return 126665345;
            }
            return A2.hashCode();
        }
        int z11 = u0Var.z(i11);
        if (z11 == 207 && (w11 = u0Var.w(i11)) != null && !p.e(w11, g.f14172a.a())) {
            z11 = w11.hashCode();
        }
        return z11;
    }

    private final void F1(int i11, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i11 != 207 || p.e(obj2, g.f14172a.a())) {
                G1(i11);
            } else {
                G1(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            G1(((Enum) obj).ordinal());
        } else {
            G1(obj.hashCode());
        }
    }

    private static final int G0(x0 x0Var) {
        int U2 = x0Var.U();
        int V2 = x0Var.V();
        while (V2 >= 0 && !x0Var.k0(V2)) {
            V2 = x0Var.y0(V2);
        }
        int i11 = V2 + 1;
        int i12 = 0;
        while (i11 < U2) {
            if (x0Var.f0(U2, i11)) {
                if (x0Var.k0(i11)) {
                    i12 = 0;
                }
                i11++;
            } else {
                i12 += x0Var.k0(i11) ? 1 : x0Var.w0(i11);
                i11 += x0Var.c0(i11);
            }
        }
        return i12;
    }

    private final void G1(int i11) {
        this.P = i11 ^ Integer.rotateLeft(N(), 3);
    }

    /* access modifiers changed from: private */
    public static final int H0(x0 x0Var, e0.c cVar, e<Object> eVar) {
        int B2 = x0Var.B(cVar);
        boolean z11 = true;
        ComposerKt.X(x0Var.U() < B2);
        I0(x0Var, eVar, B2);
        int G0 = G0(x0Var);
        while (x0Var.U() < B2) {
            if (x0Var.e0(B2)) {
                if (x0Var.j0()) {
                    eVar.h(x0Var.u0(x0Var.U()));
                    G0 = 0;
                }
                x0Var.T0();
            } else {
                G0 += x0Var.N0();
            }
        }
        if (x0Var.U() != B2) {
            z11 = false;
        }
        ComposerKt.X(z11);
        return G0;
    }

    private final void H1(int i11, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i11 != 207 || p.e(obj2, g.f14172a.a())) {
                I1(i11);
            } else {
                I1(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            I1(((Enum) obj).ordinal());
        } else {
            I1(obj.hashCode());
        }
    }

    /* access modifiers changed from: private */
    public static final void I0(x0 x0Var, e<Object> eVar, int i11) {
        while (!x0Var.g0(i11)) {
            x0Var.O0();
            if (x0Var.k0(x0Var.V())) {
                eVar.i();
            }
            x0Var.N();
        }
    }

    private final void I1(int i11) {
        this.P = Integer.rotateRight(i11 ^ N(), 3);
    }

    private final int J0(int i11) {
        return -2 - i11;
    }

    private final void J1(int i11, int i12) {
        if (N1(i11) == i12) {
            return;
        }
        if (i11 < 0) {
            HashMap<Integer, Integer> hashMap = this.f5893p;
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f5893p = hashMap;
            }
            hashMap.put(Integer.valueOf(i11), Integer.valueOf(i12));
            return;
        }
        int[] iArr = this.f5892o;
        if (iArr == null) {
            iArr = new int[this.H.u()];
            g.v(iArr, -1, 0, 0, 6, (Object) null);
            this.f5892o = iArr;
        }
        iArr[i11] = i12;
    }

    /* access modifiers changed from: private */
    public final void K0(e0<Object> e0Var, g0.g<l<Object>, ? extends d1<? extends Object>> gVar, Object obj, boolean z11) {
        e0<Object> e0Var2 = e0Var;
        g0.g<l<Object>, ? extends d1<? extends Object>> gVar2 = gVar;
        Object obj2 = obj;
        I(126665345, e0Var);
        k(obj2);
        int N2 = N();
        this.P = 126665345;
        if (s()) {
            x0.m0(this.J, 0, 1, (Object) null);
        }
        boolean z12 = !s() && !p.e(this.H.l(), gVar);
        if (z12) {
            this.f5897w.put(Integer.valueOf(this.H.k()), gVar);
        }
        z1(202, ComposerKt.F(), false, gVar);
        if (!s() || z11) {
            boolean z13 = this.f5898x;
            this.f5898x = z12;
            e0.b.b(this, l0.b.c(1378964644, true, new ComposerImpl$invokeMovableContentLambda$1(e0Var, obj2)));
            this.f5898x = z13;
        } else {
            this.K = true;
            this.L = null;
            x0 x0Var = this.J;
            this.f5883c.h(new g0(e0Var, obj, B0(), this.I, x0Var.A(x0Var.y0(x0Var.V())), k.j(), p0(this, (Integer) null, 1, (Object) null)));
        }
        u0();
        this.P = N2;
        O();
    }

    private final void K1(int i11, int i12) {
        int N1 = N1(i11);
        if (N1 != i12) {
            int i13 = i12 - N1;
            int b11 = this.f5889i.b() - 1;
            while (i11 != -1) {
                int N12 = N1(i11) + i13;
                J1(i11, N12);
                int i14 = b11;
                while (true) {
                    if (-1 < i14) {
                        Pending f11 = this.f5889i.f(i14);
                        if (f11 != null && f11.n(i11, N12)) {
                            b11 = i14 - 1;
                            break;
                        }
                        i14--;
                    } else {
                        break;
                    }
                }
                if (i11 < 0) {
                    i11 = this.H.s();
                } else if (!this.H.G(i11)) {
                    i11 = this.H.M(i11);
                } else {
                    return;
                }
            }
        }
    }

    private final g0.g<l<Object>, d1<Object>> L1(g0.g<l<Object>, ? extends d1<? extends Object>> gVar, g0.g<l<Object>, ? extends d1<? extends Object>> gVar2) {
        g.a<l<Object>, ? extends d1<? extends Object>> j11 = gVar.j();
        j11.putAll(gVar2);
        g0.g<l<Object>, ? extends d1<? extends Object>> build = j11.build();
        B1(204, ComposerKt.J());
        k(build);
        k(gVar2);
        u0();
        return build;
    }

    private final Object N0(u0 u0Var, int i11) {
        return u0Var.I(i11);
    }

    private final int N1(int i11) {
        int i12;
        Integer num;
        if (i11 < 0) {
            HashMap<Integer, Integer> hashMap = this.f5893p;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i11))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f5892o;
        if (iArr == null || (i12 = iArr[i11]) < 0) {
            return this.H.K(i11);
        }
        return i12;
    }

    private final int O0(int i11, int i12, int i13, int i14) {
        int i15;
        int M2 = this.H.M(i12);
        while (i15 != i13 && !this.H.G(i15)) {
            M2 = this.H.M(i15);
        }
        if (this.H.G(i15)) {
            i14 = 0;
        }
        if (i15 == i12) {
            return i14;
        }
        int N1 = (N1(i15) - this.H.K(i12)) + i14;
        loop1:
        while (i14 < N1 && i15 != i11) {
            i15++;
            while (true) {
                if (i15 >= i11) {
                    break loop1;
                }
                int B2 = this.H.B(i15) + i15;
                if (i11 >= B2) {
                    i14 += N1(i15);
                    i15 = B2;
                }
            }
        }
        return i14;
    }

    private final void O1() {
        if (this.f5895s) {
            this.f5895s = false;
        } else {
            ComposerKt.x("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void P1() {
        if (!(!this.f5895s)) {
            ComposerKt.x("A call to createNode(), emitNode() or useNode() expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void Q() {
        j0();
        this.f5889i.a();
        this.f5890l.a();
        this.n.a();
        this.f5896u.a();
        this.f5899y.a();
        this.f5897w.clear();
        this.H.d();
        this.P = 0;
        this.B = 0;
        this.f5895s = false;
        this.F = false;
        this.f5894r = false;
    }

    private final void Q0() {
        if (this.R.d()) {
            R0(this.R.i());
            this.R.a();
        }
    }

    private final void R0(Object[] objArr) {
        a1(new ComposerImpl$realizeDowns$1(objArr));
    }

    private final void S0() {
        int i11 = this.f5881a0;
        this.f5881a0 = 0;
        if (i11 > 0) {
            int i12 = this.X;
            if (i12 >= 0) {
                this.X = -1;
                b1(new ComposerImpl$realizeMovement$1(i12, i11));
                return;
            }
            int i13 = this.Y;
            this.Y = -1;
            int i14 = this.Z;
            this.Z = -1;
            b1(new ComposerImpl$realizeMovement$2(i13, i14, i11));
        }
    }

    private final void T0(boolean z11) {
        int s11 = z11 ? this.H.s() : this.H.k();
        int i11 = s11 - this.S;
        if (!(i11 >= 0)) {
            ComposerKt.x("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i11 > 0) {
            a1(new ComposerImpl$realizeOperationLocation$2(i11));
            this.S = s11;
        }
    }

    static /* synthetic */ void U0(ComposerImpl composerImpl, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        composerImpl.T0(z11);
    }

    private final void V0() {
        int i11 = this.Q;
        if (i11 > 0) {
            this.Q = 0;
            a1(new ComposerImpl$realizeUps$1(i11));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r9 == null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <R> R X0(e0.o r9, e0.o r10, java.lang.Integer r11, java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, f0.c<java.lang.Object>>> r12, lp0.a<? extends R> r13) {
        /*
            r8 = this;
            boolean r0 = r8.U
            boolean r1 = r8.F
            int r2 = r8.k
            r3 = 0
            r8.U = r3     // Catch:{ all -> 0x005c }
            r4 = 1
            r8.F = r4     // Catch:{ all -> 0x005c }
            r8.k = r3     // Catch:{ all -> 0x005c }
            int r4 = r12.size()     // Catch:{ all -> 0x005c }
        L_0x0012:
            if (r3 >= r4) goto L_0x0041
            java.lang.Object r5 = r12.get(r3)     // Catch:{ all -> 0x005c }
            kotlin.Pair r5 = (kotlin.Pair) r5     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r5.a()     // Catch:{ all -> 0x005c }
            androidx.compose.runtime.RecomposeScopeImpl r6 = (androidx.compose.runtime.RecomposeScopeImpl) r6     // Catch:{ all -> 0x005c }
            java.lang.Object r5 = r5.b()     // Catch:{ all -> 0x005c }
            f0.c r5 = (f0.c) r5     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x003a
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005c }
        L_0x002c:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x005c }
            r8.E1(r6, r7)     // Catch:{ all -> 0x005c }
            goto L_0x002c
        L_0x003a:
            r5 = 0
            r8.E1(r6, r5)     // Catch:{ all -> 0x005c }
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0041:
            if (r9 == 0) goto L_0x0051
            if (r11 == 0) goto L_0x004a
            int r11 = r11.intValue()     // Catch:{ all -> 0x005c }
            goto L_0x004b
        L_0x004a:
            r11 = -1
        L_0x004b:
            java.lang.Object r9 = r9.r(r10, r11, r13)     // Catch:{ all -> 0x005c }
            if (r9 != 0) goto L_0x0055
        L_0x0051:
            java.lang.Object r9 = r13.invoke()     // Catch:{ all -> 0x005c }
        L_0x0055:
            r8.U = r0
            r8.F = r1
            r8.k = r2
            return r9
        L_0x005c:
            r9 = move-exception
            r8.U = r0
            r8.F = r1
            r8.k = r2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.X0(e0.o, e0.o, java.lang.Integer, java.util.List, lp0.a):java.lang.Object");
    }

    static /* synthetic */ Object Y0(ComposerImpl composerImpl, o oVar, o oVar2, Integer num, List list, lp0.a aVar, int i11, Object obj) {
        o oVar3 = (i11 & 1) != 0 ? null : oVar;
        o oVar4 = (i11 & 2) != 0 ? null : oVar2;
        Integer num2 = (i11 & 4) != 0 ? null : num;
        if ((i11 & 8) != 0) {
            list = k.j();
        }
        return composerImpl.X0(oVar3, oVar4, num2, list, aVar);
    }

    private final void Z0() {
        boolean z11 = this.F;
        this.F = true;
        int s11 = this.H.s();
        int B2 = this.H.B(s11) + s11;
        int i11 = this.k;
        int N2 = N();
        int i12 = this.f5891m;
        c f11 = ComposerKt.E(this.t, this.H.k(), B2);
        boolean z12 = false;
        int i13 = s11;
        while (f11 != null) {
            int b11 = f11.b();
            c unused = ComposerKt.V(this.t, b11);
            if (f11.d()) {
                this.H.N(b11);
                int k11 = this.H.k();
                r1(i13, k11, s11);
                this.k = O0(b11, k11, s11, i11);
                this.P = m0(this.H.M(k11), s11, N2);
                this.L = null;
                f11.c().h(this);
                this.L = null;
                this.H.O(s11);
                i13 = k11;
                z12 = true;
            } else {
                this.E.h(f11.c());
                f11.c().y();
                this.E.g();
            }
            f11 = ComposerKt.E(this.t, this.H.k(), B2);
        }
        if (z12) {
            r1(i13, s11, s11);
            this.H.Q();
            int N1 = N1(s11);
            this.k = i11 + N1;
            this.f5891m = i12 + N1;
        } else {
            y1();
        }
        this.P = N2;
        this.F = z11;
    }

    private final void a1(q<? super e<?>, ? super x0, ? super q0, k> qVar) {
        this.f5886f.add(qVar);
    }

    private final void b1(q<? super e<?>, ? super x0, ? super q0, k> qVar) {
        V0();
        Q0();
        a1(qVar);
    }

    private final void c1() {
        t1(this.H.k());
        n1(ComposerKt.f5976b);
        this.S += this.H.p();
    }

    private final void d1(Object obj) {
        this.R.h(obj);
    }

    private final void e1() {
        int s11 = this.H.s();
        if (!(this.V.g(-1) <= s11)) {
            ComposerKt.x("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        } else if (this.V.g(-1) == s11) {
            this.V.h();
            p1(this, false, ComposerKt.f5978d, 1, (Object) null);
        }
    }

    private final void f1() {
        if (this.T) {
            p1(this, false, ComposerKt.f5978d, 1, (Object) null);
            this.T = false;
        }
    }

    private final void g1(q<? super e<?>, ? super x0, ? super q0, k> qVar) {
        this.N.add(qVar);
    }

    private final void h0() {
        RecomposeScopeImpl recomposeScopeImpl;
        if (s()) {
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((j) B0());
            this.E.h(recomposeScopeImpl2);
            M1(recomposeScopeImpl2);
            recomposeScopeImpl2.H(this.D);
            return;
        }
        c r11 = ComposerKt.V(this.t, this.H.s());
        Object H2 = this.H.H();
        if (p.e(H2, e0.g.f14172a.a())) {
            recomposeScopeImpl = new RecomposeScopeImpl((j) B0());
            M1(recomposeScopeImpl);
        } else {
            Objects.requireNonNull(H2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) H2;
        }
        recomposeScopeImpl.D(r11 != null);
        this.E.h(recomposeScopeImpl);
        recomposeScopeImpl.H(this.D);
    }

    private final void h1(e0.c cVar) {
        if (this.N.isEmpty()) {
            n1(new ComposerImpl$recordInsert$1(this.I, cVar));
            return;
        }
        List G0 = s.G0(this.N);
        this.N.clear();
        V0();
        Q0();
        n1(new ComposerImpl$recordInsert$2(this.I, cVar, G0));
    }

    private final void i1(q<? super e<?>, ? super x0, ? super q0, k> qVar) {
        this.W.h(qVar);
    }

    private final void j0() {
        this.j = null;
        this.k = 0;
        this.f5891m = 0;
        this.S = 0;
        this.P = 0;
        this.f5895s = false;
        this.T = false;
        this.V.a();
        this.E.a();
        k0();
    }

    private final void j1(int i11, int i12, int i13) {
        if (i13 > 0) {
            int i14 = this.f5881a0;
            if (i14 > 0 && this.Y == i11 - i14 && this.Z == i12 - i14) {
                this.f5881a0 = i14 + i13;
                return;
            }
            S0();
            this.Y = i11;
            this.Z = i12;
            this.f5881a0 = i13;
        }
    }

    private final void k0() {
        this.f5892o = null;
        this.f5893p = null;
    }

    private final void k1(int i11) {
        this.S = i11 - (this.H.k() - this.S);
    }

    private final void l1(int i11, int i12) {
        if (i12 > 0) {
            if (!(i11 >= 0)) {
                ComposerKt.x(("Invalid remove index " + i11).toString());
                throw new KotlinNothingValueException();
            } else if (this.X == i11) {
                this.f5881a0 += i12;
            } else {
                S0();
                this.X = i11;
                this.f5881a0 = i12;
            }
        }
    }

    private final int m0(int i11, int i12, int i13) {
        if (i11 == i12) {
            return i13;
        }
        int E0 = E0(this.H, i11);
        if (E0 == 126665345) {
            return E0;
        }
        return Integer.rotateLeft(m0(this.H.M(i11), i12, i13), 3) ^ E0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r6.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1() {
        /*
            r6 = this;
            e0.u0 r0 = r6.H
            int r0 = r0.u()
            if (r0 <= 0) goto L_0x003c
            e0.u0 r0 = r6.H
            int r1 = r0.s()
            e0.w r2 = r6.V
            r3 = -1
            int r2 = r2.g(r3)
            if (r2 == r1) goto L_0x003c
            boolean r2 = r6.T
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x002b
            boolean r2 = r6.U
            if (r2 == 0) goto L_0x002b
            lp0.q r2 = androidx.compose.runtime.ComposerKt.f5979e
            p1(r6, r4, r2, r5, r3)
            r6.T = r5
        L_0x002b:
            e0.c r0 = r0.a(r1)
            e0.w r2 = r6.V
            r2.i(r1)
            androidx.compose.runtime.ComposerImpl$recordSlotEditing$1 r1 = new androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
            r1.<init>(r0)
            p1(r6, r4, r1, r5, r3)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m1():void");
    }

    private final void n0() {
        ComposerKt.X(this.J.T());
        v0 v0Var = new v0();
        this.I = v0Var;
        x0 p11 = v0Var.p();
        p11.F();
        this.J = p11;
    }

    private final void n1(q<? super e<?>, ? super x0, ? super q0, k> qVar) {
        U0(this, false, 1, (Object) null);
        m1();
        a1(qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: g0.g<e0.l<java.lang.Object>, ? extends e0.d1<? extends java.lang.Object>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final g0.g<e0.l<java.lang.Object>, e0.d1<java.lang.Object>> o0(java.lang.Integer r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0007
            g0.g<e0.l<java.lang.Object>, ? extends e0.d1<? extends java.lang.Object>> r0 = r5.L
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r0 = r5.s()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r5.K
            if (r0 == 0) goto L_0x004a
            e0.x0 r0 = r5.J
            int r0 = r0.V()
        L_0x001b:
            if (r0 <= 0) goto L_0x004a
            e0.x0 r3 = r5.J
            int r3 = r3.a0(r0)
            if (r3 != r2) goto L_0x0043
            e0.x0 r3 = r5.J
            java.lang.Object r3 = r3.b0(r0)
            java.lang.Object r4 = androidx.compose.runtime.ComposerKt.F()
            boolean r3 = kotlin.jvm.internal.p.e(r3, r4)
            if (r3 == 0) goto L_0x0043
            e0.x0 r6 = r5.J
            java.lang.Object r6 = r6.Y(r0)
            java.util.Objects.requireNonNull(r6, r1)
            g0.g r6 = (g0.g) r6
            r5.L = r6
            return r6
        L_0x0043:
            e0.x0 r3 = r5.J
            int r0 = r3.y0(r0)
            goto L_0x001b
        L_0x004a:
            e0.u0 r0 = r5.H
            int r0 = r0.u()
            if (r0 <= 0) goto L_0x009d
            if (r6 == 0) goto L_0x0059
            int r6 = r6.intValue()
            goto L_0x005f
        L_0x0059:
            e0.u0 r6 = r5.H
            int r6 = r6.s()
        L_0x005f:
            if (r6 <= 0) goto L_0x009d
            e0.u0 r0 = r5.H
            int r0 = r0.z(r6)
            if (r0 != r2) goto L_0x0096
            e0.u0 r0 = r5.H
            java.lang.Object r0 = r0.A(r6)
            java.lang.Object r3 = androidx.compose.runtime.ComposerKt.F()
            boolean r0 = kotlin.jvm.internal.p.e(r0, r3)
            if (r0 == 0) goto L_0x0096
            java.util.HashMap<java.lang.Integer, g0.g<e0.l<java.lang.Object>, e0.d1<java.lang.Object>>> r0 = r5.f5897w
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.get(r2)
            g0.g r0 = (g0.g) r0
            if (r0 != 0) goto L_0x0093
            e0.u0 r0 = r5.H
            java.lang.Object r6 = r0.w(r6)
            java.util.Objects.requireNonNull(r6, r1)
            r0 = r6
            g0.g r0 = (g0.g) r0
        L_0x0093:
            r5.L = r0
            return r0
        L_0x0096:
            e0.u0 r0 = r5.H
            int r6 = r0.M(r6)
            goto L_0x005f
        L_0x009d:
            g0.g<e0.l<java.lang.Object>, ? extends e0.d1<? extends java.lang.Object>> r6 = r5.v
            r5.L = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.o0(java.lang.Integer):g0.g");
    }

    private final void o1(boolean z11, q<? super e<?>, ? super x0, ? super q0, k> qVar) {
        T0(z11);
        a1(qVar);
    }

    static /* synthetic */ g0.g p0(ComposerImpl composerImpl, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return composerImpl.o0(num);
    }

    static /* synthetic */ void p1(ComposerImpl composerImpl, boolean z11, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        composerImpl.o1(z11, qVar);
    }

    private final void q1() {
        if (this.R.d()) {
            this.R.g();
        } else {
            this.Q++;
        }
    }

    private final void r0(f0.b<RecomposeScopeImpl, f0.c<Object>> bVar, lp0.p<? super e0.g, ? super Integer, k> pVar) {
        if (!this.F) {
            Object a11 = g1.f14182a.a("Compose:recompose");
            try {
                androidx.compose.runtime.snapshots.b B2 = SnapshotKt.B();
                this.C = B2;
                this.D = B2.f();
                this.f5897w.clear();
                int f11 = bVar.f();
                int i11 = 0;
                while (i11 < f11) {
                    Object obj = bVar.e()[i11];
                    if (obj != null) {
                        f0.c cVar = (f0.c) bVar.g()[i11];
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        e0.c j11 = recomposeScopeImpl.j();
                        if (j11 != null) {
                            this.t.add(new c(recomposeScopeImpl, j11.a(), cVar));
                            i11++;
                        } else {
                            g1.f14182a.b(a11);
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                }
                List<c> list = this.t;
                if (list.size() > 1) {
                    o.y(list, new c());
                }
                this.k = 0;
                this.F = true;
                D1();
                Object M0 = M0();
                if (!(M0 == pVar || pVar == null)) {
                    M1(pVar);
                }
                g.j(new ComposerImpl$doCompose$2$3(this), new ComposerImpl$doCompose$2$4(this), new ComposerImpl$doCompose$2$5(pVar, this, M0));
                v0();
                this.F = false;
                this.t.clear();
                k kVar = k.f22762a;
                g1.f14182a.b(a11);
            } catch (Throwable th2) {
                g1.f14182a.b(a11);
                throw th2;
            }
        } else {
            ComposerKt.x("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void r1(int i11, int i12, int i13) {
        u0 u0Var = this.H;
        int o11 = ComposerKt.Q(u0Var, i11, i12, i13);
        while (i11 > 0 && i11 != o11) {
            if (u0Var.G(i11)) {
                q1();
            }
            i11 = u0Var.M(i11);
        }
        s0(i12, o11);
    }

    private final void s0(int i11, int i12) {
        if (i11 > 0 && i11 != i12) {
            s0(this.H.M(i11), i12);
            if (this.H.G(i11)) {
                d1(N0(this.H, i11));
            }
        }
    }

    private final void s1() {
        this.N.add(this.W.g());
    }

    private final void t0(boolean z11) {
        List<y> list;
        if (s()) {
            int V2 = this.J.V();
            H1(this.J.a0(V2), this.J.b0(V2), this.J.Y(V2));
        } else {
            int s11 = this.H.s();
            H1(this.H.z(s11), this.H.A(s11), this.H.w(s11));
        }
        int i11 = this.f5891m;
        Pending pending = this.j;
        int i12 = 0;
        if (pending != null && pending.b().size() > 0) {
            List<y> b11 = pending.b();
            List<y> f11 = pending.f();
            Set<T> e11 = n0.a.e(f11);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f11.size();
            int size2 = b11.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < size2) {
                y yVar = b11.get(i13);
                if (!e11.contains(yVar)) {
                    l1(pending.g(yVar) + pending.e(), yVar.c());
                    pending.n(yVar.b(), i12);
                    k1(yVar.b());
                    this.H.N(yVar.b());
                    c1();
                    this.H.P();
                    ComposerKt.W(this.t, yVar.b(), yVar.b() + this.H.B(yVar.b()));
                } else if (!linkedHashSet.contains(yVar)) {
                    if (i14 < size) {
                        y yVar2 = f11.get(i14);
                        if (yVar2 != yVar) {
                            int g11 = pending.g(yVar2);
                            linkedHashSet.add(yVar2);
                            if (g11 != i15) {
                                int o11 = pending.o(yVar2);
                                list = f11;
                                j1(pending.e() + g11, i15 + pending.e(), o11);
                                pending.j(g11, i15, o11);
                            } else {
                                list = f11;
                            }
                        } else {
                            list = f11;
                            i13++;
                        }
                        i14++;
                        i15 += pending.o(yVar2);
                        f11 = list;
                    }
                    i12 = 0;
                }
                i13++;
                i12 = 0;
            }
            S0();
            if (b11.size() > 0) {
                k1(this.H.m());
                this.H.Q();
            }
        }
        int i16 = this.k;
        while (!this.H.E()) {
            int k11 = this.H.k();
            c1();
            l1(i16, this.H.P());
            ComposerKt.W(this.t, k11, this.H.k());
        }
        boolean s12 = s();
        if (s12) {
            if (z11) {
                s1();
                i11 = 1;
            }
            this.H.f();
            int V3 = this.J.V();
            this.J.N();
            if (!this.H.r()) {
                int J0 = J0(V3);
                this.J.O();
                this.J.F();
                h1(this.M);
                this.O = false;
                if (!this.f5884d.isEmpty()) {
                    J1(J0, 0);
                    K1(J0, i11);
                }
            }
        } else {
            if (z11) {
                q1();
            }
            e1();
            int s13 = this.H.s();
            if (i11 != N1(s13)) {
                K1(s13, i11);
            }
            if (z11) {
                i11 = 1;
            }
            this.H.g();
            S0();
        }
        y0(i11, s12);
    }

    private final void t1(int i11) {
        u1(this, i11, false, 0);
        S0();
    }

    /* access modifiers changed from: private */
    public final void u0() {
        t0(false);
    }

    private static final int u1(ComposerImpl composerImpl, int i11, boolean z11, int i12) {
        int i13 = 1;
        if (composerImpl.H.C(i11)) {
            Object A2 = composerImpl.H.A(i11);
            Objects.requireNonNull(A2, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
            e0 e0Var = (e0) A2;
            Object y11 = composerImpl.H.y(i11, 0);
            e0.c a11 = composerImpl.H.a(i11);
            List e11 = ComposerKt.B(composerImpl.t, i11, composerImpl.H.B(i11) + i11);
            ArrayList arrayList = new ArrayList(e11.size());
            int size = e11.size();
            for (int i14 = 0; i14 < size; i14++) {
                c cVar = (c) e11.get(i14);
                arrayList.add(h.a(cVar.c(), cVar.a()));
            }
            g0 g0Var = new g0(e0Var, y11, composerImpl.B0(), composerImpl.f5884d, a11, arrayList, composerImpl.o0(Integer.valueOf(i11)));
            composerImpl.f5883c.b(g0Var);
            composerImpl.m1();
            composerImpl.a1(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl, g0Var, a11));
            if (!z11) {
                return composerImpl.H.K(i11);
            }
            composerImpl.S0();
            composerImpl.V0();
            composerImpl.Q0();
            if (!composerImpl.H.G(i11)) {
                i13 = composerImpl.H.K(i11);
            }
            if (i13 <= 0) {
                return 0;
            }
            composerImpl.l1(i12, i13);
            return 0;
        } else if (!composerImpl.H.e(i11)) {
            return composerImpl.H.K(i11);
        } else {
            int B2 = composerImpl.H.B(i11) + i11;
            int i15 = i11 + 1;
            int i16 = 0;
            while (i15 < B2) {
                boolean G2 = composerImpl.H.G(i15);
                if (G2) {
                    composerImpl.S0();
                    composerImpl.d1(composerImpl.H.I(i15));
                }
                i16 += u1(composerImpl, i15, G2 || z11, G2 ? 0 : i12 + i16);
                if (G2) {
                    composerImpl.S0();
                    composerImpl.q1();
                }
                i15 += composerImpl.H.B(i15);
            }
            return i16;
        }
    }

    private final void v0() {
        u0();
        this.f5883c.c();
        u0();
        f1();
        z0();
        this.H.d();
        this.f5894r = false;
    }

    private final <T> T v1(l<T> lVar, g0.g<l<Object>, ? extends d1<? extends Object>> gVar) {
        if (ComposerKt.z(gVar, lVar)) {
            return ComposerKt.M(gVar, lVar);
        }
        return lVar.a().getValue();
    }

    private final void w0() {
        if (this.J.T()) {
            x0 p11 = this.I.p();
            this.J = p11;
            p11.O0();
            this.K = false;
            this.L = null;
        }
    }

    private final void x0(boolean z11, Pending pending) {
        this.f5889i.h(this.j);
        this.j = pending;
        this.f5890l.i(this.k);
        if (z11) {
            this.k = 0;
        }
        this.n.i(this.f5891m);
        this.f5891m = 0;
    }

    private final void x1() {
        this.f5891m += this.H.P();
    }

    private final void y0(int i11, boolean z11) {
        Pending g11 = this.f5889i.g();
        if (g11 != null && !z11) {
            g11.l(g11.a() + 1);
        }
        this.j = g11;
        this.k = this.f5890l.h() + i11;
        this.f5891m = this.n.h() + i11;
    }

    private final void y1() {
        this.f5891m = this.H.t();
        this.H.Q();
    }

    private final void z0() {
        V0();
        if (!this.f5889i.c()) {
            ComposerKt.x("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        } else if (this.V.d()) {
            j0();
        } else {
            ComposerKt.x("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void z1(int i11, Object obj, boolean z11, Object obj2) {
        int i12;
        P1();
        F1(i11, obj, obj2);
        Pending pending = null;
        if (s()) {
            this.H.c();
            int U2 = this.J.U();
            if (z11) {
                this.J.W0(e0.g.f14172a.a());
            } else if (obj2 != null) {
                x0 x0Var = this.J;
                if (obj == null) {
                    obj = e0.g.f14172a.a();
                }
                x0Var.S0(i11, obj, obj2);
            } else {
                x0 x0Var2 = this.J;
                if (obj == null) {
                    obj = e0.g.f14172a.a();
                }
                x0Var2.U0(i11, obj);
            }
            Pending pending2 = this.j;
            if (pending2 != null) {
                y yVar = new y(i11, -1, J0(U2), -1, 0);
                pending2.i(yVar, this.k - pending2.e());
                pending2.h(yVar);
            }
            x0(z11, (Pending) null);
            return;
        }
        if (this.j == null) {
            if (this.H.n() != i11 || !p.e(obj, this.H.o())) {
                this.j = new Pending(this.H.h(), this.k);
            } else {
                C1(z11, obj2);
            }
        }
        Pending pending3 = this.j;
        if (pending3 != null) {
            y d11 = pending3.d(i11, obj);
            if (d11 != null) {
                pending3.h(d11);
                int b11 = d11.b();
                this.k = pending3.g(d11) + pending3.e();
                int m11 = pending3.m(d11);
                int a11 = m11 - pending3.a();
                pending3.k(m11, pending3.a());
                k1(b11);
                this.H.N(b11);
                if (a11 > 0) {
                    n1(new ComposerImpl$start$2(a11));
                }
                C1(z11, obj2);
            } else {
                this.H.c();
                this.O = true;
                this.L = null;
                w0();
                this.J.D();
                int U3 = this.J.U();
                if (z11) {
                    this.J.W0(e0.g.f14172a.a());
                } else if (obj2 != null) {
                    x0 x0Var3 = this.J;
                    if (obj == null) {
                        obj = e0.g.f14172a.a();
                    }
                    x0Var3.S0(i11, obj, obj2);
                } else {
                    x0 x0Var4 = this.J;
                    if (obj == null) {
                        obj = e0.g.f14172a.a();
                    }
                    x0Var4.U0(i11, obj);
                }
                this.M = this.J.A(U3);
                y yVar2 = new y(i11, -1, J0(U3), -1, 0);
                pending3.i(yVar2, this.k - pending3.e());
                pending3.h(yVar2);
                ArrayList arrayList = new ArrayList();
                if (z11) {
                    i12 = 0;
                } else {
                    i12 = this.k;
                }
                pending = new Pending(arrayList, i12);
            }
        }
        x0(z11, pending);
    }

    public void A() {
        u0();
        RecomposeScopeImpl C0 = C0();
        if (C0 != null && C0.r()) {
            C0.B(true);
        }
    }

    public final boolean A0() {
        return this.B > 0;
    }

    public void B() {
        this.q = true;
    }

    public o B0() {
        return this.f5888h;
    }

    public o0 C() {
        return C0();
    }

    public final RecomposeScopeImpl C0() {
        c1<RecomposeScopeImpl> c1Var = this.E;
        if (this.B != 0 || !c1Var.d()) {
            return null;
        }
        return c1Var.e();
    }

    public void D() {
        if (this.f5900z && this.H.s() == this.A) {
            this.A = -1;
            this.f5900z = false;
        }
        t0(false);
    }

    public void E(int i11) {
        z1(i11, (Object) null, false, (Object) null);
    }

    public final boolean E1(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        p.j(recomposeScopeImpl, "scope");
        e0.c j11 = recomposeScopeImpl.j();
        if (j11 == null) {
            return false;
        }
        int d11 = j11.d(this.f5884d);
        if (!this.F || d11 < this.H.k()) {
            return false;
        }
        ComposerKt.N(this.t, d11, recomposeScopeImpl, obj);
        return true;
    }

    public Object F() {
        return M0();
    }

    public void F0(List<Pair<g0, g0>> list) {
        u0 X2;
        int[] V2;
        List list2;
        u0 o11;
        List<Pair<g0, g0>> list3 = list;
        p.j(list3, "references");
        List<q<e<?>, x0, q0, k>> list4 = this.f5887g;
        List S2 = this.f5886f;
        try {
            this.f5886f = list4;
            a1(ComposerKt.f5980f);
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair pair = list3.get(i11);
                g0 g0Var = (g0) pair.a();
                g0 g0Var2 = (g0) pair.b();
                e0.c a11 = g0Var.a();
                int a12 = g0Var.g().a(a11);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                V0();
                a1(new ComposerImpl$insertMovableContentReferences$1$1$1(ref$IntRef, a11));
                if (g0Var2 == null) {
                    if (p.e(g0Var.g(), this.I)) {
                        n0();
                    }
                    o11 = g0Var.g().o();
                    o11.N(a12);
                    this.S = a12;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = arrayList;
                    Y0(this, (o) null, (o) null, (Integer) null, (List) null, new ComposerImpl$insertMovableContentReferences$1$1$2$1(this, arrayList, o11, g0Var), 15, (Object) null);
                    if (!arrayList2.isEmpty()) {
                        a1(new ComposerImpl$insertMovableContentReferences$1$1$2$2(ref$IntRef, arrayList2));
                    }
                    k kVar = k.f22762a;
                    o11.d();
                } else {
                    List c11 = ComposerKt.v(g0Var2.g(), g0Var2.a());
                    if (!c11.isEmpty()) {
                        a1(new ComposerImpl$insertMovableContentReferences$1$1$3(ref$IntRef, c11));
                        int a13 = this.f5884d.a(a11);
                        J1(a13, N1(a13) + c11.size());
                    }
                    a1(new ComposerImpl$insertMovableContentReferences$1$1$4(this, g0Var2, g0Var));
                    v0 g11 = g0Var2.g();
                    u0 o12 = g11.o();
                    try {
                        X2 = this.H;
                        V2 = this.f5892o;
                        this.f5892o = null;
                        this.H = o12;
                        int a14 = g11.a(g0Var2.a());
                        o12.N(a14);
                        this.S = a14;
                        ArrayList arrayList3 = new ArrayList();
                        List S3 = this.f5886f;
                        try {
                            this.f5886f = arrayList3;
                            o b11 = g0Var2.b();
                            o b12 = g0Var.b();
                            Integer valueOf = Integer.valueOf(o12.k());
                            List<Pair<RecomposeScopeImpl, f0.c<Object>>> d11 = g0Var2.d();
                            list2 = S3;
                            List<Pair<RecomposeScopeImpl, f0.c<Object>>> list5 = d11;
                            ArrayList arrayList4 = arrayList3;
                            try {
                                X0(b11, b12, valueOf, list5, new ComposerImpl$insertMovableContentReferences$1$1$5$1$1$1(this, g0Var));
                                k kVar2 = k.f22762a;
                                this.f5886f = list2;
                                if (!arrayList4.isEmpty()) {
                                    a1(new ComposerImpl$insertMovableContentReferences$1$1$5$1$2(ref$IntRef, arrayList4));
                                }
                                this.H = X2;
                                this.f5892o = V2;
                                o12.d();
                            } catch (Throwable th2) {
                                th = th2;
                                this.f5886f = list2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            list2 = S3;
                            this.f5886f = list2;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        o12.d();
                        throw th4;
                    }
                }
                a1(ComposerKt.f5977c);
            }
            a1(ComposerImpl$insertMovableContentReferences$1$2.f5947a);
            this.S = 0;
            k kVar3 = k.f22762a;
            this.f5886f = S2;
            j0();
        } catch (Throwable th5) {
            this.f5886f = S2;
            throw th5;
        }
    }

    public o0.a G() {
        return this.f5884d;
    }

    public void H() {
        z1(-127, (Object) null, false, (Object) null);
    }

    public void I(int i11, Object obj) {
        z1(i11, obj, false, (Object) null);
    }

    public void J() {
        this.f5900z = false;
    }

    public <T> void K(lp0.a<? extends T> aVar) {
        p.j(aVar, "factory");
        O1();
        if (s()) {
            int e11 = this.f5890l.e();
            x0 x0Var = this.J;
            e0.c A2 = x0Var.A(x0Var.V());
            this.f5891m++;
            g1(new ComposerImpl$createNode$2(aVar, A2, e11));
            i1(new ComposerImpl$createNode$3(A2, e11));
            return;
        }
        ComposerKt.x("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public <V, T> void L(V v11, lp0.p<? super T, ? super V, k> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(pVar, v11);
        if (s()) {
            g1(composerImpl$apply$operation$1);
        } else {
            b1(composerImpl$apply$operation$1);
        }
    }

    public final boolean L0() {
        return this.F;
    }

    public void M() {
        u0();
        u0();
        this.f5898x = ComposerKt.t(this.f5899y.h());
        this.L = null;
    }

    public final Object M0() {
        if (s()) {
            P1();
            return e0.g.f14172a.a();
        }
        return this.f5900z ? e0.g.f14172a.a() : this.H.H();
    }

    public final void M1(Object obj) {
        if (s()) {
            this.J.X0(obj);
            if (obj instanceof r0) {
                a1(new ComposerImpl$updateValue$1(obj));
                this.f5885e.add(obj);
                return;
            }
            return;
        }
        int q11 = this.H.q() - 1;
        if (obj instanceof r0) {
            this.f5885e.add(obj);
        }
        o1(true, new ComposerImpl$updateValue$2(obj, q11));
    }

    public int N() {
        return this.P;
    }

    public void O() {
        u0();
    }

    public void P() {
        u0();
    }

    public final void P0(lp0.a<k> aVar) {
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        if (!this.F) {
            this.F = true;
            try {
                aVar.invoke();
            } finally {
                this.F = false;
            }
        } else {
            ComposerKt.x("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final boolean W0(f0.b<RecomposeScopeImpl, f0.c<Object>> bVar) {
        p.j(bVar, "invalidationsRequested");
        if (!this.f5886f.isEmpty()) {
            ComposerKt.x("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        } else if (!bVar.h() && !(!this.t.isEmpty()) && !this.f5894r) {
            return false;
        } else {
            r0(bVar, (lp0.p<? super e0.g, ? super Integer, k>) null);
            return !this.f5886f.isEmpty();
        }
    }

    public void a(boolean z11) {
        if (!(this.f5891m == 0)) {
            ComposerKt.x("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw new KotlinNothingValueException();
        } else if (s()) {
        } else {
            if (!z11) {
                y1();
                return;
            }
            int k11 = this.H.k();
            int j11 = this.H.j();
            for (int i11 = k11; i11 < j11; i11++) {
                this.H.i(i11, new ComposerImpl$deactivateToEndGroup$2(this, i11));
            }
            ComposerKt.W(this.t, k11, j11);
            this.H.N(k11);
            this.H.Q();
        }
    }

    public boolean b() {
        if (!s() && !this.f5900z && !this.f5898x) {
            RecomposeScopeImpl C0 = C0();
            if (!(C0 != null && !C0.o()) || this.f5894r) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void c() {
        O1();
        if (!s()) {
            d1(D0(this.H));
        } else {
            ComposerKt.x("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    public void d() {
        t0(true);
    }

    public void e(lp0.a<k> aVar) {
        p.j(aVar, "effect");
        a1(new ComposerImpl$recordSideEffect$1(aVar));
    }

    public void f() {
        z1(125, (Object) null, true, (Object) null);
        this.f5895s = true;
    }

    public void g(int i11, Object obj) {
        if (this.H.n() == i11 && !p.e(this.H.l(), obj) && this.A < 0) {
            this.A = this.H.k();
            this.f5900z = true;
        }
        z1(i11, (Object) null, false, obj);
    }

    public void h() {
        if (this.f5891m == 0) {
            RecomposeScopeImpl C0 = C0();
            if (C0 != null) {
                C0.z();
            }
            if (this.t.isEmpty()) {
                y1();
            } else {
                Z0();
            }
        } else {
            ComposerKt.x("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
    }

    public boolean i() {
        if (!this.f5898x) {
            RecomposeScopeImpl C0 = C0();
            return C0 != null && C0.n();
        }
    }

    public final void i0() {
        this.f5897w.clear();
    }

    public a j() {
        B1(206, ComposerKt.L());
        Object M0 = M0();
        a aVar = M0 instanceof a ? (a) M0 : null;
        if (aVar == null) {
            aVar = new a(new b(N(), this.q));
            M1(aVar);
        }
        aVar.a().t(p0(this, (Integer) null, 1, (Object) null));
        u0();
        return aVar.a();
    }

    public boolean k(Object obj) {
        if (p.e(M0(), obj)) {
            return false;
        }
        M1(obj);
        return true;
    }

    public void l(o0 o0Var) {
        p.j(o0Var, "scope");
        RecomposeScopeImpl recomposeScopeImpl = o0Var instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) o0Var : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.G(true);
        }
    }

    public final void l0(f0.b<RecomposeScopeImpl, f0.c<Object>> bVar, lp0.p<? super e0.g, ? super Integer, k> pVar) {
        p.j(bVar, "invalidationsRequested");
        p.j(pVar, "content");
        if (this.f5886f.isEmpty()) {
            r0(bVar, pVar);
        } else {
            ComposerKt.x("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    public boolean m(boolean z11) {
        Object M0 = M0();
        if ((M0 instanceof Boolean) && z11 == ((Boolean) M0).booleanValue()) {
            return false;
        }
        M1(Boolean.valueOf(z11));
        return true;
    }

    public boolean n(float f11) {
        Object M0 = M0();
        if (M0 instanceof Float) {
            if (f11 == ((Number) M0).floatValue()) {
                return false;
            }
        }
        M1(Float.valueOf(f11));
        return true;
    }

    public void o() {
        this.f5900z = this.A >= 0;
    }

    public boolean p(int i11) {
        Object M0 = M0();
        if ((M0 instanceof Integer) && i11 == ((Number) M0).intValue()) {
            return false;
        }
        M1(Integer.valueOf(i11));
        return true;
    }

    public boolean q(long j11) {
        Object M0 = M0();
        if ((M0 instanceof Long) && j11 == ((Number) M0).longValue()) {
            return false;
        }
        M1(Long.valueOf(j11));
        return true;
    }

    public final void q0() {
        g1 g1Var = g1.f14182a;
        Object a11 = g1Var.a("Compose:Composer.dispose");
        try {
            this.f5883c.o(this);
            this.E.a();
            this.t.clear();
            this.f5886f.clear();
            this.f5897w.clear();
            u().clear();
            this.G = true;
            k kVar = k.f22762a;
            g1Var.b(a11);
        } catch (Throwable th2) {
            g1.f14182a.b(a11);
            throw th2;
        }
    }

    public void r(n0<?>[] n0VarArr) {
        g0.g<l<Object>, d1<Object>> gVar;
        boolean z11;
        p.j(n0VarArr, "values");
        g0.g p02 = p0(this, (Integer) null, 1, (Object) null);
        B1(201, ComposerKt.I());
        B1(203, ComposerKt.K());
        g0.g gVar2 = (g0.g) e0.b.c(this, new ComposerImpl$startProviders$currentProviders$1(n0VarArr, p02));
        u0();
        if (s()) {
            gVar = L1(p02, gVar2);
            this.K = true;
        } else {
            Object x11 = this.H.x(0);
            Objects.requireNonNull(x11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            g0.g<l<Object>, d1<Object>> gVar3 = (g0.g) x11;
            Object x12 = this.H.x(1);
            Objects.requireNonNull(x12, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            g0.g gVar4 = (g0.g) x12;
            if (!b() || !p.e(gVar4, gVar2)) {
                gVar = L1(p02, gVar2);
                z11 = !p.e(gVar, gVar3);
                if (z11 && !s()) {
                    this.f5897w.put(Integer.valueOf(this.H.k()), gVar);
                }
                this.f5899y.i(ComposerKt.u(this.f5898x));
                this.f5898x = z11;
                this.L = gVar;
                z1(202, ComposerKt.F(), false, gVar);
            }
            x1();
            gVar = gVar3;
        }
        z11 = false;
        this.f5897w.put(Integer.valueOf(this.H.k()), gVar);
        this.f5899y.i(ComposerKt.u(this.f5898x));
        this.f5898x = z11;
        this.L = gVar;
        z1(202, ComposerKt.F(), false, gVar);
    }

    public boolean s() {
        return this.O;
    }

    public e0.g t(int i11) {
        z1(i11, (Object) null, false, (Object) null);
        h0();
        return this;
    }

    public e<?> u() {
        return this.f5882b;
    }

    public s0 v() {
        e0.c cVar;
        lp0.l<e0.h, k> i11;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl g11 = this.E.d() ? this.E.g() : null;
        if (g11 != null) {
            g11.D(false);
        }
        if (!(g11 == null || (i11 = g11.i(this.D)) == null)) {
            a1(new ComposerImpl$endRestartGroup$1$1(i11, this));
        }
        if (g11 != null && !g11.q() && (g11.r() || this.q)) {
            if (g11.j() == null) {
                if (s()) {
                    x0 x0Var = this.J;
                    cVar = x0Var.A(x0Var.V());
                } else {
                    u0 u0Var = this.H;
                    cVar = u0Var.a(u0Var.s());
                }
                g11.A(cVar);
            }
            g11.C(false);
            recomposeScopeImpl = g11;
        }
        t0(false);
        return recomposeScopeImpl;
    }

    public void w() {
        int i11 = 126;
        if (s() || (!this.f5900z ? this.H.n() != 126 : this.H.n() != 125)) {
            i11 = 125;
        }
        z1(i11, (Object) null, true, (Object) null);
        this.f5895s = true;
    }

    public void w1() {
        if (this.t.isEmpty()) {
            x1();
            return;
        }
        u0 u0Var = this.H;
        int n11 = u0Var.n();
        Object o11 = u0Var.o();
        Object l11 = u0Var.l();
        F1(n11, o11, l11);
        C1(u0Var.F(), (Object) null);
        Z0();
        u0Var.g();
        H1(n11, o11, l11);
    }

    public CoroutineContext x() {
        return this.f5883c.g();
    }

    public void y(Object obj) {
        M1(obj);
    }

    public <T> T z(l<T> lVar) {
        p.j(lVar, HttpRequest.HEADER_KEY);
        return v1(lVar, p0(this, (Integer) null, 1, (Object) null));
    }
}
