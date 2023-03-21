package in.swiggy.android.tejas.feature.landing;

import fp0.c;
import in.swiggy.android.tejas.network.utils.ProtoApi;
import in.swiggy.android.tejas.network.utils.ProtoJsonApi;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ILandingAPI.kt */
public interface ILandingAPI {
    @POST("/api/v3/collection/restaurant/{collectionId}")
    @ProtoApi
    Object getCollectionV3(@Path("collectionId") String str, @Query("lat") String str2, @Query("lng") String str3, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoJsonApi
    @POST("/api/v3/collection/restaurant/json/{collectionId}")
    Object getCollectionV3Json(@Path("collectionId") String str, @Query("lat") String str2, @Query("lng") String str3, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @POST("/api/v1/favourites")
    @ProtoApi
    Object getFavorites(@Query("lat") String str, @Query("lng") String str2, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoJsonApi
    @POST("/api/v1/json/favourites")
    Object getFavoritesJson(@Query("lat") String str, @Query("lng") String str2, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoApi
    @GET("/api/v1/landing-page/{landing}")
    Object getFeatureCollection(@Path("landing") String str, @Query("lat") double d11, @Query("lng") double d12, @Query("pageLimit") Integer num, @Query("pageOffset") String str2, @Query("sourcePage") String str3, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoJsonApi
    @GET("/api/v1/json/landing-page/{landing}")
    Object getFeatureCollectionJSON(@Path("landing") String str, @Query("lat") double d11, @Query("lng") double d12, @Query("pageLimit") Integer num, @Query("pageOffset") String str2, @Query("sourcePage") String str3, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoJsonApi
    @POST("/api/v1/json/landing-page/{landing}")
    Object getFeatureCollectionJSONWithRequestBody(@Path("landing") String str, @Query("lat") double d11, @Query("lng") double d12, @Query("pageLimit") Integer num, @Query("pageOffset") String str2, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @POST("/api/v1/landing-page/{landing}")
    @ProtoApi
    Object getFeatureCollectionWithRequestBody(@Path("landing") String str, @Query("lat") double d11, @Query("lng") double d12, @Query("pageLimit") Integer num, @Query("pageOffset") String str2, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @ProtoJsonApi
    @POST("/api/v1/json/disliked")
    Object getHiddenRestoJson(@Query("lat") String str, @Query("lng") String str2, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    @POST("/api/v1/disliked")
    @ProtoApi
    Object getHiddenRestos(@Query("lat") String str, @Query("lng") String str2, @Body Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);
}
