package w5;

import android.content.Context;
import android.util.Log;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import z5.e;

/* compiled from: DocOCRHelper */
public class c {

    /* renamed from: h  reason: collision with root package name */
    public static final String f17532h = "co.hyperverge.hypersnapsdk.c.c";

    /* renamed from: i  reason: collision with root package name */
    private static c f17533i;

    /* renamed from: a  reason: collision with root package name */
    HVDocConfig f17534a;

    /* renamed from: b  reason: collision with root package name */
    JSONObject f17535b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f17536c = new JSONObject();

    /* renamed from: d  reason: collision with root package name */
    JSONObject f17537d = new JSONObject();

    /* renamed from: e  reason: collision with root package name */
    String f17538e;

    /* renamed from: f  reason: collision with root package name */
    String f17539f;

    /* renamed from: g  reason: collision with root package name */
    b f17540g;

    /* compiled from: DocOCRHelper */
    class a implements b6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f17541a;

        a(b bVar) {
            this.f17541a = bVar;
        }

        public void f(HVError hVError, co.hyperverge.hypersnapsdk.objects.b bVar) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (bVar != null) {
                jSONObject = bVar.getApiResult();
                jSONObject2 = bVar.getApiHeaders();
            }
            JSONObject jSONObject3 = jSONObject;
            if (jSONObject3 == null) {
                try {
                    this.f17541a.a(false, "Some issue with the image capture. Please try again.", (String) null, (JSONObject) null, jSONObject2, hVError);
                } catch (Exception e11) {
                    Log.e(c.f17532h, e11.getMessage());
                    this.f17541a.a(false, "", (String) null, jSONObject3, jSONObject2, (HVError) null);
                }
            } else {
                c.this.d(jSONObject3.getJSONObject("result"), jSONObject3, jSONObject2, hVError);
            }
        }
    }

    /* compiled from: DocOCRHelper */
    public interface b {
        void a(boolean z11, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, HVError hVError);
    }

    public static void b() {
        f17533i = null;
    }

    public static c e() {
        if (f17533i == null) {
            f17533i = new c();
        }
        return f17533i;
    }

    public JSONObject a(String str, String str2) {
        JSONObject k = o.k(str, str2);
        this.f17535b = k;
        if (k != null) {
            Iterator<String> keys = k.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.f17536c.put(next, String.valueOf(this.f17535b.getInt(next)));
                } catch (JSONException e11) {
                    Log.e(f17532h, e11.getMessage());
                }
            }
        }
        return this.f17536c;
    }

    public void c(Context context, String str, String str2, HVDocConfig hVDocConfig, b bVar) {
        this.f17536c = hVDocConfig.getOcrParams();
        this.f17537d = hVDocConfig.getOcrHeaders();
        this.f17534a = hVDocConfig;
        this.f17540g = bVar;
        try {
            this.f17536c.put("expectedDocumentSide", hVDocConfig.getSuffixForDocument());
            this.f17537d.put("transactionId", o.r());
        } catch (JSONException e11) {
            Log.e(f17532h, e11.getMessage());
        }
        HVDocConfig hVDocConfig2 = this.f17534a;
        a(hVDocConfig2.ocrEndpoint, hVDocConfig2.getSuffixForDocument());
        new p();
        a aVar = new a(bVar);
        if (!this.f17534a.isShouldReadQR() || str2 == null) {
            d6.a.b(context, hVDocConfig.ocrEndpoint, str, this.f17536c, this.f17537d, aVar);
            return;
        }
        d6.a.c(context, hVDocConfig.ocrEndpoint, str, str2, hVDocConfig, this.f17536c, this.f17537d, aVar);
    }

    public void d(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, HVError hVError) {
        try {
            if (!this.f17534a.isShouldEnableRetries()) {
                this.f17540g.a(false, "", (String) null, jSONObject2, jSONObject3, (HVError) null);
            }
            if (jSONObject.has(RenderingDetails.TYPE_SUMMARY)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(RenderingDetails.TYPE_SUMMARY);
                HVDocConfig hVDocConfig = this.f17534a;
                String m11 = o.m(hVDocConfig.ocrEndpoint, hVDocConfig.getSuffixForDocument());
                if (jSONObject4.has(LogCategory.ACTION)) {
                    this.f17538e = jSONObject4.getString(LogCategory.ACTION);
                }
                if (jSONObject4.has("retakeMessage")) {
                    this.f17539f = jSONObject4.getString("retakeMessage");
                }
                if (!this.f17538e.equalsIgnoreCase("retake")) {
                    this.f17540g.a(false, this.f17539f, this.f17538e, jSONObject2, jSONObject3, (HVError) null);
                } else if (m11 != null) {
                    this.f17540g.a(true, this.f17539f, this.f17538e, jSONObject2, jSONObject3, (HVError) null);
                } else {
                    this.f17540g.a(false, this.f17539f, this.f17538e, jSONObject2, jSONObject3, f());
                }
            } else {
                this.f17540g.a(false, this.f17539f, this.f17538e, jSONObject2, jSONObject3, hVError);
            }
        } catch (Exception e11) {
            if (!e.a(e11.getMessage())) {
                Log.e(f17532h, e11.getMessage());
            }
        }
    }

    public HVError f() {
        return new HVError(17, "Please call startSession before making OCR call within SDK. Transaction ID is empty");
    }
}
