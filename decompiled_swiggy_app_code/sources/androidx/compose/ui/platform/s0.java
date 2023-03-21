package androidx.compose.ui.platform;

import e0.a1;
import e0.h0;
import kotlin.coroutines.CoroutineContext;
import lp0.p;
import p0.f;
import p0.g;

/* compiled from: WindowRecomposer.android.kt */
final class s0 implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f7344a = j.e(Float.valueOf(1.0f), (a1) null, 2, (Object) null);

    public void c(float f11) {
        this.f7344a.setValue(Float.valueOf(f11));
    }

    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return g.a.a(this, r11, pVar);
    }

    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return g.a.b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.b getKey() {
        return f.a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return g.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return g.a.d(this, coroutineContext);
    }
}
