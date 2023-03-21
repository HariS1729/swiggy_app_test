package in.swiggy.android.tejas.deliveryInstructions.api;

import in.swiggy.android.tejas.deliveryInstructions.EditOrderRequest;
import in.swiggy.android.tejas.deliveryInstructions.EditOrderResponse;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: IEditOrderApi.kt */
public interface IEditOrderApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: IEditOrderApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String EDIT_PATH = "/api/v4/order/edit";

        private Companion() {
        }
    }

    @POST("/api/v4/order/edit")
    d<Response<EditOrderResponse>> updateDeliveryInstructions(@Body EditOrderRequest editOrderRequest);
}
