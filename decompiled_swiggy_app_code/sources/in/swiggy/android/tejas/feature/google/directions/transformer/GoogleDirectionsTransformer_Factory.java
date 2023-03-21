package in.swiggy.android.tejas.feature.google.directions.transformer;

import javax.inject.Provider;
import qq.e;

public final class GoogleDirectionsTransformer_Factory implements e<GoogleDirectionsTransformer> {
    private final Provider<DirectionsTransformerUtil> directionsTransformerUtilProvider;

    public GoogleDirectionsTransformer_Factory(Provider<DirectionsTransformerUtil> provider) {
        this.directionsTransformerUtilProvider = provider;
    }

    public static GoogleDirectionsTransformer_Factory create(Provider<DirectionsTransformerUtil> provider) {
        return new GoogleDirectionsTransformer_Factory(provider);
    }

    public static GoogleDirectionsTransformer newInstance(DirectionsTransformerUtil directionsTransformerUtil) {
        return new GoogleDirectionsTransformer(directionsTransformerUtil);
    }

    public GoogleDirectionsTransformer get() {
        return newInstance(this.directionsTransformerUtilProvider.get());
    }
}
