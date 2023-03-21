package androidx.compose.foundation.gestures;

import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {390, 393, 395}, m = "processDragStart")
/* compiled from: Draggable.kt */
final class DragLogic$processDragStart$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3337a;

    /* renamed from: b  reason: collision with root package name */
    Object f3338b;

    /* renamed from: c  reason: collision with root package name */
    Object f3339c;

    /* renamed from: d  reason: collision with root package name */
    Object f3340d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f3341e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DragLogic f3342f;

    /* renamed from: g  reason: collision with root package name */
    int f3343g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragLogic$processDragStart$1(DragLogic dragLogic, c<? super DragLogic$processDragStart$1> cVar) {
        super(cVar);
        this.f3342f = dragLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3341e = obj;
        this.f3343g |= Integer.MIN_VALUE;
        return this.f3342f.b((j0) null, (y1.g.c) null, this);
    }
}
