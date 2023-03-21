package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import fp0.c;
import lp0.p;
import wp0.h;
import wp0.j0;
import wp0.u0;

/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcherKt {
    public static final <T> Object a(Lifecycle lifecycle, p<? super j0, ? super c<? super T>, ? extends Object> pVar, c<? super T> cVar) {
        return b(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    public static final <T> Object b(Lifecycle lifecycle, Lifecycle.State state, p<? super j0, ? super c<? super T>, ? extends Object> pVar, c<? super T> cVar) {
        return h.g(u0.c().N0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, (c<? super PausingDispatcherKt$whenStateAtLeast$2>) null), cVar);
    }
}
