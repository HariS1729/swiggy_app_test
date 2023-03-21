package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import qq.e;

public final class FrequencyTransformer_Factory implements e<FrequencyTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final FrequencyTransformer_Factory INSTANCE = new FrequencyTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static FrequencyTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FrequencyTransformer newInstance() {
        return new FrequencyTransformer();
    }

    public FrequencyTransformer get() {
        return newInstance();
    }
}
