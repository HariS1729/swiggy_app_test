package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import c0.v;
import defpackage.v1;
import e0.d1;
import e0.f;
import e0.g;
import e0.t0;
import i1.t;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import lp0.p;
import lp0.q;
import n1.e;
import n1.o;
import p0.d;
import u0.j1;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends Lambda implements q<p<? super g, ? super Integer, ? extends k>, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f5302a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f5303b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<v> f5304c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e<v> f5305d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$FadeInFadeOutWithScale$1$1(v vVar, v vVar2, List<v> list, e<v> eVar) {
        super(3);
        this.f5302a = vVar;
        this.f5303b = vVar2;
        this.f5304c = list;
        this.f5305d = eVar;
    }

    public final void a(p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        p<? super g, ? super Integer, k> pVar2 = pVar;
        g gVar2 = gVar;
        kotlin.jvm.internal.p.j(pVar2, "children");
        if ((i11 & 14) == 0) {
            i12 = i11 | (gVar2.k(pVar2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) != 0 || !gVar.b()) {
            boolean e11 = kotlin.jvm.internal.p.e(this.f5302a, this.f5303b);
            int i13 = e11 ? 150 : 75;
            int i14 = (!e11 || s.T(this.f5304c).size() == 1) ? 0 : 75;
            d1 d11 = SnackbarHostKt.f(v1.h.h(i13, i14, v1.z.c()), e11, new SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(this.f5302a, this.f5305d), gVar, 0, 0);
            d1 e12 = SnackbarHostKt.g(v1.h.h(i13, i14, v1.z.b()), e11, gVar2, 0);
            d c11 = GraphicsLayerModifierKt.c(d.f16037h0, ((Number) e12.getValue()).floatValue(), ((Number) e12.getValue()).floatValue(), ((Number) d11.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (j1) null, false, (u0.d1) null, 16376, (Object) null);
            final v vVar = this.f5302a;
            d c12 = SemanticsModifierKt.c(c11, false, new l<n1.q, k>() {
                public final void a(n1.q qVar) {
                    kotlin.jvm.internal.p.j(qVar, "$this$semantics");
                    o.H(qVar, e.f15769b.b());
                    final v vVar = vVar;
                    o.h(qVar, (String) null, new a<Boolean>() {
                        /* renamed from: a */
                        public final Boolean invoke() {
                            vVar.dismiss();
                            return Boolean.TRUE;
                        }
                    }, 1, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((n1.q) obj);
                    return k.f22762a;
                }
            }, 1, (Object) null);
            gVar2.E(-1990474327);
            t h11 = BoxKt.h(p0.a.f16019a.o(), false, gVar2, 0);
            gVar2.E(1376089394);
            d2.e eVar = (d2.e) gVar2.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar2.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(c12);
            if (!(gVar.u() instanceof e0.e)) {
                f.c();
            }
            gVar.f();
            if (gVar.s()) {
                gVar2.K(a11);
            } else {
                gVar.c();
            }
            gVar.J();
            g a12 = Updater.a(gVar);
            Updater.c(a12, h11, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            gVar.o();
            b11.invoke(t0.a(t0.b(gVar)), gVar2, 0);
            gVar2.E(2058660585);
            gVar2.E(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
            gVar2.E(1863798444);
            pVar2.invoke(gVar2, Integer.valueOf(i12 & 14));
            gVar.P();
            gVar.P();
            gVar.P();
            gVar.d();
            gVar.P();
            gVar.P();
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((p) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
