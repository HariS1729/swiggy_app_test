package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import qq.e;

public final class ExcludeVariantGroupTransformer_Factory implements e<ExcludeVariantGroupTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ExcludeVariantGroupTransformer_Factory INSTANCE = new ExcludeVariantGroupTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ExcludeVariantGroupTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ExcludeVariantGroupTransformer newInstance() {
        return new ExcludeVariantGroupTransformer();
    }

    public ExcludeVariantGroupTransformer get() {
        return newInstance();
    }
}
