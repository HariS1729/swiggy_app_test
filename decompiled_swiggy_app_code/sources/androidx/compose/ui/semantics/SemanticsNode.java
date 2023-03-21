package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import i1.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import n1.g;
import n1.j;
import n1.k;
import n1.l;
import n1.m;
import n1.q;
import n1.r;
import t0.f;
import t0.h;

/* compiled from: SemanticsNode.kt */
public final class SemanticsNode {

    /* renamed from: a  reason: collision with root package name */
    private final k f7417a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7418b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7419c;

    /* renamed from: d  reason: collision with root package name */
    private SemanticsNode f7420d;

    /* renamed from: e  reason: collision with root package name */
    private final j f7421e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7422f;

    /* renamed from: g  reason: collision with root package name */
    private final LayoutNode f7423g;

    public SemanticsNode(k kVar, boolean z11) {
        p.j(kVar, "outerSemanticsEntity");
        this.f7417a = kVar;
        this.f7418b = z11;
        this.f7421e = kVar.j();
        this.f7422f = ((l) kVar.c()).getId();
        this.f7423g = kVar.a();
    }

    private final void a(List<SemanticsNode> list) {
        g c11 = a.k(this);
        if (c11 != null && this.f7421e.l() && (!list.isEmpty())) {
            list.add(b(c11, new SemanticsNode$emitFakeNodes$fakeNode$1(c11)));
        }
        j jVar = this.f7421e;
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        if (jVar.c(semanticsProperties.c()) && (!list.isEmpty()) && this.f7421e.l()) {
            List list2 = (List) SemanticsConfigurationKt.a(this.f7421e, semanticsProperties.c());
            String str = list2 != null ? (String) s.Y(list2) : null;
            if (str != null) {
                list.add(0, b((g) null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    private final SemanticsNode b(g gVar, lp0.l<? super q, bp0.k> lVar) {
        SemanticsNode semanticsNode = new SemanticsNode(new k(new LayoutNode(true).c0(), new m(gVar != null ? a.l(this) : a.e(this), false, false, lVar)), false);
        semanticsNode.f7419c = true;
        semanticsNode.f7420d = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> c(List<SemanticsNode> list, boolean z11) {
        List x11 = x(this, z11, false, 2, (Object) null);
        int size = x11.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode = (SemanticsNode) x11.get(i11);
            if (semanticsNode.u()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.f7421e.k()) {
                d(semanticsNode, list, false, 2, (Object) null);
            }
        }
        return list;
    }

    static /* synthetic */ List d(SemanticsNode semanticsNode, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return semanticsNode.c(list, z11);
    }

    private final List<SemanticsNode> g(boolean z11, boolean z12, boolean z13) {
        if (!z12 && this.f7421e.k()) {
            return k.j();
        }
        if (u()) {
            return d(this, (List) null, z11, 1, (Object) null);
        }
        return w(z11, z13);
    }

    private final boolean u() {
        return this.f7418b && this.f7421e.l();
    }

    private final void v(j jVar) {
        if (!this.f7421e.k()) {
            List x11 = x(this, false, false, 3, (Object) null);
            int size = x11.size();
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode = (SemanticsNode) x11.get(i11);
                if (!semanticsNode.u()) {
                    jVar.m(semanticsNode.f7421e);
                    semanticsNode.v(jVar);
                }
            }
        }
    }

    public static /* synthetic */ List x(SemanticsNode semanticsNode, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return semanticsNode.w(z11, z12);
    }

    public final LayoutNodeWrapper e() {
        if (!this.f7421e.l()) {
            return this.f7417a.b();
        }
        k i11 = a.i(this.f7423g);
        if (i11 == null) {
            i11 = this.f7417a;
        }
        return i11.b();
    }

    public final h f() {
        if (!this.f7423g.L0()) {
            return h.f16667e.a();
        }
        return n.b(e());
    }

    public final j h() {
        if (!u()) {
            return this.f7421e;
        }
        j f11 = this.f7421e.f();
        v(f11);
        return f11;
    }

    public final int i() {
        return this.f7422f;
    }

    public final i1.p j() {
        return this.f7423g;
    }

    public final LayoutNode k() {
        return this.f7423g;
    }

    public final k l() {
        return this.f7417a;
    }

    public final SemanticsNode m() {
        SemanticsNode semanticsNode = this.f7420d;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode b11 = this.f7418b ? a.f(this.f7423g, SemanticsNode$parent$1.f7426a) : null;
        if (b11 == null) {
            b11 = a.f(this.f7423g, SemanticsNode$parent$2.f7427a);
        }
        k j = b11 != null ? a.j(b11) : null;
        if (j == null) {
            return null;
        }
        return new SemanticsNode(j, this.f7418b);
    }

    public final long n() {
        if (!this.f7423g.L0()) {
            return f.f16662b.c();
        }
        return n.e(e());
    }

    public final List<SemanticsNode> o() {
        return g(false, false, true);
    }

    public final List<SemanticsNode> p() {
        return g(true, false, true);
    }

    public final long q() {
        return e().a();
    }

    public final h r() {
        k kVar;
        if (this.f7421e.l()) {
            kVar = a.i(this.f7423g);
            if (kVar == null) {
                kVar = this.f7417a;
            }
        } else {
            kVar = this.f7417a;
        }
        return kVar.l();
    }

    public final j s() {
        return this.f7421e;
    }

    public final boolean t() {
        return this.f7419c;
    }

    public final List<SemanticsNode> w(boolean z11, boolean z12) {
        List list;
        if (this.f7419c) {
            return k.j();
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            list = r.c(this.f7423g, (List) null, 1, (Object) null);
        } else {
            list = a.h(this.f7423g, (List) null, 1, (Object) null);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new SemanticsNode((k) list.get(i11), this.f7418b));
        }
        if (z12) {
            a(arrayList);
        }
        return arrayList;
    }
}
