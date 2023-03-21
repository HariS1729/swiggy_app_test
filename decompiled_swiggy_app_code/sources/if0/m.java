package if0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.annotations.SerializedName;
import ef0.f;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: XpExperimentContext.kt */
public class m extends e implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f18407f = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final transient SharedPreferences f18408d;
    @SerializedName("experiments_map")

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f18409e = new LinkedHashMap();

    /* compiled from: XpExperimentContext.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Application application) {
        super(application);
        p.j(application, LogCategory.CONTEXT);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        p.i(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        this.f18408d = defaultSharedPreferences;
        K(application);
    }

    /* access modifiers changed from: private */
    public static final void P(m mVar) {
        p.j(mVar, "this$0");
        m mVar2 = (m) super.u(m.class);
        if (mVar2 != null) {
            mVar.f18409e = mVar2.f18409e;
        }
        mVar.R();
    }

    private final void R() {
        for (Map.Entry next : this.f18409e.entrySet()) {
            String string = this.f18408d.getString(p.s("xp_experiment_", next.getKey()), "");
            if (string == null) {
                string = "";
            }
            if (!string.equals("")) {
                H().put(next.getKey(), string);
            }
        }
    }

    public final Map<String, String> H() {
        return this.f18409e;
    }

    public void K(Context context) {
        p.j(context, LogCategory.CONTEXT);
        Executors.newSingleThreadExecutor().execute(new l(this));
    }

    public void K1(Map<String, String> map) {
        this.f18409e.putAll(map == null ? new LinkedHashMap<>() : map);
        R();
        u.b(k(), map == null ? null : c.c(map));
        a();
    }

    public void T(Map<String, String> map) {
        this.f18409e = map == null ? new LinkedHashMap<>() : map;
        R();
        u.b(k(), map == null ? null : c.c(map));
        a();
    }

    /* access modifiers changed from: protected */
    public String k() {
        return "XpExperimentContext";
    }

    /* access modifiers changed from: protected */
    public Object l() {
        return this;
    }

    /* access modifiers changed from: protected */
    public String p() {
        return "xp_experiment";
    }

    public String u0(String str, String str2) {
        p.j(str, "experimentName");
        p.j(str2, "defaultValue");
        String str3 = this.f18409e.get(str);
        if (str3 != null) {
            return str3;
        }
        String string = this.f18408d.getString(str, str2);
        if (string == null) {
            string = "";
        }
        return string;
    }
}
