package h6;

import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.b;
import co.hyperverge.hypersnapsdk.objects.e;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import h6.a;
import java.util.Date;
import java.util.Objects;
import w5.o;
import z5.g;

@Instrumented
/* compiled from: IPToGeoServiceImpl */
public class c implements a {
    /* access modifiers changed from: private */
    public /* synthetic */ void c(a.C0128a aVar, e eVar, HVError hVError, b bVar) {
        Objects.toString(hVError);
        Objects.toString(bVar);
        if (bVar != null && bVar.getApiResult() != null) {
            e eVar2 = (e) GsonInstrumentation.fromJson(new Gson(), String.valueOf(bVar.getApiResult()), e.class);
            eVar2.setCreatedAt(new Date());
            o.f(eVar2);
            aVar.a(eVar2);
        } else if (hVError == null) {
        } else {
            if (d(eVar)) {
                aVar.a(eVar);
            } else {
                aVar.a();
            }
        }
    }

    private boolean d(e eVar) {
        return (eVar == null || eVar.getCreatedAt() == null) ? false : true;
    }

    public void a(a.C0128a aVar) {
        e p11 = o.p();
        if (!d(p11) || g.b(p11.getCreatedAt()) > 30) {
            t5.a.a().e(new b(this, aVar, p11));
        } else {
            aVar.a(p11);
        }
    }
}
