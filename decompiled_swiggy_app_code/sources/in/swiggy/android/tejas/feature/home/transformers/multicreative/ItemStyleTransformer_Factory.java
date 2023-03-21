package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import qq.e;

public final class ItemStyleTransformer_Factory implements e<ItemStyleTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ItemStyleTransformer_Factory INSTANCE = new ItemStyleTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ItemStyleTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ItemStyleTransformer newInstance() {
        return new ItemStyleTransformer();
    }

    public ItemStyleTransformer get() {
        return newInstance();
    }
}
