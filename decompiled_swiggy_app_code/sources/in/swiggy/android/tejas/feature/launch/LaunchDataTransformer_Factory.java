package in.swiggy.android.tejas.feature.launch;

import qq.e;

public final class LaunchDataTransformer_Factory implements e<LaunchDataTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final LaunchDataTransformer_Factory INSTANCE = new LaunchDataTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static LaunchDataTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LaunchDataTransformer newInstance() {
        return new LaunchDataTransformer();
    }

    public LaunchDataTransformer get() {
        return newInstance();
    }
}
