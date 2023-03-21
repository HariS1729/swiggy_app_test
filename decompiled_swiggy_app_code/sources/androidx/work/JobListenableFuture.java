package androidx.work;

import bp0.k;
import com.google.common.util.concurrent.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.p;
import lp0.l;
import wp0.k1;

/* compiled from: ListenableFuture.kt */
public final class JobListenableFuture<R> implements b<R> {

    /* renamed from: a  reason: collision with root package name */
    private final k1 f12280a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.b<R> f12281b;

    public JobListenableFuture(k1 k1Var, androidx.work.impl.utils.futures.b<R> bVar) {
        p.j(k1Var, "job");
        p.j(bVar, "underlying");
        this.f12280a = k1Var;
        this.f12281b = bVar;
        k1Var.C(new l<Throwable, k>(this) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JobListenableFuture<R> f12282a;

            {
                this.f12282a = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return k.f22762a;
            }

            public final void invoke(Throwable th2) {
                if (th2 == null) {
                    if (!this.f12282a.f12281b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th2 instanceof CancellationException) {
                    this.f12282a.f12281b.cancel(true);
                } else {
                    androidx.work.impl.utils.futures.b a11 = this.f12282a.f12281b;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    a11.q(th2);
                }
            }
        });
    }

    public final void b(R r11) {
        this.f12281b.p(r11);
    }

    public boolean cancel(boolean z11) {
        return this.f12281b.cancel(z11);
    }

    public void e(Runnable runnable, Executor executor) {
        this.f12281b.e(runnable, executor);
    }

    public R get() {
        return this.f12281b.get();
    }

    public R get(long j, TimeUnit timeUnit) {
        return this.f12281b.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f12281b.isCancelled();
    }

    public boolean isDone() {
        return this.f12281b.isDone();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JobListenableFuture(wp0.k1 r1, androidx.work.impl.utils.futures.b r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.b r2 = androidx.work.impl.utils.futures.b.t()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.p.i(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.JobListenableFuture.<init>(wp0.k1, androidx.work.impl.utils.futures.b, int, kotlin.jvm.internal.i):void");
    }
}
