package f5;

import android.util.Log;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
/* compiled from: HVFace */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f14641d = "f5.b";

    /* renamed from: a  reason: collision with root package name */
    private String f14642a;

    /* renamed from: b  reason: collision with root package name */
    private String f14643b;

    /* renamed from: c  reason: collision with root package name */
    private String f14644c;

    public b(String str, String str2) {
        this.f14642a = str;
        this.f14643b = str2;
    }

    public int a(int i11, int i12) {
        return (i11 * i12) / 100;
    }

    public int b(int i11, int i12) {
        return (i11 * i12) / 100;
    }

    public String c() {
        return this.f14644c;
    }

    public void d(float f11, float f12, float f13, float f14) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ltx", (double) f11);
            jSONObject.put("lty", (double) f12);
            jSONObject.put("width", (double) (f13 - f11));
            jSONObject.put("height", (double) (f14 - f12));
            jSONObject.put("rbx", (double) f13);
            jSONObject.put("rby", (double) f14);
        } catch (JSONException e11) {
            Log.d(f14641d, e11.getMessage());
        }
        this.f14644c = JSONObjectInstrumentation.toString(jSONObject);
    }
}
