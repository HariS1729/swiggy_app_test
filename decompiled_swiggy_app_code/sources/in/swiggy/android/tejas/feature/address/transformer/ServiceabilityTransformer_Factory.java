package in.swiggy.android.tejas.feature.address.transformer;

import qq.e;

public final class ServiceabilityTransformer_Factory implements e<ServiceabilityTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ServiceabilityTransformer_Factory INSTANCE = new ServiceabilityTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ServiceabilityTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ServiceabilityTransformer newInstance() {
        return new ServiceabilityTransformer();
    }

    public ServiceabilityTransformer get() {
        return newInstance();
    }
}
