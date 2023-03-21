package androidx.compose.foundation.gestures;

import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {400, 403}, m = "processDragStop")
/* compiled from: Draggable.kt */
final class DragLogic$processDragStop$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3344a;

    /* renamed from: b  reason: collision with root package name */
    Object f3345b;

    /* renamed from: c  reason: collision with root package name */
    Object f3346c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f3347d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DragLogic f3348e;

    /* renamed from: f  reason: collision with root package name */
    int f3349f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragLogic$processDragStop$1(DragLogic dragLogic, c<? super DragLogic$processDragStop$1> cVar) {
        super(cVar);
        this.f3348e = dragLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3347d = obj;
        this.f3349f |= Integer.MIN_VALUE;
        return this.f3348e.c((j0) null, (y1.g.d) null, this);
    }
}
