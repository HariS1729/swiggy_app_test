package amazonpay.silentpay;

import amazonpay.silentpay.i;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import in.juspay.hypersdk.core.PaymentConstants;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private String f1232a;

    /* renamed from: b  reason: collision with root package name */
    private String f1233b;

    private g(String str, String str2) {
        this.f1232a = str;
        this.f1233b = str2;
    }

    public static synchronized g a(Bundle bundle) {
        synchronized (g.class) {
            if (bundle != null) {
                try {
                    if (bundle.containsKey("GET_BALANCE_RESPONSE")) {
                        JSONObject jSONObject = new JSONObject(bundle.getString("GET_BALANCE_RESPONSE"));
                        g gVar = new g(jSONObject.getString(PaymentConstants.AMOUNT), jSONObject.getString(AppsFlyerProperties.CURRENCY_CODE));
                        return gVar;
                    }
                } catch (Exception e11) {
                    j.g("GetBalanceResponse", "Error while parsing get balance response", e11);
                    n.d(i.a.GET_BALANCE_RESPONSE_PARSING_FAILED);
                }
            }
            return null;
        }
    }

    public String b() {
        return this.f1232a;
    }
}
