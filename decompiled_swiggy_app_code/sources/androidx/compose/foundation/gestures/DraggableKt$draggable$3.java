package androidx.compose.foundation.gestures;

import defpackage.y1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Draggable.kt */
final class DraggableKt$draggable$3 extends Lambda implements p<g, Integer, y1.m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y1.j f3374a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$draggable$3(y1.j jVar) {
        super(2);
        this.f3374a = jVar;
    }

    public final y1.m a(g gVar, int i11) {
        gVar.E(830271906);
        y1.j jVar = this.f3374a;
        gVar.E(1157296644);
        boolean k = gVar.k(jVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new IgnorePointerDraggableState(jVar);
            gVar.y(F);
        }
        gVar.P();
        IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) F;
        gVar.P();
        return ignorePointerDraggableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((g) obj, ((Number) obj2).intValue());
    }
}
