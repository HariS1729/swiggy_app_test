package t5;

import android.content.Context;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$FaceMatchMode;
import java.util.List;
import org.json.JSONObject;
import t5.b;
import v5.f;
import w5.m;

/* compiled from: DataRepository */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f16725c;

    /* renamed from: a  reason: collision with root package name */
    private final b f16726a = f.r();

    /* renamed from: b  reason: collision with root package name */
    private final String f16727b = a.class.getSimpleName();

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f16725c == null) {
                f16725c = new a();
            }
            aVar = f16725c;
        }
        return aVar;
    }

    public void b(Context context, String str, String str2, String str3, HVDocConfig hVDocConfig, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        this.f16726a.a(context, str, str2, str3, hVDocConfig, jSONObject, jSONObject2, aVar);
    }

    public void c(Context context, String str, String str2, String str3, HyperSnapParams$FaceMatchMode hyperSnapParams$FaceMatchMode, JSONObject jSONObject, JSONObject jSONObject2, b6.a aVar) {
        this.f16726a.b(context, str, str2, str3, hyperSnapParams$FaceMatchMode, jSONObject, jSONObject2, aVar);
    }

    public void d(Context context, String str, String str2, String str3, List<Integer> list, HVFaceConfig hVFaceConfig, b.a aVar) {
        if (!m.a(context)) {
            aVar.a();
        } else {
            this.f16726a.d(str, str2, str3, list, hVFaceConfig, aVar);
        }
    }

    public void e(b6.a aVar) {
        this.f16726a.c(aVar);
    }
}
