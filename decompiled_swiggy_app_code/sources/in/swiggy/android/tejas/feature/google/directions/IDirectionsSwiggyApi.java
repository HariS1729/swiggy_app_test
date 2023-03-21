package in.swiggy.android.tejas.feature.google.directions;

import ao0.d;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.api.SwiggyDirectionsRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: IDirectionsAPI.kt */
public interface IDirectionsSwiggyApi {
    @POST("/directions")
    d<Response<SwiggyDirectionsResponse>> getDirections(@Body SwiggyDirectionsRequest swiggyDirectionsRequest);
}
