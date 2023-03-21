package androidx.compose.ui.draw;

import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import r0.c;
import r0.e;
import r0.g;

/* compiled from: DrawModifier.kt */
final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final c f6355a;

    /* renamed from: b  reason: collision with root package name */
    private final l<c, g> f6356b;

    public b(c cVar, l<? super c, g> lVar) {
        p.j(cVar, "cacheDrawScope");
        p.j(lVar, "onBuildDrawCache");
        this.f6355a = cVar;
        this.f6356b = lVar;
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public void b(w0.c cVar) {
        p.j(cVar, "<this>");
        g b11 = this.f6355a.b();
        p.g(b11);
        b11.a().invoke(cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f6355a, bVar.f6355a) && p.e(this.f6356b, bVar.f6356b);
    }

    public int hashCode() {
        return (this.f6355a.hashCode() * 31) + this.f6356b.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public void t(r0.b bVar) {
        p.j(bVar, "params");
        c cVar = this.f6355a;
        cVar.r(bVar);
        cVar.s((g) null);
        this.f6356b.invoke(cVar);
        if (cVar.b() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f6355a + ", onBuildDrawCache=" + this.f6356b + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
