package in.swiggy.android.tejas.feature.crosssell;

import fp0.c;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellRequestBody;
import in.swiggy.android.tejas.network.utils.ProtoApi;
import in.swiggy.android.tejas.network.utils.ProtoJsonApi;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: ICrossSellAPI.kt */
public interface ICrossSellAPI {
    @POST("api/v1/layout-section/CROSS_SELL")
    @ProtoApi
    Object getCrossSellCollection(@Query("lat") double d11, @Query("lng") double d12, @Body CrossSellRequestBody crossSellRequestBody, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoJsonApi
    @POST("api/v1/json/layout-section/CROSS_SELL")
    Object getCrossSellCollectionJSON(@Query("lat") double d11, @Query("lng") double d12, @Body CrossSellRequestBody crossSellRequestBody, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);
}
