package in.swiggy.android.tejas.feature.google.googlereversegeocode.transformer;

import qq.e;

public final class GoogleReverseGeocodeTransformer_Factory implements e<GoogleReverseGeocodeTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GoogleReverseGeocodeTransformer_Factory INSTANCE = new GoogleReverseGeocodeTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static GoogleReverseGeocodeTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GoogleReverseGeocodeTransformer newInstance() {
        return new GoogleReverseGeocodeTransformer();
    }

    public GoogleReverseGeocodeTransformer get() {
        return newInstance();
    }
}
