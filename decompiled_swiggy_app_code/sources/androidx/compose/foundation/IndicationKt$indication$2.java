package androidx.compose.foundation;

import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import s.h;
import u.i;

/* compiled from: Indication.kt */
final class IndicationKt$indication$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f3060a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3061b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IndicationKt$indication$2(h hVar, i iVar) {
        super(3);
        this.f3060a = hVar;
        this.f3061b = iVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-353972293);
        h hVar = this.f3060a;
        if (hVar == null) {
            hVar = g.f3191a;
        }
        s.i a11 = hVar.a(this.f3061b, gVar, 0);
        gVar.E(1157296644);
        boolean k = gVar.k(a11);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new f(a11);
            gVar.y(F);
        }
        gVar.P();
        f fVar = (f) F;
        gVar.P();
        return fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
