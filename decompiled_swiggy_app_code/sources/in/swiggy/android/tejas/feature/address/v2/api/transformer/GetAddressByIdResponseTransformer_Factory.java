package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import qq.e;

public final class GetAddressByIdResponseTransformer_Factory implements e<GetAddressByIdResponseTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GetAddressByIdResponseTransformer_Factory INSTANCE = new GetAddressByIdResponseTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static GetAddressByIdResponseTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetAddressByIdResponseTransformer newInstance() {
        return new GetAddressByIdResponseTransformer();
    }

    public GetAddressByIdResponseTransformer get() {
        return newInstance();
    }
}
