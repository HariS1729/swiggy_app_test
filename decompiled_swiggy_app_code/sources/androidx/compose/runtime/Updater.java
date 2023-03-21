package androidx.compose.runtime;

import bp0.k;
import e0.g;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Composer.kt */
public final class Updater<T> {
    public static <T> g a(g gVar) {
        p.j(gVar, "composer");
        return gVar;
    }

    public static final void b(g gVar, l<? super T, k> lVar) {
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        if (gVar.s()) {
            gVar.L(k.f22762a, new Updater$init$1(lVar));
        }
    }

    public static final <V> void c(g gVar, V v, lp0.p<? super T, ? super V, k> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        if (gVar.s() || !p.e(gVar.F(), v)) {
            gVar.y(v);
            gVar.L(v, pVar);
        }
    }
}
