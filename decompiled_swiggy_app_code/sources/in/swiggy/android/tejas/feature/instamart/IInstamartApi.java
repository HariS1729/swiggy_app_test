package in.swiggy.android.tejas.feature.instamart;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.instamart.model.ClearCartResponse;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: IInstamartApi.kt */
public interface IInstamartApi {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String INSTAMART_CLEAR_CART_API = "/api/v2/view/clear-cart?cartType=INSTAMART";
    public static final String INSTAMART_GET_CART_API = "/api/v2/view?cartType=INSTAMART";

    /* compiled from: IInstamartApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String INSTAMART_CLEAR_CART_API = "/api/v2/view/clear-cart?cartType=INSTAMART";
        public static final String INSTAMART_GET_CART_API = "/api/v2/view?cartType=INSTAMART";

        private Companion() {
        }
    }

    @POST("/api/v2/view/clear-cart?cartType=INSTAMART")
    d<Response<SwiggyApiResponse<ClearCartResponse>>> clearInstamartCart();

    @GET("/api/v2/view?cartType=INSTAMART")
    d<Response<SwiggyApiResponse<GetIMCartData>>> getInstamartCart();
}
