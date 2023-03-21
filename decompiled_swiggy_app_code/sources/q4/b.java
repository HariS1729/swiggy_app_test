package q4;

import arrow.core.extensions.EitherMonad;
import fp0.c;
import kotlin.TypeCastException;
import lp0.p;
import p4.a;
import u4.e;

/* compiled from: either.kt */
public final class b {
    public static final <L, R> a<L, R> a(a.C0165a aVar, p<? super e<o4.a<Object, L>>, ? super c<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.k(aVar, "$this$fx");
        kotlin.jvm.internal.p.k(pVar, "c");
        a.C0165a aVar2 = a.f16234a;
        EitherMonad<Object> a11 = r4.a.a();
        if (a11 != null) {
            return (a) a11.e().b(pVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.extensions.EitherMonad<L>");
    }
}
