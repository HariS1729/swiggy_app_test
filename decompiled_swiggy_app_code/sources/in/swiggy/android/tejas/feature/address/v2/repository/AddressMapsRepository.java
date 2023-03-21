package in.swiggy.android.tejas.feature.address.v2.repository;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.swiggy.locationplatform.centraladdressservice.v1.CreateAddressResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressByAddressIDResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateType;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import in.swiggy.android.tejas.feature.address.model.PostableAddress;
import in.swiggy.android.tejas.feature.address.model.UpdateAddress;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsJsonApi;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsProtoApi;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.AddressTranformerUtilsKt;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.CreateAddressResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressByIdResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressesResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.GetDefaultingAddressResponseTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.PartialUpdateTransformerUtilsKt;
import in.swiggy.android.tejas.feature.address.v2.api.transformer.UpdateAddressResponseTransformer;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeleteAddress;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import os.a;

/* compiled from: AddressMapsRepository.kt */
public final class AddressMapsRepository implements AddressRepository {
    private final IAddressMapsProtoApi api;
    private final Map<Class<? extends ModelTransformer>, ModelTransformer> transformers;

    /* compiled from: AddressMapsRepository.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateType.values().length];
            iArr[UpdateType.UNRECOGNIZED.ordinal()] = 1;
            iArr[UpdateType.UPDATE_TYPE_INVALID.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AddressMapsRepository(Map<Class<? extends ModelTransformer>, ModelTransformer> map, a aVar, IAddressMapsProtoApi iAddressMapsProtoApi, IAddressMapsJsonApi iAddressMapsJsonApi) {
        p.j(map, "transformers");
        p.j(aVar, "appBuildDetails");
        p.j(iAddressMapsProtoApi, "addressProtoApi");
        p.j(iAddressMapsJsonApi, "addressJsonApi");
        this.transformers = map;
        this.api = !aVar.j() ? iAddressMapsJsonApi : iAddressMapsProtoApi;
    }

    public d<Response<SwiggyApiResponse<AddAddressData>>> addAddress(PostableAddress postableAddress, boolean z11) {
        p.j(postableAddress, "postAddress");
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        d<retrofit2.Response<CreateAddressResponse>> addAddress = this.api.addAddress(AddressTranformerUtilsKt.createAddress(postableAddress, z11));
        ModelTransformer modelTransformer = this.transformers.get(CreateAddressResponseTransformer.class);
        Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.feature.address.v2.api.transformer.CreateAddressResponseTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager, addAddress, false, (IErrorChecker) null, (CreateAddressResponseTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }

    public d<Response<SwiggyApiResponse<AddAddressData>>> addPopAddress(PostableAddress postableAddress) {
        p.j(postableAddress, "postAddress");
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.api.addPopAddress(postableAddress), false, (IErrorChecker) null, (FlowModelTransformer) null, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 62, (Object) null);
    }

    public d<Response<SwiggyApiResponse<Object>>> deleteAddress(PostableDeleteAddress postableDeleteAddress) {
        p.j(postableDeleteAddress, "postAddress");
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.api.deleteAddress(AddressTranformerUtilsKt.deleteAddress(postableDeleteAddress)), false, (IErrorChecker) null, (FlowModelTransformer) null, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 62, (Object) null);
    }

    public d<Response<SwiggyApiResponse<Address>>> getAddressById(String str) {
        p.j(str, "addressId");
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        d<retrofit2.Response<GetAddressByAddressIDResponse>> addressById = this.api.getAddressById(str);
        ModelTransformer modelTransformer = this.transformers.get(GetAddressByIdResponseTransformer.class);
        Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressByIdResponseTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager, addressById, false, (IErrorChecker) null, (GetAddressByIdResponseTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }

    public d<Response<SwiggyApiResponse<AllAddress>>> getAllAddresses(String str) {
        p.j(str, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        d allAddresses$default = IAddressMapsProtoApi.DefaultImpls.getAllAddresses$default(this.api, str, 0, 0, 6, (Object) null);
        ModelTransformer modelTransformer = this.transformers.get(GetAddressesResponseTransformer.class);
        Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressesResponseTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager, allAddresses$default, false, (IErrorChecker) null, (GetAddressesResponseTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }

    public d<Response<SwiggyApiResponse<GetAddressDefaultingResponseData>>> getAllDefaultingAddresses(String str, int i11, String str2, String str3) {
        p.j(str, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        p.j(str2, "requestId");
        p.j(str3, "source");
        ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
        d allDefaultingAddresses$default = IAddressMapsProtoApi.DefaultImpls.getAllDefaultingAddresses$default(this.api, str, i11, str2, Integer.parseInt(str3), 0, 0, 48, (Object) null);
        ModelTransformer modelTransformer = this.transformers.get(GetDefaultingAddressResponseTransformer.class);
        Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.feature.address.v2.api.transformer.GetDefaultingAddressResponseTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager, allDefaultingAddresses$default, false, (IErrorChecker) null, (GetDefaultingAddressResponseTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }

    public d<Response<SwiggyApiResponse<AddAddressData>>> updateAddress(UpdateAddress updateAddress) {
        Class<UpdateAddressResponseTransformer> cls = UpdateAddressResponseTransformer.class;
        p.j(updateAddress, "updateAddressData");
        int i11 = WhenMappings.$EnumSwitchMapping$0[updateAddress.getUpdateType().ordinal()];
        if (i11 == 1 || i11 == 2) {
            ResponseTransformerManager responseTransformerManager = ResponseTransformerManager.INSTANCE;
            d<retrofit2.Response<UpdateAddressResponse>> updateAddress2 = this.api.updateAddress(AddressTranformerUtilsKt.updateAddress(updateAddress.getAddress()));
            ModelTransformer modelTransformer = this.transformers.get(cls);
            Objects.requireNonNull(modelTransformer, "null cannot be cast to non-null type `in`.swiggy.android.tejas.feature.address.v2.api.transformer.UpdateAddressResponseTransformer");
            return ResponseTransformerManager.buildResponse$default(responseTransformerManager, updateAddress2, false, (IErrorChecker) null, (UpdateAddressResponseTransformer) modelTransformer, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
        }
        ResponseTransformerManager responseTransformerManager2 = ResponseTransformerManager.INSTANCE;
        d<retrofit2.Response<UpdateAddressResponse>> partialAddressUpdate = this.api.partialAddressUpdate(PartialUpdateTransformerUtilsKt.getPartialUpdateEvent(updateAddress));
        ModelTransformer modelTransformer2 = this.transformers.get(cls);
        Objects.requireNonNull(modelTransformer2, "null cannot be cast to non-null type `in`.swiggy.android.tejas.feature.address.v2.api.transformer.UpdateAddressResponseTransformer");
        return ResponseTransformerManager.buildResponse$default(responseTransformerManager2, partialAddressUpdate, false, (IErrorChecker) null, (UpdateAddressResponseTransformer) modelTransformer2, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 54, (Object) null);
    }
}
