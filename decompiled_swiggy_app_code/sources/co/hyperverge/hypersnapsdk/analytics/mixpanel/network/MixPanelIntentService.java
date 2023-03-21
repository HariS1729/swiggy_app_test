package co.hyperverge.hypersnapsdk.analytics.mixpanel.network;

import android.content.Intent;
import android.util.Log;
import androidx.core.app.JobIntentService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import retrofit2.Response;
import s5.b;

@Instrumented
public class MixPanelIntentService extends JobIntentService {
    private s5.a j;
    private List<?> k;

    class a extends TypeToken<List<?>> {
        a() {
        }
    }

    private Response<Object> j(String str) {
        try {
            return this.j.a(str).execute();
        } catch (IOException e11) {
            Log.e("MixPanelIntentService", "postEvents: ", e11);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void g(Intent intent) {
        Objects.toString(intent);
        if (this.j == null) {
            this.j = v5.a.a();
        }
        try {
            Gson gson = new Gson();
            this.k = (List) GsonInstrumentation.fromJson(gson, intent.getStringExtra("events"), new a().getType());
            Objects.toString(this.k);
            Response<Object> j11 = j(GsonInstrumentation.toJson(gson, (Object) this.k));
            this.k = null;
            Objects.toString(j11);
            if (j11 != null) {
                Object body = j11.body();
                if (body instanceof Double) {
                    if (((Double) body).doubleValue() != 0.0d) {
                        ((Double) body).doubleValue();
                    }
                } else if (body != null) {
                    Objects.toString((b) GsonInstrumentation.fromJson(gson, body.toString(), b.class));
                }
            }
        } catch (Exception e11) {
            Log.e("MixPanelIntentService", "onHandleWork: ", e11);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
