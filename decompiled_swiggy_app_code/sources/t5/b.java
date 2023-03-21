package t5;

import android.content.Context;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$FaceMatchMode;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DataSource */
public abstract class b {

    /* compiled from: DataSource */
    public interface a {
        void a();

        void a(c6.a aVar);

        void a(String str);
    }

    public abstract void a(Context context, String str, String str2, String str3, HVDocConfig hVDocConfig, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar);

    public abstract void b(Context context, String str, String str2, String str3, HyperSnapParams$FaceMatchMode hyperSnapParams$FaceMatchMode, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar);

    public abstract void c(b6.a aVar);

    public abstract void d(String str, String str2, String str3, List<Integer> list, HVFaceConfig hVFaceConfig, a aVar);
}
