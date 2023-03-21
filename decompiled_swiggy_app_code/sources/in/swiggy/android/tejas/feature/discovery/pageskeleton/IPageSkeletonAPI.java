package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import in.swiggy.android.tejas.network.utils.ProtoApi;
import in.swiggy.android.tejas.network.utils.ProtoJsonApi;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: IPageSkeletonAPI.kt */
public interface IPageSkeletonAPI {
    @ProtoApi
    @GET("api/v1/skeleton")
    d<Response<com.swiggy.gandalf.widgets.v2.Response>> getPageSkeletonData(@Query("lat") double d11, @Query("lng") double d12);

    @ProtoJsonApi
    @GET("api/v1/json/skeleton")
    d<Response<com.swiggy.gandalf.widgets.v2.Response>> getPageSkeletonDataJson(@Query("lat") double d11, @Query("lng") double d12);
}
