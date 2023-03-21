package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.b;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.h;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.t0;
import i1.i;
import i1.j;
import i1.m;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.w;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.a;
import lp0.l;
import lp0.p;
import lp0.q;
import p0.d;
import p1.c0;
import p1.y;
import v1.f0;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$5 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<p<? super g, ? super Integer, k>, g, Integer, k> f4336a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4337b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4338c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c0 f4339d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TextFieldScrollerPosition f4340e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4341f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f0 f4342g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ d f4343h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ d f4344i;
    final /* synthetic */ d j;
    final /* synthetic */ d k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ y.d f4345l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4346m;
    final /* synthetic */ TextFieldSelectionManager n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ boolean f4347o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ boolean f4348p;
    final /* synthetic */ l<y, k> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$5(q<? super p<? super g, ? super Integer, k>, ? super g, ? super Integer, k> qVar, int i11, int i12, c0 c0Var, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, f0 f0Var, d dVar, d dVar2, d dVar3, d dVar4, y.d dVar5, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, boolean z11, boolean z12, l<? super y, k> lVar) {
        super(2);
        this.f4336a = qVar;
        this.f4337b = i11;
        this.f4338c = i12;
        this.f4339d = c0Var;
        this.f4340e = textFieldScrollerPosition;
        this.f4341f = textFieldValue;
        this.f4342g = f0Var;
        this.f4343h = dVar;
        this.f4344i = dVar2;
        this.j = dVar3;
        this.k = dVar4;
        this.f4345l = dVar5;
        this.f4346m = textFieldState;
        this.n = textFieldSelectionManager;
        this.f4347o = z11;
        this.f4348p = z12;
        this.q = lVar;
    }

    public final void a(g gVar, int i11) {
        g gVar2 = gVar;
        if ((i11 & 11) != 2 || !gVar.b()) {
            q<p<? super g, ? super Integer, k>, g, Integer, k> qVar = this.f4336a;
            final int i12 = this.f4338c;
            final c0 c0Var = this.f4339d;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.f4340e;
            final TextFieldValue textFieldValue = this.f4341f;
            final f0 f0Var = this.f4342g;
            final d dVar = this.f4343h;
            final d dVar2 = this.f4344i;
            final d dVar3 = this.j;
            final d dVar4 = this.k;
            y.d dVar5 = this.f4345l;
            TextFieldState textFieldState = this.f4346m;
            TextFieldSelectionManager textFieldSelectionManager = this.n;
            q<p<? super g, ? super Integer, k>, g, Integer, k> qVar2 = qVar;
            boolean z11 = this.f4347o;
            final boolean z12 = this.f4348p;
            l<y, k> lVar = this.q;
            AnonymousClass1 r02 = r5;
            final y.d dVar6 = dVar5;
            final TextFieldState textFieldState2 = textFieldState;
            final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
            final boolean z13 = z11;
            final l<y, k> lVar2 = lVar;
            AnonymousClass1 r52 = new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if ((i11 & 11) != 2 || !gVar.b()) {
                        d b11 = BringIntoViewRequesterKt.b(TextFieldSizeKt.a(TextFieldScrollKt.c(MaxLinesHeightModifierKt.a(d.f16037h0, i12, c0Var), textFieldScrollerPosition, textFieldValue, f0Var, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(textFieldState2)).N(dVar).N(dVar2), c0Var).N(dVar3).N(dVar4), dVar6);
                        final TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager2;
                        final TextFieldState textFieldState = textFieldState2;
                        final boolean z11 = z13;
                        final boolean z12 = z12;
                        final l<y, k> lVar = lVar2;
                        SimpleLayoutKt.a(b11, b.b(gVar, 19580180, true, new p<g, Integer, k>() {
                            public final void a(g gVar, int i11) {
                                if ((i11 & 11) != 2 || !gVar.b()) {
                                    final TextFieldState textFieldState = textFieldState;
                                    final l<y, k> lVar = lVar;
                                    AnonymousClass2 r92 = new t() {
                                        public /* synthetic */ int a(j jVar, List list, int i11) {
                                            return s.a(this, jVar, list, i11);
                                        }

                                        public /* synthetic */ int b(j jVar, List list, int i11) {
                                            return s.c(this, jVar, list, i11);
                                        }

                                        public /* synthetic */ int c(j jVar, List list, int i11) {
                                            return s.d(this, jVar, list, i11);
                                        }

                                        public u d(w wVar, List<? extends r> list, long j) {
                                            androidx.compose.runtime.snapshots.b k;
                                            kotlin.jvm.internal.p.j(wVar, "$this$measure");
                                            kotlin.jvm.internal.p.j(list, "measurables");
                                            b.a aVar = androidx.compose.runtime.snapshots.b.f6287e;
                                            TextFieldState textFieldState = textFieldState;
                                            androidx.compose.runtime.snapshots.b a11 = aVar.a();
                                            try {
                                                k = a11.k();
                                                a0.s g11 = textFieldState.g();
                                                y i11 = g11 != null ? g11.i() : null;
                                                a11.r(k);
                                                a11.d();
                                                Triple<Integer, Integer, y> d11 = TextFieldDelegate.f4538a.d(textFieldState.q(), j, wVar.getLayoutDirection(), i11);
                                                int intValue = d11.a().intValue();
                                                int intValue2 = d11.b().intValue();
                                                y c11 = d11.c();
                                                if (!kotlin.jvm.internal.p.e(i11, c11)) {
                                                    textFieldState.v(new a0.s(c11));
                                                    lVar.invoke(c11);
                                                }
                                                return wVar.x0(intValue, intValue2, x.i(h.a(AlignmentLineKt.a(), Integer.valueOf(c.c(c11.g()))), h.a(AlignmentLineKt.b(), Integer.valueOf(c.c(c11.j())))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1.f4368a);
                                            } catch (Throwable th2) {
                                                a11.d();
                                                throw th2;
                                            }
                                        }

                                        public int e(j jVar, List<? extends i> list, int i11) {
                                            kotlin.jvm.internal.p.j(jVar, "<this>");
                                            kotlin.jvm.internal.p.j(list, "measurables");
                                            textFieldState.q().n(jVar.getLayoutDirection());
                                            return textFieldState.q().c();
                                        }
                                    };
                                    gVar.E(-1323940314);
                                    d.a aVar = d.f16037h0;
                                    e eVar = (e) gVar.z(CompositionLocalsKt.e());
                                    LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
                                    n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
                                    ComposeUiNode.Companion companion = ComposeUiNode.J;
                                    a<ComposeUiNode> a11 = companion.a();
                                    q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(aVar);
                                    if (!(gVar.u() instanceof e0.e)) {
                                        f.c();
                                    }
                                    gVar.f();
                                    if (gVar.s()) {
                                        gVar.K(a11);
                                    } else {
                                        gVar.c();
                                    }
                                    gVar.J();
                                    g a12 = Updater.a(gVar);
                                    Updater.c(a12, r92, companion.d());
                                    Updater.c(a12, eVar, companion.b());
                                    Updater.c(a12, layoutDirection, companion.c());
                                    Updater.c(a12, n1Var, companion.f());
                                    gVar.o();
                                    boolean z11 = false;
                                    b11.invoke(t0.a(t0.b(gVar)), gVar, 0);
                                    gVar.E(2058660585);
                                    gVar.E(1714611517);
                                    gVar.P();
                                    gVar.P();
                                    gVar.d();
                                    gVar.P();
                                    TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                                    if (textFieldState.c() == HandleState.Selection && textFieldState.f() != null) {
                                        m f11 = textFieldState.f();
                                        kotlin.jvm.internal.p.g(f11);
                                        if (f11.D() && z11) {
                                            z11 = true;
                                        }
                                    }
                                    CoreTextFieldKt.c(textFieldSelectionManager, z11, gVar, 8);
                                    if (textFieldState.c() == HandleState.Cursor && !z12 && z11) {
                                        CoreTextFieldKt.d(textFieldSelectionManager, gVar, 8);
                                        return;
                                    }
                                    return;
                                }
                                gVar.h();
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((g) obj, ((Number) obj2).intValue());
                                return k.f22762a;
                            }
                        }), gVar, 48, 0);
                        return;
                    }
                    gVar.h();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            };
            g gVar3 = gVar;
            qVar2.invoke(l0.b.b(gVar3, 207445534, true, r02), gVar3, Integer.valueOf(((this.f4337b >> 9) & 112) | 6));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
