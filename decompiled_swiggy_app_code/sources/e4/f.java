package e4;

import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import d4.i;
import g4.b;
import java.util.List;
import l4.p;
import l4.q;
import m4.d;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: Schedulers */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14300a = i.f("Schedulers");

    static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            b bVar = new b(context, iVar);
            d.a(context, SystemJobService.class, true);
            i.c().a(f14300a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c11 = c(context);
        if (c11 != null) {
            return c11;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        d.a(context, SystemAlarmService.class, true);
        i.c().a(f14300a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            q N = workDatabase.N();
            workDatabase.e();
            try {
                List<p> r11 = N.r(aVar.h());
                List<p> g11 = N.g(OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT);
                if (r11 != null && r11.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (p pVar : r11) {
                        N.p(pVar.f15493a, currentTimeMillis);
                    }
                }
                workDatabase.C();
                if (r11 != null && r11.size() > 0) {
                    p[] pVarArr = (p[]) r11.toArray(new p[r11.size()]);
                    for (e next : list) {
                        if (next.b()) {
                            next.e(pVarArr);
                        }
                    }
                }
                if (g11 != null && g11.size() > 0) {
                    p[] pVarArr2 = (p[]) g11.toArray(new p[g11.size()]);
                    for (e next2 : list) {
                        if (!next2.b()) {
                            next2.e(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.i();
            }
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            i.c().a(f14300a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th2) {
            i.c().a(f14300a, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}
