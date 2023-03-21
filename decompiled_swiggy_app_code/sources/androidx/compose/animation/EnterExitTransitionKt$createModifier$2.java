package androidx.compose.animation;

import bp0.k;
import e0.d1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.j0;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$createModifier$2 extends Lambda implements l<j0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<Float> f2534a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createModifier$2(d1<Float> d1Var) {
        super(1);
        this.f2534a = d1Var;
    }

    public final void a(j0 j0Var) {
        p.j(j0Var, "$this$graphicsLayer");
        j0Var.c(EnterExitTransitionKt.n(this.f2534a));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((j0) obj);
        return k.f22762a;
    }
}
