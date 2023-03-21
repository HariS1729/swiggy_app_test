package androidx.compose.foundation;

import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import bp0.k;
import j1.b;
import j1.e;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;
import x.j;

/* compiled from: Focusable.kt */
final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l<j, k> f3628a;

    public h(l<? super j, k> lVar) {
        p.j(lVar, "onPinnableParentAvailable");
        this.f3628a = lVar;
    }

    public void D(e eVar) {
        p.j(eVar, "scope");
        this.f3628a.invoke(eVar.a(PinnableParentKt.a()));
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && p.e(((h) obj).f3628a, this.f3628a);
    }

    public int hashCode() {
        return this.f3628a.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
