package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import bp0.k;
import defpackage.y1;
import e0.d1;
import fp0.c;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: Scrollable.kt */
final class ScrollDraggableState implements y1.m, y1.l {

    /* renamed from: a  reason: collision with root package name */
    private final d1<ScrollingLogic> f3455a;

    /* renamed from: b  reason: collision with root package name */
    private y1.p f3456b = ScrollableKt.f3471a;

    public ScrollDraggableState(d1<ScrollingLogic> d1Var) {
        p.j(d1Var, "scrollLogic");
        this.f3455a = d1Var;
    }

    public Object a(MutatePriority mutatePriority, lp0.p<? super y1.l, ? super c<? super k>, ? extends Object> pVar, c<? super k> cVar) {
        Object c11 = this.f3455a.getValue().d().c(mutatePriority, new ScrollDraggableState$drag$2(this, pVar, (c<? super ScrollDraggableState$drag$2>) null), cVar);
        return c11 == b.d() ? c11 : k.f22762a;
    }

    public void b(float f11, long j) {
        ScrollingLogic value = this.f3455a.getValue();
        value.a(this.f3456b, value.l(f11), f.d(j), e1.c.f14279a.a());
    }

    public final void c(y1.p pVar) {
        p.j(pVar, "<set-?>");
        this.f3456b = pVar;
    }
}
