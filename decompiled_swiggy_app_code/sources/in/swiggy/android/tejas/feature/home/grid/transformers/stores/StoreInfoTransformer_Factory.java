package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.DiscountInfo;
import com.swiggy.presentation.stores.v1.StoreDocument;
import com.swiggy.presentation.stores.v1.StoreOrderability;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class StoreInfoTransformer_Factory implements e<StoreInfoTransformer> {
    private final Provider<ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo>> discountInfoTransformerProvider;
    private final Provider<ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument>> documentTransformerProvider;
    private final Provider<ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability>> orderabilityTransformerProvider;

    public StoreInfoTransformer_Factory(Provider<ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument>> provider, Provider<ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability>> provider2, Provider<ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo>> provider3) {
        this.documentTransformerProvider = provider;
        this.orderabilityTransformerProvider = provider2;
        this.discountInfoTransformerProvider = provider3;
    }

    public static StoreInfoTransformer_Factory create(Provider<ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument>> provider, Provider<ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability>> provider2, Provider<ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo>> provider3) {
        return new StoreInfoTransformer_Factory(provider, provider2, provider3);
    }

    public static StoreInfoTransformer newInstance(ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> iTransformer, ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> iTransformer2, ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> iTransformer3) {
        return new StoreInfoTransformer(iTransformer, iTransformer2, iTransformer3);
    }

    public StoreInfoTransformer get() {
        return newInstance(this.documentTransformerProvider.get(), this.orderabilityTransformerProvider.get(), this.discountInfoTransformerProvider.get());
    }
}
