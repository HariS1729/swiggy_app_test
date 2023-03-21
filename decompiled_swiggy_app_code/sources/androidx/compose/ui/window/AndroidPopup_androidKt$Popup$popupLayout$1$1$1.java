package androidx.compose.ui.window;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.d1;
import e0.f;
import e0.g;
import e0.t0;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.l;
import lp0.p;
import lp0.q;
import p0.d;
import r0.a;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7823a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<p<g, Integer, k>> f7824b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, d1<? extends p<? super g, ? super Integer, k>> d1Var) {
        super(2);
        this.f7823a = popupLayout;
        this.f7824b = d1Var;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            d c11 = SemanticsModifierKt.c(d.f16037h0, false, AnonymousClass1.f7825a, 1, (Object) null);
            final PopupLayout popupLayout = this.f7823a;
            d a11 = a.a(OnRemeasuredModifierKt.a(c11, new l<d2.p, k>() {
                public final void a(long j) {
                    popupLayout.m1setPopupContentSizefhxjrPA(d2.p.b(j));
                    popupLayout.v();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((d2.p) obj).j());
                    return k.f22762a;
                }
            }), this.f7823a.getCanCalculatePosition() ? 1.0f : 0.0f);
            final d1<p<g, Integer, k>> d1Var = this.f7824b;
            l0.a b11 = b.b(gVar, 606497925, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if ((i11 & 11) != 2 || !gVar.b()) {
                        AndroidPopup_androidKt.b(d1Var).invoke(gVar, 0);
                    } else {
                        gVar.h();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            });
            gVar.E(1406149896);
            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f7828a;
            gVar.E(-1323940314);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(a11);
            if (!(gVar.u() instanceof e0.e)) {
                f.c();
            }
            gVar.f();
            if (gVar.s()) {
                gVar.K(a12);
            } else {
                gVar.c();
            }
            gVar.J();
            g a13 = Updater.a(gVar);
            Updater.c(a13, androidPopup_androidKt$SimpleStack$1, companion.d());
            Updater.c(a13, eVar, companion.b());
            Updater.c(a13, layoutDirection, companion.c());
            Updater.c(a13, n1Var, companion.f());
            gVar.o();
            b12.invoke(t0.a(t0.b(gVar)), gVar, 0);
            gVar.E(2058660585);
            b11.invoke(gVar, 6);
            gVar.P();
            gVar.d();
            gVar.P();
            gVar.P();
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
