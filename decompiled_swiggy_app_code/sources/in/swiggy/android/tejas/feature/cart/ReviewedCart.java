package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ReviewedCart.kt */
public final class ReviewedCart {
    @SerializedName("cancellation_message")
    private CancellationMessage cancellationMessage;
    @SerializedName("configurations")
    private CartConfiguration cartConfiguration;
    @SerializedName("cartId")
    private String cartId;
    @SerializedName("discount_message")
    private String discountMessage;
    @SerializedName("discount_message_type")
    private String discountMessageType;
    @SerializedName("is_coupon_valid")
    private boolean isCouponValid;
    @SerializedName("addresses")
    private List<Address> mAddresses = new ArrayList(1);
    @SerializedName("rendering_details")
    private List<? extends ReviewCartBillRenderingv2> mBillRendering = new ArrayList();
    @SerializedName("cod_enabled")
    private boolean mCODEnabled = true;
    @SerializedName("cart_menu_items")
    private List<ReviewedCartItem> mCartItems = new ArrayList(1);
    @SerializedName("cart_subtotal")
    private double mCartSubtotal;
    @SerializedName("cart_total")
    private double mCartTotal;
    @SerializedName("total_without_coupon_discount")
    private double mCartTotalWithoutDiscount;
    @SerializedName("coupon_code")
    private String mCouponCode;
    @SerializedName("coupon_error_message")
    private String mCouponErrorMessage;
    @SerializedName("coupon_success_message")
    private String mCouponSuccessMsg;
    @SerializedName("delivery_charges")
    private String mDeliveryCharge;
    @SerializedName("delivery_fee_type")
    private Integer mFeeType;
    @SerializedName("is_assured")
    private boolean mIsSwiggyAssured;
    @SerializedName("order_total")
    private double mOrderTotal;
    @SerializedName("unavailable_items")
    private List<? extends OutOfStockItem> mOutOfStockItems = new ArrayList(1);
    @SerializedName("cart_popup_version")
    private Float mPopUpVersion = Float.valueOf(0.0f);
    @SerializedName("cart_popup_msg")
    private String mPopupMessage;
    @SerializedName("cart_popup_title")
    private String mPopupTitle;
    @SerializedName("subscription_items")
    private List<ReviewedCartSubscriptionItem> mSubscriptionItems = new ArrayList(1);
    @SerializedName("cart_total_count")
    private Integer mTotalOrderCount;
    @SerializedName("trade_discount_reward_list")
    private List<String> mTradeDiscountRewardType = new ArrayList(1);
    @SerializedName("new_rendering_model")
    private boolean newRenderingModel;
    @SerializedName("user_swiggy_money")
    private double swiggyMoneyBalance;

    public final CancellationMessage getCancellationMessage() {
        return this.cancellationMessage;
    }

