package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import qq.e;

public final class StoreDocumentTransformer_Factory implements e<StoreDocumentTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final StoreDocumentTransformer_Factory INSTANCE = new StoreDocumentTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static StoreDocumentTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StoreDocumentTransformer newInstance() {
        return new StoreDocumentTransformer();
    }

    public StoreDocumentTransformer get() {
        return newInstance();
    }
}
