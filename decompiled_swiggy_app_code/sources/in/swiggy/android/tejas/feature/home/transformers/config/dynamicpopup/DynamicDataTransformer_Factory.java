package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import javax.inject.Provider;
import qq.e;

public final class DynamicDataTransformer_Factory implements e<DynamicDataTransformer> {
    private final Provider<AssociatedParamListTransformer> associatedParamListTransformerProvider;

    public DynamicDataTransformer_Factory(Provider<AssociatedParamListTransformer> provider) {
        this.associatedParamListTransformerProvider = provider;
    }

    public static DynamicDataTransformer_Factory create(Provider<AssociatedParamListTransformer> provider) {
        return new DynamicDataTransformer_Factory(provider);
    }

    public static DynamicDataTransformer newInstance(AssociatedParamListTransformer associatedParamListTransformer) {
        return new DynamicDataTransformer(associatedParamListTransformer);
    }

    public DynamicDataTransformer get() {
        return newInstance(this.associatedParamListTransformerProvider.get());
    }
}
