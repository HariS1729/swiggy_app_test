package androidx.lifecycle;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import lp0.p;
import wp0.j0;
import wp0.k1;

/* compiled from: Lifecycle.kt */
public abstract class LifecycleCoroutineScope implements j0 {
    public abstract Lifecycle a();

    public final k1 c(p<? super j0, ? super c<? super k>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return j.d(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, pVar, (c<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3, (Object) null);
    }
}
