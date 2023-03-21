package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import d4.e;
import d4.i;
import e4.f;
import e4.h;
import g4.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l4.n;
import l4.p;
import l4.q;

public class ForceStopRunnable implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f12442d = i.f("ForceStopRunnable");

    /* renamed from: e  reason: collision with root package name */
    private static final long f12443e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f12444a;

    /* renamed from: b  reason: collision with root package name */
    private final e4.i f12445b;

    /* renamed from: c  reason: collision with root package name */
    private int f12446c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f12447a = i.f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                i.c().g(f12447a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, e4.i iVar) {
        this.f12444a = context.getApplicationContext();
        this.f12445b = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i11) {
        return PendingIntent.getBroadcast(context, -1, c(context), i11);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d11 = d(context, a.c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f12443e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d11);
        }
    }

    public boolean a() {
        boolean i11 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f12444a, this.f12445b) : false;
        WorkDatabase w11 = this.f12445b.w();
        q N = w11.N();
        n M = w11.M();
        w11.e();
        try {
            List<p> t = N.t();
            boolean z11 = t != null && !t.isEmpty();
            if (z11) {
                for (p next : t) {
                    N.b(WorkInfo.State.ENQUEUED, next.f15493a);
                    N.p(next.f15493a, -1);
                }
            }
            M.c();
            w11.C();
            if (z11 || i11) {
                return true;
            }
            return false;
        } finally {
            w11.i();
        }
    }

    public void b() {
        boolean a11 = a();
        if (h()) {
            i.c().a(f12442d, "Rescheduling Workers.", new Throwable[0]);
            this.f12445b.A();
            this.f12445b.t().c(false);
        } else if (e()) {
            i.c().a(f12442d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f12445b.A();
        } else if (a11) {
            i.c().a(f12442d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f12445b.q(), this.f12445b.w(), this.f12445b.v());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        int i11 = 536870912;
        try {
            if (a.c()) {
                i11 = 570425344;
            }
            PendingIntent d11 = d(this.f12444a, i11);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d11 != null) {
                    d11.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f12444a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i12)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d11 == null) {
                g(this.f12444a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e11) {
            i.c().h(f12442d, "Ignoring exception", e11);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a q = this.f12445b.q();
        if (TextUtils.isEmpty(q.c())) {
            i.c().a(f12442d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b11 = m4.f.b(this.f12444a, q);
        i.c().a(f12442d, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b11)}), new Throwable[0]);
        return b11;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f12445b.t().a();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!f()) {
                this.f12445b.z();
                return;
            }
            while (true) {
                h.e(this.f12444a);
                i.c().a(f12442d, "Performing cleanup operations.", new Throwable[0]);
                b();
                break;
            }
            this.f12445b.z();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e11) {
            int i11 = this.f12446c + 1;
            this.f12446c = i11;
            if (i11 >= 3) {
                i c11 = i.c();
                String str = f12442d;
                c11.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                e d11 = this.f12445b.q().d();
                if (d11 != null) {
                    i.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d11.a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                i.c().a(f12442d, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i11) * 300)}), e11);
                i(((long) this.f12446c) * 300);
            }
        } catch (Throwable th2) {
            this.f12445b.z();
            throw th2;
        }
    }
}
