package in.swiggy.android.swiggylynx.plugin.dash;

import bp0.k;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import in.swiggy.android.swiggylynx.plugin.dash.trackevent.TrackEventPayload;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import org.json.JSONObject;
import os.u;

/* compiled from: DashPlugin.kt */
final class DashPlugin$processTrackEvent$1 extends Lambda implements lp0.a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TrackEventPayload f19106a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DashPlugin f19107b;

    /* compiled from: DashPlugin.kt */
    public static final class a implements AppsFlyerRequestListener {
        a() {
        }

        public void onError(int i11, String str) {
            p.j(str, "errorDesc");
            u.b("DashPlugin", "Event failed to be sent:\nError code: " + i11 + "\nError description: " + str);
        }

        public void onSuccess() {
            u.b("DashPlugin", "Event sent successfully");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DashPlugin$processTrackEvent$1(TrackEventPayload trackEventPayload, DashPlugin dashPlugin) {
        super(0);
        this.f19106a = trackEventPayload;
        this.f19107b = dashPlugin;
    }

    public final void invoke() {
        try {
            HashMap hashMap = new HashMap();
            String obj = this.f19106a.c().toString();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject(obj);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = keys.next().toString();
                    Object opt = jSONObject.opt(str);
                    p.i(opt, "value");
                    hashMap.put(str, opt);
                }
            }
            AppsFlyerLib.getInstance().logEvent(this.f19107b.X0(), this.f19106a.b(), hashMap, new a());
        } catch (Exception e11) {
            u.h("AppsFlyerJsInterface", e11);
        }
    }
}
