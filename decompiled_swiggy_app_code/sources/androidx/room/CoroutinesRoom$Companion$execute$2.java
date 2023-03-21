package androidx.room;

import bp0.g;
import bp0.k;
import fp0.c;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$execute$2 extends SuspendLambda implements p<j0, c<? super R>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f11485a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Callable<R> f11486b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$2(Callable<R> callable, c<? super CoroutinesRoom$Companion$execute$2> cVar) {
        super(2, cVar);
        this.f11486b = callable;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$2(this.f11486b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super R> cVar) {
        return ((CoroutinesRoom$Companion$execute$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f11485a == 0) {
            g.b(obj);
            return this.f11486b.call();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
