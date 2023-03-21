package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.gandalf.widgets.v2.Analytics;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: AnalyticsTransformerModule.kt */
public final class AnalyticsTransformerModule {
    public static final AnalyticsTransformerModule INSTANCE = new AnalyticsTransformerModule();

    private AnalyticsTransformerModule() {
    }

    public static final ITransformer<Analytics, AnalyticsData> providesAnalyticsTransformer(AnalyticsTransformer analyticsTransformer) {
        p.j(analyticsTransformer, "analyticsTransformer");
        return analyticsTransformer;
    }
}
