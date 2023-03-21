package v5;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$FaceMatchMode;
import com.google.gson.Gson;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t5.b;
import w5.n;
import w5.o;
import z5.e;

@Instrumented
/* compiled from: RemoteDataSource */
public class f extends t5.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f17303a = "co.hyperverge.hypersnapsdk.b.g.e";

    /* renamed from: b  reason: collision with root package name */
    private static f f17304b;

    /* compiled from: RemoteDataSource */
    class a implements Callback<ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HVFaceConfig f17306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b.a f17307c;

        a(String str, HVFaceConfig hVFaceConfig, b.a aVar) {
            this.f17305a = str;
            this.f17306b = hVFaceConfig;
            this.f17307c = aVar;
        }

        public void onFailure(Call<ResponseBody> call, Throwable th2) {
            this.f17307c.a(th2.getLocalizedMessage());
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            boolean z11;
            c6.d dVar = new c6.d();
            Headers headers = response.headers();
            JSONObject k = f.this.k(headers, this.f17305a);
            dVar.f12848c = k;
            dVar.b(response.code());
            if (response.isSuccessful()) {
                try {
                    String string = response.body().string();
                    if (p5.a.t().s().isShouldReturnRawResponse()) {
                        k.put("X-HV-Raw-Response", string);
                    }
                    if (f.this.t(this.f17306b.getLivenessEndpoint())) {
                        z11 = g.l(string, headers, this.f17305a);
                    } else {
                        z11 = g.i(string, headers, this.f17305a);
                    }
                    if (z11) {
                        dVar.f12847b = new JSONObject(string);
                    } else {
                        dVar.d("Network tampering detected");
                        dVar.b(18);
                    }
                } catch (JSONException e11) {
                    Log.e(f.f17303a, e11.getMessage());
                    if (n.w().s() != null) {
                        n.w().s().a(e11);
                    }
                } catch (IOException e12) {
                    Log.e(f.f17303a, e12.getMessage());
                    if (n.w().s() != null) {
                        n.w().s().a(e12);
                    }
                }
            }
            if (response.errorBody() != null) {
                try {
                    String string2 = response.errorBody().string();
                    JSONObject jSONObject = new JSONObject(string2);
                    if (p5.a.t().s().isShouldReturnRawResponse()) {
                        k.put("X-HV-Raw-Response", string2);
                    }
                    f.this.m(dVar, new JSONObject(string2));
                    dVar.d(jSONObject.getString("error"));
                } catch (IOException | JSONException e13) {
                    Log.e(f.f17303a, e13.getMessage());
                    if (n.w().s() != null) {
                        n.w().s().a(e13);
                    }
                    dVar.d(e13.getLocalizedMessage());
                }
            }
            try {
                dVar.e(f.this.j(headers));
            } catch (Exception e14) {
                Log.e(f.f17303a, e14.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e14);
                }
            }
            this.f17307c.a((c6.a) dVar);
        }
    }

    /* compiled from: RemoteDataSource */
    class b implements Callback<ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17310b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f17311c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f17312d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f17313e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b6.a f17314f;

        b(String str, String str2, Context context, String str3, p pVar, b6.a aVar) {
            this.f17309a = str;
            this.f17310b = str2;
            this.f17311c = context;
            this.f17312d = str3;
            this.f17313e = pVar;
            this.f17314f = aVar;
        }

        public void onFailure(Call<ResponseBody> call, Throwable th2) {
            HVError hVError;
            String unused = f.f17303a;
            th2.getMessage();
            if (th2.getLocalizedMessage().contains("Certificate pinning")) {
                hVError = new HVError(15, "Secure connection could not be established.");
            } else {
                hVError = new HVError(12, th2.getLocalizedMessage());
            }
            n.w().a(this.f17311c).Q((co.hyperverge.hypersnapsdk.objects.b) null, hVError);
            this.f17314f.f(hVError, (co.hyperverge.hypersnapsdk.objects.b) null);
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            boolean z11;
            Headers headers = response.headers();
            JSONObject k = f.this.k(headers, this.f17309a);
            co.hyperverge.hypersnapsdk.objects.b bVar = new co.hyperverge.hypersnapsdk.objects.b();
            bVar.setApiHeaders(k);
            if (response.isSuccessful()) {
                try {
                    String string = response.body().string();
                    if (p5.a.t().s().isShouldReturnRawResponse()) {
                        k.put("X-HV-Raw-Response", string);
                        bVar.setApiHeaders(k);
                    }
                    if (this.f17310b.contains("apac")) {
                        z11 = g.l(string, headers, this.f17309a);
                    } else {
                        z11 = g.i(string, headers, this.f17309a);
                    }
                    if (z11) {
                        JSONObject jSONObject = new JSONObject(string);
                        bVar.setApiResult(jSONObject);
                        co.hyperverge.hypersnapsdk.objects.b h11 = f.this.g(bVar, jSONObject);
                        n.w().a(this.f17311c).h(h11, this.f17312d, this.f17313e.c().longValue());
                        this.f17314f.f((HVError) null, h11);
                        return;
                    }
                    HVError f11 = f.this.f("Network tampering detected", 18);
                    n.w().a(this.f17311c).Q((co.hyperverge.hypersnapsdk.objects.b) null, f11);
                    this.f17314f.f(f11, bVar);
                } catch (Exception e11) {
                    Log.e(f.f17303a, e11.getMessage());
                    n.w().j(this.f17311c).a(e11);
                    HVError e12 = f.this.e(e11);
                    n.w().a(this.f17311c).Q(bVar, e12);
                    this.f17314f.f(e12, bVar);
                }
            } else {
                try {
                    String string2 = response.errorBody().string();
                    JSONObject jSONObject2 = new JSONObject(string2);
                    co.hyperverge.hypersnapsdk.objects.b h12 = f.this.g(bVar, jSONObject2);
                    if (p5.a.t().s().isShouldReturnRawResponse()) {
                        k.put("X-HV-Raw-Response", string2);
                        h12.setApiHeaders(k);
                    }
                    HVError v = f.this.v(jSONObject2);
                    n.w().a(this.f17311c).Q((co.hyperverge.hypersnapsdk.objects.b) null, v);
                    this.f17314f.f(v, h12);
                } catch (Exception e13) {
                    Log.e(f.f17303a, e13.getMessage());
                    n.w().j(this.f17311c).a(e13);
                    HVError e14 = f.this.e(e13);
                    n.w().a(this.f17311c).Q((co.hyperverge.hypersnapsdk.objects.b) null, e14);
                    this.f17314f.f(e14, bVar);
                }
            }
        }
    }

    /* compiled from: RemoteDataSource */
    class c implements Callback<ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f17318c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HyperSnapParams$FaceMatchMode f17319d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b6.a f17320e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f17321f;

        c(String str, String str2, Context context, HyperSnapParams$FaceMatchMode hyperSnapParams$FaceMatchMode, b6.a aVar, p pVar) {
            this.f17316a = str;
            this.f17317b = str2;
            this.f17318c = context;
            this.f17319d = hyperSnapParams$FaceMatchMode;
            this.f17320e = aVar;
            this.f17321f = pVar;
        }

        public void onFailure(Call<ResponseBody> call, Throwable th2) {
            HVError hVError;
            String unused = f.f17303a;
            th2.getMessage();
            if (th2.getLocalizedMessage().contains("Certificate pinning")) {
                hVError = new HVError(15, "Secure connection error");
            } else {
                hVError = new HVError(12, th2.getLocalizedMessage());
            }
            n.w().a(this.f17318c).I((co.hyperverge.hypersnapsdk.objects.b) null, hVError, this.f17319d.toString());
            this.f17320e.f(hVError, (co.hyperverge.hypersnapsdk.objects.b) null);
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            boolean z11;
            Headers headers = response.headers();
            co.hyperverge.hypersnapsdk.objects.b bVar = new co.hyperverge.hypersnapsdk.objects.b();
            JSONObject k = f.this.k(headers, this.f17316a);
            bVar.setApiHeaders(k);
            if (response.isSuccessful()) {
                try {
                    String string = response.body().string();
                    if (p5.a.t().s().isShouldReturnRawResponse()) {
                        k.put("X-HV-Raw-Response", string);
                        bVar.setApiHeaders(k);
                    }
                    if (f.this.t(this.f17317b)) {
                        z11 = g.l(string, headers, this.f17316a);
                    } else {
                        z11 = g.i(string, headers, this.f17316a);
                    }
                    if (z11) {
                        JSONObject jSONObject = new JSONObject(string);
                        JSONObject jSONObject2 = jSONObject.has("result") ? jSONObject.getJSONObject("result") : null;
                        if (jSONObject2 == null || !jSONObject2.has("error") || !jSONObject2.getString("error").toLowerCase().contains("face not detected")) {
                            bVar.setApiResult(jSONObject);
                            co.hyperverge.hypersnapsdk.objects.b h11 = f.this.g(bVar, jSONObject);
                            n.w().a(this.f17318c).P(h11, this.f17321f.c().longValue());
                            this.f17320e.f((HVError) null, h11);
                            return;
                        }
                        HVError f11 = f.this.f(jSONObject2.getString("error"), 22);
                        n.w().a(this.f17318c).I((co.hyperverge.hypersnapsdk.objects.b) null, f11, this.f17319d.toString());
                        this.f17320e.f(f11, bVar);
                        return;
                    }
                    n.w().a(this.f17318c).I((co.hyperverge.hypersnapsdk.objects.b) null, f.this.f("Network tampering detected", 18), this.f17319d.toString());
                    this.f17320e.f(f.this.f("Network tampering detected", 18), bVar);
                } catch (Exception e11) {
                    f.this.s(e11);
                    n.w().j(this.f17318c).a(e11);
                    HVError e12 = f.this.e(e11);
                    n.w().a(this.f17318c).I(bVar, e12, this.f17319d.toString());
                    this.f17320e.f(e12, bVar);
                }
            } else {
                try {
                    String string2 = response.errorBody().string();
                    JSONObject jSONObject3 = new JSONObject(string2);
                    if (p5.a.t().s().isShouldReturnRawResponse()) {
                        k.put("X-HV-Raw-Response", string2);
                        bVar.setApiHeaders(k);
                    }
                    co.hyperverge.hypersnapsdk.objects.b h12 = f.this.g(bVar, jSONObject3);
                    HVError v = f.this.v(jSONObject3);
                    n.w().a(this.f17318c).I((co.hyperverge.hypersnapsdk.objects.b) null, v, this.f17319d.toString());
                    this.f17320e.f(v, h12);
                } catch (Exception e13) {
                    Log.e(f.f17303a, e13.getMessage());
                    n.w().j(this.f17318c).a(e13);
                    HVError e14 = f.this.e(e13);
                    n.w().a(this.f17318c).I((co.hyperverge.hypersnapsdk.objects.b) null, e14, this.f17319d.toString());
                    this.f17320e.f(e14, bVar);
                }
            }
        }
    }

    /* compiled from: RemoteDataSource */
    class d implements Callback<ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b6.a f17323a;

        d(b6.a aVar) {
            this.f17323a = aVar;
        }

        public void onFailure(Call<ResponseBody> call, Throwable th2) {
            String unused = f.f17303a;
            th2.getMessage();
            n.w().s().a(th2);
            this.f17323a.f(new HVError(12, th2.getLocalizedMessage()), (co.hyperverge.hypersnapsdk.objects.b) null);
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            JSONObject k = f.this.k(response.headers(), (String) null);
            co.hyperverge.hypersnapsdk.objects.b bVar = new co.hyperverge.hypersnapsdk.objects.b();
            bVar.setApiHeaders(k);
            if (response.isSuccessful()) {
                try {
                    bVar.setApiResult(new JSONObject(response.body().string()));
                    this.f17323a.f((HVError) null, bVar);
                } catch (Exception e11) {
                    Log.e(f.f17303a, e11.getMessage());
                    this.f17323a.f(f.this.e(e11), bVar);
                }
            } else {
                try {
                    this.f17323a.f(f.this.v(new JSONObject(response.errorBody().string())), bVar);
                } catch (Exception e12) {
                    Log.e(f.f17303a, e12.getMessage());
                    n.w().s().a(e12);
                    this.f17323a.f(f.this.e(e12), bVar);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public co.hyperverge.hypersnapsdk.objects.b g(co.hyperverge.hypersnapsdk.objects.b bVar, JSONObject jSONObject) {
        try {
            if (jSONObject.has("result")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (jSONObject2.has(RenderingDetails.TYPE_SUMMARY)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(RenderingDetails.TYPE_SUMMARY);
                    String string = jSONObject3.getString(LogCategory.ACTION);
                    String string2 = jSONObject3.has("retakeMessage") ? jSONObject3.getString("retakeMessage") : "Some issue with the image capture. Please try again.";
                    bVar.setAction(string);
                    bVar.setRetakeMessage(string2);
                    bVar.setApiResult(jSONObject);
                }
            }
        } catch (Exception e11) {
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public void m(c6.d dVar, JSONObject jSONObject) {
        try {
            if (jSONObject.has("result") && jSONObject.getJSONObject("result").has(RenderingDetails.TYPE_SUMMARY)) {
                dVar.f12847b = jSONObject;
            }
        } catch (JSONException e11) {
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    private boolean p(String str) {
        return !e.a(str) && (str.contains("/v1.1/readNID") || str.contains("/v2/nationalID"));
    }

    public static f r() {
        if (f17304b == null) {
            f17304b = new f();
        }
        return f17304b;
    }

    /* access modifiers changed from: private */
    public void s(Exception exc) {
        try {
            if (!TextUtils.isEmpty(exc.getMessage())) {
                Log.e(f17303a, exc.getMessage());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public boolean t(String str) {
        return str.contains("apac") || str.contains("zaf");
    }

    public static boolean u(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("dataLogging")) {
            return false;
        }
        try {
            return jSONObject.getString("dataLogging").equals("yes");
        } catch (JSONException e11) {
            if (n.w().s() == null) {
                return false;
            }
            n.w().s().a(e11);
            return false;
        }
    }

    public void a(Context context, String str, String str2, String str3, HVDocConfig hVDocConfig, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        String str4;
        String str5;
        MultipartBody.Part part;
        Call<ResponseBody> call;
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        b6.a aVar2 = aVar;
        if (aVar2 != null) {
            if (context2 == null) {
                aVar2.f(new HVError(6, "Context object is null"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (str7 == null || str2.trim().isEmpty() || !new File(str7).exists()) {
                aVar2.f(new HVError(6, "Document file path is null"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else {
                File file = new File(str7);
                if (str7.contains(".pdf")) {
                    str5 = "application/pdf";
                    str4 = "pdf";
                } else {
                    str4 = "image";
                    str5 = "image/jpeg";
                }
                MultipartBody.Part createFormData = MultipartBody.Part.createFormData(str4, file.getName(), RequestBody.create(MediaType.parse(str5), file));
                if (hVDocConfig == null || !hVDocConfig.isShouldReadQR() || e.a(str3)) {
                    part = null;
                } else {
                    File file2 = new File(str3);
                    part = MultipartBody.Part.createFormData("qrCroppedImage", file2.getName(), RequestBody.create(MediaType.parse("image/jpeg"), file2));
                }
                JSONObject l11 = l(jSONObject2 == null ? new JSONObject() : jSONObject2);
                String d11 = g.d(str7, l11);
                try {
                    if (p5.a.t().s().isShouldUseSignature() && d11 != null && !l11.has(AnalyticsAttribute.UUID_ATTRIBUTE)) {
                        l11.put(AnalyticsAttribute.UUID_ATTRIBUTE, d11);
                    }
                } catch (JSONException e11) {
                    Log.e(f17303a, e11.getMessage());
                    n.w().j(context2).a(e11);
                }
                u(jSONObject);
                Map<String, RequestBody> w11 = w(jSONObject);
                Map hashMap = new HashMap();
                if (l11 != null) {
                    hashMap = (Map) GsonInstrumentation.fromJson(new Gson(), JSONObjectInstrumentation.toString(l11), HashMap.class);
                }
                Map map = hashMap;
                if (p5.a.t().s().getAccessToken() == null || p5.a.t().s().getAccessToken().isEmpty()) {
                    map.put(AnalyticsAttribute.APP_ID_ATTRIBUTE, p5.a.t().s().getAppId());
                    map.put("appKey", p5.a.t().s().getAppKey());
                } else {
                    map.put(HttpRequest.HEADER_AUTHORIZATION, p5.a.t().s().getAccessToken());
                }
                if (hVDocConfig == null || !hVDocConfig.isShouldReadQR() || !p(str6) || part == null) {
                    call = a.d().b(str6, map, createFormData, w11);
                } else {
                    call = a.d().c(str, map, createFormData, part, w11);
                }
                x(l11);
                call.enqueue(new b(d11, str, context, str2, new p(), aVar));
                n.w().a(context2).p(str6, str7);
            }
        }
    }

    public void b(Context context, String str, String str2, String str3, HyperSnapParams$FaceMatchMode hyperSnapParams$FaceMatchMode, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        MultipartBody.Part part;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        HyperSnapParams$FaceMatchMode hyperSnapParams$FaceMatchMode2 = hyperSnapParams$FaceMatchMode;
        b6.a aVar2 = aVar;
        if (aVar2 != null) {
            if (context2 == null) {
                aVar2.f(new HVError(6, "Context object is null"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (str5 == null || str2.trim().isEmpty() || !new File(str5).exists()) {
                aVar2.f(new HVError(6, "Face file path is invalid"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (str6 == null || (str3.trim().isEmpty() && hyperSnapParams$FaceMatchMode2 == HyperSnapParams$FaceMatchMode.FACE_IDFACESTRING)) {
                aVar2.f(new HVError(6, "ID Face String is invalid"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if ((str3.trim().isEmpty() || !new File(str6).exists()) && hyperSnapParams$FaceMatchMode2 == HyperSnapParams$FaceMatchMode.FACE_ID) {
                aVar2.f(new HVError(6, "Document file path is invalid"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if ((str3.trim().isEmpty() || !new File(str6).exists()) && hyperSnapParams$FaceMatchMode2 == HyperSnapParams$FaceMatchMode.FACE_FACE) {
                aVar2.f(new HVError(6, "Second face file path is invalid"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else {
                JSONObject jSONObject3 = jSONObject2 == null ? new JSONObject() : jSONObject2;
                JSONObject jSONObject4 = jSONObject == null ? new JSONObject() : jSONObject;
                JSONObject l11 = l(jSONObject3);
                String c11 = g.c(str6, str5, l11);
                try {
                    if (!o.r().trim().isEmpty() && !l11.has("transactionId")) {
                        l11.put("transactionId", o.r());
                    }
                    if (p5.a.t().s().isShouldUseSignature() && c11 != null && !l11.has(AnalyticsAttribute.UUID_ATTRIBUTE)) {
                        l11.put(AnalyticsAttribute.UUID_ATTRIBUTE, c11);
                    }
                } catch (JSONException e11) {
                    Log.e(f17303a, e11.getMessage());
                    n.w().j(context2).a(e11);
                }
                String str7 = hyperSnapParams$FaceMatchMode2 == HyperSnapParams$FaceMatchMode.FACE_FACE ? "selfie2" : DistributedTracing.NR_ID_ATTRIBUTE;
                if (hyperSnapParams$FaceMatchMode2 == HyperSnapParams$FaceMatchMode.FACE_IDFACESTRING) {
                    try {
                        jSONObject4.put("idFaceString", str6);
                    } catch (JSONException e12) {
                        Log.e(f17303a, e12.getMessage());
                        n.w().j(context2).a(e12);
                    }
                }
                String str8 = "selfie";
                if (t(str4)) {
                    try {
                        if (hyperSnapParams$FaceMatchMode2 == HyperSnapParams$FaceMatchMode.FACE_FACE) {
                            jSONObject4.put("type", str8);
                        } else {
                            jSONObject4.put("type", DistributedTracing.NR_ID_ATTRIBUTE);
                        }
                    } catch (JSONException e13) {
                        s(e13);
                        n.w().j(context2).a(e13);
                    }
                    str8 = "image1";
                    str7 = "image2";
                }
                File file = new File(str5);
                MultipartBody.Part createFormData = MultipartBody.Part.createFormData(str8, file.getName(), RequestBody.create(MediaType.parse("image/jpeg"), file));
                if (hyperSnapParams$FaceMatchMode2 != HyperSnapParams$FaceMatchMode.FACE_IDFACESTRING) {
                    File file2 = new File(str6);
                    part = MultipartBody.Part.createFormData(str7, file2.getName(), RequestBody.create(MediaType.parse("image/jpeg"), file2));
                } else {
                    part = null;
                }
                u(jSONObject4);
                Map<String, RequestBody> w11 = w(jSONObject4);
                Map hashMap = new HashMap();
                if (l11 != null) {
                    hashMap = (Map) GsonInstrumentation.fromJson(new Gson(), JSONObjectInstrumentation.toString(l11), HashMap.class);
                }
                Map map = hashMap;
                if (p5.a.t().s().getAccessToken() == null || p5.a.t().s().getAccessToken().isEmpty()) {
                    map.put(AnalyticsAttribute.APP_ID_ATTRIBUTE, p5.a.t().s().getAppId());
                    map.put("appKey", p5.a.t().s().getAppKey());
                } else {
                    map.put(HttpRequest.HEADER_AUTHORIZATION, p5.a.t().s().getAccessToken());
                }
                Call<ResponseBody> d11 = a.d().d(str, map, createFormData, part, w11);
                p pVar = new p();
                x(l11);
                c cVar = r1;
                c cVar2 = new c(c11, str, context, hyperSnapParams$FaceMatchMode, aVar, pVar);
                d11.enqueue(cVar);
                n.w().a(context2).W(str4, hyperSnapParams$FaceMatchMode.toString(), str5, str6);
            }
        }
    }

    public void c(b6.a aVar) {
        HashMap hashMap = new HashMap();
        if (p5.a.t().s().getAccessToken() == null || p5.a.t().s().getAccessToken().isEmpty()) {
            hashMap.put(AnalyticsAttribute.APP_ID_ATTRIBUTE, p5.a.t().s().getAppId());
            hashMap.put("appKey", p5.a.t().s().getAppKey());
        } else {
            hashMap.put(HttpRequest.HEADER_AUTHORIZATION, p5.a.t().s().getAccessToken());
        }
        try {
            if (!o.r().trim().isEmpty() && !hashMap.containsKey("transactionId")) {
                hashMap.put("transactionId", o.r());
            }
        } catch (Exception e11) {
            Log.e(f17303a, e11.getMessage());
        }
        a.d().e("https://hypersnapweb.hyperverge.co/api/proxy/geoIP/", hashMap).enqueue(new d(aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List<java.lang.Integer> r22, co.hyperverge.hypersnapsdk.objects.HVFaceConfig r23, t5.b.a r24) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r6 = "uuid"
            java.lang.String r7 = "transactionId"
            java.lang.String r8 = "no"
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r9 = "image/jpeg"
            okhttp3.MediaType r9 = okhttp3.MediaType.parse(r9)
            okhttp3.RequestBody r9 = okhttp3.RequestBody.create((okhttp3.MediaType) r9, (java.io.File) r0)
            java.lang.String r0 = r0.getName()
            java.lang.String r10 = "image"
            okhttp3.MultipartBody$Part r14 = okhttp3.MultipartBody.Part.createFormData(r10, r0, r9)
            org.json.JSONObject r9 = r23.getLivenessParams()
            r10 = 0
            p5.a r0 = p5.a.t()     // Catch:{ JSONException -> 0x007c }
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()     // Catch:{ JSONException -> 0x007c }
            co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region r0 = r0.getHyperSnapRegion()     // Catch:{ JSONException -> 0x007c }
            co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region r11 = co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region.ASIA_PACIFIC     // Catch:{ JSONException -> 0x007c }
            if (r0 == r11) goto L_0x004e
            p5.a r0 = p5.a.t()     // Catch:{ JSONException -> 0x007c }
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()     // Catch:{ JSONException -> 0x007c }
            co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region r0 = r0.getHyperSnapRegion()     // Catch:{ JSONException -> 0x007c }
            co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region r11 = co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region.AsiaPacific     // Catch:{ JSONException -> 0x007c }
            if (r0 != r11) goto L_0x009b
        L_0x004e:
            java.lang.String r0 = "validateFaceSize"
            r9.put(r0, r8)     // Catch:{ JSONException -> 0x007c }
            if (r4 == 0) goto L_0x009b
            java.lang.String r0 = r23.getLivenessEndpoint()     // Catch:{ JSONException -> 0x007c }
            java.lang.String r11 = "apac"
            boolean r0 = r0.contains(r11)     // Catch:{ JSONException -> 0x007c }
            if (r0 == 0) goto L_0x009b
            java.io.File r0 = new java.io.File     // Catch:{ JSONException -> 0x007c }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r11 = "video/mp4"
            okhttp3.MediaType r11 = okhttp3.MediaType.parse(r11)     // Catch:{ JSONException -> 0x007c }
            okhttp3.RequestBody r11 = okhttp3.RequestBody.create((okhttp3.MediaType) r11, (java.io.File) r0)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r12 = "video"
            java.lang.String r0 = r0.getName()     // Catch:{ JSONException -> 0x007c }
            okhttp3.MultipartBody$Part r0 = okhttp3.MultipartBody.Part.createFormData(r12, r0, r11)     // Catch:{ JSONException -> 0x007c }
            r15 = r0
            goto L_0x009c
        L_0x007c:
            r0 = move-exception
            java.lang.String r11 = f17303a
            java.lang.String r12 = r0.getMessage()
            android.util.Log.e(r11, r12)
            w5.n r11 = w5.n.w()
            f6.b r11 = r11.s()
            if (r11 == 0) goto L_0x009b
            w5.n r11 = w5.n.w()
            f6.b r11 = r11.s()
            r11.a(r0)
        L_0x009b:
            r15 = r10
        L_0x009c:
            if (r5 == 0) goto L_0x00fa
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x00fa
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00db }
            r0.<init>()     // Catch:{ Exception -> 0x00db }
            java.lang.String r11 = "x1"
            r12 = 0
            java.lang.Object r12 = r5.get(r12)     // Catch:{ Exception -> 0x00db }
            r0.put(r11, r12)     // Catch:{ Exception -> 0x00db }
            java.lang.String r11 = "y1"
            r12 = 1
            java.lang.Object r12 = r5.get(r12)     // Catch:{ Exception -> 0x00db }
            r0.put(r11, r12)     // Catch:{ Exception -> 0x00db }
            java.lang.String r11 = "x2"
            r12 = 2
            java.lang.Object r12 = r5.get(r12)     // Catch:{ Exception -> 0x00db }
            r0.put(r11, r12)     // Catch:{ Exception -> 0x00db }
            java.lang.String r11 = "y2"
            r12 = 3
            java.lang.Object r5 = r5.get(r12)     // Catch:{ Exception -> 0x00db }
            r0.put(r11, r5)     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = "face-coordinates"
            java.lang.String r0 = com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation.toString(r0)     // Catch:{ Exception -> 0x00db }
            r9.put(r5, r0)     // Catch:{ Exception -> 0x00db }
            goto L_0x00fa
        L_0x00db:
            r0 = move-exception
            java.lang.String r5 = f17303a
            java.lang.String r11 = r0.getMessage()
            android.util.Log.e(r5, r11)
            w5.n r5 = w5.n.w()
            f6.b r5 = r5.s()
            if (r5 == 0) goto L_0x00fa
            w5.n r5 = w5.n.w()
            f6.b r5 = r5.s()
            r5.a(r0)
        L_0x00fa:
            java.util.Map r5 = r1.w(r9)
            w5.j r0 = w5.j.n()
            java.util.Map r0 = r0.r()
            r5.putAll(r0)
            java.lang.String r0 = "text/plain"
            okhttp3.MediaType r9 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r8 = okhttp3.RequestBody.create((okhttp3.MediaType) r9, (java.lang.String) r8)
            boolean r9 = r23.getShouldUseBackCamera()
            if (r9 == 0) goto L_0x0124
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            java.lang.String r8 = "yes"
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create((okhttp3.MediaType) r0, (java.lang.String) r8)
            r8 = r0
        L_0x0124:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r9 = r23.getHeaders()
            if (r9 == 0) goto L_0x0138
            org.json.JSONObject r0 = r23.getHeaders()
        L_0x0138:
            org.json.JSONObject r9 = r1.l(r0)
            java.lang.String r0 = w5.o.r()     // Catch:{ Exception -> 0x0158 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0158 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0158 }
            if (r0 != 0) goto L_0x0162
            boolean r0 = r9.has(r7)     // Catch:{ Exception -> 0x0158 }
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = w5.o.r()     // Catch:{ Exception -> 0x0158 }
            r9.put(r7, r0)     // Catch:{ Exception -> 0x0158 }
            goto L_0x0162
        L_0x0158:
            r0 = move-exception
            java.lang.String r7 = f17303a
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r7, r0)
        L_0x0162:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            boolean r7 = r9 instanceof org.json.JSONObject
            if (r7 != 0) goto L_0x0170
            java.lang.String r7 = r9.toString()
            goto L_0x0174
        L_0x0170:
            java.lang.String r7 = com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation.toString(r9)
        L_0x0174:
            java.lang.Class<java.util.HashMap> r11 = java.util.HashMap.class
            java.lang.Object r0 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r0, (java.lang.String) r7, r11)
            r13 = r0
            java.util.Map r13 = (java.util.Map) r13
            p5.a r0 = p5.a.t()
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()
            java.lang.String r0 = r0.getAccessToken()
            if (r0 == 0) goto L_0x01af
            p5.a r0 = p5.a.t()
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()
            java.lang.String r0 = r0.getAccessToken()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01af
            p5.a r0 = p5.a.t()
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()
            java.lang.String r0 = r0.getAccessToken()
            java.lang.String r7 = "Authorization"
            r13.put(r7, r0)
            goto L_0x01d1
        L_0x01af:
            p5.a r0 = p5.a.t()
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()
            java.lang.String r0 = r0.getAppId()
            java.lang.String r7 = "appId"
            r13.put(r7, r0)
            p5.a r0 = p5.a.t()
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()
            java.lang.String r0 = r0.getAppKey()
            java.lang.String r7 = "appKey"
            r13.put(r7, r0)
        L_0x01d1:
            boolean r0 = r23.isUseBothImagesSignature()
            if (r0 == 0) goto L_0x01de
            if (r3 == 0) goto L_0x01e2
            java.lang.String r10 = v5.g.c(r2, r3, r9)
            goto L_0x01e2
        L_0x01de:
            java.lang.String r10 = v5.g.d(r2, r9)
        L_0x01e2:
            p5.a r0 = p5.a.t()     // Catch:{ Exception -> 0x01fc }
            co.hyperverge.hypersnapsdk.objects.d r0 = r0.s()     // Catch:{ Exception -> 0x01fc }
            boolean r0 = r0.isShouldUseSignature()     // Catch:{ Exception -> 0x01fc }
            if (r0 == 0) goto L_0x021b
            if (r10 == 0) goto L_0x021b
            boolean r0 = r13.containsKey(r6)     // Catch:{ Exception -> 0x01fc }
            if (r0 != 0) goto L_0x021b
            r13.put(r6, r10)     // Catch:{ Exception -> 0x01fc }
            goto L_0x021b
        L_0x01fc:
            r0 = move-exception
            java.lang.String r3 = f17303a
            java.lang.String r6 = r0.getMessage()
            android.util.Log.e(r3, r6)
            w5.n r3 = w5.n.w()
            f6.b r3 = r3.s()
            if (r3 == 0) goto L_0x021b
            w5.n r3 = w5.n.w()
            f6.b r3 = r3.s()
            r3.a(r0)
        L_0x021b:
            boolean r0 = r23.isShouldRecordVideo()
            if (r0 == 0) goto L_0x0234
            if (r4 == 0) goto L_0x0234
            v5.b r11 = v5.a.d()
            java.lang.String r12 = r23.getLivenessEndpoint()
            r16 = r5
            r17 = r8
            retrofit2.Call r0 = r11.a(r12, r13, r14, r15, r16, r17)
            goto L_0x0243
        L_0x0234:
            v5.b r11 = v5.a.d()
            java.lang.String r12 = r23.getLivenessEndpoint()
            r15 = r5
            r16 = r8
            retrofit2.Call r0 = r11.f(r12, r13, r14, r15, r16)
        L_0x0243:
            v5.f$a r3 = new v5.f$a
            r4 = r23
            r5 = r24
            r3.<init>(r10, r4, r5)
            r0.enqueue(r3)
            w5.n r0 = w5.n.w()
            q5.b r0 = r0.m()
            if (r0 == 0) goto L_0x0268
            w5.n r0 = w5.n.w()
            q5.b r0 = r0.m()
            java.lang.String r3 = r23.getLivenessEndpoint()
            r0.v(r3, r2)
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.f.d(java.lang.String, java.lang.String, java.lang.String, java.util.List, co.hyperverge.hypersnapsdk.objects.HVFaceConfig, t5.b$a):void");
    }

    public HVError e(Exception exc) {
        return new HVError(2, exc.getLocalizedMessage());
    }

    public HVError f(String str, int i11) {
        return new HVError(i11, str);
    }

    public String j(Headers headers) {
        String str;
        try {
            str = headers.get("X-Request-Id");
        } catch (Exception e11) {
            s(e11);
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            str = " ";
        }
        if (str != null && !str.trim().isEmpty()) {
            return str;
        }
        try {
            return headers.get("X-HV-Request-Id");
        } catch (Exception e12) {
            s(e12);
            if (n.w().s() == null) {
                return " ";
            }
            n.w().s().a(e12);
            return " ";
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject k(Headers headers, String str) {
        JSONObject jSONObject = new JSONObject();
        int i11 = 0;
        while (i11 < headers.size()) {
            try {
                String name = headers.name(i11);
                String value = headers.value(i11);
                if (name.toLowerCase().startsWith("x-hv-")) {
                    jSONObject.put(name, value);
                }
                if (name.equalsIgnoreCase("x-request-id")) {
                    jSONObject.put("X-HV-Request-Id", value);
                }
                if (name.equalsIgnoreCase("x-response-signature")) {
                    jSONObject.put("X-HV-Response-Signature", value);
                }
                i11++;
            } catch (Exception e11) {
                s(e11);
                if (n.w().s() == null) {
                    return null;
                }
                n.w().s().a(e11);
                return null;
            }
        }
        if (p5.a.t().s().isShouldUseSignature() && str != null) {
            jSONObject.put("X-HV-Request-Signature", str);
        }
        return jSONObject;
    }

    public JSONObject l(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk-version", "3.6.23");
            jSONObject.put("os", LogSubCategory.LifeCycle.ANDROID);
            jSONObject.put(HttpRequest.SWIGGY_HEADER_VERSION_NAME, n.w().r());
            jSONObject.put("device", Build.MODEL);
        } catch (Exception e11) {
            s(e11);
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        return jSONObject;
    }

    public HVError v(JSONObject jSONObject) {
        String str;
        new JSONObject();
        HVError hVError = new HVError();
        try {
            if (jSONObject.has("error")) {
                str = jSONObject.getString("error");
            } else {
                str = jSONObject.has(HexAttribute.HEX_ATTR_MESSAGE) ? jSONObject.getString(HexAttribute.HEX_ATTR_MESSAGE) : " ";
            }
            return new HVError(jSONObject.getInt(AnalyticsAttribute.STATUS_CODE_ATTRIBUTE), str);
        } catch (JSONException e11) {
            s(e11);
            if (n.w().s() == null) {
                return hVError;
            }
            n.w().s().a(e11);
            return hVError;
        }
    }

    public Map<String, RequestBody> w(JSONObject jSONObject) {
        Gson gson = new Gson();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Map map = (Map) GsonInstrumentation.fromJson(gson, JSONObjectInstrumentation.toString(jSONObject), hashMap2.getClass());
        for (String str : map.keySet()) {
            hashMap.put(str, RequestBody.create(MediaType.parse(HttpRequest.SHARE_TYPE), (String) map.get(str)));
        }
        return hashMap;
    }

    public String x(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("referenceId")) {
            try {
                return jSONObject.getString("referenceId");
            } catch (JSONException e11) {
                s(e11);
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
        return " ";
    }
}
