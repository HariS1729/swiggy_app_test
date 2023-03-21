package androidx.compose.ui.semantics;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import n1.m;
import p0.d;

/* compiled from: SemanticsModifier.kt */
final class SemanticsModifierKt$clearAndSetSemantics$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<n1.q, k> f7414a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SemanticsModifierKt$clearAndSetSemantics$2(l<? super n1.q, k> lVar) {
        super(3);
        this.f7414a = lVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(1495908050);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = Integer.valueOf(m.f15805c.a());
            gVar.y(F);
        }
        gVar.P();
        m mVar = new m(((Number) F).intValue(), false, true, this.f7414a);
        gVar.P();
        return mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
