package v6;

import c7.c;
import coil.memory.MemoryCache;

/* compiled from: RealMemoryCache.kt */
public final class d implements MemoryCache {

    /* renamed from: a  reason: collision with root package name */
    private final g f17332a;

    /* renamed from: b  reason: collision with root package name */
    private final h f17333b;

    public d(g gVar, h hVar) {
        this.f17332a = gVar;
        this.f17333b = hVar;
    }

    public void a(int i11) {
        this.f17332a.a(i11);
        this.f17333b.a(i11);
    }

    public MemoryCache.b b(MemoryCache.Key key) {
        MemoryCache.b b11 = this.f17332a.b(key);
        return b11 == null ? this.f17333b.b(key) : b11;
    }

    public void c(MemoryCache.Key key, MemoryCache.b bVar) {
        this.f17332a.c(MemoryCache.Key.b(key, (String) null, c.b(key.c()), 1, (Object) null), bVar.a(), c.b(bVar.b()));
    }
}
