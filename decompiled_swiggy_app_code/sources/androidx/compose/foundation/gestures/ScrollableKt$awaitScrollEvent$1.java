package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {293}, m = "awaitScrollEvent")
/* compiled from: Scrollable.kt */
final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3481a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3482b;

    /* renamed from: c  reason: collision with root package name */
    int f3483c;

    ScrollableKt$awaitScrollEvent$1(c<? super ScrollableKt$awaitScrollEvent$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f3482b = obj;
        this.f3483c |= Integer.MIN_VALUE;
        return ScrollableKt.d((f1.d) null, this);
    }
}
