package w5;

import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import z5.e;

/* compiled from: FaceRetryHelper */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17565a = "co.hyperverge.hypersnapsdk.c.f";

    /* renamed from: b  reason: collision with root package name */
    static f f17566b;

    /* compiled from: FaceRetryHelper */
    public interface a {
        void a(boolean z11, String str, String str2, HVError hVError);
    }

    public static void b() {
        f17566b = null;
    }

    public static f e() {
        if (f17566b == null) {
            f17566b = new f();
        }
        return f17566b;
    }

    public JSONObject a(HVFaceConfig hVFaceConfig) {
        JSONObject headers = hVFaceConfig.getHeaders();
        try {
            if (!o.r().isEmpty()) {
                headers.put("transactionId", o.r());
            }
            if (p5.a.t().s().isShouldActivateDeviceBlocklist() && !e.a((String) null)) {
                headers.put(HttpRequest.SWIGGY_HEADER_DEVICE_ID, (Object) null);
            }
            hVFaceConfig.setLivenessAPIHeaders(headers);
        } catch (JSONException e11) {
            Log.e(f17565a, e11.getMessage());
        }
        return headers;
    }

    public void c(JSONObject jSONObject, HVFaceConfig hVFaceConfig, a aVar) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
            if (jSONObject2.has(RenderingDetails.TYPE_SUMMARY)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(RenderingDetails.TYPE_SUMMARY);
                String string = jSONObject3.getString(LogCategory.ACTION);
                String m11 = o.m(hVFaceConfig.getLivenessEndpoint(), "");
                String string2 = jSONObject3.has("retakeMessage") ? jSONObject3.getString("retakeMessage") : "Some issue with the image capture. Please try again.";
                if (!hVFaceConfig.isShouldHandleRetries()) {
                    aVar.a(false, string2, string, (HVError) null);
                } else if (!string.equalsIgnoreCase("retake")) {
                    aVar.a(false, "", string, (HVError) null);
                } else if (m11 != null) {
                    aVar.a(true, string2, string, (HVError) null);
                } else {
                    aVar.a(false, string2, string, f());
                }
            } else {
                aVar.a(false, "", "", (HVError) null);
            }
        } catch (JSONException e11) {
            Log.e(f17565a, e11.getMessage());
            aVar.a(false, "", "", (HVError) null);
        }
    }

    public JSONObject d(HVFaceConfig hVFaceConfig) {
        JSONObject livenessParams = hVFaceConfig.getLivenessParams();
        try {
            JSONObject k = o.k(hVFaceConfig.getLivenessEndpoint(), "");
            if (k != null) {
                Iterator<String> keys = k.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        livenessParams.put(next, String.valueOf(k.getInt(next)));
                    } catch (JSONException e11) {
                        Log.e(f17565a, e11.getMessage());
                    }
                }
            }
            hVFaceConfig.setLivenessAPIParameters(livenessParams);
        } catch (Exception e12) {
            Log.e(f17565a, e12.getMessage());
        }
        return livenessParams;
    }

    public HVError f() {
        return new HVError(17, "Please call startSession before making OCR call within SDK. Transaction ID is empty");
    }

    public void g(HVFaceConfig hVFaceConfig) {
        a(hVFaceConfig);
        d(hVFaceConfig);
    }
}
