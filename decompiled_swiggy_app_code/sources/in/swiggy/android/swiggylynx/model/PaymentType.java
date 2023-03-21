package in.swiggy.android.swiggylynx.model;

/* compiled from: PaymentType.kt */
public enum PaymentType {
    NONE("NONE", (int) null, 2, (String) null),
    JUSPAY(in.swiggy.android.tejas.payment.model.payment.models.PaymentType.CARD, "android_enable_webiew_refresh_Juspay"),
    JUSPAY_NB(in.swiggy.android.tejas.payment.model.payment.models.PaymentType.NB, "android_enable_webiew_refresh_Juspay_NB"),
    AMAZON_PAY(in.swiggy.android.tejas.payment.model.payment.models.PaymentType.AMAZONPAY, "android_enable_webiew_refresh_Amazon_Pay"),
    UPI_INTENT(in.swiggy.android.tejas.payment.model.payment.models.PaymentType.UPI_INTENT, "android_enable_webiew_refresh_UPI_Intent"),
    UPI_COLLECT(in.swiggy.android.tejas.payment.model.payment.models.PaymentType.UPI_COLLECT, "android_enable_webiew_refresh_UPI_Collect");
    
    private final String identifier;
    private final String wpConfigValue;

    private PaymentType(String str, String str2) {
        this.identifier = str;
        this.wpConfigValue = str2;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getWpConfigValue() {
        return this.wpConfigValue;
    }
}
