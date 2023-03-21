package in.swiggy.android.tejas.feature.address.v2.repository;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import in.swiggy.android.tejas.feature.address.model.PostableAddress;
import in.swiggy.android.tejas.feature.address.model.UpdateAddress;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeleteAddress;
import kotlinx.coroutines.flow.d;

/* compiled from: AddressRepository.kt */
public interface AddressRepository {
    d<Response<SwiggyApiResponse<AddAddressData>>> addAddress(PostableAddress postableAddress, boolean z11);

    d<Response<SwiggyApiResponse<AddAddressData>>> addPopAddress(PostableAddress postableAddress);

    d<Response<SwiggyApiResponse<Object>>> deleteAddress(PostableDeleteAddress postableDeleteAddress);

    d<Response<SwiggyApiResponse<Address>>> getAddressById(String str);

    d<Response<SwiggyApiResponse<AllAddress>>> getAllAddresses(String str);

    d<Response<SwiggyApiResponse<GetAddressDefaultingResponseData>>> getAllDefaultingAddresses(String str, int i11, String str2, String str3);

    d<Response<SwiggyApiResponse<AddAddressData>>> updateAddress(UpdateAddress updateAddress);
}
