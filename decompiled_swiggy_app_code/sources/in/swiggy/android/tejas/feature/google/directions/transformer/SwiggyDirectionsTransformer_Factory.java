package in.swiggy.android.tejas.feature.google.directions.transformer;

import javax.inject.Provider;
import qq.e;

public final class SwiggyDirectionsTransformer_Factory implements e<SwiggyDirectionsTransformer> {
    private final Provider<DirectionsTransformerUtil> directionsTransformerUtilProvider;

    public SwiggyDirectionsTransformer_Factory(Provider<DirectionsTransformerUtil> provider) {
        this.directionsTransformerUtilProvider = provider;
    }

    public static SwiggyDirectionsTransformer_Factory create(Provider<DirectionsTransformerUtil> provider) {
        return new SwiggyDirectionsTransformer_Factory(provider);
    }

    public static SwiggyDirectionsTransformer newInstance(DirectionsTransformerUtil directionsTransformerUtil) {
        return new SwiggyDirectionsTransformer(directionsTransformerUtil);
    }

    public SwiggyDirectionsTransformer get() {
        return newInstance(this.directionsTransformerUtilProvider.get());
    }
}
