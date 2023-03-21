package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class RemoteLottieItemTransformer_Factory implements e<RemoteLottieItemTransformer> {
    private final Provider<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> accessibilityTransformerProvider;
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsProvider;
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;
    private final Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> frequencyCappingTransformerProvider;

    public RemoteLottieItemTransformer_Factory(Provider<ITransformer<Analytics, AnalyticsData>> provider, Provider<ITransformer<Cta, CTA>> provider2, Provider<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> provider3, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider4) {
        this.analyticsProvider = provider;
        this.ctaTransformerProvider = provider2;
        this.accessibilityTransformerProvider = provider3;
        this.frequencyCappingTransformerProvider = provider4;
    }

    public static RemoteLottieItemTransformer_Factory create(Provider<ITransformer<Analytics, AnalyticsData>> provider, Provider<ITransformer<Cta, CTA>> provider2, Provider<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> provider3, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider4) {
        return new RemoteLottieItemTransformer_Factory(provider, provider2, provider3, provider4);
    }

    public static RemoteLottieItemTransformer newInstance(ITransformer<Analytics, AnalyticsData> iTransformer, ITransformer<Cta, CTA> iTransformer2, ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer3, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer4) {
        return new RemoteLottieItemTransformer(iTransformer, iTransformer2, iTransformer3, iTransformer4);
    }

    public RemoteLottieItemTransformer get() {
        return newInstance(this.analyticsProvider.get(), this.ctaTransformerProvider.get(), this.accessibilityTransformerProvider.get(), this.frequencyCappingTransformerProvider.get());
    }
}
