package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {327}, m = "tryAwaitRelease")
/* compiled from: TapGestureDetector.kt */
final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3451a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3452b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f3453c;

    /* renamed from: d  reason: collision with root package name */
    int f3454d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, c<? super PressGestureScopeImpl$tryAwaitRelease$1> cVar) {
        super(cVar);
        this.f3453c = pressGestureScopeImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3452b = obj;
        this.f3454d |= Integer.MIN_VALUE;
        return this.f3453c.H(this);
    }
}
