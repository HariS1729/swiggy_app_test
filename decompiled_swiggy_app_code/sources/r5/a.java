package r5;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import c6.d;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.c;
import com.google.gson.Gson;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.rudderstack.android.sdk.core.RudderClient;
import com.rudderstack.android.sdk.core.RudderConfig;
import com.rudderstack.android.sdk.core.RudderOption;
import com.rudderstack.android.sdk.core.RudderProperty;
import com.rudderstack.android.sdk.core.RudderTraits;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;
import q5.b;
import w5.n;
import w5.o;
import z5.g;

@Instrumented
/* compiled from: RudderstackManager */
public class a implements b {

    /* renamed from: e  reason: collision with root package name */
    private static final String f16476e = "co.hyperverge.hypersnapsdk.a.c.a";

    /* renamed from: f  reason: collision with root package name */
    private static a f16477f;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16478a;

    /* renamed from: b  reason: collision with root package name */
    private final RudderClient f16479b;

    /* renamed from: c  reason: collision with root package name */
    private HVFaceConfig f16480c;

    /* renamed from: d  reason: collision with root package name */
    private HVDocConfig f16481d;

    private a(Context context) {
        this.f16478a = context;
        this.f16479b = RudderClient.getInstance(context, v0(), new RudderConfig.Builder().withDataPlaneUrl("https://hypervergekrba.dataplane.rudderstack.com").withTrackLifecycleEvents(false).withRecordScreenViews(false).build());
    }

