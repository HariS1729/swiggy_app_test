package in.swiggy.android.tejas.deliveryInstructions.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.deliveryInstructions.repository.DeliveryInstructionsUpdateRepo;
import in.swiggy.android.tejas.feature.address.model.Address;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: GetAddressFromOrderUseCase.kt */
public final class GetAddressFromOrderUseCase extends FlowUseCase<String, SwiggyApiResponse<Address>> {
    private final DeliveryInstructionsUpdateRepo diUpdateRepo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAddressFromOrderUseCase(DeliveryInstructionsUpdateRepo deliveryInstructionsUpdateRepo) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(deliveryInstructionsUpdateRepo, "diUpdateRepo");
        this.diUpdateRepo = deliveryInstructionsUpdateRepo;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<Address>>> execute(String str) {
        p.j(str, "parameters");
        return this.diUpdateRepo.getAddressFromOrder(str);
    }
}
