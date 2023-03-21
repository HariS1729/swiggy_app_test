package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p.m;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier$transitionSpec$1 extends Lambda implements l<Transition.b<EnterExitState>, v1.a0<d2.l>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SlideModifier f2601a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlideModifier$transitionSpec$1(SlideModifier slideModifier) {
        super(1);
        this.f2601a = slideModifier;
    }

    /* renamed from: a */
    public final v1.a0<d2.l> invoke(Transition.b<EnterExitState> bVar) {
        p.j(bVar, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        v1.a0<d2.l> a0Var = null;
        if (bVar.a(enterExitState, enterExitState2)) {
            m value = this.f2601a.c().getValue();
            if (value != null) {
                a0Var = value.a();
            }
            if (a0Var == null) {
                return EnterExitTransitionKt.f2525d;
            }
            return a0Var;
        } else if (!bVar.a(enterExitState2, EnterExitState.PostExit)) {
            return EnterExitTransitionKt.f2525d;
        } else {
            m value2 = this.f2601a.d().getValue();
            if (value2 != null) {
                a0Var = value2.a();
            }
            if (a0Var == null) {
                return EnterExitTransitionKt.f2525d;
            }
            return a0Var;
        }
    }
}
