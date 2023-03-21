package androidx.compose.ui.focus;

import e0.g;
import f0.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import s0.o;

/* compiled from: FocusRequesterModifier.kt */
final class FocusRequesterModifierKt$focusRequester$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f6399a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusRequesterModifierKt$focusRequester$2(o oVar) {
        super(3);
        this.f6399a = oVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-307396750);
        o oVar = this.f6399a;
        int i12 = e.f14468d;
        gVar.E(1157296644);
        boolean k = gVar.k(oVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new s0.q(oVar);
            gVar.y(F);
        }
        gVar.P();
        s0.q qVar = (s0.q) F;
        gVar.P();
        return qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
