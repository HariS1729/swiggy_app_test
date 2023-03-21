package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class GoogleReverseGeocodeManager_Factory implements e<GoogleReverseGeocodeManager> {
    private final Provider<String> baseUrlProvider;
    private final Provider<IGoogleReverseGeocodeAPI> googleGeocodeAPIProvider;
    private final Provider<ITransformer<GooglePlaceList, GeocodedAddress>> transformerProvider;
    private final Provider<UrlSigner> urlSignerProvider;

    public GoogleReverseGeocodeManager_Factory(Provider<String> provider, Provider<IGoogleReverseGeocodeAPI> provider2, Provider<UrlSigner> provider3, Provider<ITransformer<GooglePlaceList, GeocodedAddress>> provider4) {
        this.baseUrlProvider = provider;
        this.googleGeocodeAPIProvider = provider2;
        this.urlSignerProvider = provider3;
        this.transformerProvider = provider4;
    }

    public static GoogleReverseGeocodeManager_Factory create(Provider<String> provider, Provider<IGoogleReverseGeocodeAPI> provider2, Provider<UrlSigner> provider3, Provider<ITransformer<GooglePlaceList, GeocodedAddress>> provider4) {
        return new GoogleReverseGeocodeManager_Factory(provider, provider2, provider3, provider4);
    }

    public static GoogleReverseGeocodeManager newInstance(String str, IGoogleReverseGeocodeAPI iGoogleReverseGeocodeAPI, UrlSigner urlSigner, ITransformer<GooglePlaceList, GeocodedAddress> iTransformer) {
        return new GoogleReverseGeocodeManager(str, iGoogleReverseGeocodeAPI, urlSigner, iTransformer);
    }

    public GoogleReverseGeocodeManager get() {
        return newInstance(this.baseUrlProvider.get(), this.googleGeocodeAPIProvider.get(), this.urlSignerProvider.get(), this.transformerProvider.get());
    }
}
