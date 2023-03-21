package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Analytics;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class VideoCardTransformer_Factory implements e<VideoCardTransformer> {
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsTransformerProvider;

    public VideoCardTransformer_Factory(Provider<ITransformer<Analytics, AnalyticsData>> provider) {
        this.analyticsTransformerProvider = provider;
    }

    public static VideoCardTransformer_Factory create(Provider<ITransformer<Analytics, AnalyticsData>> provider) {
        return new VideoCardTransformer_Factory(provider);
    }

    public static VideoCardTransformer newInstance(ITransformer<Analytics, AnalyticsData> iTransformer) {
        return new VideoCardTransformer(iTransformer);
    }

    public VideoCardTransformer get() {
        return newInstance(this.analyticsTransformerProvider.get());
    }
}
