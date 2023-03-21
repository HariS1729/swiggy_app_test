package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class ItemBrandStoryTransformer_Factory implements e<ItemBrandStoryTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ItemBrandStoryTransformer_Factory INSTANCE = new ItemBrandStoryTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ItemBrandStoryTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ItemBrandStoryTransformer newInstance() {
        return new ItemBrandStoryTransformer();
    }

    public ItemBrandStoryTransformer get() {
        return newInstance();
    }
}
