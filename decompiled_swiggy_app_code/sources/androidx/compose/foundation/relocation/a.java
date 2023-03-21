package androidx.compose.foundation.relocation;

import i1.a0;
import i1.m;
import j1.b;
import j1.e;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;

/* compiled from: BringIntoView.kt */
public abstract class a implements b, a0 {

    /* renamed from: a  reason: collision with root package name */
    private final y.b f4175a;

    /* renamed from: b  reason: collision with root package name */
    private y.b f4176b;

    /* renamed from: c  reason: collision with root package name */
    private m f4177c;

    public a(y.b bVar) {
        p.j(bVar, "defaultParent");
        this.f4175a = bVar;
    }

    public void D(e eVar) {
        p.j(eVar, "scope");
        this.f4176b = (y.b) eVar.a(BringIntoViewKt.a());
    }

    public void J(m mVar) {
        p.j(mVar, "coordinates");
        this.f4177c = mVar;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    /* access modifiers changed from: protected */
    public final m c() {
        m mVar = this.f4177c;
        if (mVar == null || !mVar.D()) {
            return null;
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public final y.b d() {
        y.b bVar = this.f4176b;
        return bVar == null ? this.f4175a : bVar;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
