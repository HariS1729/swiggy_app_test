package amazonpay.silentpay;

import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.util.Map;

abstract class s {

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f1284a;

    /* renamed from: b  reason: collision with root package name */
    String f1285b;

    s() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, Map<String, String> map) {
        if (str != null && str2 != null && !str2.trim().equalsIgnoreCase(SafeJsonPrimitive.NULL_STRING)) {
            map.put(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> b() {
        return this.f1284a;
    }
}
