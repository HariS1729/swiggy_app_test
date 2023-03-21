package gf0;

import android.content.SharedPreferences;
import ig0.c;

/* compiled from: NPSDataRepository */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f18332a;

    public b(SharedPreferences sharedPreferences) {
        this.f18332a = sharedPreferences;
    }

    public void a(boolean z11) {
        this.f18332a.edit().putBoolean("nps_took_survey", z11).apply();
    }

    public int b() {
        return this.f18332a.getInt("android_survey_question_number", 1);
    }

    public int c() {
        return this.f18332a.getInt("android_nps_local_order_count", 0);
    }

    public boolean d() {
        return this.f18332a.getBoolean("nps_took_survey", false);
    }

    public int e() {
        return this.f18332a.getInt("android_survey_question_number_local", 1);
    }

    public void f(long j) {
        this.f18332a.edit().putLong("nps_survey_took_date", j).apply();
    }

    public boolean g() {
        return c.b("android_show_nps_new", "false", this.f18332a);
    }

    public long h() {
        return this.f18332a.getLong("nps_survey_took_date", 0);
    }

    public void i(int i11) {
        this.f18332a.edit().putInt("android_survey_question_number_local", i11).apply();
    }

    public void j(int i11) {
        this.f18332a.edit().putInt("android_nps_local_order_count", i11).apply();
    }
}
