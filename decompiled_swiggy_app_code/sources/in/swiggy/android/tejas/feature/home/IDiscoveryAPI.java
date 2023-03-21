package in.swiggy.android.tejas.feature.home;

import fp0.c;
import in.swiggy.android.tejas.network.utils.ProtoApi;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: IDiscoveryAPI.kt */
public interface IDiscoveryAPI {
    @POST("/api/v1/food")
    @ProtoApi
    Object getFoodListing(@Query("lat") double d11, @Query("lng") double d12, @Header("isfoodpagevisit") boolean z11, @Header("isdefaultpage") boolean z12, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoApi
    @GET("/api/v2/home")
    Object getHomeListing(@Query("lat") double d11, @Query("lng") double d12, @Query("pageLimit") Integer num, @Query("pageOffset") String str, @Query("segmentId") String str2, @Query("segmentDomain") String str3, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);
}
