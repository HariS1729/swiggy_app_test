package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.gandalf.widgets.v2.Analytics;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class AnalyticsTransformerModule_ProvidesAnalyticsTransformerFactory implements e<ITransformer<Analytics, AnalyticsData>> {
    private final Provider<AnalyticsTransformer> analyticsTransformerProvider;

    public AnalyticsTransformerModule_ProvidesAnalyticsTransformerFactory(Provider<AnalyticsTransformer> provider) {
        this.analyticsTransformerProvider = provider;
    }

    public static AnalyticsTransformerModule_ProvidesAnalyticsTransformerFactory create(Provider<AnalyticsTransformer> provider) {
        return new AnalyticsTransformerModule_ProvidesAnalyticsTransformerFactory(provider);
    }

    public static ITransformer<Analytics, AnalyticsData> providesAnalyticsTransformer(AnalyticsTransformer analyticsTransformer) {
        return (ITransformer) i.e(AnalyticsTransformerModule.providesAnalyticsTransformer(analyticsTransformer));
    }

    public ITransformer<Analytics, AnalyticsData> get() {
        return providesAnalyticsTransformer(this.analyticsTransformerProvider.get());
    }
}
