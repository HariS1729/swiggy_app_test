package m4;

import d4.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
public class p {

    /* renamed from: f  reason: collision with root package name */
    private static final String f15684f = i.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f15685a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f15686b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f15687c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f15688d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    final Object f15689e = new Object();

    /* compiled from: WorkTimer */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f15690a = 0;

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f15690a);
            this.f15690a = this.f15690a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    public interface b {
        void b(String str);
    }

    /* compiled from: WorkTimer */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final p f15692a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15693b;

        c(p pVar, String str) {
            this.f15692a = pVar;
            this.f15693b = str;
        }

        public void run() {
            synchronized (this.f15692a.f15689e) {
                if (this.f15692a.f15687c.remove(this.f15693b) != null) {
                    b remove = this.f15692a.f15688d.remove(this.f15693b);
                    if (remove != null) {
                        remove.b(this.f15693b);
                    }
                } else {
                    i.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f15693b}), new Throwable[0]);
                }
            }
        }
    }

    public p() {
        a aVar = new a();
        this.f15685a = aVar;
        this.f15686b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.f15686b.isShutdown()) {
            this.f15686b.shutdownNow();
        }
    }

    public void b(String str, long j, b bVar) {
        synchronized (this.f15689e) {
            i.c().a(f15684f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f15687c.put(str, cVar);
            this.f15688d.put(str, bVar);
            this.f15686b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f15689e) {
            if (this.f15687c.remove(str) != null) {
                i.c().a(f15684f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f15688d.remove(str);
            }
        }
    }
}
