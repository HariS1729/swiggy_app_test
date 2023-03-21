package androidx.room;

import bp0.g;
import bp0.k;
import fp0.c;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import wp0.n;

@d(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f11489a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Callable<R> f11490b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n<R> f11491c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, n<? super R> nVar, c<? super CoroutinesRoom$Companion$execute$4$job$1> cVar) {
        super(2, cVar);
        this.f11490b = callable;
        this.f11491c = nVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.f11490b, this.f11491c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f11489a == 0) {
            g.b(obj);
            try {
                R call = this.f11490b.call();
                n<R> nVar = this.f11491c;
                Result.a aVar = Result.f25582b;
                nVar.resumeWith(Result.b(call));
            } catch (Throwable th2) {
                n<R> nVar2 = this.f11491c;
                Result.a aVar2 = Result.f25582b;
                nVar2.resumeWith(Result.b(g.a(th2)));
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
