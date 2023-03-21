package in.swiggy.android.tejas.feature.address.v2.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import in.swiggy.android.tejas.feature.address.v2.di.AddressRepo;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: GetAllAddressUseCase.kt */
public final class GetAllAddressUseCase extends FlowUseCase<String, SwiggyApiResponse<AllAddress>> {
    private final AddressRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAllAddressUseCase(@AddressRepo AddressRepository addressRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(addressRepository, "repository");
        this.repository = addressRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<AllAddress>>> execute(String str) {
        p.j(str, "parameters");
        return this.repository.getAllAddresses(str);
    }
}
