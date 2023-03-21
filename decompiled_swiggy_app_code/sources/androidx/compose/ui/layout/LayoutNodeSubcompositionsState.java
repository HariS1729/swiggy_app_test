package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import e0.a1;
import e0.g;
import e0.h;
import e0.h0;
import f0.e;
import i1.j0;
import i1.k0;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.j;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;

/* compiled from: SubcomposeLayout.kt */
public final class LayoutNodeSubcompositionsState {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f6733a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.compose.runtime.a f6734b;

    /* renamed from: c  reason: collision with root package name */
    private k0 f6735c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f6736d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<LayoutNode, a> f6737e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<Object, LayoutNode> f6738f = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final b f6739g = new b();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Map<Object, LayoutNode> f6740h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    private final k0.a f6741i = new k0.a((Set) null, 1, (i) null);
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public int k;

    /* renamed from: l  reason: collision with root package name */
    private final String f6742l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* compiled from: SubcomposeLayout.kt */
    private final class b implements j0 {

        /* renamed from: a  reason: collision with root package name */
        private LayoutDirection f6748a = LayoutDirection.Rtl;

        /* renamed from: b  reason: collision with root package name */
        private float f6749b;

        /* renamed from: c  reason: collision with root package name */
        private float f6750c;

        public b() {
        }

        public /* synthetic */ float M(float f11) {
            return d2.d.c(this, f11);
        }

        public /* synthetic */ long S(long j) {
            return d2.d.h(this, j);
        }

        public List<r> a0(Object obj, p<? super g, ? super Integer, k> pVar) {
            kotlin.jvm.internal.p.j(pVar, "content");
            return LayoutNodeSubcompositionsState.this.w(obj, pVar);
        }

        public void b(float f11) {
            this.f6749b = f11;
        }

        public float getDensity() {
            return this.f6749b;
        }

