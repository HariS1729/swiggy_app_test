package androidx.compose.material.ripple;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
/* compiled from: RippleAnimation.kt */
final class RippleAnimation$animate$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f5828a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f5829b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RippleAnimation f5830c;

    /* renamed from: d  reason: collision with root package name */
    int f5831d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(RippleAnimation rippleAnimation, c<? super RippleAnimation$animate$1> cVar) {
        super(cVar);
        this.f5830c = rippleAnimation;
    }

    public final Object invokeSuspend(Object obj) {
        this.f5829b = obj;
        this.f5831d |= Integer.MIN_VALUE;
        return this.f5830c.d(this);
    }
}
