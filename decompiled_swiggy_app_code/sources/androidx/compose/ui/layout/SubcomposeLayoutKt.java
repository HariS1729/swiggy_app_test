package androidx.compose.ui.layout;

import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.b;
import d2.e;
import e0.d1;
import e0.f;
import e0.g;
import e0.s0;
import i1.j0;
import i1.u;
import lp0.l;
import lp0.p;
import p0.d;

/* compiled from: SubcomposeLayout.kt */
public final class SubcomposeLayoutKt {
    public static final void a(SubcomposeLayoutState subcomposeLayoutState, d dVar, p<? super j0, ? super b, ? extends u> pVar, g gVar, int i11, int i12) {
        kotlin.jvm.internal.p.j(subcomposeLayoutState, HexAttribute.HEX_ATTR_THREAD_STATE);
        kotlin.jvm.internal.p.j(pVar, "measurePolicy");
        g t = gVar.t(-511989831);
        if ((i12 & 2) != 0) {
            dVar = d.f16037h0;
        }
        d dVar2 = dVar;
        a d11 = f.d(t, 0);
        d e11 = ComposedModifierKt.e(t, dVar2);
        e eVar = (e) t.z(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
        n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
        lp0.a<LayoutNode> a11 = LayoutNode.U.a();
        t.E(1886828752);
        if (!(t.u() instanceof e0.e)) {
            f.c();
        }
        t.w();
        if (t.s()) {
            t.K(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(a11));
        } else {
            t.c();
        }
        g a12 = Updater.a(t);
        Updater.c(a12, subcomposeLayoutState, subcomposeLayoutState.h());
        Updater.c(a12, d11, subcomposeLayoutState.f());
        ComposeUiNode.Companion companion = ComposeUiNode.J;
        Updater.c(a12, e11, companion.e());
        Updater.c(a12, pVar, subcomposeLayoutState.g());
        Updater.c(a12, eVar, companion.b());
        Updater.c(a12, layoutDirection, companion.c());
        Updater.c(a12, n1Var, companion.f());
        t.d();
        t.P();
        t.E(-607848778);
        if (!t.b()) {
            e0.u.g(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), t, 0);
        }
        t.P();
        d1 m11 = androidx.compose.runtime.g.m(subcomposeLayoutState, t, 8);
        k kVar = k.f22762a;
        t.E(1157296644);
        boolean k = t.k(m11);
        Object F = t.F();
        if (k || F == g.f14172a.a()) {
            F = new SubcomposeLayoutKt$SubcomposeLayout$5$1(m11);
            t.y(F);
        }
        t.P();
        e0.u.b(kVar, (l) F, t, 0);
        s0 v = t.v();
        if (v != null) {
            v.a(new SubcomposeLayoutKt$SubcomposeLayout$6(subcomposeLayoutState, dVar2, pVar, i11, i12));
        }
    }

    public static final void b(d dVar, p<? super j0, ? super b, ? extends u> pVar, g gVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.p.j(pVar, "measurePolicy");
        g t = gVar.t(-1298353104);
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
            t.E(-492369756);
            Object F = t.F();
            if (F == g.f14172a.a()) {
                F = new SubcomposeLayoutState();
                t.y(F);
            }
            t.P();
            int i15 = i13 << 3;
            a((SubcomposeLayoutState) F, dVar, pVar, t, (i15 & 112) | 8 | (i15 & 896), 0);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new SubcomposeLayoutKt$SubcomposeLayout$2(dVar, pVar, i11, i12));
        }
    }
}
