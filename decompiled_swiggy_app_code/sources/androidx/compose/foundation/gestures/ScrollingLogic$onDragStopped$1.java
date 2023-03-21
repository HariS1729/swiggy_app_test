package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {378, 383, 385, 387, 393}, m = "onDragStopped")
/* compiled from: Scrollable.kt */
final class ScrollingLogic$onDragStopped$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3538a;

    /* renamed from: b  reason: collision with root package name */
    Object f3539b;

    /* renamed from: c  reason: collision with root package name */
    float f3540c;

    /* renamed from: d  reason: collision with root package name */
    long f3541d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f3542e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f3543f;

    /* renamed from: g  reason: collision with root package name */
    int f3544g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, c<? super ScrollingLogic$onDragStopped$1> cVar) {
        super(cVar);
        this.f3543f = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3542e = obj;
        this.f3544g |= Integer.MIN_VALUE;
        return this.f3543f.e(0.0f, this);
    }
}
