package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.DiscountInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesDiscountInfoTransformerFactory implements e<ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo>> {
    private final Provider<StoreDiscountInfoTransformer> storeDiscountInfoTransformerProvider;

    public StoreTransformerModule_ProvidesDiscountInfoTransformerFactory(Provider<StoreDiscountInfoTransformer> provider) {
        this.storeDiscountInfoTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesDiscountInfoTransformerFactory create(Provider<StoreDiscountInfoTransformer> provider) {
        return new StoreTransformerModule_ProvidesDiscountInfoTransformerFactory(provider);
    }

    public static ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> providesDiscountInfoTransformer(StoreDiscountInfoTransformer storeDiscountInfoTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesDiscountInfoTransformer(storeDiscountInfoTransformer));
    }

    public ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> get() {
        return providesDiscountInfoTransformer(this.storeDiscountInfoTransformerProvider.get());
    }
}
