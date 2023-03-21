package u;

import bp0.k;
import fp0.c;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.m;

/* compiled from: InteractionSource.kt */
final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final h<h> f16733a = m.b(0, 16, BufferOverflow.DROP_OLDEST, 1, (Object) null);

    public boolean a(h hVar) {
        p.j(hVar, "interaction");
        return b().e(hVar);
    }

    public Object c(h hVar, c<? super k> cVar) {
        Object emit = b().emit(hVar, cVar);
        return emit == b.d() ? emit : k.f22762a;
    }

    /* renamed from: d */
    public h<h> b() {
        return this.f16733a;
    }
}
