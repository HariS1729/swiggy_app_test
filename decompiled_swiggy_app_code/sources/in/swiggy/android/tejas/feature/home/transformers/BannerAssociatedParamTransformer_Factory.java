package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class BannerAssociatedParamTransformer_Factory implements e<BannerAssociatedParamTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final BannerAssociatedParamTransformer_Factory INSTANCE = new BannerAssociatedParamTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static BannerAssociatedParamTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BannerAssociatedParamTransformer newInstance() {
        return new BannerAssociatedParamTransformer();
    }

    public BannerAssociatedParamTransformer get() {
        return newInstance();
    }
}
