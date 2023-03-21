package in.swiggy.android.tejas.feature.home.transformers.config.swiggyoneentrypoint;

import qq.e;

public final class SwiggyOneEntryPointConfigTransformer_Factory implements e<SwiggyOneEntryPointConfigTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final SwiggyOneEntryPointConfigTransformer_Factory INSTANCE = new SwiggyOneEntryPointConfigTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static SwiggyOneEntryPointConfigTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SwiggyOneEntryPointConfigTransformer newInstance() {
        return new SwiggyOneEntryPointConfigTransformer();
    }

    public SwiggyOneEntryPointConfigTransformer get() {
        return newInstance();
    }
}
