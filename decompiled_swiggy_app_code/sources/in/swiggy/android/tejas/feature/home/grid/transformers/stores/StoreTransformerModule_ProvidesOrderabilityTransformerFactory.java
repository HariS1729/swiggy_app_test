package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreOrderability;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesOrderabilityTransformerFactory implements e<ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability>> {
    private final Provider<StoreOrderabilityTransformer> storeOrderabilityTransformerProvider;

    public StoreTransformerModule_ProvidesOrderabilityTransformerFactory(Provider<StoreOrderabilityTransformer> provider) {
        this.storeOrderabilityTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesOrderabilityTransformerFactory create(Provider<StoreOrderabilityTransformer> provider) {
        return new StoreTransformerModule_ProvidesOrderabilityTransformerFactory(provider);
    }

    public static ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> providesOrderabilityTransformer(StoreOrderabilityTransformer storeOrderabilityTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesOrderabilityTransformer(storeOrderabilityTransformer));
    }

    public ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> get() {
        return providesOrderabilityTransformer(this.storeOrderabilityTransformerProvider.get());
    }
}
