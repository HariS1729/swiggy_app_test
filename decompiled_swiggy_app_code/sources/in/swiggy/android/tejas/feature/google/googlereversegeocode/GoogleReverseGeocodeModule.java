package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer.GoogleReverseGeocodeTransformer;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: GoogleReverseGeocodeModule.kt */
public final class GoogleReverseGeocodeModule {
    private static final String GOOGLE_API_END_POINT = "https://maps.googleapis.com";
    public static final GoogleReverseGeocodeModule INSTANCE = new GoogleReverseGeocodeModule();

    private GoogleReverseGeocodeModule() {
    }

    public static final IGoogleReverseGeocodeAPI providesReverseGeocodeAPI(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IGoogleReverseGeocodeAPI.class);
        p.i(create, "retrofit.create(IGoogleR…seGeocodeAPI::class.java)");
        return (IGoogleReverseGeocodeAPI) create;
    }

    public static final GoogleReverseGeocodeManager providesReverseGeocodeManager(IGoogleReverseGeocodeAPI iGoogleReverseGeocodeAPI, UrlSigner urlSigner, ITransformer<GooglePlaceList, GeocodedAddress> iTransformer) {
        p.j(iGoogleReverseGeocodeAPI, "googleReverseGeocodeAPI");
        p.j(urlSigner, "urlSigner");
        p.j(iTransformer, "transformer");
        return new GoogleReverseGeocodeManager("https://maps.googleapis.com", iGoogleReverseGeocodeAPI, urlSigner, iTransformer);
    }

    public static final ITransformer<GooglePlaceList, GeocodedAddress> providesReverseGeocodeTransformer(GoogleReverseGeocodeTransformer googleReverseGeocodeTransformer) {
        p.j(googleReverseGeocodeTransformer, "googleReverseGeocodeTransformer");
        return googleReverseGeocodeTransformer;
    }
}
