package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import d2.p;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import p.d;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier$sizeTransitionSpec$1 extends Lambda implements l<Transition.b<EnterExitState>, v1.a0<p>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExpandShrinkModifier f2579a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.f2579a = expandShrinkModifier;
    }

    /* renamed from: a */
    public final v1.a0<p> invoke(Transition.b<EnterExitState> bVar) {
        kotlin.jvm.internal.p.j(bVar, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        v1.a0<p> a0Var = null;
        if (bVar.a(enterExitState, enterExitState2)) {
            d value = this.f2579a.d().getValue();
            if (value != null) {
                a0Var = value.b();
            }
        } else if (bVar.a(enterExitState2, EnterExitState.PostExit)) {
            d value2 = this.f2579a.e().getValue();
            if (value2 != null) {
                a0Var = value2.b();
            }
        } else {
            a0Var = EnterExitTransitionKt.f2526e;
        }
        return a0Var == null ? EnterExitTransitionKt.f2526e : a0Var;
    }
}
