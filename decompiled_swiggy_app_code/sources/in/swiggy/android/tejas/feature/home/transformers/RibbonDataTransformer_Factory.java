package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class RibbonDataTransformer_Factory implements e<RibbonDataTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final RibbonDataTransformer_Factory INSTANCE = new RibbonDataTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static RibbonDataTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RibbonDataTransformer newInstance() {
        return new RibbonDataTransformer();
    }

    public RibbonDataTransformer get() {
        return newInstance();
    }
}
