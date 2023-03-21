package in.swiggy.android.tejas.deliveryInstructions;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.api.TransformerKey;
import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import in.swiggy.android.tejas.deliveryInstructions.api.IEditOrderApi;
import in.swiggy.android.tejas.deliveryInstructions.api.ISingleOrderApi;
import in.swiggy.android.tejas.deliveryInstructions.transformers.EditOrderResponseTransformer;
import in.swiggy.android.tejas.deliveryInstructions.transformers.OrderDataToAddressTransformer;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: DeliveryInstructionsModule.kt */
public interface DeliveryInstructionsModule {
    public static final Dependencies Dependencies = Dependencies.$$INSTANCE;

    /* compiled from: DeliveryInstructionsModule.kt */
    public static final class Dependencies {
        static final /* synthetic */ Dependencies $$INSTANCE = new Dependencies();

        private Dependencies() {
        }

        public final IEditOrderApi providesEditOrderApi(@RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API) Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IEditOrderApi) retrofit.create(IEditOrderApi.class);
        }

        public final ISingleOrderApi providesSingleOrderApi(@RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API) Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (ISingleOrderApi) retrofit.create(ISingleOrderApi.class);
        }
    }

    @TransformerKey(EditOrderResponseTransformer.class)
    ModelTransformer createEditOrderResponseTransformer(EditOrderResponseTransformer editOrderResponseTransformer);

    @TransformerKey(OrderDataToAddressTransformer.class)
    ModelTransformer singleOrderResponseTransformer(OrderDataToAddressTransformer orderDataToAddressTransformer);
}
