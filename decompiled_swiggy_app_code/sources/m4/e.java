package m4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import l4.d;
import t3.g;

/* compiled from: PreferenceUtils */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f15641a;

    public e(WorkDatabase workDatabase) {
        this.f15641a = workDatabase;
    }

    public static void b(Context context, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            gVar.l();
            try {
                gVar.z0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                gVar.z0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                gVar.y0();
            } finally {
                gVar.C0();
            }
        }
    }

    public boolean a() {
        Long b11 = this.f15641a.J().b("reschedule_needed");
        return b11 != null && b11.longValue() == 1;
    }

    public void c(boolean z11) {
        this.f15641a.J().a(new d("reschedule_needed", z11));
    }
}
