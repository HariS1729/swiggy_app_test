package a6;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadExecutor */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final TimeUnit f993b = TimeUnit.SECONDS;

    /* renamed from: c  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f994c = new LinkedBlockingQueue();

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f995d;

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f996a = new ThreadPoolExecutor(3, 5, 120, f993b, f994c);

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f995d == null) {
                f995d = new b();
            }
            bVar = f995d;
        }
        return bVar;
    }

    public Future<?> b(Runnable runnable) {
        return this.f996a.submit(runnable);
    }
}
