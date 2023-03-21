package androidx.compose.foundation;

import bp0.k;
import e0.g;
import i1.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;

/* compiled from: FocusedBounds.kt */
final class FocusedBoundsKt$onFocusedBoundsChanged$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<m, k> f3007a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusedBoundsKt$onFocusedBoundsChanged$2(l<? super m, k> lVar) {
        super(3);
        this.f3007a = lVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(1176407768);
        l<m, k> lVar = this.f3007a;
        gVar.E(1157296644);
        boolean k = gVar.k(lVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new e(lVar);
            gVar.y(F);
        }
        gVar.P();
        e eVar = (e) F;
        gVar.P();
        return eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
