package p4;

import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import lp0.l;
import o4.a;
import p4.a;

/* compiled from: Either.kt */
public final class b {
    public static final <R> a a(R r11) {
        return a.f16234a.a(r11);
    }

    public static final <A, B, C> a<A, C> b(a<? extends a<Object, ? extends A>, ? extends B> aVar, l<? super B, ? extends a<? extends A, ? extends C>> lVar) {
        p.k(aVar, "$this$flatMap");
        p.k(lVar, "f");
        a<A, C> aVar2 = (a) aVar;
        if (aVar2 instanceof a.c) {
            return (a) lVar.invoke(((a.c) aVar2).a());
        }
        if (aVar2 instanceof a.b) {
            return aVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> B c(o4.a<? extends o4.a<Object, ?>, ? extends B> aVar, lp0.a<? extends B> aVar2) {
        p.k(aVar, "$this$getOrElse");
        p.k(aVar2, TrackOrderType.DEFAULT);
        a aVar3 = (a) aVar;
        if (aVar3 instanceof a.c) {
            return e.a(((a.c) aVar3).a());
        }
        if (aVar3 instanceof a.b) {
            ((a.b) aVar3).a();
            return aVar2.invoke();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <A> a d(A a11) {
        return new a.b(a11);
    }

    public static final <A> a e(A a11) {
        return new a.c(a11);
    }
}
