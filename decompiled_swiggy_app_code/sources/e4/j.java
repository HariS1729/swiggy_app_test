package e4;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d4.f;
import d4.i;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l4.p;
import l4.q;
import l4.t;
import m4.d;
import m4.m;
import m4.n;
import m4.o;

/* compiled from: WorkerWrapper */
public class j implements Runnable {
    static final String t = i.f("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    Context f14323a;

    /* renamed from: b  reason: collision with root package name */
    private String f14324b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f14325c;

    /* renamed from: d  reason: collision with root package name */
    private WorkerParameters.a f14326d;

    /* renamed from: e  reason: collision with root package name */
    p f14327e;

    /* renamed from: f  reason: collision with root package name */
    ListenableWorker f14328f;

    /* renamed from: g  reason: collision with root package name */
    n4.a f14329g;

    /* renamed from: h  reason: collision with root package name */
    ListenableWorker.a f14330h = ListenableWorker.a.a();

    /* renamed from: i  reason: collision with root package name */
    private androidx.work.a f14331i;
    private k4.a j;
    private WorkDatabase k;

    /* renamed from: l  reason: collision with root package name */
    private q f14332l;

    /* renamed from: m  reason: collision with root package name */
    private l4.b f14333m;
    private t n;

    /* renamed from: o  reason: collision with root package name */
    private List<String> f14334o;

    /* renamed from: p  reason: collision with root package name */
    private String f14335p;
    androidx.work.impl.utils.futures.b<Boolean> q = androidx.work.impl.utils.futures.b.t();

    /* renamed from: r  reason: collision with root package name */
    com.google.common.util.concurrent.b<ListenableWorker.a> f14336r = null;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f14337s;

    /* compiled from: WorkerWrapper */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.b f14338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.b f14339b;

        a(com.google.common.util.concurrent.b bVar, androidx.work.impl.utils.futures.b bVar2) {
            this.f14338a = bVar;
            this.f14339b = bVar2;
        }

        public void run() {
            try {
                this.f14338a.get();
                i.c().a(j.t, String.format("Starting work for %s", new Object[]{j.this.f14327e.f15495c}), new Throwable[0]);
                j jVar = j.this;
                jVar.f14336r = jVar.f14328f.u();
                this.f14339b.r(j.this.f14336r);
            } catch (Throwable th2) {
                this.f14339b.q(th2);
            }
        }
    }

    /* compiled from: WorkerWrapper */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.b f14341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14342b;

