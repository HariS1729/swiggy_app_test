package w4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AndroidExecutors */
final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f17464b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f17465c;

    /* renamed from: d  reason: collision with root package name */
    static final int f17466d;

    /* renamed from: e  reason: collision with root package name */
    static final int f17467e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f17468a = new b();

    /* compiled from: AndroidExecutors */
    private static class b implements Executor {
        private b() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f17465c = availableProcessors;
        f17466d = availableProcessors + 1;
        f17467e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z11) {
        threadPoolExecutor.allowCoreThreadTimeOut(z11);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f17466d, f17467e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f17464b.f17468a;
    }
}
