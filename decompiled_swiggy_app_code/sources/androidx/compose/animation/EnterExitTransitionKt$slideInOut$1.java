package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import d2.l;
import defpackage.v1;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p.m;
import p0.d;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideInOut$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<EnterExitState> f2554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<m> f2555b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d1<m> f2556c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f2557d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$slideInOut$1(Transition<EnterExitState> transition, d1<m> d1Var, d1<m> d1Var2, String str) {
        super(3);
        this.f2554a = transition;
        this.f2555b = d1Var;
        this.f2556c = d1Var2;
        this.f2557d = str;
    }

    private static final boolean b(h0<Boolean> h0Var) {
        return h0Var.getValue().booleanValue();
    }

    private static final void c(h0<Boolean> h0Var, boolean z11) {
        h0Var.setValue(Boolean.valueOf(z11));
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(905898856);
        Transition<EnterExitState> transition = this.f2554a;
        gVar.E(-3686930);
        boolean k = gVar.k(transition);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        if (this.f2554a.g() == this.f2554a.m() && !this.f2554a.q()) {
            c(h0Var, false);
        } else if (!(this.f2555b.getValue() == null && this.f2556c.getValue() == null)) {
            c(h0Var, true);
        }
        if (b(h0Var)) {
            Transition<EnterExitState> transition2 = this.f2554a;
            v1.q0<l, v1.l> d11 = VectorConvertersKt.d(l.f14010b);
            String str = this.f2557d;
            gVar.E(-3687241);
            Object F2 = gVar.F();
            g.a aVar = g.f14172a;
            if (F2 == aVar.a()) {
                F2 = p.s(str, " slide");
                gVar.y(F2);
            }
            gVar.P();
            Transition.a<l, v1.l> b11 = TransitionKt.b(transition2, d11, (String) F2, gVar, 448, 0);
            Transition<EnterExitState> transition3 = this.f2554a;
            d1<m> d1Var = this.f2555b;
            d1<m> d1Var2 = this.f2556c;
            gVar.E(-3686930);
            boolean k11 = gVar.k(transition3);
            Object F3 = gVar.F();
            if (k11 || F3 == aVar.a()) {
                F3 = new SlideModifier(b11, d1Var, d1Var2);
                gVar.y(F3);
            }
            gVar.P();
            dVar = dVar.N((SlideModifier) F3);
        }
        gVar.P();
        return dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
