package androidx.compose.foundation.relocation;

import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import y.b;
import y.e;
import y.f;

/* compiled from: BringIntoViewResponder.kt */
final class BringIntoViewResponderKt$bringIntoViewResponder$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f4155a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderKt$bringIntoViewResponder$2(e eVar) {
        super(3);
        this.f4155a = eVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-852052847);
        b b11 = f.b(gVar, 0);
        gVar.E(1157296644);
        boolean k = gVar.k(b11);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new BringIntoViewResponderModifier(b11);
            gVar.y(F);
        }
        gVar.P();
        BringIntoViewResponderModifier bringIntoViewResponderModifier = (BringIntoViewResponderModifier) F;
        bringIntoViewResponderModifier.m(this.f4155a);
        gVar.P();
        return bringIntoViewResponderModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
