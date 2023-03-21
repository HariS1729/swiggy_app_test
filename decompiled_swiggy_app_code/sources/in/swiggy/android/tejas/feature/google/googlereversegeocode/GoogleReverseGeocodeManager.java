package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import ao0.s;
import com.google.android.gms.maps.model.LatLng;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import pi0.a;
import pi0.b;
import pi0.c;
import retrofit2.Response;

/* compiled from: GoogleReverseGeocodeManager.kt */
public final class GoogleReverseGeocodeManager {
    public static final Companion Companion = new Companion((i) null);
    public static final String PARAMS = "?latlng=%s&new_reverse_geocoder=true";
    public static final String REVERSE_GEOCODE_PATH = "/maps/api/geocode/json";
    private final String baseUrl;
    private final IGoogleReverseGeocodeAPI googleGeocodeAPI;
    private final ITransformer<GooglePlaceList, GeocodedAddress> transformer;
    private final UrlSigner urlSigner;

    /* compiled from: GoogleReverseGeocodeManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public GoogleReverseGeocodeManager(String str, IGoogleReverseGeocodeAPI iGoogleReverseGeocodeAPI, UrlSigner urlSigner2, ITransformer<GooglePlaceList, GeocodedAddress> iTransformer) {
        p.j(str, "baseUrl");
        p.j(iGoogleReverseGeocodeAPI, "googleGeocodeAPI");
        p.j(urlSigner2, "urlSigner");
        p.j(iTransformer, "transformer");
        this.baseUrl = str;
        this.googleGeocodeAPI = iGoogleReverseGeocodeAPI;
        this.urlSigner = urlSigner2;
        this.transformer = iTransformer;
    }

    /* access modifiers changed from: private */
    /* renamed from: getReverseGeocode$lambda-0  reason: not valid java name */
    public static final boolean m24getReverseGeocode$lambda0(Response response) {
        p.j(response, "response");
        return response.isSuccessful();
    }

    /* access modifiers changed from: private */
    /* renamed from: getReverseGeocode$lambda-1  reason: not valid java name */
    public static final GooglePlaceList m25getReverseGeocode$lambda1(Response response) {
        p.j(response, "response");
        return (GooglePlaceList) response.body();
    }

    public final s<GeocodedAddress> getReverseGeocode(LatLng latLng, String str, String str2) {
        p.j(latLng, "coordinates");
        p.j(str, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(str2, "clientKey");
        s<R> n = this.googleGeocodeAPI.getReverseGeocode(this.urlSigner.getReverseGeoCodeSignedUrl(this.baseUrl, latLng, str, str2)).z(c.f27856a).N(b.f27855a).d0().n(new a(this.transformer));
        p.i(n, "googleGeocodeAPI.getReve…p(transformer::transform)");
        return n;
    }
}
