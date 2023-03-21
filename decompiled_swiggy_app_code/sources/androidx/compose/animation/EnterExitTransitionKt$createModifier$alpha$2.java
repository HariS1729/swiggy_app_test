package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p.f;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$createModifier$alpha$2 extends Lambda implements q<Transition.b<EnterExitState>, g, Integer, v1.a0<Float>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f2535a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f2536b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$alpha$2(a aVar, c cVar) {
        super(3);
        this.f2535a = aVar;
        this.f2536b = cVar;
    }

    public final v1.a0<Float> a(Transition.b<EnterExitState> bVar, g gVar, int i11) {
        p.j(bVar, "$this$animateFloat");
        gVar.E(-9520302);
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        v1.a0<Float> a0Var = null;
        if (bVar.a(enterExitState, enterExitState2)) {
            f b11 = this.f2535a.a().b();
            if (b11 != null) {
                a0Var = b11.b();
            }
            if (a0Var == null) {
                a0Var = EnterExitTransitionKt.f2524c;
            }
        } else if (bVar.a(enterExitState2, EnterExitState.PostExit)) {
            f b12 = this.f2536b.a().b();
            if (b12 != null) {
                a0Var = b12.b();
            }
            if (a0Var == null) {
                a0Var = EnterExitTransitionKt.f2524c;
            }
        } else {
            a0Var = EnterExitTransitionKt.f2524c;
        }
        gVar.P();
        return a0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((Transition.b) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
