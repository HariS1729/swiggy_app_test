package amazonpay.silentpay;

import amazonpay.silentpay.e;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import com.xiaomi.mipush.sdk.Constants;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.payment.type.PaymentTransactionStatusTypeKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
final class i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static o f1252a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<i> f1253b = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static String f1254c;

    enum a {
        CONFIG_FETCH_SUCCESSFUL("810"),
        CONFIG_FETCH_UNSUCCESSFUL("811"),
        CONFIG_PROCESSING_ERROR("812"),
        PROCEEDING_IN_CUSTOM_TAB("820"),
        PROCEEDING_IN_BROWSER("830"),
        AUTHORIZE_SUCCESS("840"),
        AUTHORIZE_CANCELLED("841"),
        AUTHORIZE_FAILED("842"),
        TOKEN_FETCH_SUCCESSFUL("843"),
        TOKEN_FETCH_FAILED("844"),
        AUTHORIZE_RESPONSE_PARSING_FAILED("845"),
        LOW_MEMORY_FLOW("850"),
        APAY_ACTIVITY_ERROR("851"),
        LAYOUT_ERROR("852"),
        GET_BALANCE_SUCCESSFUL("860"),
        GET_BALANCE_FAILED("861"),
        GET_BALANCE_RESPONSE_PARSING_FAILED("862"),
        PROCESS_CHARGE_SUCCESSFUL("863"),
        PROCESS_CHARGE_FAILED("864"),
        PROCESS_CHARGE_RESPONSE_PARSING_FAILED("865"),
        GET_CHARGE_STATUS_SUCCESSFUL("866"),
        GET_CHARGE_STATUS_FAILED("867"),
        GET_CHARGE_STATUS_RESPONSE_PARSING_FAILED("868"),
        APAY_SERVICE_SUCCESS("870"),
        APAY_SERVICE_ERROR("871"),
        MSHOP_APP_PRESENT("890"),
        MSHOP_APP_NOT_PRESENT("891"),
        DEBUG_MODE("892"),
        NO_NETWORK_CONNECTIVITY("893"),
        INVALID_REQUEST_ID("894"),
        APAY_ERROR_PARSING_FAILED("895"),
        GET_CUSTOMER_INFO_SUCCESSFUL("900"),
        GET_CUSTOMER_INFO_FAILED("901"),
        GET_CUSTOMER_INFO_RESPONSE_PARSING_FAILED("902");
        
        private String I;

        private a(String str) {
            this.I = str;
        }

        public String a() {
            return this.I;
        }
    }

    @Instrumented
    private static class c extends AsyncTask implements TraceFieldInterface {

        /* renamed from: b  reason: collision with root package name */
        private static int f1275b;

        /* renamed from: a  reason: collision with root package name */
        public Trace f1276a;

        private c() {
        }

        private String a() {
            try {
                JSONObject g11 = g();
                if (g11 == null || g11.length() <= 0 || !g11.has(PaymentConstants.PAYLOAD) || g11.get(PaymentConstants.PAYLOAD).toString().length() <= 0) {
                    i.f1252a.c("PUBLISH_IN_MS", System.currentTimeMillis() + a.f1156b.k());
                    return null;
                }
                JSONObject c11 = c(g11);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("data=");
                sb2.append((!(c11 instanceof JSONObject) ? c11.toString() : JSONObjectInstrumentation.toString(c11)).replaceAll("\\\\", ""));
                return sb2.toString();
            } catch (Exception unused) {
                Log.d("RecordPublisher", "Error while building payload for publishing");
                i.m();
                return null;
            }
        }

        private JSONObject c(JSONObject jSONObject) throws IOException, JSONException {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                if (JSONObjectInstrumentation.toString(jSONObject).getBytes().length >= 860) {
                    jSONObject2.put(PaymentConstants.PAYLOAD, URLEncoder.encode(f(JSONObjectInstrumentation.toString(jSONObject)), HttpRequest.CHARSET_UTF8));
                    jSONObject2.put("isCompressed", "true");
                    jSONObject = jSONObject2;
                } else {
                    jSONObject.put("isCompressed", "false");
                }
                jSONObject.put("sdkType", LogSubCategory.LifeCycle.ANDROID);
                jSONObject.put(AnalyticsAttribute.APP_ID_ATTRIBUTE, i.f1254c);
                return jSONObject;
            }
            throw new IllegalArgumentException("appended records were null");
        }

        private void e(String str, JSONObject jSONObject) throws JSONException {
            if (i.f1252a.a(str) == null) {
                return;
            }
            if (jSONObject.has(PaymentConstants.PAYLOAD)) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString(PaymentConstants.PAYLOAD));
                jSONObject.put(PaymentConstants.PAYLOAD, new JSONObject((JSONObjectInstrumentation.toString(jSONObject2) + i.f1252a.a(str)).replaceAll("\\}\\{", Constants.ACCEPT_TIME_SEPARATOR_SP)));
                return;
            }
            jSONObject.put(PaymentConstants.PAYLOAD, i.f1252a.a(str));
        }

        private JSONObject g() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            h(jSONObject);
            if (i.f1252a.g("TIME_RECORDS")) {
                e("TIME_RECORDS", jSONObject);
            }
            if (i.f1252a.g("LOG_RECORDS")) {
                e("LOG_RECORDS", jSONObject);
            }
            return jSONObject;
        }

        private void h(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            for (a aVar : a.values()) {
                if (i.f1252a.g(aVar.name())) {
                    jSONArray.put(new JSONObject(i.f1252a.a(aVar.name())));
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject2.put("events", jSONArray);
                jSONObject.put(PaymentConstants.PAYLOAD, jSONObject2);
            }
        }

        public void _nr_setTrace(Trace trace) {
            try {
                this.f1276a = trace;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public String b(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            try {
                String a11 = a();
                if (a11 == null || a11.length() <= 0) {
                    return null;
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) URLConnectionInstrumentation.openConnection(new URL(a.f1156b.n()).openConnection());
                q.e(httpsURLConnection, a11.getBytes(), "application/x-www-form-urlencoded");
                if (httpsURLConnection.getResponseCode() == 200) {
                    return q.c(httpsURLConnection.getInputStream());
                }
                f1275b++;
                Log.w("RecordPublisher", "Record publishing failed.");
                return null;
            } catch (MalformedURLException e11) {
                f1275b++;
                i.m();
                Log.w("RecordPublisher", "MalformedURL while publishing records", e11);
                return null;
            } catch (IOException e12) {
                f1275b++;
                Log.w("RecordPublisher", "IOException while publishing logs", e12);
                i.m();
                return null;
            } catch (Exception e13) {
                f1275b++;
                i.m();
                Log.w("RecordPublisher", "Something went wrong while publishing records", e13);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void d(String str) {
            super.onPostExecute(str);
            if (!isCancelled() && str != null && str.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("status") || !jSONObject.getString("status").equalsIgnoreCase(PaymentTransactionStatusTypeKt.SUCCESS)) {
                        f1275b++;
                        Log.w("RecordPublisher", "Record publishing failed.");
                        return;
                    }
                    f1275b = 0;
                    i.m();
                    i.f1252a.c("PUBLISH_IN_MS", System.currentTimeMillis() + a.f1156b.k());
                } catch (Exception e11) {
                    Log.w("RecordPublisher", "Error while serializing response", e11);
                    i.m();
                }
            }
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ Object doInBackground(Object[] objArr) {
            try {
                TraceMachine.enterMethod(this.f1276a, "i$b#doInBackground", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "i$b#doInBackground", (ArrayList<String>) null);
            }
            String b11 = b((Void[]) objArr);
            TraceMachine.exitMethod();
            return b11;
        }

        /* access modifiers changed from: package-private */
        public String f(String str) throws IOException {
            if (str == null || str.length() <= 0) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(HttpRequest.CHARSET_UTF8));
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return Base64.encodeToString(byteArray, 2);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void onPostExecute(Object obj) {
            try {
                TraceMachine.enterMethod(this.f1276a, "i$b#onPostExecute", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "i$b#onPostExecute", (ArrayList<String>) null);
            }
            d((String) obj);
            TraceMachine.exitMethod();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            if (f1275b > a.f1156b.m()) {
                cancel(true);
                Log.w("RecordPublisher", "Attempts to publish records exceeded");
                i.m();
                i.f1252a.c("PUBLISH_IN_MS", System.currentTimeMillis() + a.f1156b.k());
            }
        }
    }

    private i(Context context) {
        f1252a = new o(context.getSharedPreferences("RECORDS_PREFS", 0));
        f1254c = context.getPackageName();
        if (!f1252a.g("PUBLISH_IN_MS")) {
            f1252a.c("PUBLISH_IN_MS", System.currentTimeMillis() + a.f1156b.k());
        }
    }

    static i a(Context context) {
        if (f1253b.get() == null) {
            f1253b = new WeakReference<>(new i(context));
        }
        return (i) f1253b.get();
    }

    private JSONObject b(e.a aVar, a aVar2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("op", aVar);
        jSONObject.put("event", aVar2.a());
        jSONObject.put("count", Integer.toString(1));
        return jSONObject;
    }

    private JSONObject c(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String obj = jSONObject.get("count").toString();
        jSONObject.remove("count");
        jSONObject.put("count", Integer.toString(Integer.valueOf(obj).intValue() + 1));
        return jSONObject;
    }

    private JSONObject d(String str, String str2, String str3, Throwable th2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (th2 != null) {
            jSONObject.put("logs", String.format("%s|%s : %s %s", new Object[]{str, str2, str3, th2.toString()}));
        } else {
            jSONObject.put("logs", String.format("%s|%s : %s", new Object[]{str, str2, str3}));
        }
        return jSONObject;
    }

    private String j(String str) {
        if (str != null) {
            return str.substring(1, str.length() - 2).replaceFirst("\"logs\":\"", "");
        }
        return "";
    }

    private JSONObject k(String str, String str2, Throwable th2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (th2 != null) {
            jSONObject.put("logs", String.format("%s : %s %s", new Object[]{str, str2, th2.toString()}));
        } else {
            jSONObject.put("logs", String.format("%s : %s", new Object[]{str, str2}));
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static void m() {
        f1252a.b();
    }

    private boolean n() {
        try {
            if (f1252a.e() > a.f1156b.l() || f1252a.f("PUBLISH_IN_MS") <= System.currentTimeMillis()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            Log.w("RecordAggregator", "error while fetching records size");
            m();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(long j, long j11) {
        if (n()) {
            AsyncTaskInstrumentation.execute(new c(), new Void[0]);
        }
        if (a.f1157c != null) {
            JSONArray jSONArray = new JSONArray();
            try {
                if (f1252a.g("TIME_RECORDS")) {
                    jSONArray = (JSONArray) new JSONObject(f1252a.a("TIME_RECORDS")).get("time");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("op", a.f1157c);
                jSONObject.put("execTime", Long.toString(j11 - j));
                jSONArray.put(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("time", jSONArray);
                f1252a.d("TIME_RECORDS", JSONObjectInstrumentation.toString(jSONObject2));
            } catch (Exception unused) {
                Log.w("RecordAggregator", "problem while publishing time metrics");
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar) {
        JSONObject jSONObject;
        if (n()) {
            AsyncTaskInstrumentation.execute(new c(), new Void[0]);
        }
        if (a.f1157c != null) {
            try {
                if (f1252a.g(aVar.name())) {
                    jSONObject = c(f1252a.a(aVar.name()));
                } else {
                    jSONObject = b(a.f1157c, aVar);
                }
                f1252a.d(aVar.name(), !(jSONObject instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject));
            } catch (Exception unused) {
                Log.w("RecordAggregator", "problem while publishing count metric for event:" + aVar.name());
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(String str, String str2, Throwable th2) {
        JSONObject jSONObject;
        d dVar = a.f1156b;
        if (dVar != null && f1254c != null && dVar.x() != null && a.f1156b.x().contains(f1254c)) {
            String replaceAll = str2.replaceAll("\"", "");
            if (n()) {
                AsyncTaskInstrumentation.execute(new c(), new Void[0]);
            }
            try {
                if (f1252a.g("LOG_RECORDS")) {
                    jSONObject = d(j(f1252a.a("LOG_RECORDS")), str, replaceAll, th2);
                } else {
                    jSONObject = k(str, replaceAll, th2);
                }
                f1252a.d("LOG_RECORDS", !(jSONObject instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject));
            } catch (Exception unused) {
                Log.w("RecordAggregator", "problem while recording logs");
                m();
            }
        }
    }
}
