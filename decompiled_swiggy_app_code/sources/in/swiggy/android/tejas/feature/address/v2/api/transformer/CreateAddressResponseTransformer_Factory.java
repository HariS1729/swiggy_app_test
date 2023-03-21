package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import qq.e;

public final class CreateAddressResponseTransformer_Factory implements e<CreateAddressResponseTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CreateAddressResponseTransformer_Factory INSTANCE = new CreateAddressResponseTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CreateAddressResponseTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CreateAddressResponseTransformer newInstance() {
        return new CreateAddressResponseTransformer();
    }

    public CreateAddressResponseTransformer get() {
        return newInstance();
    }
}
