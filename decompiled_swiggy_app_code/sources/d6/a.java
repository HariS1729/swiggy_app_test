package d6;

import android.content.Context;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$FaceMatchMode;
import org.json.JSONObject;

/* compiled from: HVNetworkHelper */
public class a {
    public static void a(Context context, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        t5.a.a().c(context, str, str2, str3, HyperSnapParams$FaceMatchMode.FACE_ID, jSONObject, jSONObject2, aVar);
    }

    public static void b(Context context, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        t5.a.a().b(context, str, str2, (String) null, (HVDocConfig) null, jSONObject, jSONObject2, aVar);
    }

    public static void c(Context context, String str, String str2, String str3, HVDocConfig hVDocConfig, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        t5.a.a().b(context, str, str2, str3, hVDocConfig, jSONObject, jSONObject2, aVar);
    }
}
