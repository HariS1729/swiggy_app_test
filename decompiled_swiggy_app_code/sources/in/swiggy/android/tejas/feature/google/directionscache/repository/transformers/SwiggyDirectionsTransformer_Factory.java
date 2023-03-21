package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import qq.e;

public final class SwiggyDirectionsTransformer_Factory implements e<SwiggyDirectionsTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final SwiggyDirectionsTransformer_Factory INSTANCE = new SwiggyDirectionsTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static SwiggyDirectionsTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SwiggyDirectionsTransformer newInstance() {
        return new SwiggyDirectionsTransformer();
    }

    public SwiggyDirectionsTransformer get() {
        return newInstance();
    }
}
