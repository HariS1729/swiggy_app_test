package androidx.compose.runtime;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;

@d(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
/* compiled from: PausableMonotonicFrameClock.kt */
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f6017a;

    /* renamed from: b  reason: collision with root package name */
    Object f6018b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f6019c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PausableMonotonicFrameClock f6020d;

    /* renamed from: e  reason: collision with root package name */
    int f6021e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, c<? super PausableMonotonicFrameClock$withFrameNanos$1> cVar) {
        super(cVar);
        this.f6020d = pausableMonotonicFrameClock;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6019c = obj;
        this.f6021e |= Integer.MIN_VALUE;
        return this.f6020d.w0((l) null, this);
    }
}
