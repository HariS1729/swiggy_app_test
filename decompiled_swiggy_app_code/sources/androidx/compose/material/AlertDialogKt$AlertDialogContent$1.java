package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import l0.a;
import l0.b;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogContent$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4817b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4818c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4819d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogContent$1(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, int i11) {
        super(2);
        this.f4816a = pVar;
        this.f4817b = pVar2;
        this.f4818c = pVar3;
        this.f4819d = i11;
    }

    public final void a(g gVar, int i11) {
        a aVar;
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            p<g, Integer, k> pVar = this.f4816a;
            p<g, Integer, k> pVar2 = this.f4817b;
            p<g, Integer, k> pVar3 = this.f4818c;
            int i12 = this.f4819d;
            gVar.E(-1113030915);
            d.a aVar2 = d.f16037h0;
            t a11 = ColumnKt.a(Arrangement.f3654a.h(), p0.a.f16019a.k(), gVar, 0);
            gVar.E(1376089394);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(aVar2);
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
            Updater.c(a13, a11, companion.d());
            Updater.c(a13, eVar, companion.b());
            Updater.c(a13, layoutDirection, companion.c());
            Updater.c(a13, n1Var, companion.f());
            gVar.o();
            b11.invoke(t0.a(t0.b(gVar)), gVar, 0);
            gVar.E(2058660585);
            gVar.E(276693625);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3715a;
            gVar.E(-80835772);
            a aVar3 = null;
            if (pVar == null) {
                aVar = null;
            } else {
                aVar = b.c(-985531970, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(pVar, i12));
            }
            if (pVar2 != null) {
                aVar3 = b.c(-985531593, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(pVar2, i12));
            }
            AlertDialogKt.a(columnScopeInstance, aVar, aVar3, gVar, 6);
            pVar3.invoke(gVar, Integer.valueOf(i12 & 14));
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
