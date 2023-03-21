package in.swiggy.android.tejas.feature.address.v2.api;

import com.swiggy.locationplatform.centraladdressservice.v1.CreateAddressRequest;
import com.swiggy.locationplatform.centraladdressservice.v1.CreateAddressResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.DeleteAddressRequest;
import com.swiggy.locationplatform.centraladdressservice.v1.DeleteAddressResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressByAddressIDResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressesResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.GetDefaultedAddressesResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressEvent;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressRequest;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressResponse;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.PostableAddress;
import in.swiggy.android.tejas.network.utils.ProtoApi;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* compiled from: IAddressMapsProtoApi.kt */
public interface IAddressMapsProtoApi {
    public static final String ADDRESS_GET_ALL = "addresses/v1/all?client_id=android-consumer-app";
    public static final String ADDRESS_PATH = "addresses/v1";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String GET_ADDRESS_DEFAULTING_ALL = "addresses/defaulting/v1/all?clientId=android-consumer-app";
    public static final String PARTIAL_EDIT_PATH = "addresses/event/v1";

    /* compiled from: IAddressMapsProtoApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ADDRESS_GET_ALL = "addresses/v1/all?client_id=android-consumer-app";
        public static final String ADDRESS_PATH = "addresses/v1";
        public static final String GET_ADDRESS_DEFAULTING_ALL = "addresses/defaulting/v1/all?clientId=android-consumer-app";
        public static final String PARTIAL_EDIT_PATH = "addresses/event/v1";

        private Companion() {
        }
    }

    /* compiled from: IAddressMapsProtoApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ d getAllAddresses$default(IAddressMapsProtoApi iAddressMapsProtoApi, String str, int i11, int i12, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 2) != 0) {
                    i11 = 1;
                }
                if ((i13 & 4) != 0) {
                    i12 = 1;
                }
                return iAddressMapsProtoApi.getAllAddresses(str, i11, i12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllAddresses");
        }

        public static /* synthetic */ d getAllDefaultingAddresses$default(IAddressMapsProtoApi iAddressMapsProtoApi, String str, int i11, String str2, int i12, int i13, int i14, int i15, Object obj) {
            if (obj == null) {
                return iAddressMapsProtoApi.getAllDefaultingAddresses(str, i11, str2, i12, (i15 & 16) != 0 ? 1 : i13, (i15 & 32) != 0 ? 1 : i14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllDefaultingAddresses");
        }
    }

    @POST("addresses/v1")
    @ProtoApi
    d<Response<CreateAddressResponse>> addAddress(@Body CreateAddressRequest createAddressRequest);

    @POST("api/v2/pop/address/add")
    d<Response<SwiggyApiResponse<AddAddressData>>> addPopAddress(@Body PostableAddress postableAddress);

    @HTTP(hasBody = true, method = "DELETE", path = "addresses/v1")
    @ProtoApi
    d<Response<DeleteAddressResponse>> deleteAddress(@Body DeleteAddressRequest deleteAddressRequest);

    @ProtoApi
    @GET("addresses/v1")
    d<Response<GetAddressByAddressIDResponse>> getAddressById(@Query("id") String str);

    @ProtoApi
    @GET("addresses/v1/all?client_id=android-consumer-app")
    d<Response<GetAddressesResponse>> getAllAddresses(@Query("entityId") String str, @Query("entityType") int i11, @Query("marketPlaceId") int i12);

    @ProtoApi
    @GET("addresses/defaulting/v1/all?clientId=android-consumer-app")
    d<Response<GetDefaultedAddressesResponse>> getAllDefaultingAddresses(@Query("entityId") String str, @Query("isGPSOn") int i11, @Query("requestId") String str2, @Query("source") int i12, @Query("entityType") int i13, @Query("marketPlaceId") int i14);

    @PUT("addresses/event/v1")
    @ProtoApi
    d<Response<UpdateAddressResponse>> partialAddressUpdate(@Body UpdateAddressEvent updateAddressEvent);

    @PUT("addresses/v1")
    @ProtoApi
    d<Response<UpdateAddressResponse>> updateAddress(@Body UpdateAddressRequest updateAddressRequest);
}
