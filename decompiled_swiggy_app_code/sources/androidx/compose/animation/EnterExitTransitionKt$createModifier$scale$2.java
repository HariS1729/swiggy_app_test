package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p.j;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$createModifier$scale$2 extends Lambda implements q<Transition.b<EnterExitState>, g, Integer, v1.a0<Float>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f2537a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f2538b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$scale$2(a aVar, c cVar) {
        super(3);
        this.f2537a = aVar;
        this.f2538b = cVar;
    }

    public final v1.a0<Float> a(Transition.b<EnterExitState> bVar, g gVar, int i11) {
        p.j(bVar, "$this$animateFloat");
        gVar.E(-9519413);
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        v1.a0<Float> a0Var = null;
        if (bVar.a(enterExitState, enterExitState2)) {
            j c11 = this.f2537a.a().c();
            if (c11 != null) {
                a0Var = c11.a();
            }
            if (a0Var == null) {
                a0Var = EnterExitTransitionKt.f2524c;
            }
        } else if (bVar.a(enterExitState2, EnterExitState.PostExit)) {
            j c12 = this.f2538b.a().c();
            if (c12 != null) {
                a0Var = c12.a();
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
