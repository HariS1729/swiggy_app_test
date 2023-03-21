package androidx.compose.foundation.layout;

import a0.h;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.e;
import i1.e0;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;

/* compiled from: Offset.kt */
final class OffsetPxModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final l<e, d2.l> f3764b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3765c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier(l<? super e, d2.l> lVar, boolean z11, l<? super n0, k> lVar2) {
        super(lVar2);
        p.j(lVar, "offset");
        p.j(lVar2, "inspectorInfo");
        this.f3764b = lVar;
        this.f3765c = z11;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new OffsetPxModifier$measure$1(this, wVar, N), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public final l<e, d2.l> c() {
        return this.f3764b;
    }

    public final boolean d() {
        return this.f3765c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxModifier offsetPxModifier = obj instanceof OffsetPxModifier ? (OffsetPxModifier) obj : null;
        if (offsetPxModifier != null && p.e(this.f3764b, offsetPxModifier.f3764b) && this.f3765c == offsetPxModifier.f3765c) {
            return true;
        }
        return false;
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (this.f3764b.hashCode() * 31) + h.a(this.f3765c);
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f3764b + ", rtlAware=" + this.f3765c + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
