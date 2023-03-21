package n1;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import lp0.a;
import lp0.l;
import lp0.q;
import p1.a0;
import p1.b;
import p1.y;
import sp0.j;

/* compiled from: SemanticsProperties.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ j<Object>[] f15810a;

    /* renamed from: b  reason: collision with root package name */
    private static final SemanticsPropertyKey f15811b;

    /* renamed from: c  reason: collision with root package name */
    private static final SemanticsPropertyKey f15812c;

    /* renamed from: d  reason: collision with root package name */
    private static final SemanticsPropertyKey f15813d;

    /* renamed from: e  reason: collision with root package name */
    private static final SemanticsPropertyKey f15814e;

    /* renamed from: f  reason: collision with root package name */
    private static final SemanticsPropertyKey f15815f;

    /* renamed from: g  reason: collision with root package name */
    private static final SemanticsPropertyKey f15816g;

    /* renamed from: h  reason: collision with root package name */
    private static final SemanticsPropertyKey f15817h;

    /* renamed from: i  reason: collision with root package name */
    private static final SemanticsPropertyKey f15818i;
    private static final SemanticsPropertyKey j;
    private static final SemanticsPropertyKey k;

    /* renamed from: l  reason: collision with root package name */
    private static final SemanticsPropertyKey f15819l;

    /* renamed from: m  reason: collision with root package name */
    private static final SemanticsPropertyKey f15820m;
    private static final SemanticsPropertyKey n;

    /* renamed from: o  reason: collision with root package name */
    private static final SemanticsPropertyKey f15821o;

    /* renamed from: p  reason: collision with root package name */
    private static final SemanticsPropertyKey f15822p;
    private static final SemanticsPropertyKey q;

    /* renamed from: r  reason: collision with root package name */
    private static final SemanticsPropertyKey f15823r = i.f15789a.c();

    static {
        Class<o> cls = o.class;
        f15810a = new j[]{s.f(new MutablePropertyReference1Impl(cls, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), s.f(new MutablePropertyReference1Impl(cls, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), s.f(new MutablePropertyReference1Impl(cls, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), s.f(new MutablePropertyReference1Impl(cls, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), s.f(new MutablePropertyReference1Impl(cls, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), s.f(new MutablePropertyReference1Impl(cls, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), s.f(new MutablePropertyReference1Impl(cls, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), s.f(new MutablePropertyReference1Impl(cls, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), s.f(new MutablePropertyReference1Impl(cls, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), s.f(new MutablePropertyReference1Impl(cls, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), s.f(new MutablePropertyReference1Impl(cls, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), s.f(new MutablePropertyReference1Impl(cls, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), s.f(new MutablePropertyReference1Impl(cls, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), s.f(new MutablePropertyReference1Impl(cls, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), s.f(new MutablePropertyReference1Impl(cls, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), s.f(new MutablePropertyReference1Impl(cls, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), s.f(new MutablePropertyReference1Impl(cls, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        f15811b = semanticsProperties.v();
        f15812c = semanticsProperties.r();
        f15813d = semanticsProperties.p();
        f15814e = semanticsProperties.o();
        f15815f = semanticsProperties.g();
        f15816g = semanticsProperties.i();
        f15817h = semanticsProperties.A();
        f15818i = semanticsProperties.s();
        j = semanticsProperties.w();
        k = semanticsProperties.e();
        f15819l = semanticsProperties.y();
        f15820m = semanticsProperties.j();
        n = semanticsProperties.u();
        f15821o = semanticsProperties.a();
        f15822p = semanticsProperties.b();
        q = semanticsProperties.z();
    }

    public static /* synthetic */ void A(q qVar, String str, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        z(qVar, str, lVar);
    }

    public static final void B(q qVar, b bVar) {
        p.j(qVar, "<this>");
        p.j(bVar, "<set-?>");
        f15821o.c(qVar, f15810a[13], bVar);
    }

    public static final void C(q qVar, String str) {
        p.j(qVar, "<this>");
        p.j(str, "value");
        qVar.a(SemanticsProperties.f7428a.c(), j.d(str));
    }

    public static final void D(q qVar, b bVar) {
        p.j(qVar, "<this>");
        p.j(bVar, "<set-?>");
        k.c(qVar, f15810a[9], bVar);
    }

    public static final void E(q qVar, boolean z11) {
        p.j(qVar, "<this>");
        f15815f.c(qVar, f15810a[4], Boolean.valueOf(z11));
    }

    public static final void F(q qVar, h hVar) {
        p.j(qVar, "<this>");
        p.j(hVar, "<set-?>");
        f15816g.c(qVar, f15810a[5], hVar);
    }

    public static final void G(q qVar, int i11) {
        p.j(qVar, "$this$imeAction");
        f15820m.c(qVar, f15810a[11], v1.l.i(i11));
    }

    public static final void H(q qVar, int i11) {
        p.j(qVar, "$this$liveRegion");
        f15814e.c(qVar, f15810a[3], e.c(i11));
    }

    public static final void I(q qVar, String str) {
        p.j(qVar, "<this>");
        p.j(str, "<set-?>");
        f15813d.c(qVar, f15810a[2], str);
    }

    public static final void J(q qVar, f fVar) {
        p.j(qVar, "<this>");
        p.j(fVar, "<set-?>");
        f15812c.c(qVar, f15810a[1], fVar);
    }

    public static final void K(q qVar, int i11) {
        p.j(qVar, "$this$role");
        f15818i.c(qVar, f15810a[7], g.g(i11));
    }

    public static final void L(q qVar, String str, q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar2) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.o(), new a(str, qVar2));
    }

    public static /* synthetic */ void M(q qVar, String str, q qVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        L(qVar, str, qVar2);
    }

    public static final void N(q qVar, String str) {
        p.j(qVar, "<this>");
        p.j(str, "<set-?>");
        j.c(qVar, f15810a[8], str);
    }

    public static final void O(q qVar, String str, l<? super b, Boolean> lVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.p(), new a(str, lVar));
    }

    public static final void P(q qVar, b bVar) {
        p.j(qVar, "<this>");
        p.j(bVar, "value");
        qVar.a(SemanticsProperties.f7428a.x(), j.d(bVar));
    }

    public static /* synthetic */ void Q(q qVar, String str, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        O(qVar, str, lVar);
    }

    public static final void R(q qVar, long j11) {
        p.j(qVar, "$this$textSelectionRange");
        f15819l.c(qVar, f15810a[10], a0.b(j11));
    }

    public static final void S(q qVar, ToggleableState toggleableState) {
        p.j(qVar, "<this>");
        p.j(toggleableState, "<set-?>");
        q.c(qVar, f15810a[15], toggleableState);
    }

    public static final void T(q qVar, h hVar) {
        p.j(qVar, "<this>");
        p.j(hVar, "<set-?>");
        f15817h.c(qVar, f15810a[6], hVar);
    }

    public static final void a(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.b(), new a(str, aVar));
    }

    public static /* synthetic */ void b(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        a(qVar, str, aVar);
    }

    public static final void c(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.d(), new a(str, aVar));
    }

    public static /* synthetic */ void d(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        c(qVar, str, aVar);
    }

    public static final void e(q qVar) {
        p.j(qVar, "<this>");
        qVar.a(SemanticsProperties.f7428a.m(), k.f22762a);
    }

    public static final void f(q qVar) {
        p.j(qVar, "<this>");
        qVar.a(SemanticsProperties.f7428a.d(), k.f22762a);
    }

    public static final void g(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.e(), new a(str, aVar));
    }

    public static /* synthetic */ void h(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        g(qVar, str, aVar);
    }

    public static final void i(q qVar, String str) {
        p.j(qVar, "<this>");
        p.j(str, "description");
        qVar.a(SemanticsProperties.f7428a.f(), str);
    }

    public static final void j(q qVar, String str, l<? super List<y>, Boolean> lVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.g(), new a(str, lVar));
    }

    public static /* synthetic */ void k(q qVar, String str, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        j(qVar, str, lVar);
    }

    public static final void l(q qVar, l<Object, Integer> lVar) {
        p.j(qVar, "<this>");
        p.j(lVar, "mapping");
        qVar.a(SemanticsProperties.f7428a.k(), lVar);
    }

    public static final void m(q qVar) {
        p.j(qVar, "<this>");
        qVar.a(SemanticsProperties.f7428a.l(), k.f22762a);
    }

    public static final void n(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.h(), new a(str, aVar));
    }

    public static /* synthetic */ void o(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        n(qVar, str, aVar);
    }

    public static final void p(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.i(), new a(str, aVar));
    }

    public static /* synthetic */ void q(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        p(qVar, str, aVar);
    }

    public static final void r(q qVar) {
        p.j(qVar, "<this>");
        qVar.a(SemanticsProperties.f7428a.q(), k.f22762a);
    }

    public static final void s(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.j(), new a(str, aVar));
    }

    public static /* synthetic */ void t(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        s(qVar, str, aVar);
    }

    public static final void u(q qVar) {
        p.j(qVar, "<this>");
        qVar.a(SemanticsProperties.f7428a.n(), k.f22762a);
    }

    public static final void v(q qVar, String str, a<Boolean> aVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.k(), new a(str, aVar));
    }

    public static /* synthetic */ void w(q qVar, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        v(qVar, str, aVar);
    }

    public static final void x(q qVar, String str, lp0.p<? super Float, ? super Float, Boolean> pVar) {
        p.j(qVar, "<this>");
        qVar.a(i.f15789a.l(), new a(str, pVar));
    }

    public static /* synthetic */ void y(q qVar, String str, lp0.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        x(qVar, str, pVar);
    }

    public static final void z(q qVar, String str, l<? super Integer, Boolean> lVar) {
        p.j(qVar, "<this>");
        p.j(lVar, LogCategory.ACTION);
        qVar.a(i.f15789a.m(), new a(str, lVar));
    }
}
