package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor */
class z0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11693a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f11694b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f11695c;

    /* compiled from: TransactionExecutor */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f11696a;

        a(Runnable runnable) {
            this.f11696a = runnable;
        }

        public void run() {
            try {
                this.f11696a.run();
            } finally {
                z0.this.a();
            }
        }
    }

    z0(Executor executor) {
        this.f11693a = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable poll = this.f11694b.poll();
        this.f11695c = poll;
        if (poll != null) {
            this.f11693a.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f11694b.offer(new a(runnable));
        if (this.f11695c == null) {
            a();
        }
    }
}
