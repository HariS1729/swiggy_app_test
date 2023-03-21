package androidx.compose.ui.layout;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import i1.m;
import i1.z;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;

/* compiled from: OnGloballyPositionedModifier.kt */
final class e extends o0 implements z {

    /* renamed from: b  reason: collision with root package name */
    private final l<m, k> f6799b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(l<? super m, k> lVar, l<? super n0, k> lVar2) {
        super(lVar2);
        p.j(lVar, "callback");
        p.j(lVar2, "inspectorInfo");
        this.f6799b = lVar;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public void e0(m mVar) {
        p.j(mVar, "coordinates");
        this.f6799b.invoke(mVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return p.e(this.f6799b, ((e) obj).f6799b);
    }

    public int hashCode() {
        return this.f6799b.hashCode();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
