package in.swiggy.android.tejas.feature.google.directions;

import ao0.d;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* compiled from: IDirectionsAPI.kt */
public interface IDirectionsAPI {
    @GET
    d<Response<GoogleDirectionsResponse>> getDirections(@Url String str);
}
