package androidx.compose.ui.layout;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import i1.t;
import l0.b;
import lp0.a;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: Layout.kt */
public final class LayoutKt {
    public static final void a(d dVar, p<? super g, ? super Integer, k> pVar, t tVar, g gVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.p.j(pVar, "content");
        kotlin.jvm.internal.p.j(tVar, "measurePolicy");
        g t = gVar.t(1949933075);
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
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            i13 |= t.k(tVar) ? 256 : 128;
        }
        if ((i13 & 731) != 146 || !t.b()) {
            if (i14 != 0) {
                dVar = d.f16037h0;
            }
            d e11 = ComposedModifierKt.e(t, dVar);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            a<LayoutNode> a11 = LayoutNode.U.a();
            int i15 = ((i13 << 3) & 896) | 6;
            t.E(-692256719);
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
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            Updater.c(a12, e11, companion.e());
            Updater.c(a12, tVar, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            Updater.b(a12, LayoutKt$MultiMeasureLayout$1$1.f6725a);
            t.o();
            pVar.invoke(t, Integer.valueOf((i15 >> 6) & 14));
            t.d();
            t.P();
        } else {
            t.h();
        }
        d dVar2 = dVar;
        s0 v = t.v();
        if (v != null) {
            v.a(new LayoutKt$MultiMeasureLayout$2(dVar2, pVar, tVar, i11, i12));
        }
    }

    public static final q<t0<ComposeUiNode>, g, Integer, k> b(d dVar) {
        kotlin.jvm.internal.p.j(dVar, "modifier");
        return b.c(-1586257396, true, new LayoutKt$materializerOf$1(dVar));
    }
}
