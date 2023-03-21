package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import qq.e;

public final class HomeCtaTransformer_Factory implements e<HomeCtaTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final HomeCtaTransformer_Factory INSTANCE = new HomeCtaTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static HomeCtaTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HomeCtaTransformer newInstance() {
        return new HomeCtaTransformer();
    }

    public HomeCtaTransformer get() {
        return newInstance();
    }
}
