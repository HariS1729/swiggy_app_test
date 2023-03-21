package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GetAddressDefaultingResponseData.kt */
public final class GetAddressDefaultingResponseData {
    @SerializedName("addresses")
    private List<Address> addresses;
    @SerializedName("defaulting_info")
    private DefaultingAddressInfo defaultingInfo;
    @SerializedName("defaulting_type")
    private int defaultingType;

    public GetAddressDefaultingResponseData(int i11, DefaultingAddressInfo defaultingAddressInfo, List<Address> list) {
        p.j(defaultingAddressInfo, "defaultingInfo");
        p.j(list, "addresses");
        this.defaultingType = i11;
        this.defaultingInfo = defaultingAddressInfo;
        this.addresses = list;
    }

    public static /* synthetic */ GetAddressDefaultingResponseData copy$default(GetAddressDefaultingResponseData getAddressDefaultingResponseData, int i11, DefaultingAddressInfo defaultingAddressInfo, List<Address> list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = getAddressDefaultingResponseData.defaultingType;
        }
        if ((i12 & 2) != 0) {
            defaultingAddressInfo = getAddressDefaultingResponseData.defaultingInfo;
        }
        if ((i12 & 4) != 0) {
            list = getAddressDefaultingResponseData.addresses;
        }
        return getAddressDefaultingResponseData.copy(i11, defaultingAddressInfo, list);
    }

    public final int component1() {
        return this.defaultingType;
    }

    public final DefaultingAddressInfo component2() {
        return this.defaultingInfo;
    }

    public final List<Address> component3() {
        return this.addresses;
    }

    public final GetAddressDefaultingResponseData copy(int i11, DefaultingAddressInfo defaultingAddressInfo, List<Address> list) {
        p.j(defaultingAddressInfo, "defaultingInfo");
        p.j(list, "addresses");
        return new GetAddressDefaultingResponseData(i11, defaultingAddressInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAddressDefaultingResponseData)) {
            return false;
        }
        GetAddressDefaultingResponseData getAddressDefaultingResponseData = (GetAddressDefaultingResponseData) obj;
        return this.defaultingType == getAddressDefaultingResponseData.defaultingType && p.e(this.defaultingInfo, getAddressDefaultingResponseData.defaultingInfo) && p.e(this.addresses, getAddressDefaultingResponseData.addresses);
    }

    public final List<Address> getAddresses() {
        return this.addresses;
    }

    public final DefaultingAddressInfo getDefaultingInfo() {
        return this.defaultingInfo;
    }

    public final int getDefaultingType() {
        return this.defaultingType;
    }

    public int hashCode() {
        return (((this.defaultingType * 31) + this.defaultingInfo.hashCode()) * 31) + this.addresses.hashCode();
    }

    public final void setAddresses(List<Address> list) {
        p.j(list, "<set-?>");
        this.addresses = list;
    }

    public final void setDefaultingInfo(DefaultingAddressInfo defaultingAddressInfo) {
        p.j(defaultingAddressInfo, "<set-?>");
        this.defaultingInfo = defaultingAddressInfo;
    }

    public final void setDefaultingType(int i11) {
        this.defaultingType = i11;
    }

    public String toString() {
        return "GetAddressDefaultingResponseData(defaultingType=" + this.defaultingType + ", defaultingInfo=" + this.defaultingInfo + ", addresses=" + this.addresses + ')';
    }
}
