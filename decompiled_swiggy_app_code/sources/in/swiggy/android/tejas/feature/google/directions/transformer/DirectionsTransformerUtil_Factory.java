package in.swiggy.android.tejas.feature.google.directions.transformer;

import qq.e;

public final class DirectionsTransformerUtil_Factory implements e<DirectionsTransformerUtil> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final DirectionsTransformerUtil_Factory INSTANCE = new DirectionsTransformerUtil_Factory();

        private InstanceHolder() {
        }
    }

    public static DirectionsTransformerUtil_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DirectionsTransformerUtil newInstance() {
        return new DirectionsTransformerUtil();
    }

    public DirectionsTransformerUtil get() {
        return newInstance();
    }
}
