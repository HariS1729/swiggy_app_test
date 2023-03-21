package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import d4.i;
import h4.c;
import h4.d;
import java.util.Collections;
import java.util.List;
import l4.p;

public class ConstraintTrackingWorker extends ListenableWorker implements c {
    private static final String k = i.f("ConstraintTrkngWrkr");

    /* renamed from: f  reason: collision with root package name */
    private WorkerParameters f12475f;

    /* renamed from: g  reason: collision with root package name */
    final Object f12476g = new Object();

    /* renamed from: h  reason: collision with root package name */
    volatile boolean f12477h = false;

    /* renamed from: i  reason: collision with root package name */
    androidx.work.impl.utils.futures.b<ListenableWorker.a> f12478i = androidx.work.impl.utils.futures.b.t();
    private ListenableWorker j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.z();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.b f12480a;

        b(com.google.common.util.concurrent.b bVar) {
            this.f12480a = bVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f12476g) {
                if (ConstraintTrackingWorker.this.f12477h) {
                    ConstraintTrackingWorker.this.y();
                } else {
                    ConstraintTrackingWorker.this.f12478i.r(this.f12480a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f12475f = workerParameters;
    }

    public void a(List<String> list) {
        i.c().a(k, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f12476g) {
            this.f12477h = true;
        }
    }

    public void f(List<String> list) {
    }

    public n4.a i() {
        return e4.i.s(b()).x();
    }

    public boolean k() {
        ListenableWorker listenableWorker = this.j;
        return listenableWorker != null && listenableWorker.k();
    }

    public void n() {
        super.n();
        ListenableWorker listenableWorker = this.j;
        if (listenableWorker != null && !listenableWorker.l()) {
            this.j.v();
        }
    }

    public com.google.common.util.concurrent.b<ListenableWorker.a> u() {
        c().execute(new a());
        return this.f12478i;
    }

    public WorkDatabase w() {
        return e4.i.s(b()).w();
    }

    /* access modifiers changed from: package-private */
    public void x() {
        this.f12478i.p(ListenableWorker.a.a());
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.f12478i.p(ListenableWorker.a.b());
    }

    /* access modifiers changed from: package-private */
    public void z() {
        String k11 = g().k("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(k11)) {
            i.c().b(k, "No worker to delegate to.", new Throwable[0]);
            x();
            return;
        }
        ListenableWorker b11 = j().b(b(), k11, this.f12475f);
        this.j = b11;
        if (b11 == null) {
            i.c().a(k, "No worker to delegate to.", new Throwable[0]);
            x();
            return;
        }
        p m11 = w().N().m(e().toString());
        if (m11 == null) {
            x();
            return;
        }
        d dVar = new d(b(), i(), this);
        dVar.d(Collections.singletonList(m11));
        if (dVar.c(e().toString())) {
            i.c().a(k, String.format("Constraints met for delegate %s", new Object[]{k11}), new Throwable[0]);
            try {
                com.google.common.util.concurrent.b<ListenableWorker.a> u11 = this.j.u();
                u11.e(new b(u11), c());
            } catch (Throwable th2) {
                i c11 = i.c();
                String str = k;
                c11.a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{k11}), th2);
                synchronized (this.f12476g) {
                    if (this.f12477h) {
                        i.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        y();
                    } else {
                        x();
                    }
                }
            }
        } else {
            i.c().a(k, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{k11}), new Throwable[0]);
            y();
        }
    }
}
