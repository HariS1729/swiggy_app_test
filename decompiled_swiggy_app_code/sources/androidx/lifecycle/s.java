package androidx.lifecycle;

import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: LifecycleOwner.kt */
public final class s {
    public static final LifecycleCoroutineScope a(r rVar) {
        p.j(rVar, "<this>");
        Lifecycle lifecycle = rVar.getLifecycle();
        p.i(lifecycle, LogCategory.LIFECYCLE);
        return p.a(lifecycle);
    }
}
