package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

/* compiled from: ReviewedCartSubscriptionItem.kt */
public final class ReviewedCartSubscriptionItem {
    @SerializedName("discount_applied")
    private final Boolean discountApplied = Boolean.FALSE;
    @SerializedName("final_price")
    private final Double finalPrice;
    @SerializedName("name")
    private final String name;
    @SerializedName("plan_id")
    private final Integer planId;
    @SerializedName("sub_total")
    private final Double subTotal;
    @SerializedName("total")
    private final Double total;

    public final Double getConvertedBasePrice() {
        Double d11 = this.subTotal;
        if (d11 == null) {
            return null;
        }
        return Double.valueOf(d11.doubleValue() / ((double) 100.0f));
    }

    public final Double getConvertedFinalPrice() {
        Double d11 = this.finalPrice;
        if (d11 == null) {
            return null;
        }
        return Double.valueOf(d11.doubleValue() / ((double) 100.0f));
    }

    public final Boolean getDiscountApplied() {
        return this.discountApplied;
    }

    public final Double getFinalPrice() {
        return this.finalPrice;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPlanId() {
        return this.planId;
    }

    public final Double getSubTotal() {
        return this.subTotal;
    }

    public final Double getTotal() {
        return this.total;
    }

    public final Boolean isDiscountApplied() {
        return this.discountApplied;
    }
}
