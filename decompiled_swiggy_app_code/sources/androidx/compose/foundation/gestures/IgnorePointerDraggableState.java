package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.jvm.internal.p;

/* compiled from: Draggable.kt */
final class IgnorePointerDraggableState implements y1.m, y1.l {

    /* renamed from: a  reason: collision with root package name */
    private final y1.j f3441a;

    /* renamed from: b  reason: collision with root package name */
    private y1.h f3442b;

    public IgnorePointerDraggableState(y1.j jVar) {
        p.j(jVar, "origin");
        this.f3441a = jVar;
    }

    public Object a(MutatePriority mutatePriority, lp0.p<? super y1.l, ? super c<? super k>, ? extends Object> pVar, c<? super k> cVar) {
        Object a11 = this.f3441a.a(mutatePriority, new IgnorePointerDraggableState$drag$2(this, pVar, (c<? super IgnorePointerDraggableState$drag$2>) null), cVar);
        return a11 == b.d() ? a11 : k.f22762a;
    }

    public void b(float f11, long j) {
        y1.h hVar = this.f3442b;
        if (hVar != null) {
            hVar.a(f11);
        }
    }

    public final void c(y1.h hVar) {
        this.f3442b = hVar;
    }
}
