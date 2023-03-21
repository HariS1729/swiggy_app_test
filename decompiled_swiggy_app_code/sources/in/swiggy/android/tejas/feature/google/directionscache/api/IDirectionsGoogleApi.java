package in.swiggy.android.tejas.feature.google.directionscache.api;

import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.network.utils.ExternalApi;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* compiled from: DirectionsApi.kt */
public interface IDirectionsGoogleApi {
    @GET
    @ExternalApi
    d<Response<GoogleDirectionsResponse>> getDirections(@Url String str);
}
