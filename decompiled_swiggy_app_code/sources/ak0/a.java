package ak0;

import com.swiggy.pos.service.grpc.v1.AddressEditStateResponse;
import fp0.c;
import in.swiggy.android.tejas.network.utils.ProtoApi;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: IAddressUpdateEligibilityApi.kt */
public interface a {
    @ProtoApi
    @GET("v3/order/address-update-eligible")
    Object a(@Query("order_id") String str, c<? super Response<AddressEditStateResponse>> cVar);
}
