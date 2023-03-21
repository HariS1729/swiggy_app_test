package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import qq.e;

public final class StoreDiscountInfoTransformer_Factory implements e<StoreDiscountInfoTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final StoreDiscountInfoTransformer_Factory INSTANCE = new StoreDiscountInfoTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static StoreDiscountInfoTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StoreDiscountInfoTransformer newInstance() {
        return new StoreDiscountInfoTransformer();
    }

    public StoreDiscountInfoTransformer get() {
        return newInstance();
    }
}
