package androidx.compose.material;

import fp0.c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {159, 183, 186}, m = "processNewAnchors$material_release")
/* compiled from: Swipeable.kt */
final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f5531a;

    /* renamed from: b  reason: collision with root package name */
    Object f5532b;

    /* renamed from: c  reason: collision with root package name */
    float f5533c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f5534d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f5535e;

    /* renamed from: f  reason: collision with root package name */
    int f5536f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, c<? super SwipeableState$processNewAnchors$1> cVar) {
        super(cVar);
        this.f5535e = swipeableState;
    }

    public final Object invokeSuspend(Object obj) {
        this.f5534d = obj;
        this.f5536f |= Integer.MIN_VALUE;
        return this.f5535e.y((Map) null, (Map) null, this);
    }
}
