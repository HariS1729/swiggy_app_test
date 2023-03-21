package in.swiggy.android.tejas.deliveryInstructions.transformers;

import qq.e;

public final class OrderDataToAddressTransformer_Factory implements e<OrderDataToAddressTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final OrderDataToAddressTransformer_Factory INSTANCE = new OrderDataToAddressTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static OrderDataToAddressTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OrderDataToAddressTransformer newInstance() {
        return new OrderDataToAddressTransformer();
    }

    public OrderDataToAddressTransformer get() {
        return newInstance();
    }
}
