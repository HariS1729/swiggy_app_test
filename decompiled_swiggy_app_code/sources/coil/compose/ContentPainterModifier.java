package coil.compose;

import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.o0;
import d2.b;
import i1.c;
import i1.i;
import i1.i0;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import lp0.p;
import p0.a;
import p0.d;
import r0.f;
import t0.l;
import t0.m;
import u0.e0;

/* compiled from: ContentPainterModifier.kt */
public final class ContentPainterModifier extends o0 implements q, f {

    /* renamed from: b  reason: collision with root package name */
    private final Painter f13467b;

    /* renamed from: c  reason: collision with root package name */
    private final a f13468c;

    /* renamed from: d  reason: collision with root package name */
    private final c f13469d;

    /* renamed from: e  reason: collision with root package name */
    private final float f13470e;

    /* renamed from: f  reason: collision with root package name */
    private final e0 f13471f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [lp0.l] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ContentPainterModifier(androidx.compose.ui.graphics.painter.Painter r8, p0.a r9, i1.c r10, float r11, u0.e0 r12) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r0 == 0) goto L_0x0012
            coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1 r0 = new coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            lp0.l r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0016:
            r7.<init>(r0)
            r7.f13467b = r8
            r7.f13468c = r9
            r7.f13469d = r10
            r7.f13470e = r11
            r7.f13471f = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.ContentPainterModifier.<init>(androidx.compose.ui.graphics.painter.Painter, p0.a, i1.c, float, u0.e0):void");
    }

    private final long c(long j) {
        if (l.k(j)) {
            return l.f16682b.b();
        }
        long k = this.f13467b.k();
        boolean z11 = true;
        if (k == l.f16682b.a()) {
            return j;
        }
        float i11 = l.i(k);
        if (!(!Float.isInfinite(i11) && !Float.isNaN(i11))) {
            i11 = l.i(j);
        }
        float g11 = l.g(k);
        if (Float.isInfinite(g11) || Float.isNaN(g11)) {
            z11 = false;
        }
        if (!z11) {
            g11 = l.g(j);
        }
        long a11 = m.a(i11, g11);
        return i0.b(a11, this.f13469d.a(a11, j));
    }

    private final long d(long j) {
        float f11;
        float f12;
        int o11;
        boolean l11 = b.l(j);
        boolean k = b.k(j);
        if (l11 && k) {
            return j;
        }
        boolean z11 = true;
        boolean z12 = b.j(j) && b.i(j);
        long k11 = this.f13467b.k();
        if (!(k11 == l.f16682b.a())) {
            if (!z12 || (!l11 && !k)) {
                float i11 = l.i(k11);
                float g11 = l.g(k11);
                if (!Float.isInfinite(i11) && !Float.isNaN(i11)) {
                    f12 = UtilsKt.b(j, i11);
                } else {
                    f12 = (float) b.p(j);
                }
                if (Float.isInfinite(g11) || Float.isNaN(g11)) {
                    z11 = false;
                }
                if (z11) {
                    f11 = UtilsKt.a(j, g11);
                    long c11 = c(m.a(f12, f11));
                    return b.e(j, d2.c.g(j, c.c(l.i(c11))), 0, d2.c.f(j, c.c(l.g(c11))), 0, 10, (Object) null);
                }
                o11 = b.o(j);
            } else {
                f12 = (float) b.n(j);
                o11 = b.m(j);
            }
            f11 = (float) o11;
            long c112 = c(m.a(f12, f11));
            return b.e(j, d2.c.g(j, c.c(l.i(c112))), 0, d2.c.f(j, c.c(l.g(c112))), 0, 10, (Object) null);
        } else if (!z12) {
            return j;
        } else {
            return b.e(j, b.n(j), 0, b.m(j), 0, 10, (Object) null);
        }
    }

    public u K(w wVar, r rVar, long j) {
        i1.e0 N = rVar.N(d(j));
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new ContentPainterModifier$measure$1(N), 4, (Object) null);
    }

    public int L(j jVar, i iVar, int i11) {
        if (!(this.f13467b.k() != l.f16682b.a())) {
            return iVar.K(i11);
        }
        int K = iVar.K(b.m(d(d2.c.b(0, 0, 0, i11, 7, (Object) null))));
        return Math.max(c.c(l.i(c(m.a((float) K, (float) i11)))), K);
    }

    public d N(d dVar) {
        return q.a.h(this, dVar);
    }

    public <R> R W(R r11, p<? super d.b, ? super R, ? extends R> pVar) {
        return q.a.c(this, r11, pVar);
    }

    public void b(w0.c cVar) {
        long c11 = c(cVar.d());
        long a11 = this.f13468c.a(UtilsKt.f(c11), UtilsKt.f(cVar.d()), cVar.getLayoutDirection());
        float c12 = (float) d2.l.c(a11);
        float d11 = (float) d2.l.d(a11);
        cVar.O().c().c(c12, d11);
        this.f13467b.j(cVar, c11, this.f13470e, this.f13471f);
        cVar.O().c().c(-c12, -d11);
        cVar.V();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
        return kotlin.jvm.internal.p.e(this.f13467b, contentPainterModifier.f13467b) && kotlin.jvm.internal.p.e(this.f13468c, contentPainterModifier.f13468c) && kotlin.jvm.internal.p.e(this.f13469d, contentPainterModifier.f13469d) && kotlin.jvm.internal.p.e(Float.valueOf(this.f13470e), Float.valueOf(contentPainterModifier.f13470e)) && kotlin.jvm.internal.p.e(this.f13471f, contentPainterModifier.f13471f);
    }

    public int f0(j jVar, i iVar, int i11) {
        if (!(this.f13467b.k() != l.f16682b.a())) {
            return iVar.x(i11);
        }
        int x11 = iVar.x(b.n(d(d2.c.b(0, i11, 0, 0, 13, (Object) null))));
        return Math.max(c.c(l.g(c(m.a((float) i11, (float) x11)))), x11);
    }

    public int hashCode() {
        int hashCode = ((((((this.f13467b.hashCode() * 31) + this.f13468c.hashCode()) * 31) + this.f13469d.hashCode()) * 31) + Float.floatToIntBits(this.f13470e)) * 31;
        e0 e0Var = this.f13471f;
        return hashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public int n0(j jVar, i iVar, int i11) {
        if (!(this.f13467b.k() != l.f16682b.a())) {
            return iVar.J(i11);
        }
        int J = iVar.J(b.n(d(d2.c.b(0, i11, 0, 0, 13, (Object) null))));
        return Math.max(c.c(l.g(c(m.a((float) i11, (float) J)))), J);
    }

    public int p(j jVar, i iVar, int i11) {
        if (!(this.f13467b.k() != l.f16682b.a())) {
            return iVar.L(i11);
        }
        int L = iVar.L(b.m(d(d2.c.b(0, 0, 0, i11, 7, (Object) null))));
        return Math.max(c.c(l.i(c(m.a((float) L, (float) i11)))), L);
    }

    public <R> R s(R r11, p<? super R, ? super d.b, ? extends R> pVar) {
        return q.a.b(this, r11, pVar);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.f13467b + ", alignment=" + this.f13468c + ", contentScale=" + this.f13469d + ", alpha=" + this.f13470e + ", colorFilter=" + this.f13471f + ')';
    }

    public boolean x(lp0.l<? super d.b, Boolean> lVar) {
        return q.a.a(this, lVar);
    }
}
