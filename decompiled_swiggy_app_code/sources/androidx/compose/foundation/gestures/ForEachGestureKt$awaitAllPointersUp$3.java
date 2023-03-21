package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {79}, m = "awaitAllPointersUp")
/* compiled from: ForEachGesture.kt */
final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3433a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3434b;

    /* renamed from: c  reason: collision with root package name */
    int f3435c;

    ForEachGestureKt$awaitAllPointersUp$3(c<? super ForEachGestureKt$awaitAllPointersUp$3> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f3434b = obj;
        this.f3435c |= Integer.MIN_VALUE;
        return ForEachGestureKt.b((f1.d) null, this);
    }
}
