package m4;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import d4.c;
import d4.d;
import d4.i;
import l4.p;

/* compiled from: WorkForegroundRunnable */
public class m implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    static final String f15661g = i.f("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    final androidx.work.impl.utils.futures.b<Void> f15662a = androidx.work.impl.utils.futures.b.t();

    /* renamed from: b  reason: collision with root package name */
    final Context f15663b;

    /* renamed from: c  reason: collision with root package name */
    final p f15664c;

    /* renamed from: d  reason: collision with root package name */
    final ListenableWorker f15665d;

    /* renamed from: e  reason: collision with root package name */
    final d f15666e;

    /* renamed from: f  reason: collision with root package name */
    final n4.a f15667f;

    /* compiled from: WorkForegroundRunnable */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.b f15668a;

        a(androidx.work.impl.utils.futures.b bVar) {
            this.f15668a = bVar;
        }

        public void run() {
            this.f15668a.r(m.this.f15665d.d());
        }
    }

    /* compiled from: WorkForegroundRunnable */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.b f15670a;

        b(androidx.work.impl.utils.futures.b bVar) {
            this.f15670a = bVar;
        }

        public void run() {
            try {
                c cVar = (c) this.f15670a.get();
                if (cVar != null) {
                    i.c().a(m.f15661g, String.format("Updating notification for %s", new Object[]{m.this.f15664c.f15495c}), new Throwable[0]);
                    m.this.f15665d.q(true);
                    m mVar = m.this;
                    mVar.f15662a.r(mVar.f15666e.a(mVar.f15663b, mVar.f15665d.e(), cVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{m.this.f15664c.f15495c}));
            } catch (Throwable th2) {
                m.this.f15662a.q(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public m(Context context, p pVar, ListenableWorker listenableWorker, d dVar, n4.a aVar) {
        this.f15663b = context;
        this.f15664c = pVar;
        this.f15665d = listenableWorker;
        this.f15666e = dVar;
        this.f15667f = aVar;
    }

    public com.google.common.util.concurrent.b<Void> a() {
        return this.f15662a;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f15664c.q || androidx.core.os.a.c()) {
            this.f15662a.p(null);
            return;
        }
        androidx.work.impl.utils.futures.b t = androidx.work.impl.utils.futures.b.t();
        this.f15667f.b().execute(new a(t));
        t.e(new b(t), this.f15667f.b());
    }
}
