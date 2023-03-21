package in.swiggy.android.tejas.apiinterface;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.swiggypop.PopItemDetailApiResponseData;
import in.swiggy.android.tejas.oldapi.models.cart.CartItems;
import in.swiggy.android.tejas.oldapi.models.refund.ActiveRefundCountData;
import in.swiggy.android.tejas.oldapi.network.requests.PostableCoupon;
import in.swiggy.android.tejas.oldapi.network.requests.PostableMarkOrderAsReceived;
import in.swiggy.android.tejas.oldapi.network.requests.RemoveCouponRequest;
import in.swiggy.android.tejas.oldapi.network.responses.ConfirmLatLngServiceableData;
import in.swiggy.android.tejas.oldapi.network.responses.PopType;
import in.swiggy.android.tejas.oldapi.network.responses.ReviewedCartResponse;
import in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData;
import retrofit2.http.Body;
import retrofit2.http.Query;

@Deprecated
public interface ICheckoutAPI {
    ReviewedCartResponse applyCoupon(@Body PostableCoupon postableCoupon);

    ReviewedCartResponse checkCartTotals(@Body CartItems cartItems);

    SwiggyApiResponse<ConfirmLatLngServiceableData> confirmLatLngPopServiceable(@Query("lat") double d11, @Query("lng") double d12, @Query("cart_type") String str);

    SwiggyApiResponse<ConfirmLatLngServiceableData> confirmLatLngServiceable(@Query("lat") double d11, @Query("lng") double d12, @Query("cart_type") String str);

    SwiggyBaseResponse flushCart();

    SwiggyApiResponse<ActiveRefundCountData> getActiveRefundCount();

    SwiggyApiResponse<PopItemDetailApiResponseData> getPopItemDetail(@Body CartItems cartItems, @PopType @Query("pop_type") String str);

    SwiggyApiResponse<SingleOrderResponseData> getSingleOrder(@Query("order_id") String str);

    SwiggyBaseResponse markOrderAsDelivered(@Body PostableMarkOrderAsReceived postableMarkOrderAsReceived);

    ReviewedCartResponse mealCheckoutPagePrice(@Body CartItems cartItems);

    ReviewedCartResponse removeCoupon(@Body RemoveCouponRequest removeCouponRequest);

    ReviewedCartResponse updateCart(@Body CartItems cartItems);
}
