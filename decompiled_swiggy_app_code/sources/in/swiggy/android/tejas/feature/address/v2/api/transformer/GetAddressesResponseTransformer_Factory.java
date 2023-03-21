package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import qq.e;

public final class GetAddressesResponseTransformer_Factory implements e<GetAddressesResponseTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GetAddressesResponseTransformer_Factory INSTANCE = new GetAddressesResponseTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static GetAddressesResponseTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetAddressesResponseTransformer newInstance() {
        return new GetAddressesResponseTransformer();
    }

    public GetAddressesResponseTransformer get() {
        return newInstance();
    }
}
