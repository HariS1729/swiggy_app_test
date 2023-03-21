package in.swiggy.android.tejas.deliveryInstructions.transformers;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: OrderDataToAddressTransformer.kt */
public final class OrderDataToAddressTransformer extends FlowModelTransformer<SwiggyApiResponse<SingleOrderResponseData>, SwiggyApiResponse<Address>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<Address>>> execute(SwiggyApiResponse<SingleOrderResponseData> swiggyApiResponse) {
        p.j(swiggyApiResponse, "parameters");
        return f.x(new OrderDataToAddressTransformer$execute$1(swiggyApiResponse, (c<? super OrderDataToAddressTransformer$execute$1>) null));
    }
}
