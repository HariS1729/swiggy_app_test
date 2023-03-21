package androidx.compose.animation.core;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {134}, m = "invokeSuspend")
/* compiled from: InfiniteTransition.kt */
final class InfiniteTransition$run$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f2669a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InfiniteTransition f2670b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1(InfiniteTransition infiniteTransition, c<? super InfiniteTransition$run$1> cVar) {
        super(2, cVar);
        this.f2670b = infiniteTransition;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new InfiniteTransition$run$1(this.f2670b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((InfiniteTransition$run$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1 r12;
        Object d11 = b.d();
        int i11 = this.f2669a;
        if (i11 == 0 || i11 == 1) {
            g.b(obj);
            do {
                r12 = new l<Long, k>(this.f2670b) {
                    public final void h(long j) {
                        ((InfiniteTransition) this.receiver).f(j);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        h(((Number) obj).longValue());
                        return k.f22762a;
                    }
                };
                this.f2669a = 1;
            } while (InfiniteAnimationPolicyKt.a(r12, this) != d11);
            return d11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
