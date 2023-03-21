package androidx.compose.foundation.lazy;

import e0.g;
import e0.s0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import rp0.f;
import w.c;
import w.h;
import x.b;

/* compiled from: LazyListItemProviderImpl.kt */
public final class LazyListItemsSnapshot {

    /* renamed from: a  reason: collision with root package name */
    private final b<h> f3983a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f3984b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, Integer> f3985c;

    public LazyListItemsSnapshot(b<h> bVar, List<Integer> list, f fVar) {
        p.j(bVar, "intervals");
        p.j(list, "headerIndexes");
        p.j(fVar, "nearestItemsRange");
        this.f3983a = bVar;
        this.f3984b = list;
        this.f3985c = LazyListItemProviderImplKt.c(fVar, bVar);
    }

    public final void a(c cVar, int i11, g gVar, int i12) {
        p.j(cVar, "scope");
        g t = gVar.t(1922528915);
        b.a<h> aVar = this.f3983a.get(i11);
        aVar.c().a().invoke(cVar, Integer.valueOf(i11 - aVar.b()), t, Integer.valueOf(i12 & 14));
        s0 v = t.v();
        if (v != null) {
            v.a(new LazyListItemsSnapshot$Item$1(this, cVar, i11, i12));
        }
    }

    public final Object b(int i11) {
        b.a<h> aVar = this.f3983a.get(i11);
        return aVar.c().c().invoke(Integer.valueOf(i11 - aVar.b()));
    }

    public final List<Integer> c() {
        return this.f3984b;
    }

    public final int d() {
        return this.f3983a.a();
    }

    public final Object e(int i11) {
        b.a<h> aVar = this.f3983a.get(i11);
        int b11 = i11 - aVar.b();
        l<Integer, Object> b12 = aVar.c().b();
        Object invoke = b12 != null ? b12.invoke(Integer.valueOf(b11)) : null;
        return invoke == null ? androidx.compose.foundation.lazy.layout.b.a(i11) : invoke;
    }

    public final Map<Object, Integer> f() {
        return this.f3985c;
    }
}
