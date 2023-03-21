package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bp0.g;
import bp0.k;
import fp0.c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f10629a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f10630b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LifecycleCoroutineScopeImpl f10631c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, c<? super LifecycleCoroutineScopeImpl$register$1> cVar) {
        super(2, cVar);
        this.f10631c = lifecycleCoroutineScopeImpl;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f10631c, cVar);
        lifecycleCoroutineScopeImpl$register$1.f10630b = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f10629a == 0) {
            g.b(obj);
            j0 j0Var = (j0) this.f10630b;
            if (this.f10631c.a().b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                this.f10631c.a().a(this.f10631c);
            } else {
                p1.e(j0Var.X0(), (CancellationException) null, 1, (Object) null);
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
