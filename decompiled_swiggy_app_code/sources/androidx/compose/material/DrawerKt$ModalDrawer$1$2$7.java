package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import defpackage.a2;
import e0.f;
import e0.g;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$7 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<a2.h, g, Integer, k> f5007a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5008b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$7(q<? super a2.h, ? super g, ? super Integer, k> qVar, int i11) {
        super(2);
        this.f5007a = qVar;
        this.f5008b = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            d l11 = SizeKt.l(d.f16037h0, 0.0f, 1, (Object) null);
            q<a2.h, g, Integer, k> qVar = this.f5007a;
            int i12 = ((this.f5008b << 9) & 7168) | 6;
            gVar.E(-1113030915);
            int i13 = i12 >> 3;
            t a11 = ColumnKt.a(Arrangement.f3654a.h(), a.f16019a.k(), gVar, (i13 & 112) | (i13 & 14));
            gVar.E(1376089394);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(l11);
            int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
            b11.invoke(t0.a(t0.b(gVar)), gVar, Integer.valueOf((i14 >> 3) & 112));
            gVar.E(2058660585);
            gVar.E(276693625);
            if (((((i14 >> 9) & 14) & 11) ^ 2) != 0 || !gVar.b()) {
                qVar.invoke(ColumnScopeInstance.f3715a, gVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
            } else {
                gVar.h();
            }
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
