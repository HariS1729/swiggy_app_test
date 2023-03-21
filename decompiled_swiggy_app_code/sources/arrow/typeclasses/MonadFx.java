package arrow.typeclasses;

import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import lp0.p;
import o4.a;
import u4.d;
import u4.e;

/* compiled from: Monad.kt */
public interface MonadFx<F> {

    /* compiled from: Monad.kt */
    public static final class DefaultImpls {
        public static <F, A> a<F, A> a(MonadFx<F> monadFx, p<? super e<F>, ? super c<? super A>, ? extends Object> pVar) {
            kotlin.jvm.internal.p.k(pVar, "c");
            MonadContinuation monadContinuation = new MonadContinuation(monadFx.a(), (CoroutineContext) null, 2, (i) null);
            fp0.e.c(new MonadFx$monad$wrapReturn$1(pVar, (c) null), monadContinuation, monadContinuation);
            return monadContinuation.k();
        }
    }

    d<F> a();

    <A> a<F, A> b(p<? super e<F>, ? super c<? super A>, ? extends Object> pVar);
}
