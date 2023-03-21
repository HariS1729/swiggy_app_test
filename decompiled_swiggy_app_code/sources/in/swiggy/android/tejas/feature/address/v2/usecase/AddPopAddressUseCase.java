package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.PostableAddress;
import in.swiggy.android.tejas.feature.address.v2.di.AddressRepo;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: AddPopAddressUseCase.kt */
public final class AddPopAddressUseCase extends FlowUseCase<PostableAddress, SwiggyApiResponse<AddAddressData>> {
    private final AddressRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPopAddressUseCase(@AddressRepo AddressRepository addressRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(addressRepository, "repository");
        this.repository = addressRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<AddAddressData>>> execute(PostableAddress postableAddress) {
        p.j(postableAddress, "parameters");
        return this.repository.addPopAddress(postableAddress);
    }
}
