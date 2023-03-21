package androidx.work;

import androidx.work.ListenableWorker;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
/* compiled from: CoroutineWorker.kt */
final class CoroutineWorker$startWork$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f12278a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineWorker f12279b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, c<? super CoroutineWorker$startWork$1> cVar) {
        super(2, cVar);
        this.f12279b = coroutineWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CoroutineWorker$startWork$1(this.f12279b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((CoroutineWorker$startWork$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f12278a;
        if (i11 == 0) {
            g.b(obj);
            CoroutineWorker coroutineWorker = this.f12279b;
            this.f12278a = 1;
            obj = coroutineWorker.w(this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                this.f12279b.A().q(th2);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f12279b.A().p((ListenableWorker.a) obj);
        return k.f22762a;
    }
}
