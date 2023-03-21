package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class ItemTopBrandTransformer_Factory implements e<ItemTopBrandTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ItemTopBrandTransformer_Factory INSTANCE = new ItemTopBrandTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ItemTopBrandTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ItemTopBrandTransformer newInstance() {
        return new ItemTopBrandTransformer();
    }

    public ItemTopBrandTransformer get() {
        return newInstance();
    }
}
