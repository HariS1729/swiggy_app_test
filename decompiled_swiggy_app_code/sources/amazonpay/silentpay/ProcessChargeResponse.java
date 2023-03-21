package amazonpay.silentpay;

import amazonpay.silentpay.i;
import android.content.Intent;
import android.net.Uri;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ProcessChargeResponse extends s {

    /* renamed from: c  reason: collision with root package name */
    private String f1138c;

    /* renamed from: d  reason: collision with root package name */
    private Status f1139d;

    public enum Status {
        COMPLETED,
        CANCELLED
    }

    private ProcessChargeResponse(String str, String str2, Status status, String str3) {
        this.f1285b = str;
        this.f1138c = str2;
        this.f1139d = status;
        if (str != null && !str.equalsIgnoreCase(SafeJsonPrimitive.NULL_STRING)) {
            this.f1284a = new HashMap<String, String>(str, str2, str3) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f1140a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f1141b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f1142c;

                {
                    this.f1140a = r3;
                    this.f1141b = r4;
                    this.f1142c = r5;
                    put(PaymentConstants.SIGNATURE, r3);
                    ProcessChargeResponse.this.a("transactionId", r4, this);
                    ProcessChargeResponse.this.a("payUrl", r5, this);
                    put("verificationOperationName", "VERIFY_PROCESS_CHARGE_RESPONSE");
                }
            };
        }
    }

    static synchronized String c(Uri uri) {
        synchronized (ProcessChargeResponse.class) {
            if (uri != null) {
                Map<String, String> d11 = q.d(uri.getQuery());
                if (!d11.isEmpty() && d11.containsKey("requestId")) {
                    String str = d11.get("requestId");
                    return str;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized java.lang.String d(android.os.Bundle r4) {
        /*
            java.lang.Class<amazonpay.silentpay.ProcessChargeResponse> r0 = amazonpay.silentpay.ProcessChargeResponse.class
            monitor-enter(r0)
            r1 = 0
            if (r4 == 0) goto L_0x005f
            java.lang.String r2 = "PROCESS_CHARGE_RESPONSE"
            boolean r2 = r4.containsKey(r2)     // Catch:{ JSONException -> 0x004f }
            if (r2 == 0) goto L_0x005f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            java.lang.String r3 = "PROCESS_CHARGE_RESPONSE"
            java.lang.String r4 = r4.getString(r3)     // Catch:{ JSONException -> 0x004f }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r4 = "response"
            boolean r4 = r2.has(r4)     // Catch:{ JSONException -> 0x004f }
            if (r4 == 0) goto L_0x005f
            java.lang.String r4 = "response"
            org.json.JSONObject r4 = r2.getJSONObject(r4)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r2 = "payUrl"
            boolean r2 = r4.has(r2)     // Catch:{ JSONException -> 0x004f }
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "payUrl"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ JSONException -> 0x004f }
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "payUrl"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r3 = "null"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ JSONException -> 0x004f }
            if (r2 != 0) goto L_0x005f
            java.lang.String r2 = "payUrl"
            java.lang.String r4 = r4.getString(r2)     // Catch:{ JSONException -> 0x004f }
            monitor-exit(r0)
            return r4
        L_0x004d:
            r4 = move-exception
            goto L_0x005d
        L_0x004f:
            java.lang.String r4 = "ProcessChargeResponse"
            java.lang.String r2 = "Error while parsing get balance response"
            amazonpay.silentpay.j.f(r4, r2)     // Catch:{ all -> 0x004d }
            amazonpay.silentpay.i$a r4 = amazonpay.silentpay.i.a.PROCESS_CHARGE_RESPONSE_PARSING_FAILED     // Catch:{ all -> 0x004d }
            amazonpay.silentpay.n.d(r4)     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r1
        L_0x005d:
            monitor-exit(r0)
            throw r4
        L_0x005f:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: amazonpay.silentpay.ProcessChargeResponse.d(android.os.Bundle):java.lang.String");
    }

    public static synchronized ProcessChargeResponse e(Intent intent) {
        synchronized (ProcessChargeResponse.class) {
            String str = null;
            if (intent != null) {
                if (intent.getData() != null) {
                    Map<String, String> d11 = q.d(intent.getData().getQuery());
                    if (d11 != null) {
                        String str2 = d11.get(PaymentConstants.SIGNATURE);
                        String str3 = d11.get("orderTotalCurrencyCode");
                        if (d11.containsKey("customInformation")) {
                            str = d11.get("customInformation");
                        }
                        ProcessChargeResponse processChargeResponse = new ProcessChargeResponse(str2, str3, str, d11.get("orderTotalAmount"), d11.get("amazonOrderId"), d11.get("requestId"), d11.get("description"), d11.get("reasonCode"), d11.get("transactionDate"), d11.get("sellerOrderId"), d11.get("status"));
                        return processChargeResponse;
                    }
                }
            }
            if (intent != null) {
                if (intent.getExtras() != null) {
                    try {
                        if (intent.getExtras().containsKey("PROCESS_CHARGE_RESPONSE")) {
                            JSONObject jSONObject = new JSONObject(intent.getExtras().getString("PROCESS_CHARGE_RESPONSE"));
                            if (jSONObject.has("PROCESS_CHARGE_STATUS")) {
                                String string = jSONObject.getString("PROCESS_CHARGE_STATUS");
                                Status status = Status.CANCELLED;
                                if (string.equalsIgnoreCase(status.name())) {
                                    ProcessChargeResponse processChargeResponse2 = new ProcessChargeResponse((String) null, (String) null, status, (String) null);
                                    return processChargeResponse2;
                                }
                            }
                            String string2 = jSONObject.has(PaymentConstants.SIGNATURE) ? jSONObject.getString(PaymentConstants.SIGNATURE) : null;
                            if (jSONObject.has("response")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                                ProcessChargeResponse processChargeResponse3 = new ProcessChargeResponse(string2, jSONObject2.getString("transactionId"), Status.COMPLETED, jSONObject2.has("payUrl") ? jSONObject2.getString("payUrl") : null);
                                return processChargeResponse3;
                            }
                        }
                    } catch (Exception e11) {
                        j.g("ProcessChargeResponse", "Error while parsing PROCESS_CHARGE_RESPONSE", e11);
                        n.d(i.a.PROCESS_CHARGE_RESPONSE_PARSING_FAILED);
                    }
                }
            }
        }
        return null;
    }

    public String f() {
        return this.f1138c;
    }

    private ProcessChargeResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1139d = Status.COMPLETED;
        String str12 = str;
        this.f1285b = str12;
        String str13 = str5;
        this.f1138c = str13;
        this.f1284a = new HashMap<String, String>(str12, str2, str3, str4, str13, str7, str8, str9, str10, str11) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1144a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f1145b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f1146c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f1147d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f1148e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f1149f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f1150g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f1151h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f1152i;
            final /* synthetic */ String j;

            {
                this.f1144a = r2;
                this.f1145b = r3;
                this.f1146c = r4;
                this.f1147d = r5;
                this.f1148e = r6;
                this.f1149f = r7;
                this.f1150g = r8;
                this.f1151h = r9;
                this.f1152i = r10;
                this.j = r11;
                put(PaymentConstants.SIGNATURE, r2);
                put("orderTotalCurrencyCode", r3);
                if (r4 != null) {
                    put("customInformation", r4);
                }
                put("orderTotalAmount", r5);
                put("amazonOrderId", r6);
                put("description", r7);
                put("reasonCode", r8);
                put("transactionDate", r9);
                put("sellerOrderId", r10);
                put("status", r11);
            }
        };
    }
}
