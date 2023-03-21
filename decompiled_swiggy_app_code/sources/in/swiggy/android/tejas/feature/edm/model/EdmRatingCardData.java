package in.swiggy.android.tejas.feature.edm.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;

/* compiled from: EdmRatingCardData.kt */
public final class EdmRatingCardData {
    @SerializedName("creativeId")
    private String creativeId;
    @SerializedName("order_id")
    private String orderId;
    @SerializedName("restaurantName")
    private String restaurantName;

    public EdmRatingCardData() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public EdmRatingCardData(String str, String str2, String str3) {
        this.creativeId = str;
        this.restaurantName = str2;
        this.orderId = str3;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getRestaurantName() {
        return this.restaurantName;
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setRestaurantName(String str) {
        this.restaurantName = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EdmRatingCardData(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
