package in.swiggy.android.tejas.feature.google.googlereversegeocode;

import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceList;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer.GoogleReverseGeocodeTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class GoogleReverseGeocodeModule_ProvidesReverseGeocodeTransformerFactory implements e<ITransformer<GooglePlaceList, GeocodedAddress>> {
    private final Provider<GoogleReverseGeocodeTransformer> googleReverseGeocodeTransformerProvider;

    public GoogleReverseGeocodeModule_ProvidesReverseGeocodeTransformerFactory(Provider<GoogleReverseGeocodeTransformer> provider) {
        this.googleReverseGeocodeTransformerProvider = provider;
    }

    public static GoogleReverseGeocodeModule_ProvidesReverseGeocodeTransformerFactory create(Provider<GoogleReverseGeocodeTransformer> provider) {
        return new GoogleReverseGeocodeModule_ProvidesReverseGeocodeTransformerFactory(provider);
    }

    public static ITransformer<GooglePlaceList, GeocodedAddress> providesReverseGeocodeTransformer(GoogleReverseGeocodeTransformer googleReverseGeocodeTransformer) {
        return (ITransformer) i.e(GoogleReverseGeocodeModule.providesReverseGeocodeTransformer(googleReverseGeocodeTransformer));
    }

    public ITransformer<GooglePlaceList, GeocodedAddress> get() {
        return providesReverseGeocodeTransformer(this.googleReverseGeocodeTransformerProvider.get());
    }
}
