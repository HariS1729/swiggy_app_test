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
import in.swiggy.android.tejas.network.utils.ProtoJsonApi;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* compiled from: IAddressMapsJsonApi.kt */
public interface IAddressMapsJsonApi extends IAddressMapsProtoApi {
    @ProtoJsonApi
    @POST("addresses/v1")
    d<Response<CreateAddressResponse>> addAddress(@Body CreateAddressRequest createAddressRequest);

    @ProtoJsonApi
    @HTTP(hasBody = true, method = "DELETE", path = "addresses/v1")
    d<Response<DeleteAddressResponse>> deleteAddress(@Body DeleteAddressRequest deleteAddressRequest);

    @ProtoJsonApi
    @GET("addresses/v1")
    d<Response<GetAddressByAddressIDResponse>> getAddressById(@Query("id") String str);

    @ProtoJsonApi
    @GET("addresses/v1/all?client_id=android-consumer-app")
    d<Response<GetAddressesResponse>> getAllAddresses(@Query("entityId") String str, @Query("entityType") int i11, @Query("marketPlaceId") int i12);

    @ProtoJsonApi
    @GET("addresses/defaulting/v1/all?clientId=android-consumer-app")
    d<Response<GetDefaultedAddressesResponse>> getAllDefaultingAddresses(@Query("entityId") String str, @Query("isGPSOn") int i11, @Query("requestId") String str2, @Query("source") int i12, @Query("entityType") int i13, @Query("marketPlaceId") int i14);

    @ProtoJsonApi
    @PUT("addresses/event/v1")
    d<Response<UpdateAddressResponse>> partialAddressUpdate(@Body UpdateAddressEvent updateAddressEvent);

    @ProtoJsonApi
    @PUT("addresses/v1")
    d<Response<UpdateAddressResponse>> updateAddress(@Body UpdateAddressRequest updateAddressRequest);
}
