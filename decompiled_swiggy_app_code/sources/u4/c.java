package u4;

import kotlin.jvm.internal.p;

/* compiled from: Foldable.kt */
public interface c<F> {

    /* compiled from: Foldable.kt */
    public static final class a {
        public static <F, A> boolean a(c<F> cVar, o4.a<? extends F, ? extends A> aVar) {
            p.k(aVar, "$this$nonEmpty");
            return !cVar.b(aVar);
        }
    }

    <A> boolean a(o4.a<? extends F, ? extends A> aVar);

    <A> boolean b(o4.a<? extends F, ? extends A> aVar);
}
