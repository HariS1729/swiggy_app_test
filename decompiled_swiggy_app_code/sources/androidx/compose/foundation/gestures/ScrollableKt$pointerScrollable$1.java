package androidx.compose.foundation.gestures;

import defpackage.y1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$1 extends Lambda implements p<g, Integer, y1.m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScrollDraggableState f3492a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$pointerScrollable$1(ScrollDraggableState scrollDraggableState) {
        super(2);
        this.f3492a = scrollDraggableState;
    }

    public final y1.m a(g gVar, int i11) {
        gVar.E(498671830);
        ScrollDraggableState scrollDraggableState = this.f3492a;
        gVar.P();
        return scrollDraggableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((g) obj, ((Number) obj2).intValue());
    }
}
