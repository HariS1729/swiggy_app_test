package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.address.v2.di.AddressRepo;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeleteAddress;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: DeleteAddressUseCase.kt */
public final class DeleteAddressUseCase extends FlowUseCase<PostableDeleteAddress, SwiggyBaseResponse> {
    private final AddressRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteAddressUseCase(@AddressRepo AddressRepository addressRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(addressRepository, "repository");
        this.repository = addressRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyBaseResponse>> execute(PostableDeleteAddress postableDeleteAddress) {
        p.j(postableDeleteAddress, "parameters");
        return this.repository.deleteAddress(postableDeleteAddress);
    }
}
