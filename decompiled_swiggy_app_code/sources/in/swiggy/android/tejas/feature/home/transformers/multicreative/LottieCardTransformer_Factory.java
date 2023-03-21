package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Analytics;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class LottieCardTransformer_Factory implements e<LottieCardTransformer> {
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsTransformerProvider;

    public LottieCardTransformer_Factory(Provider<ITransformer<Analytics, AnalyticsData>> provider) {
        this.analyticsTransformerProvider = provider;
    }

    public static LottieCardTransformer_Factory create(Provider<ITransformer<Analytics, AnalyticsData>> provider) {
        return new LottieCardTransformer_Factory(provider);
    }

    public static LottieCardTransformer newInstance(ITransformer<Analytics, AnalyticsData> iTransformer) {
        return new LottieCardTransformer(iTransformer);
    }

    public LottieCardTransformer get() {
        return newInstance(this.analyticsTransformerProvider.get());
    }
}
