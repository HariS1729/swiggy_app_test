package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Cta;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DynamicFlipTextLottieTransformer_Factory implements e<DynamicFlipTextLottieTransformer> {
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsProvider;
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;

    public DynamicFlipTextLottieTransformer_Factory(Provider<ITransformer<Analytics, AnalyticsData>> provider, Provider<ITransformer<Cta, CTA>> provider2) {
        this.analyticsProvider = provider;
        this.ctaTransformerProvider = provider2;
    }

    public static DynamicFlipTextLottieTransformer_Factory create(Provider<ITransformer<Analytics, AnalyticsData>> provider, Provider<ITransformer<Cta, CTA>> provider2) {
        return new DynamicFlipTextLottieTransformer_Factory(provider, provider2);
    }

    public static DynamicFlipTextLottieTransformer newInstance(ITransformer<Analytics, AnalyticsData> iTransformer, ITransformer<Cta, CTA> iTransformer2) {
        return new DynamicFlipTextLottieTransformer(iTransformer, iTransformer2);
    }

    public DynamicFlipTextLottieTransformer get() {
        return newInstance(this.analyticsProvider.get(), this.ctaTransformerProvider.get());
    }
}
