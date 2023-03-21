package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifierKt;
import d2.h;
import e0.g;
import k1.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import r0.c;
import t0.m;
import u0.j1;
import u0.r0;
import u0.u;

/* compiled from: Border.kt */
final class BorderKt$border$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f2854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j1 f2855b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u f2856c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$border$2(float f11, j1 j1Var, u uVar) {
        super(3);
        this.f2854a = f11;
        this.f2855b = j1Var;
        this.f2856c = uVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-1498088849);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new t();
            gVar.y(F);
        }
        gVar.P();
        final t tVar = (t) F;
        d.a aVar = d.f16037h0;
        final float f11 = this.f2854a;
        final j1 j1Var = this.f2855b;
        final u uVar = this.f2856c;
        d N = dVar.N(DrawModifierKt.b(aVar, new l<c, r0.g>() {
            /* renamed from: a */
            public final r0.g invoke(c cVar) {
                c cVar2 = cVar;
                p.j(cVar2, "$this$drawWithCache");
                if (!(cVar2.v0(f11) >= 0.0f && t0.l.h(cVar.d()) > 0.0f)) {
                    return BorderKt.m(cVar);
                }
                float f11 = (float) 2;
                float min = Math.min(h.p(f11, h.f13997b.a()) ? 1.0f : (float) Math.ceil((double) cVar2.v0(f11)), (float) Math.ceil((double) (t0.l.h(cVar.d()) / f11)));
                float f12 = min / f11;
                long a11 = t0.g.a(f12, f12);
                long a12 = m.a(t0.l.i(cVar.d()) - min, t0.l.g(cVar.d()) - min);
                boolean z11 = f11 * min > t0.l.h(cVar.d());
                r0 a13 = j1Var.a(cVar.d(), cVar.getLayoutDirection(), cVar2);
                if (a13 instanceof r0.a) {
                    return BorderKt.n(cVar, tVar, uVar, (r0.a) a13, z11, min);
                } else if (a13 instanceof r0.c) {
                    return BorderKt.p(cVar, tVar, uVar, (r0.c) a13, a11, a12, z11, min);
                } else if (a13 instanceof r0.b) {
                    return BorderKt.o(cVar, uVar, a11, a12, z11, min);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }));
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
