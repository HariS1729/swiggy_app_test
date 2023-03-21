package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class GoogleReverseGeocodeModule_ProvidesReverseGeocodeManagerFactory implements e<GoogleReverseGeocodeManager> {
    private final Provider<IGoogleReverseGeocodeAPI> googleReverseGeocodeAPIProvider;
    private final Provider<ITransformer<GooglePlaceList, GeocodedAddress>> transformerProvider;
    private final Provider<UrlSigner> urlSignerProvider;

    public GoogleReverseGeocodeModule_ProvidesReverseGeocodeManagerFactory(Provider<IGoogleReverseGeocodeAPI> provider, Provider<UrlSigner> provider2, Provider<ITransformer<GooglePlaceList, GeocodedAddress>> provider3) {
        this.googleReverseGeocodeAPIProvider = provider;
        this.urlSignerProvider = provider2;
        this.transformerProvider = provider3;
    }

    public static GoogleReverseGeocodeModule_ProvidesReverseGeocodeManagerFactory create(Provider<IGoogleReverseGeocodeAPI> provider, Provider<UrlSigner> provider2, Provider<ITransformer<GooglePlaceList, GeocodedAddress>> provider3) {
        return new GoogleReverseGeocodeModule_ProvidesReverseGeocodeManagerFactory(provider, provider2, provider3);
    }

    public static GoogleReverseGeocodeManager providesReverseGeocodeManager(IGoogleReverseGeocodeAPI iGoogleReverseGeocodeAPI, UrlSigner urlSigner, ITransformer<GooglePlaceList, GeocodedAddress> iTransformer) {
        return (GoogleReverseGeocodeManager) i.e(GoogleReverseGeocodeModule.providesReverseGeocodeManager(iGoogleReverseGeocodeAPI, urlSigner, iTransformer));
    }

    public GoogleReverseGeocodeManager get() {
        return providesReverseGeocodeManager(this.googleReverseGeocodeAPIProvider.get(), this.urlSignerProvider.get(), this.transformerProvider.get());
    }
}
