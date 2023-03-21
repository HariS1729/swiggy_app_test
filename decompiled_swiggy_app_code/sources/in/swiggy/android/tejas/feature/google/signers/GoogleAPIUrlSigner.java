package in.swiggy.android.tejas.feature.google.signers;

import android.util.Base64;
import com.google.android.gms.maps.model.LatLng;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.TejasConstants;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.GoogleReverseGeocodeManager;
import in.swiggy.android.tejas.network.HttpRequest;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.p;
import up0.a;

/* compiled from: GoogleAPIUrlSigner.kt */
public final class GoogleAPIUrlSigner implements UrlSigner {
    private final String signRequest(byte[] bArr, String str, String str2) {
        String str3 = str + '?' + str2;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(secretKeySpec);
        byte[] bytes = str3.getBytes(a.f29102b);
        p.i(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 2);
        p.i(encodeToString, PaymentConstants.SIGNATURE);
        String G = o.G(encodeToString, '+', '-', false, 4, (Object) null);
        p.i(G, PaymentConstants.SIGNATURE);
        return str3 + "&signature=" + o.G(G, '/', '_', false, 4, (Object) null);
    }

    public String getDirectionsSignedUrl(String str, LatLng latLng, LatLng latLng2, List<LatLng> list, String str2, String str3) {
        p.j(str, "baseUrl");
        p.j(latLng, "origin");
        p.j(latLng2, "destination");
        p.j(list, "intermediateLatLongs");
        p.j(str2, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(str3, "clientKey");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(latLng.f43937a);
        sb2.append(',');
        sb2.append(latLng.f43938b);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(latLng2.f43937a);
        sb4.append(',');
        sb4.append(latLng2.f43938b);
        String sb5 = sb4.toString();
        String f02 = s.f0(list, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, GoogleAPIUrlSigner$getDirectionsSignedUrl$wayPointLatLngString$1.INSTANCE, 30, (Object) null);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(TejasConstants.DIRECTIONS_PATH);
        String format = String.format(TejasConstants.DIRECTIONS_PARAMS, Arrays.copyOf(new Object[]{sb3, sb5, f02}, 3));
        p.i(format, "format(this, *args)");
        sb6.append(format);
        return signUrl(sb6.toString(), str2, str3);
    }

    public String getReverseGeoCodeSignedUrl(String str, LatLng latLng, String str2, String str3) {
        p.j(str, "baseUrl");
        p.j(latLng, "coordinates");
        p.j(str2, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(str3, "clientKey");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(latLng.f43937a);
        sb2.append(',');
        sb2.append(latLng.f43938b);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(GoogleReverseGeocodeManager.REVERSE_GEOCODE_PATH);
        String format = String.format(GoogleReverseGeocodeManager.PARAMS, Arrays.copyOf(new Object[]{sb3}, 1));
        p.i(format, "format(this, *args)");
        sb4.append(format);
        sb4.append("&language=hi");
        return signUrl(sb4.toString(), str2, str3);
    }

    public String signUrl(String str, String str2, String str3) {
        p.j(str, "url");
        p.j(str2, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(str3, "clientKey");
        String str4 = str + "&client=" + str2;
        byte[] decode = Base64.decode(o.G(o.G(str3, '-', '+', false, 4, (Object) null), '_', '/', false, 4, (Object) null), 2);
        URL url = new URL(str4);
        p.i(decode, HttpRequest.HEADER_KEY);
        String path = url.getPath();
        p.i(path, "urlInput.path");
        String query = url.getQuery();
        p.i(query, "urlInput.query");
        return url.getProtocol() + "://" + url.getHost() + signRequest(decode, path, query);
    }
}
