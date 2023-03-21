package androidx.compose.ui.graphics;

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
import u0.j0;

/* compiled from: GraphicsLayerModifier.kt */
final class BlockGraphicsLayerModifier extends o0 implements q {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l<j0, k> f6411b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier(l<? super j0, k> lVar, l<? super n0, k> lVar2) {
        super(lVar2);
        p.j(lVar, "layerBlock");
        p.j(lVar2, "inspectorInfo");
        this.f6411b = lVar;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new BlockGraphicsLayerModifier$measure$1(N, this), 4, (Object) null);
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
        if (!(obj instanceof BlockGraphicsLayerModifier)) {
            return false;
        }
        return p.e(this.f6411b, ((BlockGraphicsLayerModifier) obj).f6411b);
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return this.f6411b.hashCode();
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
        return "BlockGraphicsLayerModifier(block=" + this.f6411b + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
