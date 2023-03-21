package in.swiggy.android.tejas.feature.google.signers;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* compiled from: UrlSigner.kt */
public interface UrlSigner {
    String getDirectionsSignedUrl(String str, LatLng latLng, LatLng latLng2, List<LatLng> list, String str2, String str3);

    String getReverseGeoCodeSignedUrl(String str, LatLng latLng, String str2, String str3);

    String signUrl(String str, String str2, String str3);
}
