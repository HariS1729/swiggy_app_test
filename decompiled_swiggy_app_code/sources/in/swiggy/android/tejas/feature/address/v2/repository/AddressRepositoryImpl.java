package in.swiggy.android.tejas.feature.address.v2.repository;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import in.swiggy.android.tejas.feature.address.model.PostableAddress;
import in.swiggy.android.tejas.feature.address.model.UpdateAddress;
import in.swiggy.android.tejas.feature.address.v2.di.AddressMaps;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeleteAddress;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: AddressRepositoryImpl.kt */
public final class AddressRepositoryImpl implements AddressRepository {
    private final AddressRepository repository;

    public AddressRepositoryImpl(@AddressMaps AddressRepository addressRepository) {
        p.j(addressRepository, "repository");
        this.repository = addressRepository;
    }

    public d<Response<SwiggyApiResponse<AddAddressData>>> addAddress(PostableAddress postableAddress, boolean z11) {
        p.j(postableAddress, "postAddress");
        return this.repository.addAddress(postableAddress, z11);
    }

    public d<Response<SwiggyApiResponse<AddAddressData>>> addPopAddress(PostableAddress postableAddress) {
        p.j(postableAddress, "postAddress");
        return this.repository.addPopAddress(postableAddress);
    }

    public d<Response<SwiggyApiResponse<Object>>> deleteAddress(PostableDeleteAddress postableDeleteAddress) {
        p.j(postableDeleteAddress, "postAddress");
        return this.repository.deleteAddress(postableDeleteAddress);
    }

    public d<Response<SwiggyApiResponse<Address>>> getAddressById(String str) {
        p.j(str, "addressId");
        return this.repository.getAddressById(str);
    }

    public d<Response<SwiggyApiResponse<AllAddress>>> getAllAddresses(String str) {
        p.j(str, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        return this.repository.getAllAddresses(str);
    }

    public d<Response<SwiggyApiResponse<GetAddressDefaultingResponseData>>> getAllDefaultingAddresses(String str, int i11, String str2, String str3) {
        p.j(str, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        p.j(str2, "requestId");
        p.j(str3, "source");
        return this.repository.getAllDefaultingAddresses(str, i11, str2, str3);
    }

    public d<Response<SwiggyApiResponse<AddAddressData>>> updateAddress(UpdateAddress updateAddress) {
        p.j(updateAddress, "updateAddressData");
        return this.repository.updateAddress(updateAddress);
    }
}
