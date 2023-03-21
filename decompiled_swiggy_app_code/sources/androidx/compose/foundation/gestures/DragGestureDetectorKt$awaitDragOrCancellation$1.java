package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {823}, m = "awaitDragOrCancellation-rnUCldI")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3239a;

    /* renamed from: b  reason: collision with root package name */
    Object f3240b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f3241c;

    /* renamed from: d  reason: collision with root package name */
    int f3242d;

    DragGestureDetectorKt$awaitDragOrCancellation$1(c<? super DragGestureDetectorKt$awaitDragOrCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f3241c = obj;
        this.f3242d |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.c((f1.d) null, 0, this);
    }
}
