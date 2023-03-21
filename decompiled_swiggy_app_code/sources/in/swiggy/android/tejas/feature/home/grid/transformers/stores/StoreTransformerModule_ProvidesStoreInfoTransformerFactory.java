package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreInfo;
import in.swiggy.android.tejas.feature.home.grid.model.stores.Stores;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesStoreInfoTransformerFactory implements e<ITransformer<StoreInfo, Stores>> {
    private final Provider<StoreInfoTransformer> storeInfoTransformerProvider;

    public StoreTransformerModule_ProvidesStoreInfoTransformerFactory(Provider<StoreInfoTransformer> provider) {
        this.storeInfoTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesStoreInfoTransformerFactory create(Provider<StoreInfoTransformer> provider) {
        return new StoreTransformerModule_ProvidesStoreInfoTransformerFactory(provider);
    }

    public static ITransformer<StoreInfo, Stores> providesStoreInfoTransformer(StoreInfoTransformer storeInfoTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesStoreInfoTransformer(storeInfoTransformer));
    }

    public ITransformer<StoreInfo, Stores> get() {
        return providesStoreInfoTransformer(this.storeInfoTransformerProvider.get());
    }
}
