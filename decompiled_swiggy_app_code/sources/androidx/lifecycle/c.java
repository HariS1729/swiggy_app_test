package androidx.lifecycle;

import in.juspay.hyper.constants.LogCategory;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import wp0.j0;

/* compiled from: ViewModel.kt */
public final class c implements Closeable, j0 {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f10717a;

    public c(CoroutineContext coroutineContext) {
        p.j(coroutineContext, LogCategory.CONTEXT);
        this.f10717a = coroutineContext;
    }

    public CoroutineContext X0() {
        return this.f10717a;
    }

    public void close() {
        p1.e(X0(), (CancellationException) null, 1, (Object) null);
    }
}
