package g3;

import g3.a;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CreationExtras.kt */
public final class d extends a {
    public d() {
        this((a) null, 1, (i) null);
    }

    public d(a aVar) {
        p.j(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public <T> T a(a.b<T> bVar) {
        p.j(bVar, HttpRequest.HEADER_KEY);
        return b().get(bVar);
    }

    public final <T> void c(a.b<T> bVar, T t) {
        p.j(bVar, HttpRequest.HEADER_KEY);
        b().put(bVar, t);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? a.C0124a.f14730b : aVar);
    }
}
