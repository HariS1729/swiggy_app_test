package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import p1.c0;
import p1.d0;
import u1.i;
import u1.s;
import u1.t;
import u1.v;

/* compiled from: MaxLinesHeightModifier.kt */
final class MaxLinesHeightModifierKt$maxLinesHeight$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f4494a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c0 f4495b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaxLinesHeightModifierKt$maxLinesHeight$2(int i11, c0 c0Var) {
        super(3);
        this.f4494a = i11;
        this.f4495b = c0Var;
    }

    private static final Object b(d1<? extends Object> d1Var) {
        return d1Var.getValue();
    }

    public final d a(d dVar, g gVar, int i11) {
        g gVar2 = gVar;
        p.j(dVar, "$this$composed");
        gVar2.E(-1027014173);
        int i12 = this.f4494a;
        if (!(i12 > 0)) {
            throw new IllegalArgumentException("maxLines must be greater than 0".toString());
        } else if (i12 == Integer.MAX_VALUE) {
            d.a aVar = d.f16037h0;
            gVar.P();
            return aVar;
        } else {
            e eVar = (e) gVar2.z(CompositionLocalsKt.e());
            i.b bVar = (i.b) gVar2.z(CompositionLocalsKt.g());
            LayoutDirection layoutDirection = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
            c0 c0Var = this.f4495b;
            gVar2.E(511388516);
            boolean k = gVar2.k(c0Var) | gVar2.k(layoutDirection);
            Object F = gVar.F();
            if (k || F == g.f14172a.a()) {
                F = d0.d(c0Var, layoutDirection);
                gVar2.y(F);
            }
            gVar.P();
            c0 c0Var2 = (c0) F;
            gVar2.E(511388516);
            boolean k11 = gVar2.k(bVar) | gVar2.k(c0Var2);
            Object F2 = gVar.F();
            if (k11 || F2 == g.f14172a.a()) {
                i h11 = c0Var2.h();
                v m11 = c0Var2.m();
                if (m11 == null) {
                    m11 = v.f16949b.f();
                }
                s k12 = c0Var2.k();
                int i13 = k12 != null ? k12.i() : s.f16939b.b();
                t l11 = c0Var2.l();
                F2 = bVar.a(h11, m11, i13, l11 != null ? l11.m() : t.f16943b.a());
                gVar2.y(F2);
            }
            gVar.P();
            d1 d1Var = (d1) F2;
            Object[] objArr = {eVar, bVar, this.f4495b, layoutDirection, b(d1Var)};
            gVar2.E(-568225417);
            boolean z11 = false;
            for (int i14 = 0; i14 < 5; i14++) {
                z11 |= gVar2.k(objArr[i14]);
            }
            Object F3 = gVar.F();
            if (z11 || F3 == g.f14172a.a()) {
                F3 = Integer.valueOf(d2.p.f(a0.p.a(c0Var2, eVar, bVar, a0.p.c(), 1)));
                gVar2.y(F3);
            }
            gVar.P();
            int intValue = ((Number) F3).intValue();
            Object[] objArr2 = {eVar, bVar, this.f4495b, layoutDirection, b(d1Var)};
            gVar2.E(-568225417);
            boolean z12 = false;
            for (int i15 = 0; i15 < 5; i15++) {
                z12 |= gVar2.k(objArr2[i15]);
            }
            Object F4 = gVar.F();
            if (z12 || F4 == g.f14172a.a()) {
                F4 = Integer.valueOf(d2.p.f(a0.p.a(c0Var2, eVar, bVar, a0.p.c() + 10 + a0.p.c(), 2)));
                gVar2.y(F4);
            }
            gVar.P();
            d q = SizeKt.q(d.f16037h0, 0.0f, eVar.k(intValue + ((((Number) F4).intValue() - intValue) * (this.f4494a - 1))), 1, (Object) null);
            gVar.P();
            return q;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
