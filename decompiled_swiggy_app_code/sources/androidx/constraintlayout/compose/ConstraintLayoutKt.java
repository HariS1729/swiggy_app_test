package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import bp0.h;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.g;
import e0.h0;
import f2.c;
import f2.e;
import f2.v;
import i1.r;
import i1.t;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
public final class ConstraintLayoutKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f7936a = false;

    /* compiled from: ConstraintLayout.kt */
    public static final class a {
        a() {
        }
    }

    public static final e a(l<? super e, k> lVar) {
        p.j(lVar, "description");
        return new f2.l(lVar, (e) null, 2, (i) null);
    }

    public static final void e(v vVar, List<? extends r> list) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(list, "measurables");
        int size = list.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                r rVar = (r) list.get(i11);
                Object a11 = LayoutIdKt.a(rVar);
                if (a11 == null && (a11 = c.a(rVar)) == null) {
                    a11 = f();
                }
                vVar.m(a11, rVar);
                Object b11 = c.b(rVar);
                if (b11 != null && (b11 instanceof String) && (a11 instanceof String)) {
                    vVar.q((String) a11, (String) b11);
                }
                if (i12 <= size) {
                    i11 = i12;
                } else {
                    return;
                }
            }
        }
    }

    public static final Object f() {
        return new a();
    }

    public static final t g(int i11, h0<Long> h0Var, e eVar, Measurer measurer, g gVar, int i12) {
        p.j(h0Var, "needsUpdate");
        p.j(eVar, "constraintSet");
        p.j(measurer, "measurer");
        gVar.E(-441904281);
        Integer valueOf = Integer.valueOf(i11);
        Long value = h0Var.getValue();
        gVar.E(-3686095);
        boolean k = gVar.k(value) | gVar.k(valueOf) | gVar.k(eVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            measurer.t(eVar);
            F = new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1(measurer, eVar, i11);
            gVar.y(F);
        }
        gVar.P();
        t tVar = (t) F;
        gVar.P();
        return tVar;
    }

    public static final Pair<t, lp0.a<k>> h(int i11, ConstraintLayoutScope constraintLayoutScope, h0<Boolean> h0Var, Measurer measurer, g gVar, int i12) {
        p.j(constraintLayoutScope, "scope");
        p.j(h0Var, "remeasureRequesterState");
        p.j(measurer, "measurer");
        gVar.E(-441911663);
        gVar.E(-3687241);
        Object F = gVar.F();
        g.a aVar = g.f14172a;
        if (F == aVar.a()) {
            F = new ConstraintSetForInlineDsl(constraintLayoutScope);
            gVar.y(F);
        }
        gVar.P();
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) F;
        Integer valueOf = Integer.valueOf(i11);
        gVar.E(-3686930);
        boolean k = gVar.k(valueOf);
        Object F2 = gVar.F();
        if (k || F2 == aVar.a()) {
            F2 = h.a(new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1(measurer, constraintSetForInlineDsl, i11, h0Var), new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(h0Var, constraintSetForInlineDsl));
            gVar.y(F2);
        }
        gVar.P();
        Pair<t, lp0.a<k>> pair = (Pair) F2;
        gVar.P();
        return pair;
    }

    /* access modifiers changed from: private */
    public static final String i(ConstraintWidget constraintWidget) {
        return constraintWidget.v() + " width " + constraintWidget.a0() + " minWidth " + constraintWidget.L() + " maxWidth " + constraintWidget.J() + " height " + constraintWidget.z() + " minHeight " + constraintWidget.K() + " maxHeight " + constraintWidget.I() + " HDB " + constraintWidget.C() + " VDB " + constraintWidget.X() + " MCW " + constraintWidget.f8206w + " MCH " + constraintWidget.f8208x + " percentW " + constraintWidget.B + " percentH " + constraintWidget.E;
    }

    /* access modifiers changed from: private */
    public static final String j(b.a aVar) {
        return "measure strategy is ";
    }
}
