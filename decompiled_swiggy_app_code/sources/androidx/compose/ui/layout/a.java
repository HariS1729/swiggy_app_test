package androidx.compose.ui.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.e;
import i1.d0;
import i1.o;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;

/* compiled from: LayoutId.kt */
final class a extends o0 implements d0, o {

    /* renamed from: b  reason: collision with root package name */
    private final Object f6796b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Object obj, l<? super n0, k> lVar) {
        super(lVar);
        p.j(obj, "layoutId");
        p.j(lVar, "inspectorInfo");
        this.f6796b = obj;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public Object U(e eVar, Object obj) {
        p.j(eVar, "<this>");
        return this;
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public Object a() {
        return this.f6796b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return false;
        }
        return p.e(a(), aVar.a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public String toString() {
        return "LayoutId(id=" + a() + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