        public LayoutDirection getLayoutDirection() {
            return this.f6748a;
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

        public void p(float f11) {
            this.f6750c = f11;
        }

        public /* synthetic */ long q(int i11) {
            return d2.d.i(this, i11);
        }

        public void r(LayoutDirection layoutDirection) {
            kotlin.jvm.internal.p.j(layoutDirection, "<set-?>");
            this.f6748a = layoutDirection;
        }

        public float u0() {
            return this.f6750c;
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

    /* compiled from: SubcomposeLayout.kt */
    public static final class c extends LayoutNode.e {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LayoutNodeSubcompositionsState f6752b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<j0, d2.b, u> f6753c;

        /* compiled from: SubcomposeLayout.kt */
        public static final class a implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u f6754a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LayoutNodeSubcompositionsState f6755b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f6756c;

            a(u uVar, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i11) {
                this.f6754a = uVar;
                this.f6755b = layoutNodeSubcompositionsState;
                this.f6756c = i11;
            }

            public Map<i1.a, Integer> a() {
                return this.f6754a.a();
            }

            public void d() {
                this.f6755b.f6736d = this.f6756c;
                this.f6754a.d();
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f6755b;
                layoutNodeSubcompositionsState.n(layoutNodeSubcompositionsState.f6736d);
            }

            public int getHeight() {
                return this.f6754a.getHeight();
            }

            public int getWidth() {
                return this.f6754a.getWidth();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, p<? super j0, ? super d2.b, ? extends u> pVar, String str) {
            super(str);
            this.f6752b = layoutNodeSubcompositionsState;
            this.f6753c = pVar;
        }

        public u d(w wVar, List<? extends r> list, long j) {
            kotlin.jvm.internal.p.j(wVar, "$this$measure");
            kotlin.jvm.internal.p.j(list, "measurables");
            this.f6752b.f6739g.r(wVar.getLayoutDirection());
            this.f6752b.f6739g.b(wVar.getDensity());
            this.f6752b.f6739g.p(wVar.u0());
            this.f6752b.f6736d = 0;
            return new a(this.f6753c.invoke(this.f6752b.f6739g, d2.b.b(j)), this.f6752b, this.f6752b.f6736d);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class d implements SubcomposeLayoutState.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LayoutNodeSubcompositionsState f6757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f6758b;

        d(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Object obj) {
            this.f6757a = layoutNodeSubcompositionsState;
            this.f6758b = obj;
        }

        public int a() {
            e<LayoutNode> A0;
            LayoutNode layoutNode = (LayoutNode) this.f6757a.f6740h.get(this.f6758b);
            if (layoutNode == null || (A0 = layoutNode.A0()) == null) {
                return 0;
            }
            return A0.m();
        }

        public void b(int i11, long j) {
            LayoutNode layoutNode = (LayoutNode) this.f6757a.f6740h.get(this.f6758b);
            if (layoutNode != null && layoutNode.L0()) {
                int m11 = layoutNode.A0().m();
                if (i11 < 0 || i11 >= m11) {
                    throw new IndexOutOfBoundsException("Index (" + i11 + ") is out of bound of [0, " + m11 + ')');
                } else if (!layoutNode.g()) {
                    LayoutNode e11 = this.f6757a.f6733a;
                    e11.k = true;
                    j.a(layoutNode).e((LayoutNode) layoutNode.A0().l()[i11], j);
                    e11.k = false;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }

        public void dispose() {
            this.f6757a.q();
            LayoutNode layoutNode = (LayoutNode) this.f6757a.f6740h.remove(this.f6758b);
            if (layoutNode != null) {
                boolean z11 = false;
                if (this.f6757a.k > 0) {
                    int indexOf = this.f6757a.f6733a.Z().indexOf(layoutNode);
                    if (indexOf >= this.f6757a.f6733a.Z().size() - this.f6757a.k) {
                        z11 = true;
                    }
                    if (z11) {
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f6757a;
                        layoutNodeSubcompositionsState.j = layoutNodeSubcompositionsState.j + 1;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.f6757a;
                        layoutNodeSubcompositionsState2.k = layoutNodeSubcompositionsState2.k - 1;
                        int size = (this.f6757a.f6733a.Z().size() - this.f6757a.k) - this.f6757a.j;
                        this.f6757a.r(indexOf, size, 1);
                        this.f6757a.n(size);
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, k0 k0Var) {
        kotlin.jvm.internal.p.j(layoutNode, "root");
        kotlin.jvm.internal.p.j(k0Var, "slotReusePolicy");
        this.f6733a = layoutNode;
        this.f6735c = k0Var;
    }

    private final LayoutNode A(Object obj) {
        int i11;
        if (this.j == 0) {
            return null;
        }
        int size = this.f6733a.Z().size() - this.k;
        int i12 = size - this.j;
        int i13 = size - 1;
        int i14 = i13;
        while (true) {
            if (i14 < i12) {
                i11 = -1;
                break;
            } else if (kotlin.jvm.internal.p.e(p(i14), obj)) {
                i11 = i14;
                break;
            } else {
                i14--;
            }
        }
        if (i11 == -1) {
            while (true) {
                if (i13 < i12) {
                    i14 = i13;
                    break;
                }
                a aVar = this.f6737e.get(this.f6733a.Z().get(i13));
                kotlin.jvm.internal.p.g(aVar);
                a aVar2 = aVar;
                if (this.f6735c.b(obj, aVar2.e())) {
                    aVar2.j(obj);
                    i14 = i13;
                    i11 = i14;
                    break;
                }
                i13--;
            }
        }
        if (i11 == -1) {
            return null;
        }
        if (i14 != i12) {
            r(i14, i12, 1);
        }
        this.j--;
        LayoutNode layoutNode = this.f6733a.Z().get(i12);
        a aVar3 = this.f6737e.get(layoutNode);
        kotlin.jvm.internal.p.g(aVar3);
        aVar3.f(true);
        androidx.compose.runtime.snapshots.b.f6287e.g();
        return layoutNode;
    }

    private final LayoutNode l(int i11) {
        LayoutNode layoutNode = new LayoutNode(true);
        LayoutNode layoutNode2 = this.f6733a;
        layoutNode2.k = true;
        this.f6733a.H0(i11, layoutNode);
        layoutNode2.k = false;
        return layoutNode;
    }

    private final Object p(int i11) {
        a aVar = this.f6737e.get(this.f6733a.Z().get(i11));
        kotlin.jvm.internal.p.g(aVar);
        return aVar.e();
    }

    /* access modifiers changed from: private */
    public final void r(int i11, int i12, int i13) {
        LayoutNode layoutNode = this.f6733a;
        layoutNode.k = true;
        this.f6733a.S0(i11, i12, i13);
        layoutNode.k = false;
    }

    static /* synthetic */ void s(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 1;
        }
        layoutNodeSubcompositionsState.r(i11, i12, i13);
    }

    private final void x(LayoutNode layoutNode, a aVar) {
        androidx.compose.runtime.snapshots.b k11;
        androidx.compose.runtime.snapshots.b a11 = androidx.compose.runtime.snapshots.b.f6287e.a();
        try {
            k11 = a11.k();
            LayoutNode layoutNode2 = this.f6733a;
            layoutNode2.k = true;
            p<g, Integer, k> c11 = aVar.c();
            h b11 = aVar.b();
            androidx.compose.runtime.a aVar2 = this.f6734b;
            if (aVar2 != null) {
                aVar.g(z(b11, layoutNode, aVar2, l0.b.c(-34810602, true, new LayoutNodeSubcompositionsState$subcompose$2$1$1(aVar, c11))));
                layoutNode2.k = false;
                k kVar = k.f22762a;
                a11.r(k11);
                a11.d();
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } catch (Throwable th2) {
            a11.d();
            throw th2;
        }
    }

    private final void y(LayoutNode layoutNode, Object obj, p<? super g, ? super Integer, k> pVar) {
        Map<LayoutNode, a> map = this.f6737e;
        a aVar = map.get(layoutNode);
        if (aVar == null) {
            aVar = new a(obj, ComposableSingletons$SubcomposeLayoutKt.f6721a.a(), (h) null, 4, (i) null);
            map.put(layoutNode, aVar);
        }
        a aVar2 = aVar;
        h b11 = aVar2.b();
        boolean s11 = b11 != null ? b11.s() : true;
        if (aVar2.c() != pVar || s11 || aVar2.d()) {
            aVar2.h(pVar);
            x(layoutNode, aVar2);
            aVar2.i(false);
        }
    }

    private final h z(h hVar, LayoutNode layoutNode, androidx.compose.runtime.a aVar, p<? super g, ? super Integer, k> pVar) {
        if (hVar == null || hVar.isDisposed()) {
            hVar = a2.a(layoutNode, aVar);
        }
        hVar.c(pVar);
        return hVar;
    }

    public final t k(p<? super j0, ? super d2.b, ? extends u> pVar) {
        kotlin.jvm.internal.p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return new c(this, pVar, this.f6742l);
    }

    public final void m() {
        LayoutNode layoutNode = this.f6733a;
        layoutNode.k = true;
        for (a b11 : this.f6737e.values()) {
            h b12 = b11.b();
            if (b12 != null) {
                b12.dispose();
            }
        }
        this.f6733a.e1();
        layoutNode.k = false;
        this.f6737e.clear();
        this.f6738f.clear();
        this.k = 0;
        this.j = 0;
        this.f6740h.clear();
        q();
    }

    public final void n(int i11) {
        this.j = 0;
        int size = (this.f6733a.Z().size() - this.k) - 1;
        if (i11 <= size) {
            this.f6741i.clear();
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    this.f6741i.add(p(i12));
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
            this.f6735c.a(this.f6741i);
            while (size >= i11) {
                LayoutNode layoutNode = this.f6733a.Z().get(size);
                a aVar = this.f6737e.get(layoutNode);
                kotlin.jvm.internal.p.g(aVar);
                a aVar2 = aVar;
                Object e11 = aVar2.e();
                if (this.f6741i.contains(e11)) {
                    layoutNode.r1(LayoutNode.UsageByParent.NotUsed);
                    this.j++;
                    aVar2.f(false);
                } else {
                    LayoutNode layoutNode2 = this.f6733a;
                    layoutNode2.k = true;
                    this.f6737e.remove(layoutNode);
                    h b11 = aVar2.b();
                    if (b11 != null) {
                        b11.dispose();
                    }
                    this.f6733a.f1(size, 1);
                    layoutNode2.k = false;
                }
                this.f6738f.remove(e11);
                size--;
            }
        }
        q();
    }

    public final void o() {
        for (Map.Entry<LayoutNode, a> value : this.f6737e.entrySet()) {
            ((a) value.getValue()).i(true);
        }
        if (!this.f6733a.i0()) {
            LayoutNode.k1(this.f6733a, false, 1, (Object) null);
        }
    }

    public final void q() {
        boolean z11 = true;
        if (this.f6737e.size() == this.f6733a.Z().size()) {
            if ((this.f6733a.Z().size() - this.j) - this.k >= 0) {
                if (this.f6740h.size() != this.k) {
                    z11 = false;
                }
                if (!z11) {
                    throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.k + ". Map size " + this.f6740h.size()).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f6733a.Z().size() + ". Reusable children " + this.j + ". Precomposed children " + this.k).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f6737e.size() + ") and the children count on the SubcomposeLayout (" + this.f6733a.Z().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final SubcomposeLayoutState.a t(Object obj, p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "content");
        q();
        if (!this.f6738f.containsKey(obj)) {
            Map<Object, LayoutNode> map = this.f6740h;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = A(obj);
                if (layoutNode != null) {
                    r(this.f6733a.Z().indexOf(layoutNode), this.f6733a.Z().size(), 1);
                    this.k++;
                } else {
                    layoutNode = l(this.f6733a.Z().size());
                    this.k++;
                }
                map.put(obj, layoutNode);
            }
            y(layoutNode, obj, pVar);
        }
        return new d(this, obj);
    }

    public final void u(androidx.compose.runtime.a aVar) {
        this.f6734b = aVar;
    }

    public final void v(k0 k0Var) {
        kotlin.jvm.internal.p.j(k0Var, "value");
        if (this.f6735c != k0Var) {
            this.f6735c = k0Var;
            n(0);
        }
    }

    public final List<r> w(Object obj, p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "content");
        q();
        LayoutNode.LayoutState g02 = this.f6733a.g0();
        boolean z11 = false;
        if (g02 == LayoutNode.LayoutState.Measuring || g02 == LayoutNode.LayoutState.LayingOut) {
            Map<Object, LayoutNode> map = this.f6738f;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = this.f6740h.remove(obj);
                if (layoutNode != null) {
                    int i11 = this.k;
                    if (i11 > 0) {
                        z11 = true;
                    }
                    if (z11) {
                        this.k = i11 - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    layoutNode = A(obj);
                    if (layoutNode == null) {
                        layoutNode = l(this.f6736d);
                    }
                }
                map.put(obj, layoutNode);
            }
            LayoutNode layoutNode2 = layoutNode;
            int indexOf = this.f6733a.Z().indexOf(layoutNode2);
            int i12 = this.f6736d;
            if (indexOf >= i12) {
                if (i12 != indexOf) {
                    s(this, indexOf, i12, 0, 4, (Object) null);
                }
                this.f6736d++;
                y(layoutNode2, obj, pVar);
                return layoutNode2.W();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    /* compiled from: SubcomposeLayout.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Object f6743a;

        /* renamed from: b  reason: collision with root package name */
        private p<? super g, ? super Integer, k> f6744b;

        /* renamed from: c  reason: collision with root package name */
        private h f6745c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6746d;

        /* renamed from: e  reason: collision with root package name */
        private final h0 f6747e;

        public a(Object obj, p<? super g, ? super Integer, k> pVar, h hVar) {
            kotlin.jvm.internal.p.j(pVar, "content");
            this.f6743a = obj;
            this.f6744b = pVar;
            this.f6745c = hVar;
            this.f6747e = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
        }

        public final boolean a() {
            return ((Boolean) this.f6747e.getValue()).booleanValue();
        }

        public final h b() {
            return this.f6745c;
        }

        public final p<g, Integer, k> c() {
            return this.f6744b;
        }

        public final boolean d() {
            return this.f6746d;
        }

        public final Object e() {
            return this.f6743a;
        }

        public final void f(boolean z11) {
            this.f6747e.setValue(Boolean.valueOf(z11));
        }

        public final void g(h hVar) {
            this.f6745c = hVar;
        }

        public final void h(p<? super g, ? super Integer, k> pVar) {
            kotlin.jvm.internal.p.j(pVar, "<set-?>");
            this.f6744b = pVar;
        }

        public final void i(boolean z11) {
            this.f6746d = z11;
        }

        public final void j(Object obj) {
            this.f6743a = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, p pVar, h hVar, int i11, i iVar) {
            this(obj, pVar, (i11 & 4) != 0 ? null : hVar);
        }
    }
}
