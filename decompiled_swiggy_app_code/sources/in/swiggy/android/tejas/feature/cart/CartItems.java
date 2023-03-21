package in.swiggy.android.tejas.feature.cart;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.tejas.oldapi.models.cart.CartLatLng;
import in.swiggy.android.tejas.oldapi.models.cart.CartType;
import in.swiggy.android.tejas.oldapi.models.cart.MealItem;
import java.util.ArrayList;
import java.util.List;
import os.g0;

@Instrumented
public class CartItems {
    @SerializedName("cartLatLong")
    public CartLatLng cartLatLng;
    @SerializedName("corporate_passcode")
    public String corporatePasscode;
    @SerializedName("first_time_user")
    public boolean firstTimeUser = true;
    @SerializedName("sld")
    public int isSld = 0;
    @SerializedName("address_id")
    public String mAddressId;
    @SerializedName("cartItems")
    public List<CartItem> mCartItems = new ArrayList(1);
    @SerializedName("cart_type")
    public CartType mCartType = CartType.REGULAR;
    @SerializedName("couponCode")
    public String mCouponCode;
    @SerializedName("mealItems")
    public List<MealItem> mMealItems = new ArrayList(1);
    @SerializedName("restaurantId")
    public String mRestaurantId;
    @SerializedName("removed_plan_ids")
    public List<Long> removedSubscriptionPlanId = new ArrayList(1);
    @SerializedName("shared")
    public boolean shared;
    @SerializedName("subscriptionItems")
    public List<SubscriptionCartItem> subscriptionCartItems = new ArrayList(1);

    public String toString() {
        Gson i11 = g0.i();
        return !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
    }
}
