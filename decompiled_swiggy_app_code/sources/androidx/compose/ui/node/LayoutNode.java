package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.q0;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import f1.b0;
import i1.a0;
import i1.e0;
import i1.f0;
import i1.j;
import i1.p;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import i1.z;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import k1.h;
import k1.m;
import k1.o;
import k1.q;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import lp0.l;
import u0.x;

/* compiled from: LayoutNode.kt */
public final class LayoutNode implements r, f0, k1.r, p, ComposeUiNode, q.b {
    public static final d U = new d((i) null);
    private static final e V = new b();
    /* access modifiers changed from: private */
    public static final lp0.a<LayoutNode> W = LayoutNode$Companion$Constructor$1.f6853a;

    /* renamed from: c0  reason: collision with root package name */
    private static final n1 f6829c0 = new a();
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public static final j1.f f6830n0 = j1.c.a(LayoutNode$Companion$ModifierLocalNothing$1.f6854a);

    /* renamed from: o0  reason: collision with root package name */
    private static final c f6831o0 = new c();
    private UsageByParent A;
    private boolean B;
    private final LayoutNodeWrapper C;
    /* access modifiers changed from: private */
    public final OuterMeasurablePlaceable D;
    private float E;
    private LayoutNodeSubcompositionsState F;
    private LayoutNodeWrapper G;
    private boolean H;
    private final m I;
    private m K;
    private p0.d L;
    private l<? super q, k> M;
    private l<? super q, k> N;
    private f0.e<Pair<LayoutNodeWrapper, z>> O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private final Comparator<LayoutNode> T;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6832a;

    /* renamed from: b  reason: collision with root package name */
    private int f6833b;

    /* renamed from: c  reason: collision with root package name */
    private final f0.e<LayoutNode> f6834c;

    /* renamed from: d  reason: collision with root package name */
    private f0.e<LayoutNode> f6835d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6836e;

    /* renamed from: f  reason: collision with root package name */
    private LayoutNode f6837f;

    /* renamed from: g  reason: collision with root package name */
    private q f6838g;

    /* renamed from: h  reason: collision with root package name */
    private int f6839h;

    /* renamed from: i  reason: collision with root package name */
    private LayoutState f6840i;
    /* access modifiers changed from: private */
    public f0.e<b> j;
    /* access modifiers changed from: private */
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    private final f0.e<LayoutNode> f6841l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6842m;
    private t n;

    /* renamed from: o  reason: collision with root package name */
    private final k1.e f6843o;

    /* renamed from: p  reason: collision with root package name */
    private d2.e f6844p;
    private final w q;

    /* renamed from: r  reason: collision with root package name */
    private LayoutDirection f6845r;

    /* renamed from: s  reason: collision with root package name */
    private n1 f6846s;
    private final k1.g t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6847u;
    /* access modifiers changed from: private */
    public int v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int f6848w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public int f6849x;

    /* renamed from: y  reason: collision with root package name */
    private UsageByParent f6850y;

    /* renamed from: z  reason: collision with root package name */
    private UsageByParent f6851z;

