package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import qq.e;

public final class PopUpWidgetPositionTransformer_Factory implements e<PopUpWidgetPositionTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PopUpWidgetPositionTransformer_Factory INSTANCE = new PopUpWidgetPositionTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static PopUpWidgetPositionTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PopUpWidgetPositionTransformer newInstance() {
        return new PopUpWidgetPositionTransformer();
    }

    public PopUpWidgetPositionTransformer get() {
        return newInstance();
    }
}
