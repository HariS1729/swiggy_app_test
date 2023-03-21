package arrow.typeclasses;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import o4.a;

@d(c = "arrow.typeclasses.MonadFx$monad$wrapReturn$1", f = "Monad.kt", l = {108}, m = "invokeSuspend")
/* compiled from: Monad.kt */
final class MonadFx$monad$wrapReturn$1 extends RestrictedSuspendLambda implements p<MonadContinuation<F, ?>, c<? super a<? extends F, ? extends A>>, Object> {

    /* renamed from: b  reason: collision with root package name */
    private MonadContinuation f12499b;

    /* renamed from: c  reason: collision with root package name */
    Object f12500c;

    /* renamed from: d  reason: collision with root package name */
    Object f12501d;

    /* renamed from: e  reason: collision with root package name */
    int f12502e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p f12503f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MonadFx$monad$wrapReturn$1(p pVar, c cVar) {
        super(2, cVar);
        this.f12503f = pVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        kotlin.jvm.internal.p.k(cVar, "completion");
        MonadFx$monad$wrapReturn$1 monadFx$monad$wrapReturn$1 = new MonadFx$monad$wrapReturn$1(this.f12503f, cVar);
        monadFx$monad$wrapReturn$1.f12499b = (MonadContinuation) obj;
        return monadFx$monad$wrapReturn$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MonadFx$monad$wrapReturn$1) create(obj, (c) obj2)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        MonadContinuation monadContinuation;
        Object d11 = b.d();
        int i11 = this.f12502e;
        if (i11 == 0) {
            g.b(obj);
            MonadContinuation monadContinuation2 = this.f12499b;
            p pVar = this.f12503f;
            this.f12500c = monadContinuation2;
            this.f12501d = monadContinuation2;
            this.f12502e = 1;
            Object invoke = pVar.invoke(monadContinuation2, this);
            if (invoke == d11) {
                return d11;
            }
            monadContinuation = monadContinuation2;
            obj = invoke;
        } else if (i11 == 1) {
            monadContinuation = (MonadContinuation) this.f12501d;
            MonadContinuation monadContinuation3 = (MonadContinuation) this.f12500c;
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return monadContinuation.d(obj);
    }
}
