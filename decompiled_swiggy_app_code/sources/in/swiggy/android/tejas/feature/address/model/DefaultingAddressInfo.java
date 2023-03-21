package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: GetAddressDefaultingResponseData.kt */
public final class DefaultingAddressInfo {
    @SerializedName("proximity_weight")
    private Double proximityWeight;

    public DefaultingAddressInfo(Double d11) {
        this.proximityWeight = d11;
    }

    public static /* synthetic */ DefaultingAddressInfo copy$default(DefaultingAddressInfo defaultingAddressInfo, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = defaultingAddressInfo.proximityWeight;
        }
        return defaultingAddressInfo.copy(d11);
    }

    public final Double component1() {
        return this.proximityWeight;
    }

    public final DefaultingAddressInfo copy(Double d11) {
        return new DefaultingAddressInfo(d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultingAddressInfo) && p.e(this.proximityWeight, ((DefaultingAddressInfo) obj).proximityWeight);
    }

    public final Double getProximityWeight() {
        return this.proximityWeight;
    }

    public int hashCode() {
        Double d11 = this.proximityWeight;
        if (d11 == null) {
            return 0;
        }
        return d11.hashCode();
    }

    public final void setProximityWeight(Double d11) {
        this.proximityWeight = d11;
    }

    public String toString() {
        return "DefaultingAddressInfo(proximityWeight=" + this.proximityWeight + ')';
    }
}
