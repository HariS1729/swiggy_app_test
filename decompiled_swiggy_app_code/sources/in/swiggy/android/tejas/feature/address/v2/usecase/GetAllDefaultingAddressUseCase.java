package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingRequestParam;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import in.swiggy.android.tejas.feature.address.v2.di.AddressRepo;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: GetAllDefaultingAddressUseCase.kt */
public final class GetAllDefaultingAddressUseCase extends FlowUseCase<GetAddressDefaultingRequestParam, SwiggyApiResponse<GetAddressDefaultingResponseData>> {
    private final AddressRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAllDefaultingAddressUseCase(@AddressRepo AddressRepository addressRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(addressRepository, "repository");
        this.repository = addressRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<GetAddressDefaultingResponseData>>> execute(GetAddressDefaultingRequestParam getAddressDefaultingRequestParam) {
        p.j(getAddressDefaultingRequestParam, "parameters");
        return this.repository.getAllDefaultingAddresses(getAddressDefaultingRequestParam.getUserId(), getAddressDefaultingRequestParam.isGPSOn(), getAddressDefaultingRequestParam.getRequestId(), getAddressDefaultingRequestParam.getSource());
    }
}
