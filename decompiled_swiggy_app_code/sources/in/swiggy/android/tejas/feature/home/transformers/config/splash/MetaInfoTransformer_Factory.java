package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import qq.e;

public final class MetaInfoTransformer_Factory implements e<MetaInfoTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MetaInfoTransformer_Factory INSTANCE = new MetaInfoTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static MetaInfoTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MetaInfoTransformer newInstance() {
        return new MetaInfoTransformer();
    }

    public MetaInfoTransformer get() {
        return newInstance();
    }
}
