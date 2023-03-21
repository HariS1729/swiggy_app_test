package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bp0.g;
import kotlin.Result;
import kotlin.jvm.internal.p;
import lp0.a;
import wp0.n;

/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements o {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Lifecycle.State f10705a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Lifecycle f10706b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n<Object> f10707c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<Object> f10708d;

    public void b(r rVar, Lifecycle.Event event) {
        Object obj;
        p.j(rVar, "source");
        p.j(event, "event");
        if (event == Lifecycle.Event.upTo(this.f10705a)) {
            this.f10706b.c(this);
            n<Object> nVar = this.f10707c;
            a<Object> aVar = this.f10708d;
            try {
                Result.a aVar2 = Result.f25582b;
                obj = Result.b(aVar.invoke());
            } catch (Throwable th2) {
                Result.a aVar3 = Result.f25582b;
                obj = Result.b(g.a(th2));
            }
            nVar.resumeWith(obj);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.f10706b.c(this);
            n<Object> nVar2 = this.f10707c;
            Result.a aVar4 = Result.f25582b;
            nVar2.resumeWith(Result.b(g.a(new LifecycleDestroyedException())));
        }
    }
}
