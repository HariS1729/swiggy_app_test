package n4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m4.g;

/* compiled from: WorkManagerTaskExecutor */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g f15837a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f15838b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f15839c = new a();

    /* compiled from: WorkManagerTaskExecutor */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f15837a = new g(executor);
    }

    public g a() {
        return this.f15837a;
    }

    public Executor b() {
        return this.f15839c;
    }

    public void c(Runnable runnable) {
        this.f15837a.execute(runnable);
    }

    public void d(Runnable runnable) {
        this.f15838b.post(runnable);
    }
}
