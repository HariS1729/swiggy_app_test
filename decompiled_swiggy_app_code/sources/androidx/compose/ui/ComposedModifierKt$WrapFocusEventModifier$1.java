package androidx.compose.ui;

import bp0.k;
import e0.g;
import e0.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.q;
import s0.c;
import s0.d;

/* compiled from: ComposedModifier.kt */
final class ComposedModifierKt$WrapFocusEventModifier$1 extends Lambda implements q<c, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposedModifierKt$WrapFocusEventModifier$1 f6316a = new ComposedModifierKt$WrapFocusEventModifier$1();

    ComposedModifierKt$WrapFocusEventModifier$1() {
        super(3);
    }

    public final d a(c cVar, g gVar, int i11) {
        p.j(cVar, "mod");
        gVar.E(-1790596922);
        gVar.E(1157296644);
        boolean k = gVar.k(cVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new d(new ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(cVar));
            gVar.y(F);
        }
        gVar.P();
        final d dVar = (d) F;
        u.g(new a<k>() {
            public final void invoke() {
                dVar.e();
            }
        }, gVar, 0);
        gVar.P();
        return dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((c) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
