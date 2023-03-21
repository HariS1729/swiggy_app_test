package androidx.compose.ui.focus;

import bp0.k;
import e0.g;
import e0.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import lp0.q;
import p0.d;
import s0.s;

/* compiled from: FocusModifier.kt */
final class FocusModifierKt$focusTarget$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    public static final FocusModifierKt$focusTarget$2 f6390a = new FocusModifierKt$focusTarget$2();

    FocusModifierKt$focusTarget$2() {
        super(3);
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-326009031);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new FocusModifier(FocusStateImpl.Inactive, (l) null, 2, (i) null);
            gVar.y(F);
        }
        gVar.P();
        final FocusModifier focusModifier = (FocusModifier) F;
        u.g(new a<k>() {
            public final void invoke() {
                s.k(focusModifier);
            }
        }, gVar, 0);
        d b11 = FocusModifierKt.b(dVar, focusModifier);
        gVar.P();
        return b11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
