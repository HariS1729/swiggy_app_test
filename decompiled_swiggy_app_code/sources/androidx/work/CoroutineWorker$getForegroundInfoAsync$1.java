package androidx.work;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
/* compiled from: CoroutineWorker.kt */
final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f12274a;

    /* renamed from: b  reason: collision with root package name */
    int f12275b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ JobListenableFuture<d4.c> f12276c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineWorker f12277d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineWorker$getForegroundInfoAsync$1(JobListenableFuture<d4.c> jobListenableFuture, CoroutineWorker coroutineWorker, c<? super CoroutineWorker$getForegroundInfoAsync$1> cVar) {
        super(2, cVar);
        this.f12276c = jobListenableFuture;
        this.f12277d = coroutineWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.f12276c, this.f12277d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        JobListenableFuture<d4.c> jobListenableFuture;
        Object d11 = b.d();
        int i11 = this.f12275b;
        if (i11 == 0) {
            g.b(obj);
            JobListenableFuture<d4.c> jobListenableFuture2 = this.f12276c;
            CoroutineWorker coroutineWorker = this.f12277d;
            this.f12274a = jobListenableFuture2;
            this.f12275b = 1;
            Object y11 = coroutineWorker.y(this);
            if (y11 == d11) {
                return d11;
            }
            jobListenableFuture = jobListenableFuture2;
            obj = y11;
        } else if (i11 == 1) {
            jobListenableFuture = (JobListenableFuture) this.f12274a;
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jobListenableFuture.b(obj);
        return k.f22762a;
    }
}
