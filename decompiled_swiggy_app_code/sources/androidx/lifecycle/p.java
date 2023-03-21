package androidx.lifecycle;

import wp0.e2;
import wp0.k1;
import wp0.u0;

/* compiled from: Lifecycle.kt */
public final class p {
    public static final LifecycleCoroutineScope a(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.p.j(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.f10621a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, e2.b((k1) null, 1, (Object) null).plus(u0.c().N0()));
        } while (!lifecycle.f10621a.compareAndSet((Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.e();
        return lifecycleCoroutineScopeImpl;
    }
}
