package androidx.compose.foundation.text.selection;

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
import e0.s0;
import e0.t0;
import lp0.a;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: SimpleLayout.kt */
public final class SimpleLayoutKt {
    public static final void a(d dVar, p<? super g, ? super Integer, k> pVar, g gVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.p.j(pVar, "content");
        g t = gVar.t(-2105228848);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (t.k(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= t.k(pVar) ? 32 : 16;
        }
        if ((i13 & 91) != 18 || !t.b()) {
            if (i14 != 0) {
                dVar = d.f16037h0;
            }
            SimpleLayoutKt$SimpleLayout$1 simpleLayoutKt$SimpleLayout$1 = SimpleLayoutKt$SimpleLayout$1.f4731a;
            t.E(-1323940314);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(dVar);
            int i15 = (((((i13 << 3) & 112) | ((i13 >> 3) & 14)) << 9) & 7168) | 6;
            if (!(t.u() instanceof e0.e)) {
                f.c();
            }
            t.f();
            if (t.s()) {
                t.K(a11);
            } else {
                t.c();
            }
            t.J();
            g a12 = Updater.a(t);
            Updater.c(a12, simpleLayoutKt$SimpleLayout$1, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, Integer.valueOf((i15 >> 3) & 112));
            t.E(2058660585);
            pVar.invoke(t, Integer.valueOf((i15 >> 9) & 14));
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new SimpleLayoutKt$SimpleLayout$2(dVar, pVar, i11, i12));
        }
    }
}
