package e0;

import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: MonotonicFrameClock.kt */
public final class d0 {
    public static final c0 a(CoroutineContext coroutineContext) {
        p.j(coroutineContext, "<this>");
        c0 c0Var = (c0) coroutineContext.get(c0.f14166b0);
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object b(l<? super Long, ? extends R> lVar, c<? super R> cVar) {
        return a(cVar.getContext()).w0(lVar, cVar);
    }
}
