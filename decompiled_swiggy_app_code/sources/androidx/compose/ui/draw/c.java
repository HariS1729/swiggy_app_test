package androidx.compose.ui.draw;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import p0.e;
import r0.f;

/* compiled from: DrawModifier.kt */
final class c extends o0 implements f {

    /* renamed from: b  reason: collision with root package name */
    private final l<w0.c, k> f6357b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(l<? super w0.c, k> lVar, l<? super n0, k> lVar2) {
        super(lVar2);
        p.j(lVar, "onDraw");
        p.j(lVar2, "inspectorInfo");
        this.f6357b = lVar;
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public void b(w0.c cVar) {
        p.j(cVar, "<this>");
        this.f6357b.invoke(cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return p.e(this.f6357b, ((c) obj).f6357b);
    }

    public int hashCode() {
        return this.f6357b.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
