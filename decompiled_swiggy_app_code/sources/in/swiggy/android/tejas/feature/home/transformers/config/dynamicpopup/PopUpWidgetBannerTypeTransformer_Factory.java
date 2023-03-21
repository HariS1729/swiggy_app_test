package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import qq.e;

public final class PopUpWidgetBannerTypeTransformer_Factory implements e<PopUpWidgetBannerTypeTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PopUpWidgetBannerTypeTransformer_Factory INSTANCE = new PopUpWidgetBannerTypeTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static PopUpWidgetBannerTypeTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PopUpWidgetBannerTypeTransformer newInstance() {
        return new PopUpWidgetBannerTypeTransformer();
    }

    public PopUpWidgetBannerTypeTransformer get() {
        return newInstance();
    }
}
