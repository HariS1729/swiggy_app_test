package androidx.compose.foundation.relocation;

import bp0.k;
import d2.q;
import fp0.c;
import i1.m;
import kotlin.jvm.internal.p;
import t0.h;

/* compiled from: BringIntoViewRequester.kt */
final class b extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(y.b bVar) {
        super(bVar);
        p.j(bVar, "defaultParent");
    }

    public final Object e(h hVar, c<? super k> cVar) {
        m c11 = c();
        if (c11 == null) {
            return k.f22762a;
        }
        if (hVar == null) {
            hVar = t0.m.c(q.b(c11.a()));
        }
        Object a11 = d().a(hVar, c11, cVar);
        return a11 == b.d() ? a11 : k.f22762a;
    }
}
