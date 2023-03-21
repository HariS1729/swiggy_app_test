package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.b;
import fp0.c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.u0;
import wp0.z;

/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: f  reason: collision with root package name */
    private final z f12270f = p1.b((k1) null, 1, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private final b<ListenableWorker.a> f12271g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineDispatcher f12272h;

    /* compiled from: CoroutineWorker.kt */
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f12273a;

        a(CoroutineWorker coroutineWorker) {
            this.f12273a = coroutineWorker;
        }

        public final void run() {
            if (this.f12273a.A().isCancelled()) {
                k1.a.a(this.f12273a.B(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.j(context, "appContext");
        p.j(workerParameters, "params");
        b<ListenableWorker.a> t = b.t();
        p.i(t, "create()");
        this.f12271g = t;
        t.e(new a(this), i().a());
        this.f12272h = u0.a();
    }

    static /* synthetic */ Object z(CoroutineWorker coroutineWorker, c cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public final b<ListenableWorker.a> A() {
        return this.f12271g;
    }

    public final z B() {
        return this.f12270f;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(d4.c r4, fp0.c<? super bp0.k> r5) {
        /*
            r3 = this;
            com.google.common.util.concurrent.b r4 = r3.o(r4)
            java.lang.String r0 = "setForegroundAsync(foregroundInfo)"
            kotlin.jvm.internal.p.i(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x0014 }
            goto L_0x004a
        L_0x0014:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            throw r4
        L_0x001e:
            wp0.o r0 = new wp0.o
            fp0.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.w()
            d4.h r1 = new d4.h
            r1.<init>(r0, r4)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r4.e(r1, r2)
            androidx.work.ListenableFutureKt$await$2$2 r1 = new androidx.work.ListenableFutureKt$await$2$2
            r1.<init>(r4)
            r0.N(r1)
            java.lang.Object r4 = r0.t()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            if (r4 != r0) goto L_0x004a
            kotlin.coroutines.jvm.internal.f.c(r5)
        L_0x004a:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.d()
            if (r4 != r5) goto L_0x0051
            return r4
        L_0x0051:
            bp0.k r4 = bp0.k.f22762a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.C(d4.c, fp0.c):java.lang.Object");
    }

    public final com.google.common.util.concurrent.b<d4.c> d() {
        z b11 = p1.b((k1) null, 1, (Object) null);
        j0 a11 = k0.a(x().plus(b11));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b11, (b) null, 2, (i) null);
        k1 unused = j.d(a11, (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, (c<? super CoroutineWorker$getForegroundInfoAsync$1>) null), 3, (Object) null);
        return jobListenableFuture;
    }

    public final void n() {
        super.n();
        this.f12271g.cancel(false);
    }

    public final com.google.common.util.concurrent.b<ListenableWorker.a> u() {
        k1 unused = j.d(k0.a(x().plus(this.f12270f)), (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$startWork$1(this, (c<? super CoroutineWorker$startWork$1>) null), 3, (Object) null);
        return this.f12271g;
    }

    public abstract Object w(c<? super ListenableWorker.a> cVar);

    public CoroutineDispatcher x() {
        return this.f12272h;
    }

    public Object y(c<? super d4.c> cVar) {
        return z(this, cVar);
    }
}
