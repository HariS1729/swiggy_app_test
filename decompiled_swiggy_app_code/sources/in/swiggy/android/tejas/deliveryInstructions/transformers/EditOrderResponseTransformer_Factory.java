package in.swiggy.android.tejas.deliveryInstructions.transformers;

import qq.e;

public final class EditOrderResponseTransformer_Factory implements e<EditOrderResponseTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final EditOrderResponseTransformer_Factory INSTANCE = new EditOrderResponseTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static EditOrderResponseTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EditOrderResponseTransformer newInstance() {
        return new EditOrderResponseTransformer();
    }

    public EditOrderResponseTransformer get() {
        return newInstance();
    }
}
