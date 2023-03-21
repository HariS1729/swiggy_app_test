package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class AutoScrollTransformer_Factory implements e<AutoScrollTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AutoScrollTransformer_Factory INSTANCE = new AutoScrollTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static AutoScrollTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AutoScrollTransformer newInstance() {
        return new AutoScrollTransformer();
    }

    public AutoScrollTransformer get() {
        return newInstance();
    }
}
