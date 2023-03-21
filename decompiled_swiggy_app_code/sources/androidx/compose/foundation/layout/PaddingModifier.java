package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.c;
import d2.h;
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
import p0.d;
import p0.e;

/* compiled from: Padding.kt */
final class PaddingModifier extends o0 implements q {

    /* renamed from: b  reason: collision with root package name */
    private final float f3777b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3778c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3779d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3780e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3781f;

    private PaddingModifier(float f11, float f12, float f13, float f14, boolean z11, l<? super n0, k> lVar) {
        super(lVar);
        this.f3777b = f11;
        this.f3778c = f12;
        this.f3779d = f13;
        this.f3780e = f14;
        this.f3781f = z11;
        if (!((f11 >= 0.0f || h.p(f11, h.f13997b.c())) && (f12 >= 0.0f || h.p(f12, h.f13997b.c())) && ((f13 >= 0.0f || h.p(f13, h.f13997b.c())) && (f14 >= 0.0f || h.p(f14, h.f13997b.c()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ PaddingModifier(float f11, float f12, float f13, float f14, boolean z11, l lVar, i iVar) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        int j02 = wVar.j0(this.f3777b) + wVar.j0(this.f3779d);
        int j03 = wVar.j0(this.f3778c) + wVar.j0(this.f3780e);
        e0 N = rVar.N(c.i(j, -j02, -j03));
        return v.b(wVar, c.g(j, N.A0() + j02), c.f(j, N.e0() + j03), (Map) null, new PaddingModifier$measure$1(this, N, wVar), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i1.i iVar, int i11) {
        return b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public final boolean c() {
        return this.f3781f;
    }

    public final float d() {
        return this.f3777b;
    }

    public final float e() {
        return this.f3778c;
    }

    public boolean equals(Object obj) {
        PaddingModifier paddingModifier = obj instanceof PaddingModifier ? (PaddingModifier) obj : null;
        if (paddingModifier != null && h.p(this.f3777b, paddingModifier.f3777b) && h.p(this.f3778c, paddingModifier.f3778c) && h.p(this.f3779d, paddingModifier.f3779d) && h.p(this.f3780e, paddingModifier.f3780e) && this.f3781f == paddingModifier.f3781f) {
            return true;
        }
        return false;
    }

    public /* synthetic */ int f0(j jVar, i1.i iVar, int i11) {
        return b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (((((((h.q(this.f3777b) * 31) + h.q(this.f3778c)) * 31) + h.q(this.f3779d)) * 31) + h.q(this.f3780e)) * 31) + a0.h.a(this.f3781f);
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

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
