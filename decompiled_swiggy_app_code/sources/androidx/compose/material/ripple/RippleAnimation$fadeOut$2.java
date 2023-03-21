package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineStart;
import lp0.l;
import lp0.p;
import wp0.j0;
import wp0.k1;

@d(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* compiled from: RippleAnimation.kt */
final class RippleAnimation$fadeOut$2 extends SuspendLambda implements p<j0, c<? super k1>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5841a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f5842b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RippleAnimation f5843c;

    @d(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1  reason: invalid class name */
    /* compiled from: RippleAnimation.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5844a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(rippleAnimation, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f5844a;
            if (i11 == 0) {
                g.b(obj);
                Animatable a11 = rippleAnimation.f5824g;
                Float c11 = a.c(0.0f);
                v1.p0 i12 = v1.h.i(150, 0, v1.z.c(), 2, (Object) null);
                this.f5844a = 1;
                if (Animatable.f(a11, c11, i12, (Object) null, (l) null, this, 12, (Object) null) == d11) {
                    return d11;
                }
            } else if (i11 == 1) {
                g.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, c<? super RippleAnimation$fadeOut$2> cVar) {
        super(2, cVar);
        this.f5843c = rippleAnimation;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.f5843c, cVar);
        rippleAnimation$fadeOut$2.f5842b = obj;
        return rippleAnimation$fadeOut$2;
    }

    public final Object invoke(j0 j0Var, c<? super k1> cVar) {
        return ((RippleAnimation$fadeOut$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f5841a == 0) {
            g.b(obj);
            final RippleAnimation rippleAnimation = this.f5843c;
            return j.d((j0) this.f5842b, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
