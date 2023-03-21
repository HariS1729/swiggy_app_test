package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

/* compiled from: ReviewedCartItem.kt */
public final class ReviewedCartItem {
    @SerializedName("inventory")
    private final int inventory;
    @SerializedName("in_stock")
    private final boolean isInStock;
    @SerializedName("base_price")
    private double mBasePrice;
    @SerializedName("final_price")
    private double mFinalPrice;
    @SerializedName("cloudinaryImageId")
    private String mImagePath;
    @SerializedName("isVeg")
    private boolean mIsVeg;
    @SerializedName("menu_item_id")
    private String mMenuItemId;
    @SerializedName("name")
    private String mName;
    @SerializedName("packing_charge")
    private double mPackagingCharge;
    @SerializedName("quantity")
    private int mQuantity;
    @SerializedName("rewardType")
    private String mRewardType;
    @SerializedName("subtotal")
    private double mSubtotal;

    public final int getInventory() {
        return this.inventory;
    }

    public final double getMBasePrice() {
        return this.mBasePrice;
    }

    public final double getMFinalPrice() {
        return this.mFinalPrice;
    }

    public final String getMImagePath() {
        return this.mImagePath;
    }

    public final boolean getMIsVeg() {
        return this.mIsVeg;
    }

    public final String getMMenuItemId() {
        return this.mMenuItemId;
    }

    public final String getMName() {
        return this.mName;
    }

    public final double getMPackagingCharge() {
        return this.mPackagingCharge;
    }

    public final int getMQuantity() {
        return this.mQuantity;
    }

    public final String getMRewardType() {
        return this.mRewardType;
    }

    public final double getMSubtotal() {
        return this.mSubtotal;
    }

    public final boolean isInStock() {
        return this.isInStock;
    }

    public final void setMBasePrice(double d11) {
        this.mBasePrice = d11;
    }

    public final void setMFinalPrice(double d11) {
        this.mFinalPrice = d11;
    }

    public final void setMImagePath(String str) {
        this.mImagePath = str;
    }

    public final void setMIsVeg(boolean z11) {
        this.mIsVeg = z11;
    }

    public final void setMMenuItemId(String str) {
        this.mMenuItemId = str;
    }

    public final void setMName(String str) {
        this.mName = str;
    }

    public final void setMPackagingCharge(double d11) {
        this.mPackagingCharge = d11;
    }

    public final void setMQuantity(int i11) {
        this.mQuantity = i11;
    }

    public final void setMRewardType(String str) {
        this.mRewardType = str;
    }

    public final void setMSubtotal(double d11) {
        this.mSubtotal = d11;
    }
}
