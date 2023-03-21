package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Analytics;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class ImageCardTransformer_Factory implements e<ImageCardTransformer> {
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsTransformerProvider;

    public ImageCardTransformer_Factory(Provider<ITransformer<Analytics, AnalyticsData>> provider) {
        this.analyticsTransformerProvider = provider;
    }

    public static ImageCardTransformer_Factory create(Provider<ITransformer<Analytics, AnalyticsData>> provider) {
        return new ImageCardTransformer_Factory(provider);
    }

    public static ImageCardTransformer newInstance(ITransformer<Analytics, AnalyticsData> iTransformer) {
        return new ImageCardTransformer(iTransformer);
    }

    public ImageCardTransformer get() {
        return newInstance(this.analyticsTransformerProvider.get());
    }
}
