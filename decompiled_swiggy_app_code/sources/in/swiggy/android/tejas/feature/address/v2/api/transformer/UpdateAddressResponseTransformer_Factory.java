package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import qq.e;

public final class UpdateAddressResponseTransformer_Factory implements e<UpdateAddressResponseTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final UpdateAddressResponseTransformer_Factory INSTANCE = new UpdateAddressResponseTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static UpdateAddressResponseTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UpdateAddressResponseTransformer newInstance() {
        return new UpdateAddressResponseTransformer();
    }

    public UpdateAddressResponseTransformer get() {
        return newInstance();
    }
}
