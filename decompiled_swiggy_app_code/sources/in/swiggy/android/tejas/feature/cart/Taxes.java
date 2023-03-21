package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

public class Taxes {
    @SerializedName("service_charges")
    public double mServiceCharge;
    @SerializedName("service_tax")
    public double mServiceTax;
    @SerializedName("vat")
    public double mVat;

    public String toString() {
        return "Taxes{mVat=" + this.mVat + ", mServiceTax=" + this.mServiceTax + ", mServiceCharge=" + this.mServiceCharge + '}';
    }
}
