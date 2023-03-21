package in.swiggy.android.tejas.deliveryInstructions.repository;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import in.swiggy.android.tejas.deliveryInstructions.EditOrderRequest;
import in.swiggy.android.tejas.deliveryInstructions.EditOrderResponse;
import in.swiggy.android.tejas.deliveryInstructions.api.IEditOrderApi;
import in.swiggy.android.tejas.deliveryInstructions.api.ISingleOrderApi;
import in.swiggy.android.tejas.deliveryInstructions.transformers.EditOrderResponseTransformer;
import in.swiggy.android.tejas.deliveryInstructions.transformers.OrderDataToAddressTransformer;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: DeliveryInstructionsUpdateRepo.kt */
public final class DeliveryInstructionsUpdateRepo {
    private final IEditOrderApi editOrderApi;
    private final ISingleOrderApi singleOrderApi;
    private final Map<Class<? extends ModelTransformer>, ModelTransformer> transformers;

    public DeliveryInstructionsUpdateRepo(IEditOrderApi iEditOrderApi, ISingleOrderApi iSingleOrderApi, Map<Class<? extends ModelTransformer>, ModelTransformer> map) {
        p.j(iEditOrderApi, "editOrderApi");
        p.j(iSingleOrderApi, "singleOrderApi");
        p.j(map, "transformers");
        this.editOrderApi = iEditOrderApi;
        this.singleOrderApi = iSingleOrderApi;
        this.transformers = map;
    }

    public final d<Response<SwiggyApiResponse<Address>>> getAddressFromOrder(String str) {
        p.j(str, "orderId");
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        d<retrofit2.Response<SwiggyApiResponse<SingleOrderResponseData>>> orderData = this.singleOrderApi.getOrderData(str);
        ModelTransformer modelTransformer = this.transformers.get(OrderDataToAddressTransformer.class);
        Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.deliveryInstructions.transformers.OrderDataToAddressTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager, orderData, false, (IErrorChecker) null, (OrderDataToAddressTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }

    public final d<Response<SwiggyApiResponse<EditOrderResponse>>> updateDeliveryInstructions(EditOrderRequest editOrderRequest) {
        p.j(editOrderRequest, "editOrderRequest");
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        d<retrofit2.Response<EditOrderResponse>> updateDeliveryInstructions = this.editOrderApi.updateDeliveryInstructions(editOrderRequest);
        ModelTransformer modelTransformer = this.transformers.get(EditOrderResponseTransformer.class);
        Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.deliveryInstructions.transformers.EditOrderResponseTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager, updateDeliveryInstructions, false, (IErrorChecker) null, (EditOrderResponseTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }
}
