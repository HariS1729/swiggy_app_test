package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class ItemPopTransformer_Factory implements e<ItemPopTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ItemPopTransformer_Factory INSTANCE = new ItemPopTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ItemPopTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ItemPopTransformer newInstance() {
        return new ItemPopTransformer();
    }

    public ItemPopTransformer get() {
        return newInstance();
    }
}
