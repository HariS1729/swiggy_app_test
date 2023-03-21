package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreServiceabilityInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesServiceabilityTransformerFactory implements e<ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo>> {
    private final Provider<StoreServiceabilityInfoTransformer> storeServiceabilityInfoTransformerProvider;

    public StoreTransformerModule_ProvidesServiceabilityTransformerFactory(Provider<StoreServiceabilityInfoTransformer> provider) {
        this.storeServiceabilityInfoTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesServiceabilityTransformerFactory create(Provider<StoreServiceabilityInfoTransformer> provider) {
        return new StoreTransformerModule_ProvidesServiceabilityTransformerFactory(provider);
    }

    public static ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> providesServiceabilityTransformer(StoreServiceabilityInfoTransformer storeServiceabilityInfoTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesServiceabilityTransformer(storeServiceabilityInfoTransformer));
    }

    public ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> get() {
        return providesServiceabilityTransformer(this.storeServiceabilityInfoTransformerProvider.get());
    }
}
