package androidx.compose.foundation.layout;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import e0.f;
import e0.g;
import e0.t0;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.q;
import p0.d;

/* compiled from: Spacer.kt */
public final class k {
    public static final void a(d dVar, g gVar, int i11) {
        p.j(dVar, "modifier");
        gVar.E(-72882467);
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f3855a;
        gVar.E(-1323940314);
        e eVar = (e) gVar.z(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
        n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
        ComposeUiNode.Companion companion = ComposeUiNode.J;
        a<ComposeUiNode> a11 = companion.a();
        q<t0<ComposeUiNode>, g, Integer, bp0.k> b11 = LayoutKt.b(dVar);
        int i12 = (((((i11 << 3) & 112) | 384) << 9) & 7168) | 6;
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
        Updater.c(a12, spacerMeasurePolicy, companion.d());
        Updater.c(a12, eVar, companion.b());
        Updater.c(a12, layoutDirection, companion.c());
        Updater.c(a12, n1Var, companion.f());
        gVar.o();
        b11.invoke(t0.a(t0.b(gVar)), gVar, Integer.valueOf((i12 >> 3) & 112));
        gVar.E(2058660585);
        gVar.E(1142320198);
        if (((i12 >> 9) & 14 & 11) == 2 && gVar.b()) {
            gVar.h();
        }
        gVar.P();
        gVar.P();
        gVar.d();
        gVar.P();
        gVar.P();
    }
}
