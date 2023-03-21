package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.presentation.stores.v1.StoreInfo;
import in.swiggy.android.tejas.feature.home.grid.model.stores.Stores;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class GridStoresCardTransformer_Factory implements e<GridStoresCardTransformer> {
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsProvider;
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;
    private final Provider<ITransformer<StoreInfo, Stores>> storeInfoTransformerProvider;

    public GridStoresCardTransformer_Factory(Provider<ITransformer<StoreInfo, Stores>> provider, Provider<ITransformer<Analytics, AnalyticsData>> provider2, Provider<ITransformer<Cta, CTA>> provider3) {
        this.storeInfoTransformerProvider = provider;
        this.analyticsProvider = provider2;
        this.ctaTransformerProvider = provider3;
    }

    public static GridStoresCardTransformer_Factory create(Provider<ITransformer<StoreInfo, Stores>> provider, Provider<ITransformer<Analytics, AnalyticsData>> provider2, Provider<ITransformer<Cta, CTA>> provider3) {
        return new GridStoresCardTransformer_Factory(provider, provider2, provider3);
    }

    public static GridStoresCardTransformer newInstance(ITransformer<StoreInfo, Stores> iTransformer, ITransformer<Analytics, AnalyticsData> iTransformer2, ITransformer<Cta, CTA> iTransformer3) {
        return new GridStoresCardTransformer(iTransformer, iTransformer2, iTransformer3);
    }

    public GridStoresCardTransformer get() {
        return newInstance(this.storeInfoTransformerProvider.get(), this.analyticsProvider.get(), this.ctaTransformerProvider.get());
    }
}
