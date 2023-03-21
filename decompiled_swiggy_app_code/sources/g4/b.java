package g4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d4.i;
import e4.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l4.g;
import l4.p;
import l4.q;
import m4.c;

/* compiled from: SystemJobScheduler */
public class b implements e {

    /* renamed from: e  reason: collision with root package name */
    private static final String f14738e = i.f("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f14739a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f14740b;

    /* renamed from: c  reason: collision with root package name */
    private final e4.i f14741c;

    /* renamed from: d  reason: collision with root package name */
    private final a f14742d;

    public b(Context context, e4.i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void a(Context context) {
        List<JobInfo> g11;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g11 = g(context, jobScheduler)) != null && !g11.isEmpty()) {
            for (JobInfo id2 : g11) {
                c(jobScheduler, id2.getId());
            }
        }
    }

    private static void c(JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable th2) {
            i.c().b(f14738e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i11)}), th2);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g11 = g(context, jobScheduler);
        if (g11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g11) {
            if (str.equals(h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            i.c().b(f14738e, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, e4.i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g11 = g(context, jobScheduler);
        List<String> c11 = iVar.w().K().c();
        boolean z11 = false;
        HashSet hashSet = new HashSet(g11 != null ? g11.size() : 0);
        if (g11 != null && !g11.isEmpty()) {
            for (JobInfo next : g11) {
                String h11 = h(next);
                if (!TextUtils.isEmpty(h11)) {
                    hashSet.add(h11);
                } else {
                    c(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it2 = c11.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains(it2.next())) {
                    i.c().a(f14738e, "Reconciling jobs", new Throwable[0]);
                    z11 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z11) {
            WorkDatabase w11 = iVar.w();
            w11.e();
            try {
                q N = w11.N();
                for (String p11 : c11) {
                    N.p(p11, -1);
                }
                w11.C();
            } finally {
                w11.i();
            }
        }
        return z11;
    }

    public boolean b() {
        return true;
    }

    public void d(String str) {
        List<Integer> f11 = f(this.f14739a, this.f14740b, str);
        if (f11 != null && !f11.isEmpty()) {
            for (Integer intValue : f11) {
                c(this.f14740b, intValue.intValue());
            }
            this.f14741c.w().K().d(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public void e(p... pVarArr) {
        int i11;
        List<Integer> f11;
        int i12;
        WorkDatabase w11 = this.f14741c.w();
        c cVar = new c(w11);
        int length = pVarArr.length;
        int i13 = 0;
        while (i13 < length) {
            p pVar = pVarArr[i13];
            w11.e();
            try {
                p m11 = w11.N().m(pVar.f15493a);
                if (m11 == null) {
                    i c11 = i.c();
                    String str = f14738e;
                    c11.h(str, "Skipping scheduling " + pVar.f15493a + " because it's no longer in the DB", new Throwable[0]);
                    w11.C();
                } else if (m11.f15494b != WorkInfo.State.ENQUEUED) {
                    i c12 = i.c();
                    String str2 = f14738e;
                    c12.h(str2, "Skipping scheduling " + pVar.f15493a + " because it is no longer enqueued", new Throwable[0]);
                    w11.C();
                } else {
                    g b11 = w11.K().b(pVar.f15493a);
                    if (b11 != null) {
                        i11 = b11.f15472b;
                    } else {
                        i11 = cVar.d(this.f14741c.q().i(), this.f14741c.q().g());
                    }
                    if (b11 == null) {
                        this.f14741c.w().K().a(new g(pVar.f15493a, i11));
                    }
                    j(pVar, i11);
                    if (Build.VERSION.SDK_INT == 23 && (f11 = f(this.f14739a, this.f14740b, pVar.f15493a)) != null) {
                        int indexOf = f11.indexOf(Integer.valueOf(i11));
                        if (indexOf >= 0) {
                            f11.remove(indexOf);
                        }
                        if (!f11.isEmpty()) {
                            i12 = f11.get(0).intValue();
                        } else {
                            i12 = cVar.d(this.f14741c.q().i(), this.f14741c.q().g());
                        }
                        j(pVar, i12);
                    }
                    w11.C();
                }
                w11.i();
                i13++;
            } catch (Throwable th2) {
                w11.i();
                throw th2;
            }
        }
    }

    public void j(p pVar, int i11) {
        JobInfo a11 = this.f14742d.a(pVar, i11);
        i c11 = i.c();
        String str = f14738e;
        c11.a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f15493a, Integer.valueOf(i11)}), new Throwable[0]);
        try {
            if (this.f14740b.schedule(a11) == 0) {
                i.c().h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f15493a}), new Throwable[0]);
                if (pVar.q && pVar.f15506r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.q = false;
                    i.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f15493a}), new Throwable[0]);
                    j(pVar, i11);
                }
            }
        } catch (IllegalStateException e11) {
            List<JobInfo> g11 = g(this.f14739a, this.f14740b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g11 != null ? g11.size() : 0), Integer.valueOf(this.f14741c.w().N().l().size()), Integer.valueOf(this.f14741c.q().h())});
            i.c().b(f14738e, format, new Throwable[0]);
            throw new IllegalStateException(format, e11);
        } catch (Throwable th2) {
            i.c().b(f14738e, String.format("Unable to schedule %s", new Object[]{pVar}), th2);
        }
    }

    public b(Context context, e4.i iVar, JobScheduler jobScheduler, a aVar) {
        this.f14739a = context;
        this.f14741c = iVar;
        this.f14740b = jobScheduler;
        this.f14742d = aVar;
    }
}
