package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import ao0.d;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* compiled from: IGoogleReverseGeocodeAPI.kt */
public interface IGoogleReverseGeocodeAPI {
    @GET
    d<Response<GooglePlaceList>> getReverseGeocode(@Url String str);
}
