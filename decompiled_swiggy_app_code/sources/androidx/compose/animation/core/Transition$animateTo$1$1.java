package androidx.compose.animation.core;

import bp0.g;
import bp0.k;
import e0.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {432}, m = "invokeSuspend")
/* compiled from: Transition.kt */
final class Transition$animateTo$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f2750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2751b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1(Transition<S> transition, c<? super Transition$animateTo$1$1> cVar) {
        super(2, cVar);
        this.f2751b = transition;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new Transition$animateTo$1$1(this.f2751b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((Transition$animateTo$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1 r12;
        Object d11 = b.d();
        int i11 = this.f2750a;
        if (i11 == 0 || i11 == 1) {
            g.b(obj);
            do {
                final Transition<S> transition = this.f2751b;
                r12 = new l<Long, k>() {
                    public final void a(long j) {
                        if (!transition.q()) {
                            transition.s(j / 1);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Number) obj).longValue());
                        return k.f22762a;
                    }
                };
                this.f2750a = 1;
            } while (d0.b(r12, this) != d11);
            return d11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
