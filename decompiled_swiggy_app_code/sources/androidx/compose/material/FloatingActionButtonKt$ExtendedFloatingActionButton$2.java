package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: FloatingActionButton.kt */
final class FloatingActionButtonKt$ExtendedFloatingActionButton$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5048a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5049b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5050c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FloatingActionButtonKt$ExtendedFloatingActionButton$2(p<? super g, ? super Integer, k> pVar, int i11, p<? super g, ? super Integer, k> pVar2) {
        super(2);
        this.f5048a = pVar;
        this.f5049b = i11;
        this.f5050c = pVar2;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            float d11 = this.f5048a == null ? FloatingActionButtonKt.f5047d : FloatingActionButtonKt.f5046c;
            d.a aVar = d.f16037h0;
            d m11 = PaddingKt.m(aVar, d11, 0.0f, FloatingActionButtonKt.f5047d, 0.0f, 10, (Object) null);
            a.c i12 = a.f16019a.i();
            p<g, Integer, k> pVar = this.f5048a;
            int i13 = this.f5049b;
            p<g, Integer, k> pVar2 = this.f5050c;
            gVar.E(-1989997165);
            t a11 = RowKt.a(Arrangement.f3654a.g(), i12, gVar, 48);
            gVar.E(1376089394);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(m11);
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
            gVar.E(-326682362);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f3806a;
            gVar.E(-1435223599);
            gVar.E(-1435223599);
            if (pVar != null) {
                pVar.invoke(gVar, Integer.valueOf((i13 >> 9) & 14));
                androidx.compose.foundation.layout.k.a(SizeKt.x(aVar, FloatingActionButtonKt.f5046c), gVar, 6);
            }
            gVar.P();
            pVar2.invoke(gVar, Integer.valueOf(i13 & 14));
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
