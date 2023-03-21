package ze0;

import bf0.c;
import cg0.n;
import in.swiggy.android.repositories.cart.data.a;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.cart.CartItems;
import in.swiggy.android.tejas.oldapi.models.cart.CartLatLng;
import in.swiggy.android.tejas.oldapi.models.cart.CartType;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCart;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCartItem;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCartMeal;
import in.swiggy.android.tejas.oldapi.models.cart.SubscriptionCartItem;
import in.swiggy.android.tejas.oldapi.models.cart.UserFlowInfo;
import in.swiggy.android.tejas.oldapi.models.cart.detip.DETipDetails;
import in.swiggy.android.tejas.oldapi.models.cart.detip.DETipDetailsRequest;
import in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.network.responses.ReviewedCartResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: RegularCart */
public class d extends a implements c {
    public d(a aVar, n nVar) {
        super(aVar);
        this.f20045b = nVar;
    }

    public ReviewedCart B() {
        ReviewedCartResponse reviewedCartResponse = this.f20044a.f18540p;
        if (reviewedCartResponse != null) {
            return reviewedCartResponse.mReviewedCart;
        }
        return null;
    }

    public void G(boolean z11) {
        this.f20044a.f18542s = Boolean.valueOf(z11);
    }

    public void H(ReviewedCartResponse reviewedCartResponse) {
        ReviewedCart reviewedCart;
        this.f20044a.f18540p = reviewedCartResponse;
        if (reviewedCartResponse != null && (reviewedCart = reviewedCartResponse.mReviewedCart) != null) {
            y0(reviewedCart.isCouponValid());
            a aVar = this.f20044a;
            if (!(aVar.f18540p == null || aVar.f18528a == null)) {
                for (int i11 = 0; i11 < this.f20044a.f18540p.mReviewedCart.mCartItems.size(); i11++) {
                    ReviewedCartItem reviewedCartItem = this.f20044a.f18540p.mReviewedCart.mCartItems.get(i11);
                    MenuItemInCart J0 = J0(reviewedCartItem);
                    if (J0 != null) {
                        J0.copyValuesFromReviewedCartItem(reviewedCartItem, Boolean.FALSE);
                    }
                }
                if (this.f20044a.f18540p.mReviewedCart.hasSuggestions()) {
                    for (MenuItem next : this.f20044a.f18540p.mReviewedCart.mSuggestions.mSuggestionsItems) {
                        next.setPrice(next.getPrice() * 100.0d);
                    }
                }
            }
            a aVar2 = this.f20044a;
            if (!(aVar2.f18540p == null || aVar2.f18529b == null)) {
                for (int i12 = 0; i12 < this.f20044a.f18540p.mReviewedCart.mMealItems.size(); i12++) {
                    ReviewedCartMeal reviewedCartMeal = this.f20044a.f18540p.mReviewedCart.mMealItems.get(i12);
                    MealItemInCart h02 = h0(reviewedCartMeal);
                    if (h02 != null) {
                        h02.copyValuesFromReviewedCartItem(reviewedCartMeal, Boolean.FALSE);
                    }
                }
            }
            E0();
            DETipDetails dETipDetails = reviewedCartResponse.mReviewedCart.deTipDetails;
            if (dETipDetails != null) {
                d0(Double.valueOf(dETipDetails.getAmount()), Boolean.valueOf(reviewedCartResponse.mReviewedCart.deTipDetails.getOptIn()));
            }
            UserFlowInfo userFlowInfo = reviewedCartResponse.mReviewedCart.userFlowInfo;
            if (userFlowInfo != null) {
                L0(userFlowInfo);
            }
        }
    }

    public void I0() {
        super.I0();
    }

    public boolean J() {
        return !isEmpty() && K0() && B().hasSuggestions();
    }

    public MenuItemInCart J0(ReviewedCartItem reviewedCartItem) {
        Map map = this.f20044a.f18528a.get(reviewedCartItem.mMenuItemId);
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (MenuItemInCart) map.get(reviewedCartItem.getCustomizationHash());
    }

    public boolean K0() {
        ReviewedCartResponse reviewedCartResponse = this.f20044a.f18540p;
        return (reviewedCartResponse == null || reviewedCartResponse.mReviewedCart == null) ? false : true;
    }

