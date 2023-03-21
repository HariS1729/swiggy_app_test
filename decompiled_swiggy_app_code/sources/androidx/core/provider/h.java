package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor */
class h {

    /* compiled from: RequestExecutor */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f9357a;

        /* renamed from: b  reason: collision with root package name */
        private int f9358b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        /* compiled from: RequestExecutor */
        private static class C0042a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f9359a;

            C0042a(Runnable runnable, String str, int i11) {
                super(runnable, str);
                this.f9359a = i11;
            }

            public void run() {
                Process.setThreadPriority(this.f9359a);
                super.run();
            }
        }

        a(String str, int i11) {
            this.f9357a = str;
            this.f9358b = i11;
        }

        public Thread newThread(Runnable runnable) {
            return new C0042a(runnable, this.f9357a, this.f9358b);
        }
    }

    /* compiled from: RequestExecutor */
    private static class b<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable<T> f9360a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.core.util.a<T> f9361b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f9362c;

        /* compiled from: RequestExecutor */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f9363a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f9364b;

            a(androidx.core.util.a aVar, Object obj) {
                this.f9363a = aVar;
                this.f9364b = obj;
            }

            public void run() {
                this.f9363a.accept(this.f9364b);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f9360a = callable;
            this.f9361b = aVar;
            this.f9362c = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f9360a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f9362c.post(new a(this.f9361b, t));
        }
    }

    static ThreadPoolExecutor a(String str, int i11, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i12, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i11));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i11) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i11, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (InterruptedException e12) {
            throw e12;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
