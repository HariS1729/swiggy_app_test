package e0;

import bp0.k;
import kotlin.jvm.internal.x;
import lp0.p;

/* compiled from: ActualJvm.jvm.kt */
public final class b {
    public static final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void b(g gVar, p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(gVar, "composer");
        kotlin.jvm.internal.p.j(pVar, "composable");
        ((p) x.e(pVar, 2)).invoke(gVar, 1);
    }

    public static final <T> T c(g gVar, p<? super g, ? super Integer, ? extends T> pVar) {
        kotlin.jvm.internal.p.j(gVar, "composer");
        kotlin.jvm.internal.p.j(pVar, "composable");
        return ((p) x.e(pVar, 2)).invoke(gVar, 1);
    }
}
