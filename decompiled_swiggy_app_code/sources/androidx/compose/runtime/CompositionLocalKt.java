package androidx.compose.runtime;

import bp0.k;
import e0.a1;
import e0.e1;
import e0.g;
import e0.m0;
import e0.n0;
import e0.s0;
import e0.t;
import in.swiggy.android.tejas.network.HttpRequest;
import lp0.a;
import lp0.p;

/* compiled from: CompositionLocal.kt */
public final class CompositionLocalKt {
    public static final void a(n0<?>[] n0VarArr, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(n0VarArr, "values");
        kotlin.jvm.internal.p.j(pVar, "content");
        g t = gVar.t(-1390796515);
        t.r(n0VarArr);
        pVar.invoke(t, Integer.valueOf((i11 >> 3) & 14));
        t.M();
        s0 v = t.v();
        if (v != null) {
            v.a(new CompositionLocalKt$CompositionLocalProvider$1(n0VarArr, pVar, i11));
        }
    }

    public static final <T> m0<T> b(a1<T> a1Var, a<? extends T> aVar) {
        kotlin.jvm.internal.p.j(a1Var, HttpRequest.HEADER_POLICY);
        kotlin.jvm.internal.p.j(aVar, "defaultFactory");
        return new t(a1Var, aVar);
    }

    public static /* synthetic */ m0 c(a1 a1Var, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a1Var = g.o();
        }
        return b(a1Var, aVar);
    }

    public static final <T> m0<T> d(a<? extends T> aVar) {
        kotlin.jvm.internal.p.j(aVar, "defaultFactory");
        return new e1(aVar);
    }
}
