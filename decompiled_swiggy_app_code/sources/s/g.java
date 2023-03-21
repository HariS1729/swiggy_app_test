package s;

import androidx.compose.foundation.FocusedBoundsKt;
import bp0.k;
import i1.m;
import i1.z;
import j1.b;
import j1.e;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;

/* compiled from: FocusedBounds.kt */
public final class g implements b, z {

    /* renamed from: a  reason: collision with root package name */
    private l<? super m, k> f16537a;

    /* renamed from: b  reason: collision with root package name */
    private m f16538b;

    private final void a() {
        l<? super m, k> lVar;
        m mVar = this.f16538b;
        if (mVar != null) {
            p.g(mVar);
            if (mVar.D() && (lVar = this.f16537a) != null) {
                lVar.invoke(this.f16538b);
            }
        }
    }

    public void D(e eVar) {
        l<? super m, k> lVar;
        p.j(eVar, "scope");
        l<? super m, k> lVar2 = (l) eVar.a(FocusedBoundsKt.a());
        if (lVar2 == null && (lVar = this.f16537a) != null) {
            lVar.invoke(null);
        }
        this.f16537a = lVar2;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public void e0(m mVar) {
        p.j(mVar, "coordinates");
        this.f16538b = mVar;
        if (mVar.D()) {
            a();
            return;
        }
        l<? super m, k> lVar = this.f16537a;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
