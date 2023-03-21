package q4;

import kotlin.jvm.internal.p;
import lp0.l;
import p4.c;
import u4.d;

/* compiled from: listk.kt */
public interface e extends d<Object> {

    /* compiled from: listk.kt */
    public static final class a {
        public static <A, B> c<B> a(e eVar, o4.a<Object, ? extends A> aVar, l<? super A, ? extends o4.a<Object, ? extends B>> lVar) {
            p.k(aVar, "$this$flatMap");
            p.k(lVar, "f");
            return ((c) aVar).a(lVar);
        }

        public static <A> c<A> b(e eVar, A a11) {
            return c.f16239b.a(a11);
        }

        public static <A, B> c<B> c(e eVar, o4.a<Object, ? extends A> aVar, l<? super A, ? extends B> lVar) {
            p.k(aVar, "$this$map");
            p.k(lVar, "f");
            return ((c) aVar).d(lVar);
        }
    }

    <A, B> c<B> f(o4.a<Object, ? extends A> aVar, l<? super A, ? extends B> lVar);
}
