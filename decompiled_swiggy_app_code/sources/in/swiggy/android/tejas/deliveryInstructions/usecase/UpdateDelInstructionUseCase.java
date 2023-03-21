package in.swiggy.android.tejas.deliveryInstructions.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.deliveryInstructions.EditOrderRequest;
import in.swiggy.android.tejas.deliveryInstructions.EditOrderResponse;
import in.swiggy.android.tejas.deliveryInstructions.repository.DeliveryInstructionsUpdateRepo;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: UpdateDelInstructionUseCase.kt */
public final class UpdateDelInstructionUseCase extends FlowUseCase<EditOrderRequest, SwiggyApiResponse<EditOrderResponse>> {
    private final DeliveryInstructionsUpdateRepo diUpdateRepo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateDelInstructionUseCase(DeliveryInstructionsUpdateRepo deliveryInstructionsUpdateRepo) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(deliveryInstructionsUpdateRepo, "diUpdateRepo");
        this.diUpdateRepo = deliveryInstructionsUpdateRepo;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<EditOrderResponse>>> execute(EditOrderRequest editOrderRequest) {
        p.j(editOrderRequest, "parameters");
        return this.diUpdateRepo.updateDeliveryInstructions(editOrderRequest);
    }
}
