package r4;

import arrow.core.extensions.EitherMonad;
import arrow.typeclasses.MonadFx;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: EitherMonad.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final EitherMonad<Object> f16475a = new C0179a();

    /* renamed from: r4.a$a  reason: collision with other inner class name */
    /* compiled from: EitherMonad.kt */
    public static final class C0179a implements EitherMonad<Object> {
        C0179a() {
        }

        /* renamed from: a */
        public <A, B> p4.a<Object, B> c(o4.a<? extends o4.a<Object, ? extends Object>, ? extends A> aVar, l<? super A, ? extends o4.a<? extends o4.a<Object, ? extends Object>, ? extends B>> lVar) {
            p.k(aVar, "$this$flatMap");
            p.k(lVar, "f");
            return EitherMonad.DefaultImpls.a(this, aVar, lVar);
        }

        /* renamed from: b */
        public <A> p4.a<Object, A> d(A a11) {
            return EitherMonad.DefaultImpls.c(this, a11);
        }

        public MonadFx<o4.a<Object, Object>> e() {
            return EitherMonad.DefaultImpls.b(this);
        }
    }

    public static final EitherMonad<Object> a() {
        return f16475a;
    }
}
