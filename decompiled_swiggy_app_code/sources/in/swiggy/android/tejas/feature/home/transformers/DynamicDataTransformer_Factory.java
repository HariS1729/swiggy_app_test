package in.swiggy.android.tejas.feature.home.transformers;

import javax.inject.Provider;
import qq.e;

public final class DynamicDataTransformer_Factory implements e<DynamicDataTransformer> {
    private final Provider<BannerAssociatedParamTransformer> paramsTransformerProvider;

    public DynamicDataTransformer_Factory(Provider<BannerAssociatedParamTransformer> provider) {
        this.paramsTransformerProvider = provider;
    }

    public static DynamicDataTransformer_Factory create(Provider<BannerAssociatedParamTransformer> provider) {
        return new DynamicDataTransformer_Factory(provider);
    }

    public static DynamicDataTransformer newInstance(BannerAssociatedParamTransformer bannerAssociatedParamTransformer) {
        return new DynamicDataTransformer(bannerAssociatedParamTransformer);
    }

    public DynamicDataTransformer get() {
        return newInstance(this.paramsTransformerProvider.get());
    }
}
