package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import qq.e;

public final class GoogleDirectionsTransformer_Factory implements e<GoogleDirectionsTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GoogleDirectionsTransformer_Factory INSTANCE = new GoogleDirectionsTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static GoogleDirectionsTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GoogleDirectionsTransformer newInstance() {
        return new GoogleDirectionsTransformer();
    }

    public GoogleDirectionsTransformer get() {
        return newInstance();
    }
}
