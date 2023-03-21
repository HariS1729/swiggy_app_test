package in.swiggy.android.tejas.feature.home.transformers;

import javax.inject.Provider;
import qq.e;

public final class RestaurantTransformer_Factory implements e<RestaurantTransformer> {
    private final Provider<CTATransformer> ctaTransformerProvider;

    public RestaurantTransformer_Factory(Provider<CTATransformer> provider) {
        this.ctaTransformerProvider = provider;
    }

    public static RestaurantTransformer_Factory create(Provider<CTATransformer> provider) {
        return new RestaurantTransformer_Factory(provider);
    }

    public static RestaurantTransformer newInstance(CTATransformer cTATransformer) {
        return new RestaurantTransformer(cTATransformer);
    }

    public RestaurantTransformer get() {
        return newInstance(this.ctaTransformerProvider.get());
    }
}
