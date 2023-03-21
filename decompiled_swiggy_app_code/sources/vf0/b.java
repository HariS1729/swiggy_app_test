package vf0;

import bs.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AssetPreCacheRequest.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f19938a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19939b;

    public b(c cVar, long j) {
        p.j(cVar, "asset");
        this.f19938a = cVar;
        this.f19939b = j;
    }

    public final c a() {
        return this.f19938a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f19938a, bVar.f19938a) && this.f19939b == bVar.f19939b;
    }

    public int hashCode() {
        return (this.f19938a.hashCode() * 31) + a.a(this.f19939b);
    }

    public String toString() {
        return "AssetPreCacheRequest(asset=" + this.f19938a + ", ttlSeconds=" + this.f19939b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, long j, int i11, i iVar) {
        this(cVar, (i11 & 2) != 0 ? -1 : j);
    }
}
