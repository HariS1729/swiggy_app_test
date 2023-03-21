package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.b;

public abstract class Worker extends ListenableWorker {

    /* renamed from: f  reason: collision with root package name */
    b<ListenableWorker.a> f12302f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.f12302f.p(Worker.this.w());
            } catch (Throwable th2) {
                Worker.this.f12302f.q(th2);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final com.google.common.util.concurrent.b<ListenableWorker.a> u() {
        this.f12302f = b.t();
        c().execute(new a());
        return this.f12302f;
    }

    public abstract ListenableWorker.a w();
}
