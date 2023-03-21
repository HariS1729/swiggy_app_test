package in.swiggy.android.tejas.feature.detipping.api;

import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.detipping.dataType.DeTipPostOrderRequest;
import in.swiggy.android.tejas.feature.detipping.dataType.DeTipPostOrderResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: IDeTipPostOrderApi.kt */
public interface IDeTipPostOrderApi {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String DE_TIP_API = "api/v1/request/register/post_order_tip";

    /* compiled from: IDeTipPostOrderApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String DE_TIP_API = "api/v1/request/register/post_order_tip";

        private Companion() {
        }
    }

    @POST("api/v1/request/register/post_order_tip")
    Object getCartKeyForDeTip(@Body DeTipPostOrderRequest deTipPostOrderRequest, c<? super Response<SwiggyApiResponse<DeTipPostOrderResponse>>> cVar);
}
