package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import qq.e;

public final class AnalyticsTransformer_Factory implements e<AnalyticsTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AnalyticsTransformer_Factory INSTANCE = new AnalyticsTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static AnalyticsTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AnalyticsTransformer newInstance() {
        return new AnalyticsTransformer();
    }

    public AnalyticsTransformer get() {
        return newInstance();
    }
}
