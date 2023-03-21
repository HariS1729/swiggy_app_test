package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.h;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.w;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: AlignmentLine.kt */
final class a extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final i1.a f3893b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3894c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3895d;

    private a(i1.a aVar, float f11, float f12, l<? super n0, k> lVar) {
        super(lVar);
        this.f3893b = aVar;
        this.f3894c = f11;
        this.f3895d = f12;
        if (!((f11 >= 0.0f || h.p(f11, h.f13997b.c())) && (f12 >= 0.0f || h.p(f12, h.f13997b.c())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public /* synthetic */ a(i1.a aVar, float f11, float f12, l lVar, i iVar) {
        this(aVar, f11, f12, lVar);
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        return AlignmentLineKt.c(wVar, this.f3893b, this.f3894c, this.f3895d, rVar, j);
    }

    public /* synthetic */ int L(j jVar, i1.i iVar, int i11) {
        return b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null && p.e(this.f3893b, aVar.f3893b) && h.p(this.f3894c, aVar.f3894c) && h.p(this.f3895d, aVar.f3895d)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ int f0(j jVar, i1.i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (((this.f3893b.hashCode() * 31) + h.q(this.f3894c)) * 31) + h.q(this.f3895d);
    }

    public /* synthetic */ int n0(j jVar, i1.i iVar, int i11) {
        return b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i1.i iVar, int i11) {
        return b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f3893b + ", before=" + h.r(this.f3894c) + ", after=" + h.r(this.f3895d) + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