    /* compiled from: LayoutNode.kt */
    public enum LayoutState {
        Measuring,
        LayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    public static final class a implements n1 {
        a() {
        }

        public long a() {
            return 40;
        }

        public float b() {
            return 16.0f;
        }

        public long c() {
            return 300;
        }

        public long d() {
            return 400;
        }

        public long e() {
            return d2.k.f14006b.b();
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class b extends e {
        b() {
            super("Undefined intrinsics block and it is required");
        }

        public /* bridge */ /* synthetic */ u d(w wVar, List list, long j) {
            return (u) j(wVar, list, j);
        }

        public Void j(w wVar, List<? extends r> list, long j) {
            kotlin.jvm.internal.p.j(wVar, "$this$measure");
            kotlin.jvm.internal.p.j(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class c implements j1.d {
        c() {
        }

        public /* synthetic */ p0.d N(p0.d dVar) {
            return p0.c.a(this, dVar);
        }

        public /* synthetic */ Object W(Object obj, lp0.p pVar) {
            return p0.e.c(this, obj, pVar);
        }

        /* renamed from: a */
        public Void getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
        }

        public j1.f getKey() {
            return LayoutNode.f6830n0;
        }

        public /* synthetic */ Object s(Object obj, lp0.p pVar) {
            return p0.e.b(this, obj, pVar);
        }

        public /* synthetic */ boolean x(l lVar) {
            return p0.e.a(this, lVar);
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(i iVar) {
            this();
        }

        public final lp0.a<LayoutNode> a() {
            return LayoutNode.W;
        }
    }

    /* compiled from: LayoutNode.kt */
    public static abstract class e implements t {

        /* renamed from: a  reason: collision with root package name */
        private final String f6855a;

        public e(String str) {
            kotlin.jvm.internal.p.j(str, "error");
            this.f6855a = str;
        }

        public /* bridge */ /* synthetic */ int a(j jVar, List list, int i11) {
            return ((Number) f(jVar, list, i11)).intValue();
        }

        public /* bridge */ /* synthetic */ int b(j jVar, List list, int i11) {
            return ((Number) h(jVar, list, i11)).intValue();
        }

        public /* bridge */ /* synthetic */ int c(j jVar, List list, int i11) {
            return ((Number) i(jVar, list, i11)).intValue();
        }

        public /* bridge */ /* synthetic */ int e(j jVar, List list, int i11) {
            return ((Number) g(jVar, list, i11)).intValue();
        }

        public Void f(j jVar, List<? extends i1.i> list, int i11) {
            kotlin.jvm.internal.p.j(jVar, "<this>");
            kotlin.jvm.internal.p.j(list, "measurables");
            throw new IllegalStateException(this.f6855a.toString());
        }

        public Void g(j jVar, List<? extends i1.i> list, int i11) {
            kotlin.jvm.internal.p.j(jVar, "<this>");
            kotlin.jvm.internal.p.j(list, "measurables");
            throw new IllegalStateException(this.f6855a.toString());
        }

        public Void h(j jVar, List<? extends i1.i> list, int i11) {
            kotlin.jvm.internal.p.j(jVar, "<this>");
            kotlin.jvm.internal.p.j(list, "measurables");
            throw new IllegalStateException(this.f6855a.toString());
        }

        public Void i(j jVar, List<? extends i1.i> list, int i11) {
            kotlin.jvm.internal.p.j(jVar, "<this>");
            kotlin.jvm.internal.p.j(list, "measurables");
            throw new IllegalStateException(this.f6855a.toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6856a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            f6856a = iArr;
        }
    }

    /* compiled from: LayoutNode.kt */
    public static final class g implements w, d2.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LayoutNode f6857a;

        g(LayoutNode layoutNode) {
            this.f6857a = layoutNode;
        }

        public /* synthetic */ float M(float f11) {
            return d2.d.c(this, f11);
        }

        public /* synthetic */ long S(long j) {
            return d2.d.h(this, j);
        }

        public float getDensity() {
            return this.f6857a.X().getDensity();
        }

        public LayoutDirection getLayoutDirection() {
            return this.f6857a.getLayoutDirection();
        }

        public /* synthetic */ int j0(float f11) {
            return d2.d.b(this, f11);
        }

        public /* synthetic */ float k(int i11) {
            return d2.d.d(this, i11);
        }

        public /* synthetic */ float m0(long j) {
            return d2.d.f(this, j);
        }

        public /* synthetic */ long o(long j) {
            return d2.d.e(this, j);
        }

        public /* synthetic */ long q(int i11) {
            return d2.d.i(this, i11);
        }

        public float u0() {
            return this.f6857a.X().u0();
        }

        public /* synthetic */ float v0(float f11) {
            return d2.d.g(this, f11);
        }

        public /* synthetic */ u x0(int i11, int i12, Map map, l lVar) {
            return v.a(this, i11, i12, map, lVar);
        }

        public /* synthetic */ int y0(long j) {
            return d2.d.a(this, j);
        }
    }

    public LayoutNode() {
        this(false, 1, (i) null);
    }

    public LayoutNode(boolean z11) {
        this.f6832a = z11;
        this.f6834c = new f0.e<>(new LayoutNode[16], 0);
        this.f6840i = LayoutState.Idle;
        this.j = new f0.e<>(new b[16], 0);
        this.f6841l = new f0.e<>(new LayoutNode[16], 0);
        this.f6842m = true;
        this.n = V;
        this.f6843o = new k1.e(this);
        this.f6844p = d2.g.b(1.0f, 0.0f, 2, (Object) null);
        this.q = new g(this);
        this.f6845r = LayoutDirection.Ltr;
        this.f6846s = f6829c0;
        this.t = new k1.g(this);
        this.v = Integer.MAX_VALUE;
        this.f6848w = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f6850y = usageByParent;
        this.f6851z = usageByParent;
        this.A = usageByParent;
        a aVar = new a(this);
        this.C = aVar;
        this.D = new OuterMeasurablePlaceable(this, aVar);
        this.H = true;
        m mVar = new m(this, f6831o0);
        this.I = mVar;
        this.K = mVar;
        this.L = p0.d.f16037h0;
        this.T = k1.f.f25533a;
    }

    /* access modifiers changed from: private */
    public final void C(j1.b bVar, m mVar, f0.e<ModifierLocalConsumerEntity> eVar) {
        int i11;
        ModifierLocalConsumerEntity modifierLocalConsumerEntity;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            i11 = 0;
            while (true) {
                if (((ModifierLocalConsumerEntity) l11[i11]).e() == bVar) {
                    break;
                }
                i11++;
                if (i11 >= m11) {
                    break;
                }
            }
            i11 = -1;
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            modifierLocalConsumerEntity = new ModifierLocalConsumerEntity(mVar, bVar);
        } else {
            modifierLocalConsumerEntity = eVar.u(i11);
            modifierLocalConsumerEntity.j(mVar);
        }
        mVar.e().b(modifierLocalConsumerEntity);
    }

    private final boolean C0() {
        return ((Boolean) m0().W(Boolean.FALSE, new LayoutNode$hasNewPositioningCallback$1(this.O))).booleanValue();
    }

    /* access modifiers changed from: private */
    public final m D(j1.d<?> dVar, m mVar) {
        m h11 = mVar.h();
        while (h11 != null && h11.g() != dVar) {
            h11 = h11.h();
        }
        if (h11 == null) {
            h11 = new m(this, dVar);
        } else {
            m i11 = h11.i();
            if (i11 != null) {
                i11.l(h11.h());
            }
            m h12 = h11.h();
            if (h12 != null) {
                h12.m(h11.i());
            }
        }
        h11.l(mVar.h());
        m h13 = mVar.h();
        if (h13 != null) {
            h13.m(h11);
        }
        mVar.l(h11);
        h11.m(mVar);
        return h11;
    }

    private final void E() {
        if (this.f6840i == LayoutState.Measuring) {
            this.t.q(true);
            if (this.t.a()) {
                N0();
                return;
            }
            return;
        }
        this.t.p(true);
    }

    public static /* synthetic */ void E0(LayoutNode layoutNode, long j11, k1.c cVar, boolean z11, boolean z12, int i11, Object obj) {
        layoutNode.D0(j11, cVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? true : z12);
    }

    public static /* synthetic */ void G0(LayoutNode layoutNode, long j11, k1.c cVar, boolean z11, boolean z12, int i11, Object obj) {
        layoutNode.F0(j11, cVar, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12);
    }

    private final void H() {
        this.A = this.f6851z;
        this.f6851z = UsageByParent.NotUsed;
        f0.e<LayoutNode> A0 = A0();
        int m11 = A0.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = A0.l();
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.f6851z != UsageByParent.NotUsed) {
                    layoutNode.H();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void I() {
        this.A = this.f6851z;
        this.f6851z = UsageByParent.NotUsed;
        f0.e<LayoutNode> A0 = A0();
        int m11 = A0.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = A0.l();
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.f6851z == UsageByParent.InLayoutBlock) {
                    layoutNode.I();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void K0() {
        LayoutNode u02;
        if (this.f6833b > 0) {
            this.f6836e = true;
        }
        if (this.f6832a && (u02 = u0()) != null) {
            u02.f6836e = true;
        }
    }

    private final void M() {
        LayoutNodeWrapper s02 = s0();
        LayoutNodeWrapper layoutNodeWrapper = this.C;
        while (!kotlin.jvm.internal.p.e(s02, layoutNodeWrapper)) {
            b bVar = (b) s02;
            this.j.b(bVar);
            s02 = bVar.r1();
        }
    }

    private final String O(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append(10);
        f0.e<LayoutNode> A0 = A0();
        int m11 = A0.m();
        if (m11 > 0) {
            Object[] l11 = A0.l();
            int i13 = 0;
            do {
                sb2.append(((LayoutNode) l11[i13]).O(i11 + 1));
                i13++;
            } while (i13 < m11);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.p.i(sb3, "tree.toString()");
        if (i11 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        kotlin.jvm.internal.p.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ String P(LayoutNode layoutNode, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return layoutNode.O(i11);
    }

    private final void P0() {
        this.f6847u = true;
        LayoutNodeWrapper s02 = s0();
        LayoutNodeWrapper r12 = this.C.r1();
        while (!kotlin.jvm.internal.p.e(s02, r12) && s02 != null) {
            if (s02.g1()) {
                s02.y1();
            }
            s02 = s02.r1();
        }
        f0.e<LayoutNode> A0 = A0();
        int m11 = A0.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = A0.l();
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.v != Integer.MAX_VALUE) {
                    layoutNode.P0();
                    l1(layoutNode);
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void Q0(p0.d dVar) {
        f0.e<b> eVar = this.j;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            int i11 = 0;
            do {
                ((b) l11[i11]).a2(false);
                i11++;
            } while (i11 < m11);
        }
        dVar.s(k.f22762a, new LayoutNode$markReusedModifiers$2(this));
    }

    /* access modifiers changed from: private */
    public final void R0() {
        if (g()) {
            int i11 = 0;
            this.f6847u = false;
            f0.e<LayoutNode> A0 = A0();
            int m11 = A0.m();
            if (m11 > 0) {
                Object[] l11 = A0.l();
                do {
                    ((LayoutNode) l11[i11]).R0();
                    i11++;
                } while (i11 < m11);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s0.n T(s0.i r8, f0.e<androidx.compose.ui.node.ModifierLocalConsumerEntity> r9) {
        /*
            r7 = this;
            int r0 = r9.m()
            r1 = 0
            if (r0 <= 0) goto L_0x0044
            java.lang.Object[] r9 = r9.l()
            r2 = 0
            r3 = 0
        L_0x000d:
            r4 = r9[r3]
            r5 = r4
            androidx.compose.ui.node.ModifierLocalConsumerEntity r5 = (androidx.compose.ui.node.ModifierLocalConsumerEntity) r5
            j1.b r6 = r5.e()
            boolean r6 = r6 instanceof s0.n
            if (r6 == 0) goto L_0x003c
            j1.b r6 = r5.e()
            s0.n r6 = (s0.n) r6
            lp0.l r6 = r6.d()
            boolean r6 = r6 instanceof s0.k
            if (r6 == 0) goto L_0x003c
            j1.b r5 = r5.e()
            s0.n r5 = (s0.n) r5
            lp0.l r5 = r5.d()
            s0.k r5 = (s0.k) r5
            s0.i r5 = r5.a()
            if (r5 != r8) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            int r3 = r3 + 1
            if (r3 < r0) goto L_0x000d
        L_0x0044:
            r4 = r1
        L_0x0045:
            androidx.compose.ui.node.ModifierLocalConsumerEntity r4 = (androidx.compose.ui.node.ModifierLocalConsumerEntity) r4
            if (r4 == 0) goto L_0x004e
            j1.b r8 = r4.e()
            goto L_0x004f
        L_0x004e:
            r8 = r1
        L_0x004f:
            boolean r9 = r8 instanceof s0.n
            if (r9 == 0) goto L_0x0056
            r1 = r8
            s0.n r1 = (s0.n) r1
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.T(s0.i, f0.e):s0.n");
    }

    private final void U0() {
        f0.e<LayoutNode> A0 = A0();
        int m11 = A0.m();
        if (m11 > 0) {
            Object[] l11 = A0.l();
            int i11 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.R && layoutNode.f6850y == UsageByParent.InMeasureBlock && d1(layoutNode, (d2.b) null, 1, (Object) null)) {
                    k1(this, false, 1, (Object) null);
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void V0(LayoutNode layoutNode) {
        if (this.f6838g != null) {
            layoutNode.Q();
        }
        layoutNode.f6837f = null;
        layoutNode.s0().P1((LayoutNodeWrapper) null);
        if (layoutNode.f6832a) {
            this.f6833b--;
            f0.e<LayoutNode> eVar = layoutNode.f6834c;
            int m11 = eVar.m();
            if (m11 > 0) {
                int i11 = 0;
                Object[] l11 = eVar.l();
                do {
                    ((LayoutNode) l11[i11]).s0().P1((LayoutNodeWrapper) null);
                    i11++;
                } while (i11 < m11);
            }
        }
        K0();
        Y0();
    }

    private final void W0() {
        k1(this, false, 1, (Object) null);
        LayoutNode u02 = u0();
        if (u02 != null) {
            u02.I0();
        }
        J0();
    }

    /* access modifiers changed from: private */
    public final void Y0() {
        if (this.f6832a) {
            LayoutNode u02 = u0();
            if (u02 != null) {
                u02.Y0();
                return;
            }
            return;
        }
        this.f6842m = true;
    }

    private final LayoutNodeWrapper b0() {
        if (this.H) {
            LayoutNodeWrapper layoutNodeWrapper = this.C;
            LayoutNodeWrapper s12 = s0().s1();
            this.G = null;
            while (true) {
                if (kotlin.jvm.internal.p.e(layoutNodeWrapper, s12)) {
                    break;
                }
                if ((layoutNodeWrapper != null ? layoutNodeWrapper.h1() : null) != null) {
                    this.G = layoutNodeWrapper;
                    break;
                }
                layoutNodeWrapper = layoutNodeWrapper != null ? layoutNodeWrapper.s1() : null;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.G;
        if (layoutNodeWrapper2 == null || layoutNodeWrapper2.h1() != null) {
            return layoutNodeWrapper2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void b1() {
        if (this.f6836e) {
            int i11 = 0;
            this.f6836e = false;
            f0.e<LayoutNode> eVar = this.f6835d;
            if (eVar == null) {
                f0.e<LayoutNode> eVar2 = new f0.e<>(new LayoutNode[16], 0);
                this.f6835d = eVar2;
                eVar = eVar2;
            }
            eVar.g();
            f0.e<LayoutNode> eVar3 = this.f6834c;
            int m11 = eVar3.m();
            if (m11 > 0) {
                Object[] l11 = eVar3.l();
                do {
                    LayoutNode layoutNode = (LayoutNode) l11[i11];
                    if (layoutNode.f6832a) {
                        eVar.c(eVar.m(), layoutNode.A0());
                    } else {
                        eVar.b(layoutNode);
                    }
                    i11++;
                } while (i11 < m11);
            }
        }
    }

    public static /* synthetic */ boolean d1(LayoutNode layoutNode, d2.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = layoutNode.D.J0();
        }
        return layoutNode.c1(bVar);
    }

    public static /* synthetic */ void i1(LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        layoutNode.h1(z11);
    }

    /* access modifiers changed from: private */
    public static final int k(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f11 = layoutNode.E;
        float f12 = layoutNode2.E;
        if (f11 == f12) {
            return kotlin.jvm.internal.p.l(layoutNode.v, layoutNode2.v);
        }
        return Float.compare(f11, f12);
    }

    public static /* synthetic */ void k1(LayoutNode layoutNode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        layoutNode.j1(z11);
    }

    private final void l1(LayoutNode layoutNode) {
        if (f.f6856a[layoutNode.f6840i.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.f6840i);
        } else if (layoutNode.R) {
            layoutNode.j1(true);
        } else if (layoutNode.S) {
            layoutNode.h1(true);
        }
    }

    /* access modifiers changed from: private */
    public final b n1(LayoutNodeWrapper layoutNodeWrapper, i1.q qVar) {
        int i11;
        if (this.j.o()) {
            return null;
        }
        f0.e<b> eVar = this.j;
        int m11 = eVar.m();
        int i12 = -1;
        if (m11 > 0) {
            i11 = m11 - 1;
            Object[] l11 = eVar.l();
            while (true) {
                b bVar = (b) l11[i11];
                if (bVar.X1() && bVar.W1() == qVar) {
                    break;
                }
                i11--;
                if (i11 < 0) {
                    break;
                }
            }
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            f0.e<b> eVar2 = this.j;
            int m12 = eVar2.m();
            if (m12 > 0) {
                int i13 = m12 - 1;
                Object[] l12 = eVar2.l();
                while (true) {
                    if (!(!((b) l12[i13]).X1())) {
                        i13--;
                        if (i13 < 0) {
                            break;
                        }
                    } else {
                        i12 = i13;
                        break;
                    }
                }
            }
            i11 = i12;
        }
        if (i11 < 0) {
            return null;
        }
        b u11 = this.j.u(i11);
        u11.Z1(qVar);
        u11.b2(layoutNodeWrapper);
        return u11;
    }

    private final void s1(p0.d dVar) {
        int i11 = 0;
        f0.e eVar = new f0.e(new ModifierLocalConsumerEntity[16], 0);
        for (m mVar = this.I; mVar != null; mVar = mVar.h()) {
            eVar.c(eVar.m(), mVar.e());
            mVar.e().g();
        }
        m mVar2 = (m) dVar.s(this.I, new LayoutNode$setModifierLocals$1(this, eVar));
        this.K = mVar2;
        this.K.l((m) null);
        if (L0()) {
            int m11 = eVar.m();
            if (m11 > 0) {
                Object[] l11 = eVar.l();
                do {
                    ((ModifierLocalConsumerEntity) l11[i11]).d();
                    i11++;
                } while (i11 < m11);
            }
            for (m h11 = mVar2.h(); h11 != null; h11 = h11.h()) {
                h11.c();
            }
            for (m mVar3 = this.I; mVar3 != null; mVar3 = mVar3.h()) {
                mVar3.b();
            }
        }
    }

    private final boolean x1() {
        LayoutNodeWrapper s02 = s0();
        LayoutNodeWrapper r12 = this.C.r1();
        while (!kotlin.jvm.internal.p.e(s02, r12) && s02 != null) {
            if (s02.h1() != null) {
                return false;
            }
            if (k1.b.m(s02.e1(), k1.b.f15323a.a())) {
                return true;
            }
            s02 = s02.r1();
        }
        return true;
    }

    public final f0.e<LayoutNode> A0() {
        if (this.f6833b == 0) {
            return this.f6834c;
        }
        b1();
        f0.e<LayoutNode> eVar = this.f6835d;
        kotlin.jvm.internal.p.g(eVar);
        return eVar;
    }

    public final void B0(u uVar) {
        kotlin.jvm.internal.p.j(uVar, "measureResult");
        this.C.N1(uVar);
    }

    public final void D0(long j11, k1.c<b0> cVar, boolean z11, boolean z12) {
        kotlin.jvm.internal.p.j(cVar, "hitTestResult");
        s0().w1(LayoutNodeWrapper.f6866w.a(), s0().c1(j11), cVar, z11, z12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(k1.q r9) {
        /*
            r8 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.p.j(r9, r0)
            k1.q r0 = r8.f6838g
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r3 = 0
            if (r0 == 0) goto L_0x00dc
            androidx.compose.ui.node.LayoutNode r0 = r8.f6837f
            if (r0 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x001a
            k1.q r0 = r0.f6838g
            goto L_0x001b
        L_0x001a:
            r0 = r3
        L_0x001b:
            boolean r0 = kotlin.jvm.internal.p.e(r0, r9)
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 != 0) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r9)
            java.lang.String r9 = ") than the parent's owner("
            r0.append(r9)
            androidx.compose.ui.node.LayoutNode r9 = r8.u0()
            if (r9 == 0) goto L_0x0042
            k1.q r9 = r9.f6838g
            goto L_0x0043
        L_0x0042:
            r9 = r3
        L_0x0043:
            r0.append(r9)
            java.lang.String r9 = "). This tree: "
            r0.append(r9)
            java.lang.String r9 = P(r8, r1, r2, r3)
            r0.append(r9)
            java.lang.String r9 = " Parent tree: "
            r0.append(r9)
            androidx.compose.ui.node.LayoutNode r9 = r8.f6837f
            if (r9 == 0) goto L_0x005f
            java.lang.String r3 = P(r9, r1, r2, r3)
        L_0x005f:
            r0.append(r3)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r0 = r8.u0()
            if (r0 != 0) goto L_0x0078
            r8.f6847u = r2
        L_0x0078:
            r8.f6838g = r9
            if (r0 == 0) goto L_0x007f
            int r4 = r0.f6839h
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            int r4 = r4 + r2
            r8.f6839h = r4
            n1.k r4 = androidx.compose.ui.semantics.a.j(r8)
            if (r4 == 0) goto L_0x008c
            r9.q()
        L_0x008c:
            r9.n(r8)
            f0.e<androidx.compose.ui.node.LayoutNode> r4 = r8.f6834c
            int r5 = r4.m()
            if (r5 <= 0) goto L_0x00a6
            java.lang.Object[] r4 = r4.l()
            r6 = 0
        L_0x009c:
            r7 = r4[r6]
            androidx.compose.ui.node.LayoutNode r7 = (androidx.compose.ui.node.LayoutNode) r7
            r7.F(r9)
            int r6 = r6 + r2
            if (r6 < r5) goto L_0x009c
        L_0x00a6:
            k1(r8, r1, r2, r3)
            if (r0 == 0) goto L_0x00ae
            k1(r0, r1, r2, r3)
        L_0x00ae:
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r8.s0()
            androidx.compose.ui.node.LayoutNodeWrapper r1 = r8.C
            androidx.compose.ui.node.LayoutNodeWrapper r1 = r1.r1()
        L_0x00b8:
            boolean r2 = kotlin.jvm.internal.p.e(r0, r1)
            if (r2 != 0) goto L_0x00c8
            if (r0 == 0) goto L_0x00c8
            r0.T0()
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.r1()
            goto L_0x00b8
        L_0x00c8:
            k1.m r0 = r8.I
        L_0x00ca:
            if (r0 == 0) goto L_0x00d4
            r0.a()
            k1.m r0 = r0.h()
            goto L_0x00ca
        L_0x00d4:
            lp0.l<? super k1.q, bp0.k> r0 = r8.M
            if (r0 == 0) goto L_0x00db
            r0.invoke(r9)
        L_0x00db:
            return
        L_0x00dc:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Cannot attach "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = " as it already is attached.  Tree: "
            r9.append(r0)
            java.lang.String r0 = P(r8, r1, r2, r3)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.F(k1.q):void");
    }

    public final void F0(long j11, k1.c<n1.k> cVar, boolean z11, boolean z12) {
        kotlin.jvm.internal.p.j(cVar, "hitSemanticsEntities");
        s0().w1(LayoutNodeWrapper.f6866w.b(), s0().c1(j11), cVar, true, z12);
    }

    public final Map<i1.a, Integer> G() {
        if (!this.D.I0()) {
            E();
        }
        M0();
        return this.t.b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.compose.ui.node.LayoutNodeWrapper] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H0(int r7, androidx.compose.ui.node.LayoutNode r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.p.j(r8, r0)
            androidx.compose.ui.node.LayoutNode r0 = r8.f6837f
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.String r3 = " Other tree: "
            java.lang.String r4 = "Cannot insert "
            r5 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r7.append(r0)
            java.lang.String r0 = P(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            androidx.compose.ui.node.LayoutNode r8 = r8.f6837f
            if (r8 == 0) goto L_0x0037
            java.lang.String r5 = P(r8, r1, r2, r5)
        L_0x0037:
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0048:
            k1.q r0 = r8.f6838g
            if (r0 != 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x00b5
            r8.f6837f = r6
            f0.e<androidx.compose.ui.node.LayoutNode> r0 = r6.f6834c
            r0.a(r7, r8)
            r6.Y0()
            boolean r7 = r8.f6832a
            if (r7 == 0) goto L_0x0076
            boolean r7 = r6.f6832a
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x006a
            int r7 = r6.f6833b
            int r7 = r7 + r2
            r6.f6833b = r7
            goto L_0x0076
        L_0x006a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0076:
            r6.K0()
            androidx.compose.ui.node.LayoutNodeWrapper r7 = r8.s0()
            boolean r0 = r6.f6832a
            if (r0 == 0) goto L_0x0088
            androidx.compose.ui.node.LayoutNode r0 = r6.f6837f
            if (r0 == 0) goto L_0x008a
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r0.C
            goto L_0x008a
        L_0x0088:
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r6.C
        L_0x008a:
            r7.P1(r5)
            boolean r7 = r8.f6832a
            if (r7 == 0) goto L_0x00ad
            f0.e<androidx.compose.ui.node.LayoutNode> r7 = r8.f6834c
            int r0 = r7.m()
            if (r0 <= 0) goto L_0x00ad
            java.lang.Object[] r7 = r7.l()
        L_0x009d:
            r3 = r7[r1]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.ui.node.LayoutNode) r3
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.s0()
            androidx.compose.ui.node.LayoutNodeWrapper r4 = r6.C
            r3.P1(r4)
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x009d
        L_0x00ad:
            k1.q r7 = r6.f6838g
            if (r7 == 0) goto L_0x00b4
            r8.F(r7)
        L_0x00b4:
            return
        L_0x00b5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r7.append(r0)
            java.lang.String r0 = P(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r8 = P(r8, r1, r2, r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.H0(int, androidx.compose.ui.node.LayoutNode):void");
    }

    public final void I0() {
        LayoutNodeWrapper b02 = b0();
        if (b02 != null) {
            b02.y1();
            return;
        }
        LayoutNode u02 = u0();
        if (u02 != null) {
            u02.I0();
        }
    }

    public int J(int i11) {
        return this.D.J(i11);
    }

    public final void J0() {
        LayoutNodeWrapper s02 = s0();
        LayoutNodeWrapper layoutNodeWrapper = this.C;
        while (!kotlin.jvm.internal.p.e(s02, layoutNodeWrapper)) {
            b bVar = (b) s02;
            o h12 = bVar.h1();
            if (h12 != null) {
                h12.invalidate();
            }
            s02 = bVar.r1();
        }
        o h13 = this.C.h1();
        if (h13 != null) {
            h13.invalidate();
        }
    }

    public int K(int i11) {
        return this.D.K(i11);
    }

    public int L(int i11) {
        return this.D.L(i11);
    }

    public boolean L0() {
        return this.f6838g != null;
    }

    public final void M0() {
        this.t.l();
        if (this.S) {
            U0();
        }
        if (this.S) {
            this.S = false;
            this.f6840i = LayoutState.LayingOut;
            k1.j.a(this).getSnapshotObserver().c(this, new LayoutNode$layoutChildren$1(this));
            this.f6840i = LayoutState.Idle;
        }
        if (this.t.h()) {
            this.t.o(true);
        }
        if (this.t.a() && this.t.e()) {
            this.t.j();
        }
    }

    public e0 N(long j11) {
        if (this.f6851z == UsageByParent.NotUsed) {
            H();
        }
        return this.D.N(j11);
    }

    public final void N0() {
        this.S = true;
    }

    public final void O0() {
        this.R = true;
    }

    public final void Q() {
        q qVar = this.f6838g;
        String str = null;
        if (qVar == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode u02 = u0();
            if (u02 != null) {
                str = P(u02, 0, 1, (Object) null);
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString().toString());
        }
        LayoutNode u03 = u0();
        if (u03 != null) {
            u03.I0();
            k1(u03, false, 1, (Object) null);
        }
        this.t.m();
        l<? super q, k> lVar = this.N;
        if (lVar != null) {
            lVar.invoke(qVar);
        }
        for (m mVar = this.I; mVar != null; mVar = mVar.h()) {
            mVar.c();
        }
        LayoutNodeWrapper s02 = s0();
        LayoutNodeWrapper r12 = this.C.r1();
        while (!kotlin.jvm.internal.p.e(s02, r12) && s02 != null) {
            s02.W0();
            s02 = s02.r1();
        }
        if (androidx.compose.ui.semantics.a.j(this) != null) {
            qVar.q();
        }
        qVar.o(this);
        this.f6838g = null;
        this.f6839h = 0;
        f0.e<LayoutNode> eVar = this.f6834c;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            int i11 = 0;
            do {
                ((LayoutNode) l11[i11]).Q();
                i11++;
            } while (i11 < m11);
        }
        this.v = Integer.MAX_VALUE;
        this.f6848w = Integer.MAX_VALUE;
        this.f6847u = false;
    }

    public final void R() {
        f0.e<Pair<LayoutNodeWrapper, z>> eVar;
        int m11;
        if (this.f6840i == LayoutState.Idle && !this.S && !this.R && g() && (eVar = this.O) != null && (m11 = eVar.m()) > 0) {
            int i11 = 0;
            Object[] l11 = eVar.l();
            do {
                Pair pair = (Pair) l11[i11];
                ((z) pair.d()).e0((i1.m) pair.c());
                i11++;
            } while (i11 < m11);
        }
    }

    public final void S(x xVar) {
        kotlin.jvm.internal.p.j(xVar, "canvas");
        s0().Y0(xVar);
    }

    public final void S0(int i11, int i12, int i13) {
        if (i11 != i12) {
            for (int i14 = 0; i14 < i13; i14++) {
                this.f6834c.a(i11 > i12 ? i12 + i14 : (i12 + i13) - 2, this.f6834c.u(i11 > i12 ? i11 + i14 : i11));
            }
            Y0();
            K0();
            k1(this, false, 1, (Object) null);
        }
    }

    public final void T0() {
        if (!this.t.a()) {
            this.t.n(true);
            LayoutNode u02 = u0();
            if (u02 != null) {
                if (this.t.i()) {
                    k1(u02, false, 1, (Object) null);
                } else if (this.t.c()) {
                    i1(u02, false, 1, (Object) null);
                }
                if (this.t.g()) {
                    k1(this, false, 1, (Object) null);
                }
                if (this.t.f()) {
                    i1(u02, false, 1, (Object) null);
                }
                u02.T0();
            }
        }
    }

    public final k1.g U() {
        return this.t;
    }

    public final boolean V() {
        return this.B;
    }

    public final List<LayoutNode> W() {
        return A0().f();
    }

    public d2.e X() {
        return this.f6844p;
    }

    public final void X0() {
        LayoutNode u02 = u0();
        float t12 = this.C.t1();
        LayoutNodeWrapper s02 = s0();
        LayoutNodeWrapper layoutNodeWrapper = this.C;
        while (!kotlin.jvm.internal.p.e(s02, layoutNodeWrapper)) {
            b bVar = (b) s02;
            t12 += bVar.t1();
            s02 = bVar.r1();
        }
        boolean z11 = false;
        if (!(t12 == this.E)) {
            this.E = t12;
            if (u02 != null) {
                u02.Y0();
            }
            if (u02 != null) {
                u02.I0();
            }
        }
        if (!g()) {
            if (u02 != null) {
                u02.I0();
            }
            P0();
        }
        if (u02 == null) {
            this.v = 0;
        } else if (!this.Q && u02.f6840i == LayoutState.LayingOut) {
            if (this.v == Integer.MAX_VALUE) {
                z11 = true;
            }
            if (z11) {
                int i11 = u02.f6849x;
                this.v = i11;
                u02.f6849x = i11 + 1;
            } else {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
        }
        M0();
    }

    public final int Y() {
        return this.f6839h;
    }

    public final List<LayoutNode> Z() {
        return this.f6834c.f();
    }

    public final void Z0(long j11) {
        LayoutState layoutState = LayoutState.Measuring;
        this.f6840i = layoutState;
        this.R = false;
        k1.j.a(this).getSnapshotObserver().d(this, new LayoutNode$performMeasure$1(this, j11));
        if (this.f6840i == layoutState) {
            N0();
            this.f6840i = LayoutState.Idle;
        }
    }

    public void a(p0.d dVar) {
        LayoutNode u02;
        LayoutNode u03;
        q qVar;
        kotlin.jvm.internal.p.j(dVar, "value");
        if (!kotlin.jvm.internal.p.e(dVar, this.L)) {
            if (kotlin.jvm.internal.p.e(m0(), p0.d.f16037h0) || (!this.f6832a)) {
                this.L = dVar;
                boolean x12 = x1();
                M();
                LayoutNodeWrapper s02 = s0();
                LayoutNodeWrapper r12 = this.C.r1();
                while (!kotlin.jvm.internal.p.e(s02, r12) && s02 != null) {
                    k1.b.j(s02.e1());
                    s02 = s02.r1();
                }
                Q0(dVar);
                LayoutNodeWrapper K0 = this.D.K0();
                if (androidx.compose.ui.semantics.a.j(this) != null && L0()) {
                    q qVar2 = this.f6838g;
                    kotlin.jvm.internal.p.g(qVar2);
                    qVar2.q();
                }
                boolean C0 = C0();
                f0.e<Pair<LayoutNodeWrapper, z>> eVar = this.O;
                if (eVar != null) {
                    eVar.g();
                }
                this.C.E1();
                LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) m0().W(this.C, new LayoutNode$modifier$outerWrapper$1(this));
                s1(dVar);
                LayoutNode u04 = u0();
                layoutNodeWrapper.P1(u04 != null ? u04.C : null);
                this.D.R0(layoutNodeWrapper);
                if (L0()) {
                    f0.e<b> eVar2 = this.j;
                    int m11 = eVar2.m();
                    if (m11 > 0) {
                        Object[] l11 = eVar2.l();
                        int i11 = 0;
                        do {
                            ((b) l11[i11]).W0();
                            i11++;
                        } while (i11 < m11);
                    }
                    LayoutNodeWrapper s03 = s0();
                    LayoutNodeWrapper r13 = this.C.r1();
                    while (!kotlin.jvm.internal.p.e(s03, r13) && s03 != null) {
                        if (!s03.D()) {
                            s03.T0();
                        } else {
                            for (k1.i iVar : s03.e1()) {
                                while (iVar != null) {
                                    iVar.g();
                                    iVar = iVar.d();
                                }
                            }
                        }
                        s03 = s03.r1();
                    }
                }
                this.j.g();
                LayoutNodeWrapper s04 = s0();
                LayoutNodeWrapper r14 = this.C.r1();
                while (!kotlin.jvm.internal.p.e(s04, r14) && s04 != null) {
                    s04.I1();
                    s04 = s04.r1();
                }
                if (!kotlin.jvm.internal.p.e(K0, this.C) || !kotlin.jvm.internal.p.e(layoutNodeWrapper, this.C)) {
                    k1(this, false, 1, (Object) null);
                } else if (this.f6840i == LayoutState.Idle && !this.R && C0) {
                    k1(this, false, 1, (Object) null);
                } else if (k1.b.m(this.C.e1(), k1.b.f15323a.b()) && (qVar = this.f6838g) != null) {
                    qVar.h(this);
                }
                Object p11 = p();
                this.D.O0();
                if (!kotlin.jvm.internal.p.e(p11, p()) && (u03 = u0()) != null) {
                    k1(u03, false, 1, (Object) null);
                }
                if ((x12 || x1()) && (u02 = u0()) != null) {
                    u02.I0();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
    }

    public int a0() {
        return this.D.e0();
    }

    public final void a1(int i11, int i12) {
        if (this.f6851z == UsageByParent.NotUsed) {
            I();
        }
        e0.a.C0133a aVar = e0.a.f14880a;
        int q02 = this.D.q0();
        LayoutDirection layoutDirection = getLayoutDirection();
        int z11 = aVar.h();
        LayoutDirection y11 = aVar.g();
        e0.a.f14882c = q02;
        e0.a.f14881b = layoutDirection;
        e0.a.n(aVar, this.D, i11, i12, 0.0f, 4, (Object) null);
        e0.a.f14882c = z11;
        e0.a.f14881b = y11;
    }

    public void b() {
        k1(this, false, 1, (Object) null);
        d2.b J0 = this.D.J0();
        if (J0 != null) {
            q qVar = this.f6838g;
            if (qVar != null) {
                qVar.e(this, J0.t());
                return;
            }
            return;
        }
        q qVar2 = this.f6838g;
        if (qVar2 != null) {
            k1.p.a(qVar2, false, 1, (Object) null);
        }
    }

    public void c(LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutDirection, "value");
        if (this.f6845r != layoutDirection) {
            this.f6845r = layoutDirection;
            W0();
        }
    }

    public final LayoutNodeWrapper c0() {
        return this.C;
    }

    public final boolean c1(d2.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f6851z == UsageByParent.NotUsed) {
            H();
        }
        return this.D.P0(bVar.t());
    }

    public i1.m d() {
        return this.C;
    }

    public final k1.e d0() {
        return this.f6843o;
    }

    public void e(t tVar) {
        kotlin.jvm.internal.p.j(tVar, "value");
        if (!kotlin.jvm.internal.p.e(this.n, tVar)) {
            this.n = tVar;
            this.f6843o.f(j0());
            k1(this, false, 1, (Object) null);
        }
    }

    public final UsageByParent e0() {
        return this.f6851z;
    }

    public final void e1() {
        int m11 = this.f6834c.m();
        while (true) {
            m11--;
            if (-1 < m11) {
                V0((LayoutNode) this.f6834c.l()[m11]);
            } else {
                this.f6834c.g();
                return;
            }
        }
    }

    public void f(n1 n1Var) {
        kotlin.jvm.internal.p.j(n1Var, "<set-?>");
        this.f6846s = n1Var;
    }

    public final boolean f0() {
        return this.S;
    }

    public final void f1(int i11, int i12) {
        if (i12 >= 0) {
            int i13 = (i12 + i11) - 1;
            if (i11 <= i13) {
                while (true) {
                    V0(this.f6834c.u(i13));
                    if (i13 != i11) {
                        i13--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i12 + ") must be greater than 0").toString());
        }
    }

    public boolean g() {
        return this.f6847u;
    }

    public final LayoutState g0() {
        return this.f6840i;
    }

    /* JADX INFO: finally extract failed */
    public final void g1() {
        if (this.f6851z == UsageByParent.NotUsed) {
            I();
        }
        try {
            this.Q = true;
            this.D.Q0();
            this.Q = false;
        } catch (Throwable th2) {
            this.Q = false;
            throw th2;
        }
    }

    public LayoutDirection getLayoutDirection() {
        return this.f6845r;
    }

    public void h() {
        for (k1.i iVar = this.C.e1()[k1.b.f15323a.b()]; iVar != null; iVar = iVar.d()) {
            ((a0) ((k1.v) iVar).c()).J(this.C);
        }
    }

    public final h h0() {
        return k1.j.a(this).getSharedDrawScope();
    }

    public final void h1(boolean z11) {
        q qVar;
        if (!this.f6832a && (qVar = this.f6838g) != null) {
            qVar.l(this, z11);
        }
    }

    public void i(d2.e eVar) {
        kotlin.jvm.internal.p.j(eVar, "value");
        if (!kotlin.jvm.internal.p.e(this.f6844p, eVar)) {
            this.f6844p = eVar;
            W0();
        }
    }

    public final boolean i0() {
        return this.R;
    }

    public t j0() {
        return this.n;
    }

    public final void j1(boolean z11) {
        q qVar;
        if (!this.k && !this.f6832a && (qVar = this.f6838g) != null) {
            qVar.s(this, z11);
            this.D.L0(z11);
        }
    }

    public final w k0() {
        return this.q;
    }

    public final UsageByParent l0() {
        return this.f6850y;
    }

    public p0.d m0() {
        return this.L;
    }

    public final void m1() {
        f0.e<LayoutNode> A0 = A0();
        int m11 = A0.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = A0.l();
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                UsageByParent usageByParent = layoutNode.A;
                layoutNode.f6851z = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.m1();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    public final m n0() {
        return this.I;
    }

    public boolean o0() {
        return L0();
    }

    public final void o1(boolean z11) {
        this.B = z11;
    }

    public Object p() {
        return this.D.p();
    }

    public final m p0() {
        return this.K;
    }

    public final void p1(boolean z11) {
        this.H = z11;
    }

    public final boolean q0() {
        return this.P;
    }

    public final void q1(UsageByParent usageByParent) {
        kotlin.jvm.internal.p.j(usageByParent, "<set-?>");
        this.f6851z = usageByParent;
    }

    public final f0.e<Pair<LayoutNodeWrapper, z>> r0() {
        f0.e<Pair<LayoutNodeWrapper, z>> eVar = this.O;
        if (eVar != null) {
            return eVar;
        }
        f0.e<Pair<LayoutNodeWrapper, z>> eVar2 = new f0.e<>(new Pair[16], 0);
        this.O = eVar2;
        return eVar2;
    }

    public final void r1(UsageByParent usageByParent) {
        kotlin.jvm.internal.p.j(usageByParent, "<set-?>");
        this.f6850y = usageByParent;
    }

    public final LayoutNodeWrapper s0() {
        return this.D.K0();
    }

    public final q t0() {
        return this.f6838g;
    }

    public final void t1(boolean z11) {
        this.P = z11;
    }

    public String toString() {
        return q0.a(this, (String) null) + " children: " + W().size() + " measurePolicy: " + j0();
    }

    public final LayoutNode u0() {
        LayoutNode layoutNode = this.f6837f;
        boolean z11 = true;
        if (layoutNode == null || !layoutNode.f6832a) {
            z11 = false;
        }
        if (!z11) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.u0();
        }
        return null;
    }

    public final void u1(l<? super q, k> lVar) {
        this.M = lVar;
    }

    public final int v0() {
        return this.v;
    }

    public final void v1(l<? super q, k> lVar) {
        this.N = lVar;
    }

    public final LayoutNodeSubcompositionsState w0() {
        return this.F;
    }

    public final void w1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.F = layoutNodeSubcompositionsState;
    }

    public int x(int i11) {
        return this.D.x(i11);
    }

    public n1 x0() {
        return this.f6846s;
    }

    public int y0() {
        return this.D.A0();
    }

    public final f0.e<LayoutNode> z0() {
        if (this.f6842m) {
            this.f6841l.g();
            f0.e<LayoutNode> eVar = this.f6841l;
            eVar.c(eVar.m(), A0());
            this.f6841l.y(this.T);
            this.f6842m = false;
        }
        return this.f6841l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNode(boolean z11, int i11, i iVar) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
