package androidx.compose.foundation.layout;

import a0.h;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import i1.d0;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: Box.kt */
final class b extends o0 implements d0 {

    /* renamed from: b  reason: collision with root package name */
    private a f3896b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3897c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, boolean z11, l<? super n0, k> lVar) {
        super(lVar);
        p.j(aVar, "alignment");
        p.j(lVar, "inspectorInfo");
        this.f3896b = aVar;
        this.f3897c = z11;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public final a c() {
        return this.f3896b;
    }

    public final boolean d() {
        return this.f3897c;
    }

    /* renamed from: e */
    public b U(d2.e eVar, Object obj) {
        p.j(eVar, "<this>");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar != null && p.e(this.f3896b, bVar.f3896b) && this.f3897c == bVar.f3897c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f3896b.hashCode() * 31) + h.a(this.f3897c);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.f3896b + ", matchParentSize=" + this.f3897c + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
