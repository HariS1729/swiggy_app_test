package androidx.compose.ui;

import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.q;
import s0.p;

/* compiled from: ComposedModifier.kt */
final class ComposedModifierKt$WrapFocusRequesterModifier$1 extends Lambda implements q<p, g, Integer, s0.q> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposedModifierKt$WrapFocusRequesterModifier$1 f6318a = new ComposedModifierKt$WrapFocusRequesterModifier$1();

    ComposedModifierKt$WrapFocusRequesterModifier$1() {
        super(3);
    }

    public final s0.q a(p pVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(pVar, "mod");
        gVar.E(945678692);
        gVar.E(1157296644);
        boolean k = gVar.k(pVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new s0.q(pVar.r());
            gVar.y(F);
        }
        gVar.P();
        s0.q qVar = (s0.q) F;
        gVar.P();
        return qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((p) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
