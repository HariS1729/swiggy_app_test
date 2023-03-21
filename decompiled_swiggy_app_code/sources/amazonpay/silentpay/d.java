package amazonpay.silentpay;

import amazonpay.silentpay.i;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.api.authorization.e;
import com.amazon.identity.auth.device.api.authorization.f;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
final class d {
    private static final e[] t = {f.a("payments::conduct_silentpay"), f.a("profile:contact")};

    /* renamed from: u  reason: collision with root package name */
    private static WeakReference<d> f1200u = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public static o v;

    /* renamed from: w  reason: collision with root package name */
    private static PackageManager f1201w;

    /* renamed from: x  reason: collision with root package name */
    private static String f1202x;

    /* renamed from: a  reason: collision with root package name */
    private int f1203a;

    /* renamed from: b  reason: collision with root package name */
    private String f1204b;

    /* renamed from: c  reason: collision with root package name */
    private int f1205c;

    /* renamed from: d  reason: collision with root package name */
    private float f1206d;

    /* renamed from: e  reason: collision with root package name */
    private int f1207e;

    /* renamed from: f  reason: collision with root package name */
    private long f1208f;

    /* renamed from: g  reason: collision with root package name */
    private long f1209g;

    /* renamed from: h  reason: collision with root package name */
    private int f1210h;

    /* renamed from: i  reason: collision with root package name */
    private String f1211i;
    private int j;
    private String k;

    /* renamed from: l  reason: collision with root package name */
    private String f1212l;

    /* renamed from: m  reason: collision with root package name */
    private String f1213m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private int f1214o;

    /* renamed from: p  reason: collision with root package name */
    private Region f1215p;
    private e[] q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1216r;

    /* renamed from: s  reason: collision with root package name */
    private List<String> f1217s;

    @Instrumented
    private static class a extends AsyncTask implements TraceFieldInterface {

        /* renamed from: b  reason: collision with root package name */
        private static boolean f1218b = false;

        /* renamed from: a  reason: collision with root package name */
        public Trace f1219a;

        private a() {
        }

        private boolean c() {
            if (!d.v.g("UPDATE_CONFIG_AFTER_MS")) {
                d.v.c("UPDATE_CONFIG_AFTER_MS", 0);
            }
            return d.v.f("UPDATE_CONFIG_AFTER_MS") < System.currentTimeMillis();
        }

        private String d() {
            return d.v.g("CONFIGURATION_URL") ? d.v.a("CONFIGURATION_URL") : "https://amazonpay.amazon.in/getDynamicConfig";
        }

