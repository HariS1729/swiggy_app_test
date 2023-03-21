package e4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.R;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.c;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import d4.i;
import d4.m;
import d4.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m4.e;
import m4.h;
import m4.j;
import n4.b;

/* compiled from: WorkManagerImpl */
public class i extends n {
    private static final String j = d4.i.f("WorkManagerImpl");
    private static i k = null;

    /* renamed from: l  reason: collision with root package name */
    private static i f14312l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f14313m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f14314a;

    /* renamed from: b  reason: collision with root package name */
    private a f14315b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f14316c;

    /* renamed from: d  reason: collision with root package name */
    private n4.a f14317d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f14318e;

    /* renamed from: f  reason: collision with root package name */
    private d f14319f;

    /* renamed from: g  reason: collision with root package name */
    private e f14320g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14321h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f14322i;

    public i(Context context, a aVar, n4.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    public static void m(Context context, a aVar) {
        synchronized (f14313m) {
            i iVar = k;
            if (iVar != null) {
                if (f14312l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f14312l == null) {
                    f14312l = new i(applicationContext, aVar, new b(aVar.l()));
                }
                k = f14312l;
            }
        }
    }

    @Deprecated
    public static i r() {
        synchronized (f14313m) {
            i iVar = k;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = f14312l;
            return iVar2;
        }
    }

    public static i s(Context context) {
        i r11;
        synchronized (f14313m) {
            r11 = r();
            if (r11 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof a.c) {
                    m(applicationContext, ((a.c) applicationContext).i());
                    r11 = s(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return r11;
    }

    private void y(Context context, a aVar, n4.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14314a = applicationContext;
        this.f14315b = aVar;
        this.f14317d = aVar2;
        this.f14316c = workDatabase;
        this.f14318e = list;
        this.f14319f = dVar;
        this.f14320g = new e(workDatabase);
        this.f14321h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f14317d.c(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public void A() {
        if (Build.VERSION.SDK_INT >= 23) {
            g4.b.a(p());
        }
        w().N().n();
        f.b(q(), w(), v());
    }

    public void B(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f14313m) {
            this.f14322i = pendingResult;
            if (this.f14321h) {
                pendingResult.finish();
                this.f14322i = null;
            }
        }
    }

    public void C(String str) {
        D(str, (WorkerParameters.a) null);
    }

    public void D(String str, WorkerParameters.a aVar) {
        this.f14317d.c(new h(this, str, aVar));
    }

    public void E(String str) {
        this.f14317d.c(new j(this, str, true));
    }

    public void F(String str) {
        this.f14317d.c(new j(this, str, false));
    }

    public m b(String str, ExistingWorkPolicy existingWorkPolicy, List<c> list) {
        if (!list.isEmpty()) {
            return new g(this, str, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public d4.j c(String str) {
        m4.a d11 = m4.a.d(str, this);
        this.f14317d.c(d11);
        return d11.e();
    }

    public d4.j d(String str) {
        m4.a c11 = m4.a.c(str, this, true);
        this.f14317d.c(c11);
        return c11.e();
    }

    public d4.j e(UUID uuid) {
        m4.a b11 = m4.a.b(uuid, this);
        this.f14317d.c(b11);
        return b11.e();
    }

    public d4.j g(List<? extends androidx.work.e> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public d4.j h(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, d dVar) {
        return o(str, existingPeriodicWorkPolicy, dVar).a();
    }

    public d4.j j(String str, ExistingWorkPolicy existingWorkPolicy, List<c> list) {
        return new g(this, str, existingWorkPolicy, list).a();
    }

    public com.google.common.util.concurrent.b<List<WorkInfo>> l(String str) {
        m4.i<List<WorkInfo>> a11 = m4.i.a(this, str);
        this.f14317d.a().execute(a11);
        return a11.b();
    }

    public List<e> n(Context context, a aVar, n4.a aVar2) {
        return Arrays.asList(new e[]{f.a(context, this), new f4.b(context, aVar, aVar2, this)});
    }

    public g o(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, d dVar) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new g(this, str, existingWorkPolicy, Collections.singletonList(dVar));
    }

    public Context p() {
        return this.f14314a;
    }

    public a q() {
        return this.f14315b;
    }

    public e t() {
        return this.f14320g;
    }

    public d u() {
        return this.f14319f;
    }

    public List<e> v() {
        return this.f14318e;
    }

    public WorkDatabase w() {
        return this.f14316c;
    }

    public n4.a x() {
        return this.f14317d;
    }

    public void z() {
        synchronized (f14313m) {
            this.f14321h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f14322i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f14322i = null;
            }
        }
    }

    public i(Context context, a aVar, n4.a aVar2, boolean z11) {
        this(context, aVar, aVar2, WorkDatabase.E(context.getApplicationContext(), aVar2.a(), z11));
    }

    public i(Context context, a aVar, n4.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        d4.i.e(new i.a(aVar.j()));
        Context context2 = context;
        a aVar3 = aVar;
        n4.a aVar4 = aVar2;
        WorkDatabase workDatabase2 = workDatabase;
        List<e> n = n(applicationContext, aVar, aVar2);
        y(context2, aVar3, aVar4, workDatabase2, n, new d(context2, aVar3, aVar4, workDatabase2, n));
    }
}