        b(androidx.work.impl.utils.futures.b bVar, String str) {
            this.f14341a = bVar;
            this.f14342b = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f14341a.get();
                if (aVar == null) {
                    i.c().b(j.t, String.format("%s returned a null result. Treating it as a failure.", new Object[]{j.this.f14327e.f15495c}), new Throwable[0]);
                } else {
                    i.c().a(j.t, String.format("%s returned a %s result.", new Object[]{j.this.f14327e.f15495c, aVar}), new Throwable[0]);
                    j.this.f14330h = aVar;
                }
            } catch (CancellationException e11) {
                i.c().d(j.t, String.format("%s was cancelled", new Object[]{this.f14342b}), e11);
            } catch (InterruptedException | ExecutionException e12) {
                i.c().b(j.t, String.format("%s failed because it threw an exception/error", new Object[]{this.f14342b}), e12);
            } catch (Throwable th2) {
                j.this.f();
                throw th2;
            }
            j.this.f();
        }
    }

    /* compiled from: WorkerWrapper */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f14344a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f14345b;

        /* renamed from: c  reason: collision with root package name */
        k4.a f14346c;

        /* renamed from: d  reason: collision with root package name */
        n4.a f14347d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.a f14348e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f14349f;

        /* renamed from: g  reason: collision with root package name */
        String f14350g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f14351h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f14352i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, n4.a aVar2, k4.a aVar3, WorkDatabase workDatabase, String str) {
            this.f14344a = context.getApplicationContext();
            this.f14347d = aVar2;
            this.f14346c = aVar3;
            this.f14348e = aVar;
            this.f14349f = workDatabase;
            this.f14350g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f14352i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f14351h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f14323a = cVar.f14344a;
        this.f14329g = cVar.f14347d;
        this.j = cVar.f14346c;
        this.f14324b = cVar.f14350g;
        this.f14325c = cVar.f14351h;
        this.f14326d = cVar.f14352i;
        this.f14328f = cVar.f14345b;
        this.f14331i = cVar.f14348e;
        WorkDatabase workDatabase = cVar.f14349f;
        this.k = workDatabase;
        this.f14332l = workDatabase.N();
        this.f14333m = this.k.F();
        this.n = this.k.O();
    }

    private String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f14324b);
        sb2.append(", tags={ ");
        boolean z11 = true;
        for (String next : list) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            i.c().d(t, String.format("Worker result SUCCESS for %s", new Object[]{this.f14335p}), new Throwable[0]);
            if (this.f14327e.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            i.c().d(t, String.format("Worker result RETRY for %s", new Object[]{this.f14335p}), new Throwable[0]);
            g();
        } else {
            i.c().d(t, String.format("Worker result FAILURE for %s", new Object[]{this.f14335p}), new Throwable[0]);
            if (this.f14327e.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f14332l.d(str2) != WorkInfo.State.CANCELLED) {
                this.f14332l.b(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f14333m.a(str2));
        }
    }

    private void g() {
        this.k.e();
        try {
            this.f14332l.b(WorkInfo.State.ENQUEUED, this.f14324b);
            this.f14332l.j(this.f14324b, System.currentTimeMillis());
            this.f14332l.p(this.f14324b, -1);
            this.k.C();
        } finally {
            this.k.i();
            i(true);
        }
    }

    private void h() {
        this.k.e();
        try {
            this.f14332l.j(this.f14324b, System.currentTimeMillis());
            this.f14332l.b(WorkInfo.State.ENQUEUED, this.f14324b);
            this.f14332l.i(this.f14324b);
            this.f14332l.p(this.f14324b, -1);
            this.k.C();
        } finally {
            this.k.i();
            i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    private void i(boolean z11) {
        ListenableWorker listenableWorker;
        this.k.e();
        try {
            if (!this.k.N().h()) {
                d.a(this.f14323a, RescheduleReceiver.class, false);
            }
            if (z11) {
                this.f14332l.b(WorkInfo.State.ENQUEUED, this.f14324b);
                this.f14332l.p(this.f14324b, -1);
            }
            if (!(this.f14327e == null || (listenableWorker = this.f14328f) == null || !listenableWorker.k())) {
                this.j.b(this.f14324b);
            }
            this.k.C();
            this.k.i();
            this.q.p(Boolean.valueOf(z11));
        } catch (Throwable th2) {
            this.k.i();
            throw th2;
        }
    }

    private void j() {
        WorkInfo.State d11 = this.f14332l.d(this.f14324b);
        if (d11 == WorkInfo.State.RUNNING) {
            i.c().a(t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f14324b}), new Throwable[0]);
            i(true);
            return;
        }
        i.c().a(t, String.format("Status for %s is %s; not doing any work", new Object[]{this.f14324b, d11}), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.b b11;
        if (!n()) {
            this.k.e();
            try {
                p m11 = this.f14332l.m(this.f14324b);
                this.f14327e = m11;
                if (m11 == null) {
                    i.c().b(t, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f14324b}), new Throwable[0]);
                    i(false);
                    this.k.C();
                } else if (m11.f15494b != WorkInfo.State.ENQUEUED) {
                    j();
                    this.k.C();
                    i.c().a(t, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f14327e.f15495c}), new Throwable[0]);
                    this.k.i();
                } else {
                    if (m11.d() || this.f14327e.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        p pVar = this.f14327e;
                        if (!(pVar.n == 0) && currentTimeMillis < pVar.a()) {
                            i.c().a(t, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f14327e.f15495c}), new Throwable[0]);
                            i(true);
                            this.k.C();
                            this.k.i();
                            return;
                        }
                    }
                    this.k.C();
                    this.k.i();
                    if (this.f14327e.d()) {
                        b11 = this.f14327e.f15497e;
                    } else {
                        f b12 = this.f14331i.f().b(this.f14327e.f15496d);
                        if (b12 == null) {
                            i.c().b(t, String.format("Could not create Input Merger %s", new Object[]{this.f14327e.f15496d}), new Throwable[0]);
                            l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f14327e.f15497e);
                        arrayList.addAll(this.f14332l.f(this.f14324b));
                        b11 = b12.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f14324b), b11, this.f14334o, this.f14326d, this.f14327e.k, this.f14331i.e(), this.f14329g, this.f14331i.m(), new o(this.k, this.f14329g), new n(this.k, this.j, this.f14329g));
                    if (this.f14328f == null) {
                        this.f14328f = this.f14331i.m().b(this.f14323a, this.f14327e.f15495c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f14328f;
                    if (listenableWorker == null) {
                        i.c().b(t, String.format("Could not create Worker %s", new Object[]{this.f14327e.f15495c}), new Throwable[0]);
                        l();
                    } else if (listenableWorker.m()) {
                        i.c().b(t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f14327e.f15495c}), new Throwable[0]);
                        l();
                    } else {
                        this.f14328f.r();
                        if (!o()) {
                            j();
                        } else if (!n()) {
                            androidx.work.impl.utils.futures.b t11 = androidx.work.impl.utils.futures.b.t();
                            m mVar = new m(this.f14323a, this.f14327e, this.f14328f, workerParameters.b(), this.f14329g);
                            this.f14329g.b().execute(mVar);
                            com.google.common.util.concurrent.b<Void> a11 = mVar.a();
                            a11.e(new a(a11, t11), this.f14329g.b());
                            t11.e(new b(t11, this.f14335p), this.f14329g.a());
                        }
                    }
                }
            } finally {
                this.k.i();
            }
        }
    }

    private void m() {
        this.k.e();
        try {
            this.f14332l.b(WorkInfo.State.SUCCEEDED, this.f14324b);
            this.f14332l.s(this.f14324b, ((ListenableWorker.a.c) this.f14330h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f14333m.a(this.f14324b)) {
                if (this.f14332l.d(next) == WorkInfo.State.BLOCKED && this.f14333m.c(next)) {
                    i.c().d(t, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f14332l.b(WorkInfo.State.ENQUEUED, next);
                    this.f14332l.j(next, currentTimeMillis);
                }
            }
            this.k.C();
        } finally {
            this.k.i();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f14337s) {
            return false;
        }
        i.c().a(t, String.format("Work interrupted for %s", new Object[]{this.f14335p}), new Throwable[0]);
        WorkInfo.State d11 = this.f14332l.d(this.f14324b);
        if (d11 == null) {
            i(false);
        } else {
            i(!d11.isFinished());
        }
        return true;
    }

    private boolean o() {
        this.k.e();
        try {
            boolean z11 = true;
            if (this.f14332l.d(this.f14324b) == WorkInfo.State.ENQUEUED) {
                this.f14332l.b(WorkInfo.State.RUNNING, this.f14324b);
                this.f14332l.v(this.f14324b);
            } else {
                z11 = false;
            }
            this.k.C();
            return z11;
        } finally {
            this.k.i();
        }
    }

    public com.google.common.util.concurrent.b<Boolean> b() {
        return this.q;
    }

    public void d() {
        boolean z11;
        this.f14337s = true;
        n();
        com.google.common.util.concurrent.b<ListenableWorker.a> bVar = this.f14336r;
        if (bVar != null) {
            z11 = bVar.isDone();
            this.f14336r.cancel(true);
        } else {
            z11 = false;
        }
        ListenableWorker listenableWorker = this.f14328f;
        if (listenableWorker == null || z11) {
            i.c().a(t, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f14327e}), new Throwable[0]);
            return;
        }
        listenableWorker.v();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (!n()) {
            this.k.e();
            try {
                WorkInfo.State d11 = this.f14332l.d(this.f14324b);
                this.k.M().a(this.f14324b);
                if (d11 == null) {
                    i(false);
                } else if (d11 == WorkInfo.State.RUNNING) {
                    c(this.f14330h);
                } else if (!d11.isFinished()) {
                    g();
                }
                this.k.C();
            } finally {
                this.k.i();
            }
        }
        List<e> list = this.f14325c;
        if (list != null) {
            for (e d12 : list) {
                d12.d(this.f14324b);
            }
            f.b(this.f14331i, this.k, this.f14325c);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.k.e();
        try {
            e(this.f14324b);
            this.f14332l.s(this.f14324b, ((ListenableWorker.a.C0092a) this.f14330h).e());
            this.k.C();
        } finally {
            this.k.i();
            i(false);
        }
    }

    public void run() {
        List<String> b11 = this.n.b(this.f14324b);
        this.f14334o = b11;
        this.f14335p = a(b11);
        k();
    }
}
