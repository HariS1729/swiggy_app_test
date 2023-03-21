package androidx.lifecycle;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {79}, m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f10624a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LifecycleCoroutineScope f10625b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<j0, c<? super k>, Object> f10626c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, p<? super j0, ? super c<? super k>, ? extends Object> pVar, c<? super LifecycleCoroutineScope$launchWhenCreated$1> cVar) {
        super(2, cVar);
        this.f10625b = lifecycleCoroutineScope;
        this.f10626c = pVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.f10625b, this.f10626c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f10624a;
        if (i11 == 0) {
            g.b(obj);
            Lifecycle a11 = this.f10625b.a();
            p<j0, c<? super k>, Object> pVar = this.f10626c;
            this.f10624a = 1;
            if (PausingDispatcherKt.a(a11, pVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
