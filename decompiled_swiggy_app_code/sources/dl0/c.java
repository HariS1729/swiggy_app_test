package dl0;

import android.content.SharedPreferences;
import com.newrelic.agent.android.instrumentation.Instrumented;
import ef0.f;
import java.util.List;
import kotlin.jvm.internal.p;
import os.d0;
import os.f0;

@Instrumented
/* compiled from: TrackUtils.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f20108a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final int f20109b = 8;

    private c() {
    }

    public static final boolean b(String str) {
        p.j(str, "url");
        f0 f0Var = new f0(str);
        String d11 = f0Var.d();
        List<String> f11 = f0Var.f();
        if (!d0.e(d11) && p.e(d11, "stores")) {
            return true;
        }
        if (f11.size() < 1 || !StringsKt__StringsKt.S(f11.get(0), "stores", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    public static final boolean c(f fVar) {
        p.j(fVar, "xpExperimentContext");
        return js.c.p(fVar.u0("track_v3_share_location", "false"), false);
    }

    public final int a(SharedPreferences sharedPreferences) {
        p.j(sharedPreferences, "sharedPreferences");
        String string = sharedPreferences.getString("swiggy_track_order_de_and_customer_distance", "30000");
        if (string == null) {
            string = "";
        }
        return js.c.v(string, 0, 1, (Object) null);
    }
}
