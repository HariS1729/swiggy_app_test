package androidx.compose.runtime;

import e0.b0;
import e0.c0;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import lp0.l;
import lp0.p;
import wp0.h;
import wp0.u0;

/* compiled from: ActualAndroid.android.kt */
final class SdkStubsFallbackFrameClock implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final SdkStubsFallbackFrameClock f6092a = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
    }

    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return c0.a.a(this, r11, pVar);
    }

    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return c0.a.b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.b getKey() {
        return b0.a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return c0.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return c0.a.d(this, coroutineContext);
    }

    public <R> Object w0(l<? super Long, ? extends R> lVar, c<? super R> cVar) {
        return h.g(u0.c(), new SdkStubsFallbackFrameClock$withFrameNanos$2(lVar, (c<? super SdkStubsFallbackFrameClock$withFrameNanos$2>) null), cVar);
    }
}
