package in.swiggy.android.tejas.feature.chathead.models;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: Meta.kt */
public final class Meta {
    @SerializedName("orderId")
    private final String orderId;
    @SerializedName("orderRestaurantName")
    private final String orderRestaurantName;
    @SerializedName("orderType")
    private final String orderType;

    public Meta(String str, String str2, String str3) {
        p.j(str, "orderId");
        p.j(str2, "orderRestaurantName");
        p.j(str3, "orderType");
        this.orderId = str;
        this.orderRestaurantName = str2;
        this.orderType = str3;
    }

    public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = meta.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = meta.orderRestaurantName;
        }
        if ((i11 & 4) != 0) {
            str3 = meta.orderType;
        }
        return meta.copy(str, str2, str3);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.orderRestaurantName;
    }

    public final String component3() {
        return this.orderType;
    }

    public final Meta copy(String str, String str2, String str3) {
        p.j(str, "orderId");
        p.j(str2, "orderRestaurantName");
        p.j(str3, "orderType");
        return new Meta(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return p.e(this.orderId, meta.orderId) && p.e(this.orderRestaurantName, meta.orderRestaurantName) && p.e(this.orderType, meta.orderType);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderRestaurantName() {
        return this.orderRestaurantName;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        return (((this.orderId.hashCode() * 31) + this.orderRestaurantName.hashCode()) * 31) + this.orderType.hashCode();
    }

    public String toString() {
        return "Meta(orderId=" + this.orderId + ", orderRestaurantName=" + this.orderRestaurantName + ", orderType=" + this.orderType + ')';
    }
}
