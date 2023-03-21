package amazonpay.silentpay;

import amazonpay.silentpay.APayError;
import amazonpay.silentpay.i;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Handler.Callback f1169a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<c> f1170b = new WeakReference<>((Object) null);

    @Instrumented
    private static class a extends AsyncTask implements TraceFieldInterface {

        /* renamed from: a  reason: collision with root package name */
        private URL f1188a;

        /* renamed from: b  reason: collision with root package name */
        public Trace f1189b;

        private a() {
        }

        private String a(URL url, b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) URLConnectionInstrumentation.openConnection(url.openConnection());
            d(httpURLConnection, bVar.a());
            httpURLConnection.setConnectTimeout(a.f1156b.s());
            if (bVar.f() == C0005c.POST) {
                JSONObject h11 = bVar.h();
                q.e(httpURLConnection, (!(h11 instanceof JSONObject) ? h11.toString() : JSONObjectInstrumentation.toString(h11)).getBytes(), "application/json");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                n.d(i.a.APAY_SERVICE_SUCCESS);
                return q.c(httpURLConnection.getInputStream());
            }
            j.f("APayServiceCall", String.format("received non 200 response code: %s : %s", new Object[]{String.valueOf(responseCode), httpURLConnection.getResponseMessage()}));
            n.d(i.a.APAY_SERVICE_ERROR);
            return null;
        }

        private void d(HttpURLConnection httpURLConnection, Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }

        public void _nr_setTrace(Trace trace) {
            try {
                this.f1189b = trace;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        public String b(b... bVarArr) {
            b bVar = bVarArr[0];
            try {
                URL url = new URL(q.b(new URL(bVar.g()), bVar.d(), bVar.i()).toString());
                this.f1188a = url;
                return a(url, bVar);
            } catch (SocketTimeoutException e11) {
                n.d(i.a.NO_NETWORK_CONNECTIVITY);
                j.g("APayServiceCall", "Timeout while contacting APay endpoint", e11);
                c.g(new APayError(APayError.ErrorType.NETWORK_ERROR, "Timeout while contacting APay endpoint", e11));
                return null;
            } catch (MalformedURLException e12) {
                n.d(i.a.APAY_SERVICE_ERROR);
                j.g("APayServiceCall", "Invalid APay Service endpoint", e12);
                c.g(new APayError(APayError.ErrorType.APAY_ERROR, "Invalid APay Service endpoint", e12));
                return null;
            } catch (IOException e13) {
                n.d(i.a.APAY_SERVICE_ERROR);
                j.g("APayServiceCall", "Unable to contact APay Service endpoint", e13);
                c.g(new APayError(APayError.ErrorType.APAY_SERVICE_ERROR, "Unable to contact APay Service endpoint", e13));
                return null;
            } catch (Exception e14) {
                n.d(i.a.APAY_SERVICE_ERROR);
                j.g("APayServiceCall", "Unexpected error while contacting APay Service", e14);
                c.g(new APayError(APayError.ErrorType.APAY_SERVICE_ERROR, "Unexpected error while contacting APay Service", e14));
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void c(String str) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            if (str != null && str.trim().length() > 0) {
                j.a("APayServiceCall", String.format("received response %s", new Object[]{str}));
                bundle.putString("RESPONSE", str);
                message.setData(bundle);
            }
            c.f1169a.handleMessage(message);
            super.onPostExecute(str);
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ Object doInBackground(Object[] objArr) {
            try {
                TraceMachine.enterMethod(this.f1189b, "c$a#doInBackground", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "c$a#doInBackground", (ArrayList<String>) null);
            }
            String b11 = b((b[]) objArr);
            TraceMachine.exitMethod();
            return b11;
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void onPostExecute(Object obj) {
            try {
                TraceMachine.enterMethod(this.f1189b, "c$a#onPostExecute", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "c$a#onPostExecute", (ArrayList<String>) null);
            }
            c((String) obj);
            TraceMachine.exitMethod();
        }
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f1190a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f1191b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private String f1192c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f1193d;

        /* renamed from: e  reason: collision with root package name */
        private C0005c f1194e;

        /* renamed from: f  reason: collision with root package name */
        private String f1195f;

        b(C0005c cVar, String str) {
            this.f1194e = cVar;
            this.f1195f = str;
        }

        public Map<String, String> a() {
            return this.f1190a;
        }

        /* access modifiers changed from: package-private */
        public void b(Map<String, String> map) {
            this.f1190a = map;
        }

        /* access modifiers changed from: package-private */
        public void c(JSONObject jSONObject) {
            this.f1193d = jSONObject;
        }

        public Map<String, String> d() {
            return this.f1191b;
        }

        /* access modifiers changed from: package-private */
        public void e(Map<String, String> map) {
            this.f1191b = map;
        }

        public C0005c f() {
            return this.f1194e;
        }

        public String g() {
            return this.f1195f;
        }

        public JSONObject h() {
            return this.f1193d;
        }

        public String i() {
            return this.f1192c;
        }
    }

    /* renamed from: amazonpay.silentpay.c$c  reason: collision with other inner class name */
    private enum C0005c {
        GET,
        POST
    }

    private c() {
    }

    static c a() {
        if (f1170b.get() == null) {
            f1170b = new WeakReference<>(new c());
        }
        return (c) f1170b.get();
    }

    private JSONObject b(b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("redirectUrl", String.format("amzn://amazonpay.amazon.in/%s", new Object[]{a.f1156b.v()}));
        jSONObject.put(PaymentConstants.PAYLOAD, bVar.c());
        jSONObject.put(HttpRequest.HEADER_KEY, bVar.d());
        jSONObject.put("iv", bVar.e());
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static void g(APayError aPayError) {
        Message message = new Message();
        Bundle bundle = new Bundle();
        if (aPayError != null) {
            try {
                bundle.putSerializable("APAY_ERROR", aPayError);
            } catch (Exception e11) {
                bundle = new Bundle();
                j.e("APayServiceAccessor", "Exception during error serialization", e11);
            }
        }
        message.setData(bundle);
        f1169a.handleMessage(message);
    }

    /* access modifiers changed from: package-private */
    public void d(String str, b bVar, Handler.Callback callback) {
        f1169a = callback;
        b bVar2 = new b(C0005c.GET, a.f1156b.c(str));
        bVar2.b(new HashMap<String, String>(bVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f1176a;

            {
                this.f1176a = r4;
                put("isSandbox", String.valueOf(r4.b()));
                put("timestamp", String.valueOf(System.currentTimeMillis()));
                put(PaymentConstants.MERCHANT_ID_CAMEL, r4.a());
            }
        });
        bVar2.e(new HashMap<String, String>(bVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f1178a;

            {
                this.f1178a = r3;
                put(PaymentConstants.PAYLOAD, r3.c());
                put(HttpRequest.HEADER_KEY, r3.d());
                put("iv", r3.e());
            }
        });
        AsyncTaskInstrumentation.execute(new a(), bVar2);
    }

    /* access modifiers changed from: package-private */
    public void e(String str, f fVar, Handler.Callback callback) {
        f1169a = callback;
        b bVar = new b(C0005c.GET, a.f1156b.p());
        bVar.b(new HashMap<String, String>(str, fVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1171a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f1172b;

            {
                this.f1171a = r2;
                this.f1172b = r3;
                put("authToken", r2);
                put("isSandbox", String.valueOf(r3.b()));
            }
        });
        bVar.e(new HashMap<String, String>(fVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f1174a;

            {
                this.f1174a = r2;
                put(PaymentConstants.MERCHANT_ID_CAMEL, r2.a());
            }
        });
        AsyncTaskInstrumentation.execute(new a(), bVar);
    }

    /* access modifiers changed from: package-private */
    public void h(String str, b bVar, Handler.Callback callback) {
        f1169a = callback;
        b bVar2 = new b(C0005c.POST, a.f1156b.q());
        bVar2.b(new HashMap<String, String>(str, bVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1180a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f1181b;

            {
                this.f1180a = r2;
                this.f1181b = r3;
                if (r2 != null) {
                    put("authToken", r2);
                }
                put("requestId", r3.f());
                put("isSandbox", String.valueOf(r3.b()));
            }
        });
        try {
            bVar2.c(b(bVar));
            AsyncTaskInstrumentation.execute(new a(), bVar2);
        } catch (JSONException unused) {
            j.f("APayServiceAccessor", "Unable to construct request for process charge");
            g(new APayError(APayError.ErrorType.APAY_ERROR, "Unable to construct request for process charge"));
        }
    }

    /* access modifiers changed from: package-private */
    public void i(String str, b bVar, Handler.Callback callback) {
        f1169a = callback;
        b bVar2 = new b(C0005c.GET, a.f1156b.r());
        bVar2.b(new HashMap<String, String>(str, bVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1183a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f1184b;

            {
                this.f1183a = r2;
                this.f1184b = r3;
                if (r2 != null) {
                    put("authToken", r2);
                }
                put("isMock", String.valueOf(false));
                put("isSandbox", String.valueOf(r3.b()));
            }
        });
        bVar2.e(new HashMap<String, String>(bVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f1186a;

            {
                this.f1186a = r3;
                put(PaymentConstants.PAYLOAD, r3.c());
                put(HttpRequest.HEADER_KEY, r3.d());
                put("iv", r3.e());
            }
        });
        AsyncTaskInstrumentation.execute(new a(), bVar2);
    }
}
