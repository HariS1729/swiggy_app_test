package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f10803f;

    /* renamed from: g  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f10804g;

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f10805h;

    /* renamed from: i  reason: collision with root package name */
    private static f f10806i;
    private static volatile Executor j;

    /* renamed from: a  reason: collision with root package name */
    private final g<Params, Result> f10807a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<Result> f10808b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Status f10809c = Status.PENDING;

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f10810d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    final AtomicBoolean f10811e = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f10812a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f10812a.getAndIncrement());
        }
    }

    class b extends g<Params, Result> {
        b() {
        }

        public Result call() throws Exception {
            ModernAsyncTask.this.f10811e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = ModernAsyncTask.this.b(this.f10818a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.l(result);
                return result;
            } catch (Throwable th2) {
                ModernAsyncTask.this.l(result);
                throw th2;
            }
        }
    }

    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                ModernAsyncTask.this.m(get());
            } catch (InterruptedException e11) {
                Log.w("AsyncTask", e11);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (CancellationException unused) {
                ModernAsyncTask.this.m(null);
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10815a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10815a = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10815a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.d.<clinit>():void");
        }
    }

    private static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final ModernAsyncTask f10816a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f10817b;

        e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f10816a = modernAsyncTask;
            this.f10817b = dataArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i11 = message.what;
            if (i11 == 1) {
                eVar.f10816a.d(eVar.f10817b[0]);
            } else if (i11 == 2) {
                eVar.f10816a.k(eVar.f10817b);
            }
        }
    }

    private static abstract class g<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f10818a;

        g() {
        }
    }

    static {
        a aVar = new a();
        f10803f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f10804g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f10805h = threadPoolExecutor;
        j = threadPoolExecutor;
    }

    ModernAsyncTask() {
        b bVar = new b();
        this.f10807a = bVar;
        this.f10808b = new c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (ModernAsyncTask.class) {
            if (f10806i == null) {
                f10806i = new f();
            }
            fVar = f10806i;
        }
        return fVar;
    }

    public final boolean a(boolean z11) {
        this.f10810d.set(true);
        return this.f10808b.cancel(z11);
    }

    /* access modifiers changed from: protected */
    public abstract Result b(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f10809c != Status.PENDING) {
            int i11 = d.f10815a[this.f10809c.ordinal()];
            if (i11 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i11 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f10809c = Status.RUNNING;
            j();
            this.f10807a.f10818a = paramsArr;
            executor.execute(this.f10808b);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f10809c = Status.FINISHED;
    }

    public final boolean f() {
        return this.f10810d.get();
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h(Result result) {
        g();
    }

    /* access modifiers changed from: protected */
    public void i(Result result) {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k(Progress... progressArr) {
    }

    /* access modifiers changed from: package-private */
    public Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    public void m(Result result) {
        if (!this.f10811e.get()) {
            l(result);
        }
    }
}
