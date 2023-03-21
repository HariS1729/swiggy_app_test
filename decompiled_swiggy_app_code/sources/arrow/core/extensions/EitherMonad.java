package arrow.core.extensions;

import arrow.typeclasses.MonadFx;
import kotlin.TypeCastException;
import kotlin.jvm.internal.p;
import lp0.l;
import o4.a;
import p4.b;
import q4.a;
import q4.c;
import u4.d;

/* compiled from: either.kt */
public interface EitherMonad<L> extends d<a<Object, ? extends L>>, q4.a<L> {

    /* compiled from: either.kt */
    public static final class DefaultImpls {
        public static <L, A, B> p4.a<L, B> a(EitherMonad<L> eitherMonad, a<? extends a<Object, ? extends L>, ? extends A> aVar, l<? super A, ? extends a<? extends a<Object, ? extends L>, ? extends B>> lVar) {
            p.k(aVar, "$this$flatMap");
            p.k(lVar, "f");
            return b.b((p4.a) aVar, new EitherMonad$flatMap$1(lVar));
        }

        public static <L> MonadFx<a<Object, L>> b(EitherMonad<L> eitherMonad) {
            c cVar = c.f16376b;
            if (cVar != null) {
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type arrow.typeclasses.MonadFx<arrow.core.EitherPartialOf<L> /* = arrow.Kind<arrow.core.ForEither, L> */>");
        }

        public static <L, A> p4.a<L, A> c(EitherMonad<L> eitherMonad, A a11) {
            return a.C0172a.a(eitherMonad, a11);
        }
    }

    MonadFx<o4.a<Object, L>> e();
}
