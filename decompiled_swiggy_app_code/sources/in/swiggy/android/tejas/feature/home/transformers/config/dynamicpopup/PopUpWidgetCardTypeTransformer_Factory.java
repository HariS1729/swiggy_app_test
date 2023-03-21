package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import qq.e;

public final class PopUpWidgetCardTypeTransformer_Factory implements e<PopUpWidgetCardTypeTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PopUpWidgetCardTypeTransformer_Factory INSTANCE = new PopUpWidgetCardTypeTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static PopUpWidgetCardTypeTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PopUpWidgetCardTypeTransformer newInstance() {
        return new PopUpWidgetCardTypeTransformer();
    }

    public PopUpWidgetCardTypeTransformer get() {
        return newInstance();
    }
}
