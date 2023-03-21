package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import qq.e;

public final class BusinessLineInfoTransformer_Factory implements e<BusinessLineInfoTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final BusinessLineInfoTransformer_Factory INSTANCE = new BusinessLineInfoTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static BusinessLineInfoTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BusinessLineInfoTransformer newInstance() {
        return new BusinessLineInfoTransformer();
    }

    public BusinessLineInfoTransformer get() {
        return newInstance();
    }
}
