package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import bp0.k;
import d2.e;
import e0.g;
import e0.u;
import f1.d0;
import fp0.c;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilterKt$pointerInput$4 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f6698a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6699b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<d0, c<? super k>, Object> f6700c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilterKt$pointerInput$4(Object obj, Object obj2, p<? super d0, ? super c<? super k>, ? extends Object> pVar) {
        super(3);
        this.f6698a = obj;
        this.f6699b = obj2;
        this.f6700c = pVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(dVar, "$this$composed");
        gVar.E(1175567217);
        e eVar = (e) gVar.z(CompositionLocalsKt.e());
        n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
        gVar.E(1157296644);
        boolean k = gVar.k(eVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new SuspendingPointerInputFilter(n1Var, eVar);
            gVar.y(F);
        }
        gVar.P();
        SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) F;
        u.c(suspendingPointerInputFilter, this.f6698a, this.f6699b, new SuspendingPointerInputFilterKt$pointerInput$4$2$1(suspendingPointerInputFilter, this.f6700c, (c<? super SuspendingPointerInputFilterKt$pointerInput$4$2$1>) null), gVar, 576);
        gVar.P();
        return suspendingPointerInputFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
