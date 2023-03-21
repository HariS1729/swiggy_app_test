package w4;

import in.juspay.hyper.constants.LogSubCategory;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: BoltsExecutors */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final b f17469d = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f17470a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f17471b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f17472c;

    /* renamed from: w4.b$b  reason: collision with other inner class name */
    /* compiled from: BoltsExecutors */
    private static class C0205b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f17473a;

        private C0205b() {
            this.f17473a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f17473a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f17473a.remove();
            } else {
                this.f17473a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.f17473a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f17473a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            } else {
                b.a().execute(runnable);
            }
            a();
        }
    }

    private b() {
        this.f17470a = !c() ? Executors.newCachedThreadPool() : a.b();
        this.f17471b = Executors.newSingleThreadScheduledExecutor();
        this.f17472c = new C0205b();
    }

    public static ExecutorService a() {
        return f17469d.f17470a;
    }

    static Executor b() {
        return f17469d.f17472c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(LogSubCategory.LifeCycle.ANDROID);
    }
}
