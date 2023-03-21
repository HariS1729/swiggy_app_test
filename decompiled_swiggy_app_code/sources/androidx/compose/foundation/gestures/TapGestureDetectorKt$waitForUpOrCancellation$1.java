package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {262, 277}, m = "waitForUpOrCancellation")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$waitForUpOrCancellation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3621a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3622b;

    /* renamed from: c  reason: collision with root package name */
    int f3623c;

    TapGestureDetectorKt$waitForUpOrCancellation$1(c<? super TapGestureDetectorKt$waitForUpOrCancellation$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f3622b = obj;
        this.f3623c |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.l((f1.d) null, this);
    }
}
