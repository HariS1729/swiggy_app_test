package androidx.compose.foundation;

import bp0.k;
import i1.m;
import j1.b;
import j1.d;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;

/* compiled from: FocusedBounds.kt */
final class e implements b, d<l<? super m, ? extends k>>, l<m, k> {

    /* renamed from: a  reason: collision with root package name */
    private final l<m, k> f3187a;

    /* renamed from: b  reason: collision with root package name */
    private l<? super m, k> f3188b;

    /* renamed from: c  reason: collision with root package name */
    private m f3189c;

    public e(l<? super m, k> lVar) {
        p.j(lVar, "handler");
        this.f3187a = lVar;
    }

    public void D(j1.e eVar) {
        p.j(eVar, "scope");
        l<? super m, k> lVar = (l) eVar.a(FocusedBoundsKt.a());
        if (!p.e(lVar, this.f3188b)) {
            this.f3188b = lVar;
        }
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    /* renamed from: a */
    public l<m, k> getValue() {
        return this;
    }

    public void c(m mVar) {
        this.f3189c = mVar;
        this.f3187a.invoke(mVar);
        l<? super m, k> lVar = this.f3188b;
        if (lVar != null) {
            lVar.invoke(mVar);
        }
    }

    public f<l<m, k>> getKey() {
        return FocusedBoundsKt.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((m) obj);
        return k.f22762a;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
