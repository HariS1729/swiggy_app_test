package androidx.compose.ui.graphics;

import a0.h;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import i1.e0;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;
import u0.d0;
import u0.d1;
import u0.j0;
import u0.j1;
import u0.q1;

/* compiled from: GraphicsLayerModifier.kt */
final class SimpleGraphicsLayerModifier extends o0 implements q {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f6427b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final float f6428c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final float f6429d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final float f6430e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final float f6431f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final float f6432g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final float f6433h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final float f6434i;
    /* access modifiers changed from: private */
    public final float j;
    /* access modifiers changed from: private */
    public final float k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f6435l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final j1 f6436m;
    /* access modifiers changed from: private */
    public final boolean n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final long f6437o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final long f6438p;
    /* access modifiers changed from: private */
    public final l<j0, k> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, j1 j1Var, boolean z11, d1 d1Var, long j12, long j13, l<? super n0, k> lVar) {
        super(lVar);
        this.f6427b = f11;
        this.f6428c = f12;
        this.f6429d = f13;
        this.f6430e = f14;
        this.f6431f = f15;
        this.f6432g = f16;
        this.f6433h = f17;
        this.f6434i = f18;
        this.j = f19;
        this.k = f21;
        this.f6435l = j11;
        this.f6436m = j1Var;
        this.n = z11;
        this.f6437o = j12;
        this.f6438p = j13;
        this.q = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, j1 j1Var, boolean z11, d1 d1Var, long j12, long j13, l lVar, i iVar) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, j1Var, z11, d1Var, j12, j13, lVar);
    }

    public u K(w wVar, r rVar, long j11) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        e0 N = rVar.N(j11);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new SimpleGraphicsLayerModifier$measure$1(N, this), 4, (Object) null);
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
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = obj instanceof SimpleGraphicsLayerModifier ? (SimpleGraphicsLayerModifier) obj : null;
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        if (!(this.f6427b == simpleGraphicsLayerModifier.f6427b)) {
            return false;
        }
        if (!(this.f6428c == simpleGraphicsLayerModifier.f6428c)) {
            return false;
        }
        if (!(this.f6429d == simpleGraphicsLayerModifier.f6429d)) {
            return false;
        }
        if (!(this.f6430e == simpleGraphicsLayerModifier.f6430e)) {
            return false;
        }
        if (!(this.f6431f == simpleGraphicsLayerModifier.f6431f)) {
            return false;
        }
        if (!(this.f6432g == simpleGraphicsLayerModifier.f6432g)) {
            return false;
        }
        if (!(this.f6433h == simpleGraphicsLayerModifier.f6433h)) {
            return false;
        }
        if (!(this.f6434i == simpleGraphicsLayerModifier.f6434i)) {
            return false;
        }
        if (!(this.j == simpleGraphicsLayerModifier.j)) {
            return false;
        }
        if (!(this.k == simpleGraphicsLayerModifier.k) || !q1.e(this.f6435l, simpleGraphicsLayerModifier.f6435l) || !p.e(this.f6436m, simpleGraphicsLayerModifier.f6436m) || this.n != simpleGraphicsLayerModifier.n || !p.e((Object) null, (Object) null) || !d0.n(this.f6437o, simpleGraphicsLayerModifier.f6437o) || !d0.n(this.f6438p, simpleGraphicsLayerModifier.f6438p)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ int f0(j jVar, i1.i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.floatToIntBits(this.f6427b) * 31) + Float.floatToIntBits(this.f6428c)) * 31) + Float.floatToIntBits(this.f6429d)) * 31) + Float.floatToIntBits(this.f6430e)) * 31) + Float.floatToIntBits(this.f6431f)) * 31) + Float.floatToIntBits(this.f6432g)) * 31) + Float.floatToIntBits(this.f6433h)) * 31) + Float.floatToIntBits(this.f6434i)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + q1.h(this.f6435l)) * 31) + this.f6436m.hashCode()) * 31) + h.a(this.n)) * 31) + 0) * 31) + d0.t(this.f6437o)) * 31) + d0.t(this.f6438p);
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
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f6427b + ", scaleY=" + this.f6428c + ", alpha = " + this.f6429d + ", translationX=" + this.f6430e + ", translationY=" + this.f6431f + ", shadowElevation=" + this.f6432g + ", rotationX=" + this.f6433h + ", rotationY=" + this.f6434i + ", rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + q1.i(this.f6435l) + ", shape=" + this.f6436m + ", clip=" + this.n + ", renderEffect=" + null + ", ambientShadowColor=" + d0.u(this.f6437o) + ", spotShadowColor=" + d0.u(this.f6438p) + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
