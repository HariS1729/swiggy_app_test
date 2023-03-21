package androidx.compose.ui;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
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
import p0.e;

/* compiled from: ZIndexModifier.kt */
final class ZIndexModifier extends o0 implements q {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f6322b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZIndexModifier(float f11, l<? super n0, k> lVar) {
        super(lVar);
        p.j(lVar, "inspectorInfo");
        this.f6322b = f11;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new ZIndexModifier$measure$1(N, this), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        ZIndexModifier zIndexModifier = obj instanceof ZIndexModifier ? (ZIndexModifier) obj : null;
        if (zIndexModifier != null && this.f6322b == zIndexModifier.f6322b) {
            return true;
        }
        return false;
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f6322b);
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f6322b + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
