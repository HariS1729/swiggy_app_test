package in.swiggy.android.tejas.feature.google.directionscache.api;

import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: DirectionsApi.kt */
public interface IDirectionsSwiggyApi {
    @POST("/directions")
    d<Response<SwiggyDirectionsResponse>> getDirections(@Body SwiggyDirectionsRequest swiggyDirectionsRequest);
}
