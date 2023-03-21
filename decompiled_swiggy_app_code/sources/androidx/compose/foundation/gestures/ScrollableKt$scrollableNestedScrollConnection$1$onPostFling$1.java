package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {477}, m = "onPostFling-RZ2iAVY")
/* compiled from: Scrollable.kt */
final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    long f3511a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3512b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 f3513c;

    /* renamed from: d  reason: collision with root package name */
    int f3514d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, c<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.f3513c = scrollableKt$scrollableNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3512b = obj;
        this.f3514d |= Integer.MIN_VALUE;
        return this.f3513c.d(0, 0, this);
    }
}
