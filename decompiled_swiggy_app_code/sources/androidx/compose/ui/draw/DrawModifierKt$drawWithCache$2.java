package androidx.compose.ui.draw;

import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import r0.c;

/* compiled from: DrawModifier.kt */
final class DrawModifierKt$drawWithCache$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<c, r0.g> f6330a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawModifierKt$drawWithCache$2(l<? super c, r0.g> lVar) {
        super(3);
        this.f6330a = lVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-1689569019);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new c();
            gVar.y(F);
        }
        gVar.P();
        d N = dVar.N(new b((c) F, this.f6330a));
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
