package og0;

import cg0.n;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import ef0.e;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import ps.b;

/* compiled from: DefaultHeaders.kt */
public final class a {
    public static final C0237a Companion = new C0237a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final n f19798a;

    /* renamed from: b  reason: collision with root package name */
    private final b f19799b;

    /* renamed from: c  reason: collision with root package name */
    private final e f19800c;

    /* renamed from: d  reason: collision with root package name */
    private final os.a f19801d;

    /* renamed from: og0.a$a  reason: collision with other inner class name */
    /* compiled from: DefaultHeaders.kt */
    public static final class C0237a {
        private C0237a() {
        }

        public /* synthetic */ C0237a(i iVar) {
            this();
        }
    }

    public a(n nVar, b bVar, e eVar, os.a aVar) {
        p.j(nVar, "locationContext");
        p.j(bVar, "contextService");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(aVar, "appBuildDetails");
        this.f19798a = nVar;
        this.f19799b = bVar;
        this.f19800c = eVar;
        this.f19801d = aVar;
    }

    public final HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        String token = this.f19800c.getToken();
        p.i(token, "user.token");
        hashMap.put("token", token);
        String tid = this.f19800c.getTid();
        if (tid == null) {
            tid = "";
        }
        hashMap.put(HttpRequest.TID_KEY, tid);
        String sessionId = this.f19800c.getSessionId();
        p.i(sessionId, "user.sessionId");
        hashMap.put(HttpRequest.SWIGGY_HEADER_SID, sessionId);
        if (this.f19800c.o0()) {
            String customerId = this.f19800c.getCustomerId();
            p.i(customerId, "user.customerId");
            hashMap.put(AnalyticsAttribute.USER_ID_ATTRIBUTE, customerId);
        } else {
            hashMap.put(AnalyticsAttribute.USER_ID_ATTRIBUTE, "");
            hashMap.put("token", "");
        }
        hashMap.put("lat", String.valueOf(this.f19798a.getLatitude()));
        hashMap.put("lng", String.valueOf(this.f19798a.getLongitude()));
        String swuid = this.f19800c.getSwuid();
        p.i(swuid, "user.swuid");
        hashMap.put(HttpRequest.SWIGGY_HEADER_UID, swuid);
        String deviceId = this.f19800c.getDeviceId();
        p.i(deviceId, "user.deviceId");
        hashMap.put(HttpRequest.SWIGGY_HEADER_DEVICE_ID, deviceId);
        String m11 = this.f19799b.d().m();
        p.i(m11, "contextService.deviceDetails.deviceManufacturer");
        hashMap.put(HttpRequest.SWIGGY_HEADER_DEVICE_MANUFACTURER, m11);
        String n = this.f19799b.d().n();
        p.i(n, "contextService.deviceDetails.deviceModel");
        hashMap.put(HttpRequest.SWIGGY_HEADER_DEVICE_MODEL_NAME, n);
        hashMap.put(HttpRequest.SWIGGY_HEADER_VERSION_CODE, String.valueOf(this.f19801d.h()));
        hashMap.put(AnalyticsAttribute.APPLICATION_PLATFORM_ATTRIBUTE, "Swiggy-Android");
        hashMap.put("analyticsPlatform", "an");
        hashMap.put(HexAttribute.HEX_ATTR_APP_VERSION, "4.26.0");
        hashMap.put("accessibility-enabled", String.valueOf(this.f19799b.i()));
        hashMap.put("hideBackButton", "false");
        return hashMap;
    }
}
