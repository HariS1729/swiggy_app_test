package t4;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.p;
import lp0.l;
import p4.c;
import q4.e;

/* compiled from: ListKMonad.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final e f16724a = new a();

    /* compiled from: ListKMonad.kt */
    public static final class a implements e {
        a() {
        }

        /* renamed from: a */
        public <A, B> c<B> c(o4.a<Object, ? extends A> aVar, l<? super A, ? extends o4.a<Object, ? extends B>> lVar) {
            p.k(aVar, "$this$flatMap");
            p.k(lVar, "f");
            return e.a.a(this, aVar, lVar);
        }

        /* renamed from: b */
        public <A> c<A> d(A a11) {
            return e.a.b(this, a11);
        }

        public <A, B> c<B> f(o4.a<Object, ? extends A> aVar, l<? super A, ? extends B> lVar) {
            p.k(aVar, "$this$map");
            p.k(lVar, "f");
            return e.a.c(this, aVar, lVar);
        }
    }

    public static final e a() {
        return f16724a;
    }

    public static final <A, B> List<B> b(List<? extends A> list, l<? super A, ? extends B> lVar) {
        p.k(list, "$this$map");
        p.k(lVar, "arg1");
        a aVar = a.f16723a;
        c<B> f11 = a().f(new c(list), lVar);
        if (f11 != null) {
            return f11;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<B>");
    }
}