        public void _nr_setTrace(Trace trace) {
            try {
                this.f1219a = trace;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public String a(Void... voidArr) {
            URL url;
            try {
                if (!isCancelled()) {
                    String d11 = d();
                    try {
                        AnonymousClass1 r22 = new HashMap<String, String>() {
                            {
                                put(HttpRequest.HEADER_KEY, "android-silentPay-v2");
                            }
                        };
                        if (d11 != null) {
                            url = new URL(q.b(new URL(d11), r22, (String) null).toString());
                        } else {
                            url = new URL(q.b(new URL("https://amazonpay.amazon.in/getDynamicConfig"), r22, (String) null).toString());
                        }
                    } catch (MalformedURLException e11) {
                        j.e("FetchConfigTask", "Malformed url in background task", e11);
                        n.d(i.a.CONFIG_FETCH_UNSUCCESSFUL);
                        url = null;
                    }
                    if (url != null) {
                        try {
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) URLConnectionInstrumentation.openConnection(url.openConnection());
                            if (httpsURLConnection != null) {
                                int responseCode = httpsURLConnection.getResponseCode();
                                if (responseCode == 200) {
                                    n.d(i.a.CONFIG_FETCH_SUCCESSFUL);
                                    return q.c(httpsURLConnection.getInputStream());
                                }
                                n.d(i.a.CONFIG_FETCH_UNSUCCESSFUL);
                                j.d("FetchConfigTask", String.format("Config endpoint returned non 200 response: %s", new Object[]{String.valueOf(responseCode)}));
                                return null;
                            }
                        } catch (IOException e12) {
                            j.e("FetchConfigTask", "Unable to contact config endpoint", e12);
                            n.d(i.a.CONFIG_FETCH_UNSUCCESSFUL);
                        }
                    }
                }
            } catch (Exception e13) {
                j.e("FetchConfigTask", "Something went wrong while fetching config", e13);
                n.d(i.a.CONFIG_FETCH_UNSUCCESSFUL);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void b(String str) {
            super.onPostExecute(str);
            if (!isCancelled() && str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("UPDATE_CONFIG_AFTER_MS")) {
                        d.v.c("UPDATE_CONFIG_AFTER_MS", System.currentTimeMillis() + jSONObject.getLong("UPDATE_CONFIG_AFTER_MS"));
                    }
                    d.v.d("CONFIGURATION", JSONObjectInstrumentation.toString(jSONObject));
                    d.v.c("UPDATE_CONFIG_AFTER_MS", System.currentTimeMillis() + Long.valueOf(jSONObject.getString("UPDATE_CONFIG_AFTER_MS")).longValue());
                    d.v.d("CONFIGURATION_URL", jSONObject.getString("CONFIGURATION_URL"));
                    f1218b = false;
                } catch (Exception e11) {
                    j.e("FetchConfigTask", "Error while processing dynamic config", e11);
                    n.d(i.a.CONFIG_PROCESSING_ERROR);
                    d.v.b();
                }
            }
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ Object doInBackground(Object[] objArr) {
            try {
                TraceMachine.enterMethod(this.f1219a, "d$a#doInBackground", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "d$a#doInBackground", (ArrayList<String>) null);
            }
            String a11 = a((Void[]) objArr);
            TraceMachine.exitMethod();
            return a11;
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void onPostExecute(Object obj) {
            try {
                TraceMachine.enterMethod(this.f1219a, "d$a#onPostExecute", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "d$a#onPostExecute", (ArrayList<String>) null);
            }
            b((String) obj);
            TraceMachine.exitMethod();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            if (!c() || f1218b) {
                cancel(true);
                f1218b = true;
            }
        }

        /* synthetic */ a(b bVar) {
            this();
        }
    }

    static class b implements X509TrustManager {
    }

    @Instrumented
    private static class c extends AsyncTask implements TraceFieldInterface {

        /* renamed from: a  reason: collision with root package name */
        public Trace f1221a;

        private c() {
        }

        public void _nr_setTrace(Trace trace) {
            try {
                this.f1221a = trace;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public String a(Void... voidArr) {
            try {
                String unused = d.j("in.amazon.mShop.android.shopping");
                try {
                    n.d(i.a.MSHOP_APP_PRESENT);
                } catch (Exception e11) {
                    j.e("MShopAppTask", "Something went wrong", e11);
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused2) {
                n.d(i.a.MSHOP_APP_NOT_PRESENT);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ Object doInBackground(Object[] objArr) {
            try {
                TraceMachine.enterMethod(this.f1221a, "d$b#doInBackground", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "d$b#doInBackground", (ArrayList<String>) null);
            }
            String a11 = a((Void[]) objArr);
            TraceMachine.exitMethod();
            return a11;
        }

        /* synthetic */ c(b bVar) {
            this();
        }
    }

    private d(int i11, String str, int i12, float f11, int i13, long j11, long j12, int i14, String str2, int i15, String str3, String str4, String str5, String str6, int i16, Region region, e[] eVarArr, boolean z11, List<String> list) {
        this.f1203a = i11;
        this.f1204b = str;
        this.f1205c = i12;
        this.f1206d = f11;
        this.f1207e = i13;
        this.f1208f = j11;
        this.f1209g = j12;
        this.f1210h = i14;
        this.f1211i = str2;
        this.j = i15;
        this.k = str3;
        this.f1212l = str4;
        this.f1213m = str5;
        this.n = str6;
        this.f1214o = i16;
        this.f1215p = region;
        this.q = eVarArr;
        this.f1216r = z11;
        this.f1217s = list;
    }

    private static void A() {
        try {
            AsyncTaskInstrumentation.execute(new a((b) null), new Void[0]);
            AsyncTaskInstrumentation.execute(new c((b) null), new Void[0]);
        } catch (Exception e11) {
            j.e("Configuration", "Error while executing background tasks.", e11);
        }
    }

    private static boolean B() {
        return v.g("CONFIGURATION");
    }

    private static d C() {
        j.a("Configuration", "Returning default config");
        return new d(0, "Processing...Please Wait.", e.f1223b, 24.0f, e.f1222a, 1800000, 1000, 3, "https://amazonpay.amazon.in/postRecords", 5, "https://amazonpay.amazon.in/payments/v1/sfa/instrument/AMAZON_PAY_BALANCE/api/balance", "https://amazonpay.amazon.in/customer/CONSENT_TOKEN/info/v1", "https://amazonpay.amazon.in/payments/v1/sfa/instrument/AMAZON_PAY_BALANCE/api/processCharge", "https://amazonpay.amazon.in/payments/v1/api/chargeStatus", 300000, Region.EU, t, false, (List<String>) null);
    }

    private static d D() throws JSONException {
        j.a("Configuration", "Returning cached config");
        JSONObject jSONObject = new JSONObject(v.a("CONFIGURATION"));
        JSONArray d11 = d(jSONObject);
        e[] eVarArr = new e[d11.length()];
        for (int i11 = 0; i11 < d11.length(); i11++) {
            if (d11.getString(i11).equalsIgnoreCase("ProfileScope.profile")) {
                eVarArr[i11] = com.amazon.identity.auth.device.api.authorization.d.a();
            } else {
                eVarArr[i11] = f.a(d11.getString(i11));
            }
        }
        d dVar = r3;
        d dVar2 = new d(Integer.valueOf(jSONObject.getString("MINIMUM_OS_VERSION_FOR_CUSTOM_TAB")).intValue(), jSONObject.getString("TRANSITION_SCREEN_TEXT"), Color.parseColor(jSONObject.getString("TRANSITION_SCREEN_TEXT_COLOR")), Float.valueOf(jSONObject.getString("TRANSITION_SCREEN_TEXT_SIZE")).floatValue(), Color.parseColor(jSONObject.getString("TRANSITION_SCREEN_BACKGROUND_COLOR")), Long.valueOf(jSONObject.getString("PUBLISH_RECORDS_IN_MS")).longValue(), Long.valueOf(jSONObject.getString("MAX_RECORDS_SIZE")).longValue(), Integer.valueOf(jSONObject.getString("PUBLISH_RECORDS_MAX_RETRYS")).intValue(), jSONObject.getString("PUBLISH_RECORDS_ENDPOINT"), Integer.valueOf(jSONObject.getString("PUBLISH_MIN_LOG_LEVEL")).intValue(), jSONObject.getString("BALANCE_ENDPOINT"), jSONObject.getString("CUSTOMER_INFO_ENDPOINT"), jSONObject.getString("PROCESS_CHARGE_ENDPOINT"), jSONObject.getString("CHARGE_STATUS_ENDPOINT"), jSONObject.getInt("APAY_SERVICE_CONNECTION_TIMEOUT"), Region.valueOf(jSONObject.getString("AUTH_REGION")), eVarArr, Boolean.valueOf(jSONObject.getString("RETURN_USER_DATA")).booleanValue(), h(jSONObject));
        return dVar;
    }

    private boolean E() {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = f1201w.queryIntentServices(intent, 0);
        boolean z11 = queryIntentServices != null && !queryIntentServices.isEmpty();
        j.a("Configuration", String.format("isCustomTabSupported: %s", new Object[]{String.valueOf(z11)}));
        return z11;
    }

    private boolean F() {
        boolean z11 = Build.VERSION.SDK_INT >= this.f1203a;
        j.a("Configuration", String.format("isAndroidVersionSupported: %s", new Object[]{String.valueOf(z11)}));
        return z11;
    }

    static d a(Context context) {
        if (f1200u.get() == null) {
            f1200u = new WeakReference<>(f(context));
        }
        return (d) f1200u.get();
    }

    private static JSONArray d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("PROFILE_AUTH_SCOPES");
        JSONArray jSONArray2 = jSONObject.getJSONArray("PAYMENT_AUTH_SCOPES");
        JSONArray jSONArray3 = new JSONArray();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            jSONArray3.put(jSONArray.get(i11));
        }
        for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
            jSONArray3.put(jSONArray2.get(i12));
        }
        return jSONArray3;
    }

    private static d f(Context context) {
        v = new o(context.getSharedPreferences("CONFIG_PREFS", 0));
        f1201w = context.getPackageManager();
        f1202x = context.getPackageName();
        A();
        if (!B()) {
            return C();
        }
        try {
            return D();
        } catch (Exception unused) {
            j.a("Configuration", "unable to fetch cached config.");
            v.b();
            return C();
        }
    }

    private static List<String> h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("PUBLISH_LOGS_FOR_APPS");
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(jSONArray.getString(i11));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static String j(String str) throws PackageManager.NameNotFoundException {
        return f1201w.getPackageInfo(str, 0).versionName;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f1204b;
    }

    /* access modifiers changed from: package-private */
    public String c(String str) {
        return this.f1212l.replace("{customerIdentifier}", str);
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f1205c;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f1206d;
    }

    /* access modifiers changed from: package-private */
    public long k() {
        return this.f1208f;
    }

    /* access modifiers changed from: package-private */
    public long l() {
        return this.f1209g;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f1210h;
    }

    /* access modifiers changed from: package-private */
    public String n() {
        return this.f1211i;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public String p() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public String q() {
        return this.f1213m;
    }

    /* access modifiers changed from: package-private */
    public String r() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.f1214o;
    }

    /* access modifiers changed from: package-private */
    public Region t() {
        return this.f1215p;
    }

    /* access modifiers changed from: package-private */
    public e[] u() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public String v() {
        return f1202x;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.f1216r;
    }

    /* access modifiers changed from: package-private */
    public List<String> x() {
        return this.f1217s;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return E() && F();
    }
}
