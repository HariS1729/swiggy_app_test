package androidx.compose.foundation.lazy;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import lp0.r;
import w.c;

/* compiled from: LazyListScopeImpl.kt */
final class LazyListScopeImpl$item$3 extends Lambda implements r<c, Integer, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<c, g, Integer, k> f4037a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListScopeImpl$item$3(q<? super c, ? super g, ? super Integer, k> qVar) {
        super(4);
        this.f4037a = qVar;
    }

    public final void a(c cVar, int i11, g gVar, int i12) {
        p.j(cVar, "$this$$receiver");
        if ((i12 & 14) == 0) {
            i12 |= gVar.k(cVar) ? 4 : 2;
        }
        if ((i12 & 651) != 130 || !gVar.b()) {
            this.f4037a.invoke(cVar, gVar, Integer.valueOf(i12 & 14));
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        a((c) obj, ((Number) obj2).intValue(), (g) obj3, ((Number) obj4).intValue());
        return k.f22762a;
    }
}
