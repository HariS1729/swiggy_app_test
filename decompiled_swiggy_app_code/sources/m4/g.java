package m4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f15643a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f15644b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15645c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private volatile Runnable f15646d;

    /* compiled from: SerialExecutor */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final g f15647a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f15648b;

        a(g gVar, Runnable runnable) {
            this.f15647a = gVar;
            this.f15648b = runnable;
        }

        public void run() {
            try {
                this.f15648b.run();
            } finally {
                this.f15647a.b();
            }
        }
    }

    public g(Executor executor) {
        this.f15644b = executor;
    }

    public boolean a() {
        boolean z11;
        synchronized (this.f15645c) {
            z11 = !this.f15643a.isEmpty();
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f15645c) {
            Runnable poll = this.f15643a.poll();
            this.f15646d = poll;
            if (poll != null) {
                this.f15644b.execute(this.f15646d);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f15645c) {
            this.f15643a.add(new a(this, runnable));
            if (this.f15646d == null) {
                b();
            }
        }
    }
}
