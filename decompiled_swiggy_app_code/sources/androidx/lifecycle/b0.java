package androidx.lifecycle;

import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import wp0.u0;

/* compiled from: PausingDispatcher.kt */
public final class b0 extends CoroutineDispatcher {

    /* renamed from: b  reason: collision with root package name */
    public final f f10716b = new f();

    public void D(CoroutineContext coroutineContext, Runnable runnable) {
        p.j(coroutineContext, LogCategory.CONTEXT);
        p.j(runnable, RenderingDetails.TYPE_BLOCK);
        this.f10716b.c(coroutineContext, runnable);
    }

    public boolean I0(CoroutineContext coroutineContext) {
        p.j(coroutineContext, LogCategory.CONTEXT);
        if (u0.c().N0().I0(coroutineContext)) {
            return true;
        }
        return !this.f10716b.b();
    }
}
