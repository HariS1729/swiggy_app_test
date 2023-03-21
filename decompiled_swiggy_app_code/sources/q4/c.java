package q4;

import arrow.core.extensions.EitherMonad;
import arrow.typeclasses.MonadFx;
import kotlin.TypeCastException;
import lp0.p;
import o4.a;
import p4.a;
import u4.d;
import u4.e;

/* compiled from: either.kt */
public final class c implements MonadFx<a<Object, ? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    private static final d<a<Object, Object>> f16375a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f16376b = new c();

    static {
        a.C0165a aVar = p4.a.f16234a;
        EitherMonad<Object> a11 = r4.a.a();
        if (a11 != null) {
            f16375a = a11;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.extensions.EitherMonad<L>");
    }

    private c() {
    }

    public d<o4.a<Object, Object>> a() {
        return f16375a;
    }

    /* renamed from: c */
    public <A> p4.a<Object, A> b(p<? super e<o4.a<Object, Object>>, ? super fp0.c<? super A>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.k(pVar, "c");
        return (p4.a) MonadFx.DefaultImpls.a(this, pVar);
    }
}
