package in.swiggy.android.tejas.apiinterface;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.oldapi.models.googleplace.GoogleDirectionResponse;
import java.util.List;
import retrofit2.http.Url;

@Deprecated
public interface IGoogleApi {
    public static final String DIRECTIONS_PATH = "directions/json";
    public static final String GEOCODE_PATH = "geocode/json";

    GeocodedAddress getBestGeocodedAddressFromSDK(double d11, double d12);

    GooglePlace getBestGooglePlaceFromAPI(double d11, double d12);

    GoogleDirectionResponse getDirections(LatLng latLng, LatLng latLng2, List<LatLng> list);

    GoogleDirectionResponse getDirectionsWithSignedUrl(@Url String str);

    GooglePlaceList getGooglePlaceListWithSignedUrl(@Url String str);

    GoogleDirectionResponse getSnapToRoad(@Url String str);
}