    public final CartConfiguration getCartConfiguration() {
        return this.cartConfiguration;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getDiscountMessage() {
        return this.discountMessage;
    }

    public final String getDiscountMessageType() {
        return this.discountMessageType;
    }

    public final List<Address> getMAddresses() {
        return this.mAddresses;
    }

    public final List<ReviewCartBillRenderingv2> getMBillRendering() {
        return this.mBillRendering;
    }

    public final boolean getMCODEnabled() {
        return this.mCODEnabled;
    }

    public final List<ReviewedCartItem> getMCartItems() {
        return this.mCartItems;
    }

    public final double getMCartSubtotal() {
        return this.mCartSubtotal;
    }

    public final double getMCartTotal() {
        return this.mCartTotal;
    }

    public final double getMCartTotalWithoutDiscount() {
        return this.mCartTotalWithoutDiscount;
    }

    public final String getMCouponCode() {
        return this.mCouponCode;
    }

    public final String getMCouponErrorMessage() {
        return this.mCouponErrorMessage;
    }

    public final String getMCouponSuccessMsg() {
        return this.mCouponSuccessMsg;
    }

    public final String getMDeliveryCharge() {
        return this.mDeliveryCharge;
    }

    public final Integer getMFeeType() {
        return this.mFeeType;
    }

    public final boolean getMIsSwiggyAssured() {
        return this.mIsSwiggyAssured;
    }

    public final double getMOrderTotal() {
        return this.mOrderTotal;
    }

    public final List<OutOfStockItem> getMOutOfStockItems() {
        return this.mOutOfStockItems;
    }

    public final Float getMPopUpVersion() {
        return this.mPopUpVersion;
    }

    public final String getMPopupMessage() {
        return this.mPopupMessage;
    }

    public final String getMPopupTitle() {
        return this.mPopupTitle;
    }

    public final List<ReviewedCartSubscriptionItem> getMSubscriptionItems() {
        return this.mSubscriptionItems;
    }

    public final Integer getMTotalOrderCount() {
        return this.mTotalOrderCount;
    }

    public final List<String> getMTradeDiscountRewardType() {
        return this.mTradeDiscountRewardType;
    }

    public final boolean getNewRenderingModel() {
        return this.newRenderingModel;
    }

    public final double getSwiggyMoneyBalance() {
        return this.swiggyMoneyBalance;
    }

    public final boolean isCouponValid() {
        return this.isCouponValid;
    }

    public final void setCancellationMessage(CancellationMessage cancellationMessage2) {
        this.cancellationMessage = cancellationMessage2;
    }

    public final void setCartConfiguration(CartConfiguration cartConfiguration2) {
        this.cartConfiguration = cartConfiguration2;
    }

    public final void setCartId(String str) {
        this.cartId = str;
    }

    public final void setCouponValid(boolean z11) {
        this.isCouponValid = z11;
    }

    public final void setDiscountMessage(String str) {
        this.discountMessage = str;
    }

    public final void setDiscountMessageType(String str) {
        this.discountMessageType = str;
    }

    public final void setMAddresses(List<Address> list) {
        p.j(list, "<set-?>");
        this.mAddresses = list;
    }

    public final void setMBillRendering(List<? extends ReviewCartBillRenderingv2> list) {
        p.j(list, "<set-?>");
        this.mBillRendering = list;
    }

    public final void setMCODEnabled(boolean z11) {
        this.mCODEnabled = z11;
    }

    public final void setMCartItems(List<ReviewedCartItem> list) {
        p.j(list, "<set-?>");
        this.mCartItems = list;
    }

    public final void setMCartSubtotal(double d11) {
        this.mCartSubtotal = d11;
    }

    public final void setMCartTotal(double d11) {
        this.mCartTotal = d11;
    }

    public final void setMCartTotalWithoutDiscount(double d11) {
        this.mCartTotalWithoutDiscount = d11;
    }

    public final void setMCouponCode(String str) {
        this.mCouponCode = str;
    }

    public final void setMCouponErrorMessage(String str) {
        this.mCouponErrorMessage = str;
    }

    public final void setMCouponSuccessMsg(String str) {
        this.mCouponSuccessMsg = str;
    }

    public final void setMDeliveryCharge(String str) {
        this.mDeliveryCharge = str;
    }

    public final void setMFeeType(Integer num) {
        this.mFeeType = num;
    }

    public final void setMIsSwiggyAssured(boolean z11) {
        this.mIsSwiggyAssured = z11;
    }

    public final void setMOrderTotal(double d11) {
        this.mOrderTotal = d11;
    }

    public final void setMOutOfStockItems(List<? extends OutOfStockItem> list) {
        p.j(list, "<set-?>");
        this.mOutOfStockItems = list;
    }

    public final void setMPopUpVersion(Float f11) {
        this.mPopUpVersion = f11;
    }

    public final void setMPopupMessage(String str) {
        this.mPopupMessage = str;
    }

    public final void setMPopupTitle(String str) {
        this.mPopupTitle = str;
    }

    public final void setMSubscriptionItems(List<ReviewedCartSubscriptionItem> list) {
        p.j(list, "<set-?>");
        this.mSubscriptionItems = list;
    }

    public final void setMTotalOrderCount(Integer num) {
        this.mTotalOrderCount = num;
    }

    public final void setMTradeDiscountRewardType(List<String> list) {
        p.j(list, "<set-?>");
        this.mTradeDiscountRewardType = list;
    }

    public final void setNewRenderingModel(boolean z11) {
        this.newRenderingModel = z11;
    }

    public final void setSwiggyMoneyBalance(double d11) {
        this.swiggyMoneyBalance = d11;
    }
}
