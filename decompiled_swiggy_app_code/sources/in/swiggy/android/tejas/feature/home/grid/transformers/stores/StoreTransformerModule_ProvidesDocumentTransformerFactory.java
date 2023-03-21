package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreDocument;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesDocumentTransformerFactory implements e<ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument>> {
    private final Provider<StoreDocumentTransformer> storeDocumentTransformerProvider;

    public StoreTransformerModule_ProvidesDocumentTransformerFactory(Provider<StoreDocumentTransformer> provider) {
        this.storeDocumentTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesDocumentTransformerFactory create(Provider<StoreDocumentTransformer> provider) {
        return new StoreTransformerModule_ProvidesDocumentTransformerFactory(provider);
    }

    public static ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> providesDocumentTransformer(StoreDocumentTransformer storeDocumentTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesDocumentTransformer(storeDocumentTransformer));
    }

    public ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> get() {
        return providesDocumentTransformer(this.storeDocumentTransformerProvider.get());
    }
}
