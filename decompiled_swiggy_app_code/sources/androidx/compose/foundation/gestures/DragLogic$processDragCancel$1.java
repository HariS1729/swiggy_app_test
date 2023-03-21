package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {408, 411}, m = "processDragCancel")
/* compiled from: Draggable.kt */
final class DragLogic$processDragCancel$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3332a;

    /* renamed from: b  reason: collision with root package name */
    Object f3333b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f3334c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DragLogic f3335d;

    /* renamed from: e  reason: collision with root package name */
    int f3336e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragLogic$processDragCancel$1(DragLogic dragLogic, c<? super DragLogic$processDragCancel$1> cVar) {
        super(cVar);
        this.f3335d = dragLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3334c = obj;
        this.f3336e |= Integer.MIN_VALUE;
        return this.f3335d.a((j0) null, this);
    }
}
