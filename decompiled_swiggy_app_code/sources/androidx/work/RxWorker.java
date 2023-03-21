package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.b;
import ao0.r;
import ao0.s;
import ao0.t;
import java.util.concurrent.Executor;
import m4.k;

public abstract class RxWorker extends ListenableWorker {

    /* renamed from: g  reason: collision with root package name */
    static final Executor f12291g = new k();

    /* renamed from: f  reason: collision with root package name */
    private a<ListenableWorker.a> f12292f;

    static class a<T> implements t<T>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b<T> f12293a;

        /* renamed from: b  reason: collision with root package name */
        private eo0.b f12294b;

        a() {
            b<T> t = b.t();
            this.f12293a = t;
            t.e(this, RxWorker.f12291g);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            eo0.b bVar = this.f12294b;
            if (bVar != null) {
                bVar.dispose();
            }
        }

        public void onError(Throwable th2) {
            this.f12293a.q(th2);
        }

        public void onSubscribe(eo0.b bVar) {
            this.f12294b = bVar;
        }

        public void onSuccess(T t) {
            this.f12293a.p(t);
        }

        public void run() {
            if (this.f12293a.isCancelled()) {
                a();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public void n() {
        super.n();
        a<ListenableWorker.a> aVar = this.f12292f;
        if (aVar != null) {
            aVar.a();
            this.f12292f = null;
        }
    }

    public com.google.common.util.concurrent.b<ListenableWorker.a> u() {
        this.f12292f = new a<>();
        w().x(x()).o(wo0.a.b(i().a())).a(this.f12292f);
        return this.f12292f.f12293a;
    }

    public abstract s<ListenableWorker.a> w();

    /* access modifiers changed from: protected */
    public r x() {
        return wo0.a.b(c());
    }
}
