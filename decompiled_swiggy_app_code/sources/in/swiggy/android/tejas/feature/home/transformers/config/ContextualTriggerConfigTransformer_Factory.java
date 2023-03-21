package in.swiggy.android.tejas.feature.home.transformers.config;

import qq.e;

public final class ContextualTriggerConfigTransformer_Factory implements e<ContextualTriggerConfigTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ContextualTriggerConfigTransformer_Factory INSTANCE = new ContextualTriggerConfigTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ContextualTriggerConfigTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ContextualTriggerConfigTransformer newInstance() {
        return new ContextualTriggerConfigTransformer();
    }

    public ContextualTriggerConfigTransformer get() {
        return newInstance();
    }
}
