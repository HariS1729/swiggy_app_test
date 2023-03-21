package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import fp0.c;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import wp0.k1;
import wp0.u0;

/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Lifecycle f10627a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f10628b;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        p.j(lifecycle, LogCategory.LIFECYCLE);
        p.j(coroutineContext, "coroutineContext");
        this.f10627a = lifecycle;
        this.f10628b = coroutineContext;
        if (a().b() == Lifecycle.State.DESTROYED) {
            p1.e(X0(), (CancellationException) null, 1, (Object) null);
        }
    }

    public CoroutineContext X0() {
        return this.f10628b;
    }

    public Lifecycle a() {
        return this.f10627a;
    }

    public void b(r rVar, Lifecycle.Event event) {
        p.j(rVar, "source");
        p.j(event, "event");
        if (a().b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            a().c(this);
            p1.e(X0(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final void e() {
        k1 unused = j.d(this, u0.c().N0(), (CoroutineStart) null, new LifecycleCoroutineScopeImpl$register$1(this, (c<? super LifecycleCoroutineScopeImpl$register$1>) null), 2, (Object) null);
    }
}
