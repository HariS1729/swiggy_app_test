package androidx.compose.material.ripple;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import u.n;
import wp0.j0;

@d(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
/* compiled from: CommonRipple.kt */
final class CommonRippleIndicationInstance$addRipple$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5805a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RippleAnimation f5806b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CommonRippleIndicationInstance f5807c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f5808d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, n nVar, c<? super CommonRippleIndicationInstance$addRipple$2> cVar) {
        super(2, cVar);
        this.f5806b = rippleAnimation;
        this.f5807c = commonRippleIndicationInstance;
        this.f5808d = nVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CommonRippleIndicationInstance$addRipple$2(this.f5806b, this.f5807c, this.f5808d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5805a;
        if (i11 == 0) {
            g.b(obj);
            RippleAnimation rippleAnimation = this.f5806b;
            this.f5805a = 1;
            if (rippleAnimation.d(this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                this.f5807c.f5804f.remove(this.f5808d);
                throw th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f5807c.f5804f.remove(this.f5808d);
        return k.f22762a;
    }
}