    public void L0(UserFlowInfo userFlowInfo) {
        a aVar = this.f20044a;
        if (aVar.v == null) {
            aVar.v = new UserFlowInfo();
        }
        this.f20044a.v.setCartSourceFlowType(userFlowInfo.getCartSourceFlowType());
        this.f20044a.v.setFlowData(userFlowInfo.getFlowData());
    }

    public void d0(Double d11, Boolean bool) {
        a aVar = this.f20044a;
        DETipDetailsRequest dETipDetailsRequest = aVar.f18543u;
        if (dETipDetailsRequest != null) {
            dETipDetailsRequest.setAmount(d11.doubleValue());
            this.f20044a.f18543u.setOptIn(bool.booleanValue());
            return;
        }
        aVar.f18543u = new DETipDetailsRequest();
        this.f20044a.f18543u.setAmount(d11.doubleValue());
        this.f20044a.f18543u.setOptIn(bool.booleanValue());
    }

    public CartItems w() {
        ReviewedCart reviewedCart;
        CartItems cartItems = new CartItems();
        cartItems.mRestaurantId = getRestaurantId();
        cartItems.mCartItems = new ArrayList();
        if (k0()) {
            cartItems.mCartType = CartType.CAFE;
            if (i() != null) {
                cartItems.corporatePasscode = i().corporatePasscode;
            }
        }
        Address address = this.f20044a.f18538m;
        if (address != null) {
            cartItems.mAddressId = address.getId();
        } else {
            cartItems.mAddressId = this.f20045b.getAddressId();
        }
        if (!(this.f20045b.getLatitude() == 0.0d || this.f20045b.getLongitude() == 0.0d)) {
            CartLatLng cartLatLng = new CartLatLng();
            cartLatLng.setLat(Double.valueOf(this.f20045b.getLatitude()));
            cartLatLng.setLng(Double.valueOf(this.f20045b.getLongitude()));
            cartItems.cartLatLng = cartLatLng;
        }
        for (LinkedHashMap<String, MenuItemInCart> values : this.f20044a.f18528a.values()) {
            for (MenuItemInCart cartItem : values.values()) {
                cartItems.mCartItems.add(cartItem.getCartItem());
            }
        }
        for (LinkedHashMap<String, MealItemInCart> values2 : this.f20044a.f18529b.values()) {
            for (MealItemInCart generateMealItem : values2.values()) {
                cartItems.mMealItems.add(generateMealItem.generateMealItem());
            }
        }
        a aVar = this.f20044a;
        ReviewedCartResponse reviewedCartResponse = aVar.f18540p;
        if (!(reviewedCartResponse == null || (reviewedCart = reviewedCartResponse.mReviewedCart) == null)) {
            cartItems.mCouponCode = reviewedCart.mCouponCode;
        }
        if (aVar.q != 0) {
            SubscriptionCartItem subscriptionCartItem = new SubscriptionCartItem();
            subscriptionCartItem.setPlanID(Integer.valueOf(this.f20044a.q));
            subscriptionCartItem.setQuantity(1);
            cartItems.subscriptionCartItems.add(subscriptionCartItem);
        }
        cartItems.isSld = k() ? 1 : 0;
        long j = this.f20044a.f18541r;
        if (j != 0) {
            cartItems.removedSubscriptionPlanId.add(Long.valueOf(j));
        }
        Boolean bool = this.f20044a.f18542s;
        if (bool != null) {
            cartItems.batchOptIn = bool.booleanValue();
        }
        Boolean bool2 = this.f20044a.t;
        if (bool2 != null) {
            cartItems.addressNudgeShown = bool2.booleanValue();
        }
        a aVar2 = this.f20044a;
        DETipDetailsRequest dETipDetailsRequest = aVar2.f18543u;
        if (dETipDetailsRequest != null) {
            cartItems.deTipDetails = dETipDetailsRequest;
        }
        UserFlowInfo userFlowInfo = aVar2.v;
        if (userFlowInfo != null) {
            cartItems.userFlowInfo = userFlowInfo;
        }
        List<String> list = aVar2.f18545x;
        if (list != null) {
            cartItems.selectedDeliveryInstructions = list;
        }
        String str = aVar2.f18547z;
        if (str != null && !str.isEmpty()) {
            cartItems.slaOption = this.f20044a.f18547z;
        }
        return cartItems;
    }
}
