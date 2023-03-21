package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import qq.e;

public final class CrossButtonPositionTransformer_Factory implements e<CrossButtonPositionTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CrossButtonPositionTransformer_Factory INSTANCE = new CrossButtonPositionTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CrossButtonPositionTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CrossButtonPositionTransformer newInstance() {
        return new CrossButtonPositionTransformer();
    }

    public CrossButtonPositionTransformer get() {
        return newInstance();
    }
}
