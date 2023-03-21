package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoresInfoWithStyle;
import in.swiggy.android.tejas.feature.home.grid.model.stores.GridStoresSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesGridStoresTransformerFactory implements e<ITransformer<StoresInfoWithStyle, GridStoresSection>> {
    private final Provider<GridStoresCardTransformer> gridStoresSectionTransformerProvider;

    public StoreTransformerModule_ProvidesGridStoresTransformerFactory(Provider<GridStoresCardTransformer> provider) {
        this.gridStoresSectionTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesGridStoresTransformerFactory create(Provider<GridStoresCardTransformer> provider) {
        return new StoreTransformerModule_ProvidesGridStoresTransformerFactory(provider);
    }

    public static ITransformer<StoresInfoWithStyle, GridStoresSection> providesGridStoresTransformer(GridStoresCardTransformer gridStoresCardTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesGridStoresTransformer(gridStoresCardTransformer));
    }

    public ITransformer<StoresInfoWithStyle, GridStoresSection> get() {
        return providesGridStoresTransformer(this.gridStoresSectionTransformerProvider.get());
    }
}
