package amazonpay.silentpay;

import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.Map;

public class GetChargeStatusResponse extends s {

    /* renamed from: c  reason: collision with root package name */
    private String f1121c;

    /* renamed from: d  reason: collision with root package name */
    private String f1122d;

    /* renamed from: e  reason: collision with root package name */
    private String f1123e;

    /* renamed from: f  reason: collision with root package name */
    private String f1124f;

    /* renamed from: g  reason: collision with root package name */
    private String f1125g;

    /* renamed from: h  reason: collision with root package name */
    private String f1126h;

    /* renamed from: i  reason: collision with root package name */
    private String f1127i;
    private String j;
    private TransactionStatus k;

    public enum TransactionStatus {
        SUCCESS,
        PENDING,
        FAILURE
    }

    private GetChargeStatusResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10 = str3;
        String str11 = str6;
        this.f1121c = str;
        this.f1122d = str2;
        this.f1285b = str10;
        this.f1123e = str4;
        this.f1124f = str5;
        this.f1125g = str11;
        this.f1126h = str7;
        this.f1127i = str8;
        this.j = str9;
        if (str10 != null && !str10.equalsIgnoreCase(SafeJsonPrimitive.NULL_STRING)) {
            this.f1284a = new HashMap<String, String>(str3, str, str2, str4, str5, str6, str7, str8, str9) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f1128a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f1129b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f1130c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f1131d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ String f1132e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ String f1133f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ String f1134g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ String f1135h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ String f1136i;

                {
                    this.f1128a = r3;
                    this.f1129b = r4;
                    this.f1130c = r5;
                    this.f1131d = r6;
                    this.f1132e = r7;
                    this.f1133f = r8;
                    this.f1134g = r9;
                    this.f1135h = r10;
                    this.f1136i = r11;
                    put(PaymentConstants.SIGNATURE, r3);
                    GetChargeStatusResponse.this.a("transactionId", r4, this);
                    GetChargeStatusResponse.this.a("merchantTransactionId", r5, this);
                    GetChargeStatusResponse.this.a("transactionValue", r6, this);
                    GetChargeStatusResponse.this.a("transactionCurrencyCode", r7, this);
                    GetChargeStatusResponse.this.a("transactionStatusCode", r8, this);
                    GetChargeStatusResponse.this.a("transactionStatusDescription", r9, this);
                    GetChargeStatusResponse.this.a("merchantCustomData", r10, this);
                    GetChargeStatusResponse.this.a("transactionDate", r11, this);
                    put("verificationOperationName", "VERIFY_CHARGE_STATUS");
                }
            };
        }
        str6.hashCode();
        if (str11.equals("01")) {
            this.k = TransactionStatus.PENDING;
        } else if (!str11.equals("001")) {
            this.k = TransactionStatus.FAILURE;
        } else {
            this.k = TransactionStatus.SUCCESS;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r1 = new org.json.JSONObject(r13.getString("GET_CHARGE_STATUS_RESPONSE"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized amazonpay.silentpay.GetChargeStatusResponse c(android.os.Bundle r13) {
        /*
            java.lang.Class<amazonpay.silentpay.GetChargeStatusResponse> r0 = amazonpay.silentpay.GetChargeStatusResponse.class
            monitor-enter(r0)
            if (r13 == 0) goto L_0x0070
            java.lang.String r1 = "GET_CHARGE_STATUS_RESPONSE"
            boolean r1 = r13.containsKey(r1)     // Catch:{ Exception -> 0x0060 }
            if (r1 == 0) goto L_0x0070
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "GET_CHARGE_STATUS_RESPONSE"
            java.lang.String r13 = r13.getString(r2)     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r13)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r13 = "response"
            org.json.JSONObject r13 = r1.getJSONObject(r13)     // Catch:{ Exception -> 0x0060 }
            if (r13 == 0) goto L_0x0070
            amazonpay.silentpay.GetChargeStatusResponse r12 = new amazonpay.silentpay.GetChargeStatusResponse     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "transactionId"
            java.lang.String r3 = r13.getString(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "merchantTransactionId"
            java.lang.String r4 = r13.getString(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "signature"
            java.lang.String r5 = r1.getString(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "transactionValue"
            java.lang.String r6 = r13.getString(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "transactionCurrencyCode"
            java.lang.String r7 = r13.getString(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "transactionStatusCode"
            java.lang.String r8 = r13.getString(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "transactionStatusDescription"
            java.lang.String r9 = r13.getString(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "merchantCustomData"
            java.lang.String r10 = r13.getString(r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "transactionDate"
            java.lang.String r11 = r13.getString(r1)     // Catch:{ Exception -> 0x0060 }
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0060 }
            monitor-exit(r0)
            return r12
        L_0x005e:
            r13 = move-exception
            goto L_0x006e
        L_0x0060:
            r13 = move-exception
            java.lang.String r1 = "GetChargeStatusResponse"
            java.lang.String r2 = "Error while parsing GET_CHARGE_STATUS_RESPONSE response"
            amazonpay.silentpay.j.g(r1, r2, r13)     // Catch:{ all -> 0x005e }
            amazonpay.silentpay.i$a r13 = amazonpay.silentpay.i.a.PROCESS_CHARGE_RESPONSE_PARSING_FAILED     // Catch:{ all -> 0x005e }
            amazonpay.silentpay.n.d(r13)     // Catch:{ all -> 0x005e }
            goto L_0x0070
        L_0x006e:
            monitor-exit(r0)
            throw r13
        L_0x0070:
            r13 = 0
            monitor-exit(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: amazonpay.silentpay.GetChargeStatusResponse.c(android.os.Bundle):amazonpay.silentpay.GetChargeStatusResponse");
    }

    public Map<String, String> b() {
        return super.b();
    }

    public TransactionStatus d() {
        return this.k;
    }
}
