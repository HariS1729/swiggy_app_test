package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import qq.e;

public final class StoreServiceabilityInfoTransformer_Factory implements e<StoreServiceabilityInfoTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final StoreServiceabilityInfoTransformer_Factory INSTANCE = new StoreServiceabilityInfoTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static StoreServiceabilityInfoTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StoreServiceabilityInfoTransformer newInstance() {
        return new StoreServiceabilityInfoTransformer();
    }

    public StoreServiceabilityInfoTransformer get() {
        return newInstance();
    }
}
