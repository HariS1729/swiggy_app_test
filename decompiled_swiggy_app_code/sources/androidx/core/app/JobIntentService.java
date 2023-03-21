package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.newrelic.agent.android.harvest.HarvestTimer;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: h  reason: collision with root package name */
    static final Object f8961h = new Object();

    /* renamed from: i  reason: collision with root package name */
    static final HashMap<ComponentName, h> f8962i = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    b f8963a;

    /* renamed from: b  reason: collision with root package name */
    h f8964b;

    /* renamed from: c  reason: collision with root package name */
    a f8965c;

    /* renamed from: d  reason: collision with root package name */
    boolean f8966d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f8967e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f8968f = false;

    /* renamed from: g  reason: collision with root package name */
    final ArrayList<d> f8969g;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a11 = JobIntentService.this.a();
                if (a11 == null) {
                    return null;
                }
                JobIntentService.this.g(a11.getIntent());
                a11.a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.i();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    static final class c extends h {

        /* renamed from: d  reason: collision with root package name */
        private final Context f8971d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f8972e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f8973f;

        /* renamed from: g  reason: collision with root package name */
        boolean f8974g;

        /* renamed from: h  reason: collision with root package name */
        boolean f8975h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f8971d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f8972e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f8973f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f8986a);
            if (this.f8971d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f8974g) {
                        this.f8974g = true;
                        if (!this.f8975h) {
                            this.f8972e.acquire(HarvestTimer.DEFAULT_HARVEST_PERIOD);
                        }
                    }
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (this.f8975h) {
                    if (this.f8974g) {
                        this.f8972e.acquire(HarvestTimer.DEFAULT_HARVEST_PERIOD);
                    }
                    this.f8975h = false;
                    this.f8973f.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                if (!this.f8975h) {
                    this.f8975h = true;
                    this.f8973f.acquire(600000);
                    this.f8972e.release();
                }
            }
        }

        public void e() {
            synchronized (this) {
                this.f8974g = false;
            }
        }
    }

    final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final Intent f8976a;

        /* renamed from: b  reason: collision with root package name */
        final int f8977b;

        d(Intent intent, int i11) {
            this.f8976a = intent;
            this.f8977b = i11;
        }

        public void a() {
            JobIntentService.this.stopSelf(this.f8977b);
        }

        public Intent getIntent() {
            return this.f8976a;
        }
    }

    interface e {
        void a();

        Intent getIntent();
    }

    static final class f extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final JobIntentService f8979a;

        /* renamed from: b  reason: collision with root package name */
        final Object f8980b = new Object();

        /* renamed from: c  reason: collision with root package name */
        JobParameters f8981c;

        final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f8982a;

            a(JobWorkItem jobWorkItem) {
                this.f8982a = jobWorkItem;
            }

            public void a() {
                synchronized (f.this.f8980b) {
                    JobParameters jobParameters = f.this.f8981c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f8982a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f8982a.getIntent();
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f8979a = jobIntentService;
        }

        public IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f8979a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.e b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f8980b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f8981c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f8979a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.f.b():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f8981c = jobParameters;
            this.f8979a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b11 = this.f8979a.b();
            synchronized (this.f8980b) {
                this.f8981c = null;
            }
            return b11;
        }
    }

    static final class g extends h {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f8984d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f8985e;

        g(Context context, ComponentName componentName, int i11) {
            super(componentName);
            b(i11);
            this.f8984d = new JobInfo.Builder(i11, this.f8986a).setOverrideDeadline(0).build();
            this.f8985e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        public void a(Intent intent) {
            this.f8985e.enqueue(this.f8984d, new JobWorkItem(intent));
        }
    }

    static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f8986a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8987b;

        /* renamed from: c  reason: collision with root package name */
        int f8988c;

        h(ComponentName componentName) {
            this.f8986a = componentName;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Intent intent);

        /* access modifiers changed from: package-private */
        public void b(int i11) {
            if (!this.f8987b) {
                this.f8987b = true;
                this.f8988c = i11;
            } else if (this.f8988c != i11) {
                throw new IllegalArgumentException("Given job ID " + i11 + " is different than previous " + this.f8988c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8969g = null;
        } else {
            this.f8969g = new ArrayList<>();
        }
    }

    public static void c(Context context, ComponentName componentName, int i11, Intent intent) {
        if (intent != null) {
            synchronized (f8961h) {
                h f11 = f(context, componentName, true, i11);
                f11.b(i11);
                f11.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(Context context, Class<?> cls, int i11, Intent intent) {
        c(context, new ComponentName(context, cls), i11, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z11, int i11) {
        h hVar;
        HashMap<ComponentName, h> hashMap = f8962i;
        h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z11) {
            hVar = new g(context, componentName, i11);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    public e a() {
        b bVar = this.f8963a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f8969g) {
            if (this.f8969g.size() <= 0) {
                return null;
            }
            e remove = this.f8969g.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        a aVar = this.f8965c;
        if (aVar != null) {
            aVar.cancel(this.f8966d);
        }
        this.f8967e = true;
        return h();
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z11) {
        if (this.f8965c == null) {
            this.f8965c = new a();
            h hVar = this.f8964b;
            if (hVar != null && z11) {
                hVar.d();
            }
            this.f8965c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        ArrayList<d> arrayList = this.f8969g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f8965c = null;
                ArrayList<d> arrayList2 = this.f8969g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f8968f) {
                    this.f8964b.c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.f8963a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8963a = new f(this);
            this.f8964b = null;
            return;
        }
        this.f8963a = null;
        this.f8964b = f(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f8969g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f8968f = true;
                this.f8964b.c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i11, int i12) {
        if (this.f8969g == null) {
            return 2;
        }
        this.f8964b.e();
        synchronized (this.f8969g) {
            ArrayList<d> arrayList = this.f8969g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i12));
            e(true);
        }
        return 3;
    }
}
