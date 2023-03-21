package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

/* compiled from: SubscriptionCartItem.kt */
public final class SubscriptionCartItem {
    @SerializedName("plan_id")
    private Integer planID;
    @SerializedName("quantity")
    private Integer quantity;

    public final Integer getPlanID() {
        return this.planID;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final void setPlanID(Integer num) {
        this.planID = num;
    }

    public final void setQuantity(Integer num) {
        this.quantity = num;
    }
}
