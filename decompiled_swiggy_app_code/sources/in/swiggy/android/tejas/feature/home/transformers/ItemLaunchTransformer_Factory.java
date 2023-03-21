package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class ItemLaunchTransformer_Factory implements e<ItemLaunchTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ItemLaunchTransformer_Factory INSTANCE = new ItemLaunchTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ItemLaunchTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ItemLaunchTransformer newInstance() {
        return new ItemLaunchTransformer();
    }

    public ItemLaunchTransformer get() {
        return newInstance();
    }
}
