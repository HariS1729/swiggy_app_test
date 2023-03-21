package q4;

import kotlin.jvm.internal.p;
import u4.c;

/* compiled from: listk.kt */
public interface d extends c<Object> {

    /* compiled from: listk.kt */
    public static final class a {
        public static <A> boolean a(d dVar, o4.a<Object, ? extends A> aVar) {
            p.k(aVar, "$this$isEmpty");
            return ((p4.c) aVar).isEmpty();
        }

        public static <A> boolean b(d dVar, o4.a<Object, ? extends A> aVar) {
            p.k(aVar, "$this$nonEmpty");
            return c.a.a(dVar, aVar);
        }
    }
}
