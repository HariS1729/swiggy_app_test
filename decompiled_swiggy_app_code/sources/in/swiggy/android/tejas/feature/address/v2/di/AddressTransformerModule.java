package in.swiggy.android.tejas.feature.address.v2.di;

import in.swiggy.android.tejas.api.TransformerKey;
import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.CreateAddressResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressByIdResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressesResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.GetDefaultingAddressResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.UpdateAddressResponseTransformer;

/* compiled from: AddressTransformerModule.kt */
public interface AddressTransformerModule {
    @TransformerKey(GetDefaultingAddressResponseTransformer.class)
    ModelTransformer GetDefaultedAddressesResponse(GetDefaultingAddressResponseTransformer getDefaultingAddressResponseTransformer);

    @TransformerKey(CreateAddressResponseTransformer.class)
    ModelTransformer createAddressResponse(CreateAddressResponseTransformer createAddressResponseTransformer);

    @TransformerKey(GetAddressByIdResponseTransformer.class)
    ModelTransformer getAddressByIdResponse(GetAddressByIdResponseTransformer getAddressByIdResponseTransformer);

    @TransformerKey(GetAddressesResponseTransformer.class)
    ModelTransformer getAllAddressResponse(GetAddressesResponseTransformer getAddressesResponseTransformer);

    @TransformerKey(UpdateAddressResponseTransformer.class)
    ModelTransformer updateAddressResponse(UpdateAddressResponseTransformer updateAddressResponseTransformer);
}
