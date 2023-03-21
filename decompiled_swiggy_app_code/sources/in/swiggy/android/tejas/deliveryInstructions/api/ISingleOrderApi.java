package in.swiggy.android.tejas.deliveryInstructions.api;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: ISingleOrderApi.kt */
public interface ISingleOrderApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ISingleOrderApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String GET_SINGLE_ORDER_API = "api/v1/order/getSingleOrder";

        private Companion() {
        }
    }

    @GET("api/v1/order/getSingleOrder")
    d<Response<SwiggyApiResponse<SingleOrderResponseData>>> getOrderData(@Query("order_id") String str);
}
