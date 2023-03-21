package androidx.compose.ui.focus;

import bp0.k;
import e0.g;
import e0.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import lp0.q;
import p0.d;
import s0.r;

/* compiled from: FocusEventModifier.kt */
final class FocusEventModifierKt$onFocusEvent$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<r, k> f6365a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusEventModifierKt$onFocusEvent$2(l<? super r, k> lVar) {
        super(3);
        this.f6365a = lVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(607036704);
        l<r, k> lVar = this.f6365a;
        gVar.E(1157296644);
        boolean k = gVar.k(lVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new s0.d(lVar);
            gVar.y(F);
        }
        gVar.P();
        final s0.d dVar2 = (s0.d) F;
        u.g(new a<k>() {
            public final void invoke() {
                dVar2.e();
            }
        }, gVar, 0);
        gVar.P();
        return dVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
