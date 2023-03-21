package m4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import l4.d;
import t3.g;

/* compiled from: IdGenerator */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f15639a;

    public c(WorkDatabase workDatabase) {
        this.f15639a = workDatabase;
    }

    public static void a(Context context, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i11 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i12 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.l();
            try {
                gVar.z0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                gVar.z0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                sharedPreferences.edit().clear().apply();
                gVar.y0();
            } finally {
                gVar.C0();
            }
        }
    }

    private int c(String str) {
        this.f15639a.e();
        try {
            Long b11 = this.f15639a.J().b(str);
            int i11 = 0;
            int intValue = b11 != null ? b11.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i11 = intValue + 1;
            }
            e(str, i11);
            this.f15639a.C();
            return intValue;
        } finally {
            this.f15639a.i();
        }
    }

    private void e(String str, int i11) {
        this.f15639a.J().a(new d(str, (long) i11));
    }

    public int b() {
        int c11;
        synchronized (c.class) {
            c11 = c("next_alarm_manager_id");
        }
        return c11;
    }

    public int d(int i11, int i12) {
        synchronized (c.class) {
            int c11 = c("next_job_scheduler_id");
            if (c11 >= i11) {
                if (c11 <= i12) {
                    i11 = c11;
                }
            }
            e("next_job_scheduler_id", i11 + 1);
        }
        return i11;
    }
}