    private String A0(String str) {
        try {
            Bitmap decodeFile = BitmapFactoryInstrumentation.decodeFile(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            long length = (long) byteArrayOutputStream.toByteArray().length;
            return (((double) length) / 1024.0d) + " KB";
        } catch (Exception e11) {
            Log.e(f16476e, e11.getMessage());
            return null;
        }
    }

    private void B0(String str, String str2, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, Object> s02 = s0();
        Map<String, Object> u02 = u0();
        Map<String, Object> t02 = t0();
        map.putAll(s02);
        if (str2 != null) {
            char c11 = 65535;
            switch (str2.hashCode()) {
                case 120891692:
                    if (str2.equals("NetworkEvent")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 208551453:
                    if (str2.equals("FaceEvent")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 882304098:
                    if (str2.equals("DocEvent")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    map.putAll(u02);
                    map.putAll(t02);
                    break;
                case 1:
                    map.putAll(u02);
                    break;
                case 2:
                    map.putAll(t02);
                    break;
            }
        }
        RudderProperty rudderProperty = new RudderProperty();
        rudderProperty.putValue(map);
        rudderProperty.putValue("hv_event", str);
        if (!g.p(this.f16478a)) {
            GsonInstrumentation.toJson(new Gson(), (Object) rudderProperty);
        }
        this.f16479b.track("MobileSDK", rudderProperty);
    }

    private String C0(String str) {
        long length = new File(str).length();
        return (length / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) + "KB";
    }

    private Map<String, Object> s0() {
        HashMap hashMap = new HashMap();
        try {
            String r11 = o.r();
            String name = p5.a.t().s().getHyperSnapRegion().name();
            String appId = p5.a.t().s().getAppId();
            String f11 = g.f();
            hashMap.put("transactionId", r11);
            hashMap.put("region", name);
            hashMap.put(AnalyticsAttribute.APP_ID_ATTRIBUTE, appId);
            hashMap.put(PaymentConstants.SDK_VERSION, "3.6.23");
            hashMap.put("abiArch", f11);
            c hyperKYCConfigs = p5.a.t().s().getHyperKYCConfigs();
            if (hyperKYCConfigs != null) {
                HashMap<String, String> hyperKYCValueMap = hyperKYCConfigs.getHyperKYCValueMap();
                for (String next : hyperKYCValueMap.values()) {
                    hashMap.put(next, hyperKYCValueMap.get(next));
                }
            }
            hashMap.put("hyperSnapSDKConfig", p5.a.t().s());
        } catch (Exception e11) {
            Log.e(f16476e, e11.getMessage());
            n.w().j(this.f16478a).a(e11);
        }
        return hashMap;
    }

    private Map<String, Object> t0() {
        HashMap hashMap = new HashMap();
        hashMap.put(HVDocConfig.KEY, this.f16481d);
        return hashMap;
    }

    private Map<String, Object> u0() {
        HashMap hashMap = new HashMap();
        hashMap.put("hvFaceConfig", this.f16480c);
        return hashMap;
    }

    private String v0() {
        return g.p(this.f16478a) ? "1yqj4KITc63FThQOpC1kNPGXoSN" : "1zROhc3quLhmAyHhEtkZgjGkhTC";
    }

    public static a w0(Context context) {
        if (f16477f == null) {
            f16477f = new a(context);
        }
        return f16477f;
    }

    private void x0(String str, String str2, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.putAll(s0());
        RudderProperty rudderProperty = new RudderProperty();
        rudderProperty.putValue(map);
        rudderProperty.putValue("hv_event", str2);
        RudderTraits rudderTraits = new RudderTraits();
        rudderTraits.put("properties", rudderProperty);
        if (!g.p(this.f16478a)) {
            GsonInstrumentation.toJson(new Gson(), (Object) rudderTraits);
        }
        this.f16479b.identify(str, rudderTraits, (RudderOption) null);
    }

    private String y0(String str) {
        try {
            return str.substring(str.lastIndexOf(".") + 1);
        } catch (Exception e11) {
            Log.e(f16476e, e11.getMessage());
            return null;
        }
    }

    private void z0(String str, String str2, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, Object> s02 = s0();
        Map<String, Object> u02 = u0();
        Map<String, Object> t02 = t0();
        map.putAll(s02);
        if (str2 != null) {
            char c11 = 65535;
            switch (str2.hashCode()) {
                case 120891692:
                    if (str2.equals("NetworkEvent")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 208551453:
                    if (str2.equals("FaceEvent")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 882304098:
                    if (str2.equals("DocEvent")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    map.putAll(u02);
                    map.putAll(t02);
                    break;
                case 1:
                    map.putAll(u02);
                    break;
                case 2:
                    map.putAll(t02);
                    break;
            }
        }
        RudderProperty rudderProperty = new RudderProperty();
        rudderProperty.putValue(map);
        rudderProperty.putValue("hv_event", str);
        if (!g.p(this.f16478a)) {
            GsonInstrumentation.toJson(new Gson(), (Object) rudderProperty);
        }
        this.f16479b.screen("MobileSDK", rudderProperty);
    }

    public void A() {
        B0("Selfie - Capture Screen Back Pressed", "FaceEvent", (Map<String, Object>) null);
    }

    public void B(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Capture Screen Capture Button Clicked", "DocEvent", hashMap);
    }

    public void C(HVFaceConfig hVFaceConfig) {
    }

    public void D(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Instructions Screen Proceed Button Clicked", "FaceEvent", hashMap);
    }

    public void E(HVFaceConfig hVFaceConfig) {
    }

    public void F() {
        z0("Document - Capture Screen Launched", "DocEvent", (Map<String, Object>) null);
    }

    public void G(HVDocConfig hVDocConfig, String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        hashMap.put("imageSize", A0(str));
        hashMap.put("imageFormat", y0(str));
        B0("Document - Capture Saved", "DocEvent", hashMap);
    }

    public void H(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Picker Screen Document Capture Button Clicked", "DocEvent", hashMap);
    }

    public void I(co.hyperverge.hypersnapsdk.objects.b bVar, HVError hVError, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Face Match API Call Failed", "NetworkEvent", hashMap);
    }

    public void J() {
        z0("Selfie - Capture Screen Launched", "FaceEvent", (Map<String, Object>) null);
    }

    public void K(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Instructions Screen Load Success", "FaceEvent", hashMap);
    }

    public void L(HVFaceConfig hVFaceConfig) {
        this.f16480c = hVFaceConfig;
        B0("Selfie Flow Started", "FaceEvent", new HashMap(u0()));
    }

    public void M(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Retake Screen Retake Button Clicked", "FaceEvent", hashMap);
    }

    public void N() {
    }

    public void O() {
        B0("Document - Capture Flash Button Clicked", "DocEvent", (Map<String, Object>) null);
    }

    public void P(co.hyperverge.hypersnapsdk.objects.b bVar, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Attempts", Integer.valueOf(bVar.getAttemptsCount()));
        hashMap.put(LogCategory.ACTION, bVar.getAction());
        hashMap.put(AnalyticsAttribute.RESPONSE_TIME_ATTRIBUTE, Long.valueOf(j));
        B0("Face Match API Response Received", "NetworkEvent", hashMap);
    }

    public void Q(co.hyperverge.hypersnapsdk.objects.b bVar, HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Document - Capture API Call Failed", "DocEvent", hashMap);
    }

    public void R() {
        B0("Selfie - Retake Screen Back Pressed", "FaceEvent", (Map<String, Object>) null);
    }

    public void S(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Selfie - Retake Screen Load Failure", "FaceEvent", hashMap);
    }

    public void T(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Document - Instructions Screen Load Failure", "DocEvent", hashMap);
    }

    public void U(HVError hVError, HVDocConfig hVDocConfig, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Document - Capture Failed", "DocEvent", hashMap);
    }

    public void V(d dVar, HVFaceConfig hVFaceConfig, long j) {
    }

    public void W(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("apiUrl", str);
        hashMap.put(HttpRequest.CONTENT_TYPE_KEY, "formdata");
        B0("Face Match API Post", "NetworkEvent", hashMap);
    }

    public void X(HVDocConfig hVDocConfig) {
    }

    public void Y(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Selfie - Instructions Screen Load Failure", "FaceEvent", hashMap);
    }

    public void Z(HVDocConfig hVDocConfig) {
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Capture Screen Capture Button Clicked", "FaceEvent", hashMap);
    }

    public void a(String str) {
    }

    public void a0() {
    }

    public void b() {
    }

    public void b(HVDocConfig hVDocConfig, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Capture Screen Capture Successful", "DocEvent", hashMap);
    }

    public void b0(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Document - Capture Screen Load Failure", "DocEvent", hashMap);
    }

    public void c(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Review Screen Confirm Button Clicked", "DocEvent", hashMap);
    }

    public void c0(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Instructions Screen Proceed Button Clicked", "DocEvent", hashMap);
    }

    public void d(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Review Screen Load Success", "DocEvent", hashMap);
    }

    public void d0(String str, long j, long j11) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j11));
        hashMap.put("videoSize", C0(str));
        hashMap.put("videoFormat", y0(str));
        hashMap.put("videoDuration", Long.valueOf(j));
        B0("Selfie - Video Record Successful", "FaceEvent", hashMap);
    }

    public void e(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Picker Screen Load Success", "DocEvent", hashMap);
    }

    public void e0() {
        z0("Document - Retake Screen Launched", "DocEvent", (Map<String, Object>) null);
    }

    public void f() {
        B0("Document - Picker Screen Close Clicked", "DocEvent", (Map<String, Object>) null);
    }

    public void f0(HVError hVError, d dVar, HVFaceConfig hVFaceConfig) {
    }

    public void g(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Camera Permission Granted", (String) null, hashMap);
    }

    public void g0(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Retake Screen Load Success", "DocEvent", hashMap);
    }

    public void h() {
        B0("Document - Capture Screen Close Clicked", "DocEvent", (Map<String, Object>) null);
    }

    public void h0() {
        z0("Document - Instructions Launched", "DocEvent", (Map<String, Object>) null);
    }

    public void i() {
        B0("Document - Capture Screen Back Pressed", "DocEvent", (Map<String, Object>) null);
    }

    public void i0(String str, int i11) {
    }

    public void j() {
        B0("Selfie - Capture Screen Close Clicked", "FaceEvent", (Map<String, Object>) null);
    }

    public void j0(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Document - Retake Screen Load Failure", "DocEvent", hashMap);
    }

    public void k() {
        z0("Document - Picker Screen Launched", "DocEvent", (Map<String, Object>) null);
    }

    public void k0(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Retake Screen Load Success", "FaceEvent", hashMap);
    }

    public void l() {
        z0("Document - Review Screen Launched", "DocEvent", (Map<String, Object>) null);
    }

    public void l0(HVDocConfig hVDocConfig) {
        this.f16481d = hVDocConfig;
        B0("Doc Flow Started", "DocEvent", new HashMap(t0()));
    }

    public void m() {
        B0("Camera Permission Requested", (String) null, (Map<String, Object>) null);
    }

    public void m0(String str, int i11) {
    }

    public void n() {
        z0("Selfie - Retake Screen Launched", "FaceEvent", (Map<String, Object>) null);
    }

    public void n0(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Retake Screen Retake Button Clicked", "DocEvent", hashMap);
    }

    public void o() {
        p pVar = new p();
        HashMap hashMap = new HashMap();
        hashMap.put("Initialisation Timestamp", Long.valueOf(pVar.a()));
        hashMap.put("IP Address", g.g(true));
        x0(UUID.randomUUID() + "_HyperSnapSDKInitialised", "HyperSnapSDK Initialised", hashMap);
    }

    public void o0(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Selfie - Capture Screen Load Failure", "FaceEvent", hashMap);
    }

    public void p(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("apiUrl", str);
        hashMap.put(HttpRequest.CONTENT_TYPE_KEY, "formdata");
        B0("Document - Capture API Post", "DocEvent", hashMap);
    }

    public void p0(HVFaceConfig hVFaceConfig, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Capture Screen Capture Successful", "FaceEvent", hashMap);
    }

    public void q(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Picker Screen Document Upload Button Clicked", "DocEvent", hashMap);
    }

    public void q0(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Capture Screen Load Success", "FaceEvent", hashMap);
    }

    public void r(HVError hVError, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Error - Camera Permission Denied", (String) null, hashMap);
    }

    public void r0(HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Document - Review Screen Load Failure", "DocEvent", hashMap);
    }

    public void s(d dVar, String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(AnalyticsAttribute.STATUS_CODE_ATTRIBUTE, Integer.valueOf(dVar.a()));
        hashMap.put(AnalyticsAttribute.RESPONSE_TIME_ATTRIBUTE, Long.valueOf(j));
        hashMap.put("imageSize", A0(str));
        hashMap.put("imageFormat", y0(str));
        B0("Selfie - Capture API Response Received", "FaceEvent", hashMap);
    }

    public void t(HVError hVError, HVFaceConfig hVFaceConfig, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Capture Screen Capture Failed", "FaceEvent", hashMap);
    }

    public void u() {
        B0("Document - Review Screen Back Pressed", "DocEvent", (Map<String, Object>) null);
    }

    public void v() {
    }

    public void v(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("apiUrl", str);
        hashMap.put(HttpRequest.CONTENT_TYPE_KEY, "formdata");
        B0("Selfie - Capture API Post", "FaceEvent", hashMap);
    }

    public void w(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Capture Screen Load Success", "DocEvent", hashMap);
    }

    public void x(d dVar, HVError hVError) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        B0("Selfie - Capture API Call Failed", "FaceEvent", hashMap);
    }

    public void y() {
        B0("Selfie - Capture Flip Camera Button Clicked", "FaceEvent", (Map<String, Object>) null);
    }

    public void z(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Instructions Screen Load Success", "DocEvent", hashMap);
    }

    public void f(HVFaceConfig hVFaceConfig, String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        hashMap.put("imageSize", A0(str));
        hashMap.put("imageFormat", y0(str));
        B0("Selfie - Capture Screen Capture Saved", "FaceEvent", hashMap);
    }

    public void h(co.hyperverge.hypersnapsdk.objects.b bVar, String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Attempts", Integer.valueOf(bVar.getAttemptsCount()));
        hashMap.put(LogCategory.ACTION, bVar.getAction());
        hashMap.put(AnalyticsAttribute.RESPONSE_TIME_ATTRIBUTE, Long.valueOf(j));
        hashMap.put("imageSize", A0(str));
        hashMap.put("imageFormat", y0(str));
        B0("Document - Capture API Response Received", "DocEvent", hashMap);
    }

    public void i(HVError hVError, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Code", Integer.valueOf(hVError.getErrorCode()));
        hashMap.put("Error Message", hVError.getErrorMessage());
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Selfie - Video Record Failed", "FaceEvent", hashMap);
    }

    public void k(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("Time Spent", Long.valueOf(j));
        B0("Document - Review Screen Retake Button Clicked", "DocEvent", hashMap);
    }

    public void a() {
        z0("Selfie - Instructions Screen Launched", "FaceEvent", (Map<String, Object>) null);
    }

    public void d() {
        B0("Document - Retake Screen Back Pressed", "DocEvent", (Map<String, Object>) null);
    }
}
