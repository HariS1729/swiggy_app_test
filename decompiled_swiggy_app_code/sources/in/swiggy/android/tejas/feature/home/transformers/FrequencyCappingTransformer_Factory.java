package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class FrequencyCappingTransformer_Factory implements e<FrequencyCappingTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final FrequencyCappingTransformer_Factory INSTANCE = new FrequencyCappingTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static FrequencyCappingTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FrequencyCappingTransformer newInstance() {
        return new FrequencyCappingTransformer();
    }

    public FrequencyCappingTransformer get() {
        return newInstance();
    }
}
