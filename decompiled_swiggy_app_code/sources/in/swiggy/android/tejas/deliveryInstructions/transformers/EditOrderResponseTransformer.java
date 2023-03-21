package in.swiggy.android.tejas.deliveryInstructions.transformers;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.deliveryInstructions.EditOrderResponse;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: EditOrderResponseTransformer.kt */
public final class EditOrderResponseTransformer extends FlowModelTransformer<EditOrderResponse, SwiggyApiResponse<EditOrderResponse>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<EditOrderResponse>>> execute(EditOrderResponse editOrderResponse) {
        p.j(editOrderResponse, "parameters");
        return f.x(new EditOrderResponseTransformer$execute$1(editOrderResponse, (c<? super EditOrderResponseTransformer$execute$1>) null));
    }
}
