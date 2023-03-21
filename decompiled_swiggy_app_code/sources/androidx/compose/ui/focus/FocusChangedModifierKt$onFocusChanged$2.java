package androidx.compose.ui.focus;

import bp0.k;
import e0.a1;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import s0.r;

/* compiled from: FocusChangedModifier.kt */
final class FocusChangedModifierKt$onFocusChanged$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<r, k> f6359a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusChangedModifierKt$onFocusChanged$2(l<? super r, k> lVar) {
        super(3);
        this.f6359a = lVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-1741761824);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = j.e((Object) null, (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        final h0 h0Var = (h0) F;
        d.a aVar = d.f16037h0;
        final l<r, k> lVar = this.f6359a;
        d b11 = FocusEventModifierKt.b(aVar, new l<r, k>() {
            public final void a(r rVar) {
                p.j(rVar, "it");
                if (!p.e(h0Var.getValue(), rVar)) {
                    h0Var.setValue(rVar);
                    lVar.invoke(rVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r) obj);
                return k.f22762a;
            }
        });
        gVar.P();
        return b11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
