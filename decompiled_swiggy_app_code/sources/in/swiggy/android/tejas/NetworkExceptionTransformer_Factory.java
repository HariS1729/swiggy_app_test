package in.swiggy.android.tejas;

import qq.e;

public final class NetworkExceptionTransformer_Factory implements e<NetworkExceptionTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final NetworkExceptionTransformer_Factory INSTANCE = new NetworkExceptionTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static NetworkExceptionTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NetworkExceptionTransformer newInstance() {
        return new NetworkExceptionTransformer();
    }

    public NetworkExceptionTransformer get() {
        return newInstance();
    }
}
