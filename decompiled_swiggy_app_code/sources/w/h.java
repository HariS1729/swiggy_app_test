package w;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.r;

/* compiled from: LazyListScopeImpl.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final l<Integer, Object> f17362a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Integer, Object> f17363b;

    /* renamed from: c  reason: collision with root package name */
    private final r<c, Integer, g, Integer, k> f17364c;

    public h(l<? super Integer, ? extends Object> lVar, l<? super Integer, ? extends Object> lVar2, r<? super c, ? super Integer, ? super g, ? super Integer, k> rVar) {
        p.j(lVar2, "type");
        p.j(rVar, "item");
        this.f17362a = lVar;
        this.f17363b = lVar2;
        this.f17364c = rVar;
    }

    public final r<c, Integer, g, Integer, k> a() {
        return this.f17364c;
    }

    public final l<Integer, Object> b() {
        return this.f17362a;
    }

    public final l<Integer, Object> c() {
        return this.f17363b;
    }
}
