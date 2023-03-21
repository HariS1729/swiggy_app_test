package amazonpay.silentpay;

import in.juspay.hypersdk.core.PaymentConstants;

public class f extends k {

    /* renamed from: c  reason: collision with root package name */
    private String f1231c;

    public f(String str, boolean z11) {
        this.f1231c = (String) r.a(str, PaymentConstants.MERCHANT_ID_CAMEL);
        this.f1277a = z11;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f1231c;
    }
}
