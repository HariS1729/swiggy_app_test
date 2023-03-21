package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreServiceabilityInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class StoreOrderabilityTransformer_Factory implements e<StoreOrderabilityTransformer> {
    private final Provider<ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo>> searviceabilityTransformerProvider;

    public StoreOrderabilityTransformer_Factory(Provider<ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo>> provider) {
        this.searviceabilityTransformerProvider = provider;
    }

    public static StoreOrderabilityTransformer_Factory create(Provider<ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo>> provider) {
        return new StoreOrderabilityTransformer_Factory(provider);
    }

    public static StoreOrderabilityTransformer newInstance(ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> iTransformer) {
        return new StoreOrderabilityTransformer(iTransformer);
    }

    public StoreOrderabilityTransformer get() {
        return newInstance(this.searviceabilityTransformerProvider.get());
    }
}
