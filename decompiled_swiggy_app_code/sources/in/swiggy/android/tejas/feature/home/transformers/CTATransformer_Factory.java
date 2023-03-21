package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class CTATransformer_Factory implements e<CTATransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CTATransformer_Factory INSTANCE = new CTATransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CTATransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CTATransformer newInstance() {
        return new CTATransformer();
    }

    public CTATransformer get() {
        return newInstance();
    }
}
