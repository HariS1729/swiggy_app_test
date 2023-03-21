package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import qq.e;

public final class GetDefaultingAddressResponseTransformer_Factory implements e<GetDefaultingAddressResponseTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GetDefaultingAddressResponseTransformer_Factory INSTANCE = new GetDefaultingAddressResponseTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static GetDefaultingAddressResponseTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetDefaultingAddressResponseTransformer newInstance() {
        return new GetDefaultingAddressResponseTransformer();
    }

    public GetDefaultingAddressResponseTransformer get() {
        return newInstance();
    }
}
