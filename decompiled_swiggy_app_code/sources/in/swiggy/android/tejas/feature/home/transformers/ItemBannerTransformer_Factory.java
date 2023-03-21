package in.swiggy.android.tejas.feature.home.transformers;

import javax.inject.Provider;
import qq.e;

public final class ItemBannerTransformer_Factory implements e<ItemBannerTransformer> {
    private final Provider<DynamicDataTransformer> dataTransformerProvider;

    public ItemBannerTransformer_Factory(Provider<DynamicDataTransformer> provider) {
        this.dataTransformerProvider = provider;
    }

    public static ItemBannerTransformer_Factory create(Provider<DynamicDataTransformer> provider) {
        return new ItemBannerTransformer_Factory(provider);
    }

    public static ItemBannerTransformer newInstance(DynamicDataTransformer dynamicDataTransformer) {
        return new ItemBannerTransformer(dynamicDataTransformer);
    }

    public ItemBannerTransformer get() {
        return newInstance(this.dataTransformerProvider.get());
    }
}
