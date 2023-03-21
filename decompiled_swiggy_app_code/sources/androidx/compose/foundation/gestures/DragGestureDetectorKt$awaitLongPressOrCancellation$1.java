package androidx.compose.foundation.gestures;

import f1.d0;
import f1.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {754}, m = "awaitLongPressOrCancellation")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3251a;

    /* renamed from: b  reason: collision with root package name */
    Object f3252b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f3253c;

    /* renamed from: d  reason: collision with root package name */
    int f3254d;

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f3253c = obj;
        this.f3254d |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.e((d0) null, (v) null, this);
    }
}
