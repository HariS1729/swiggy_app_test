package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import qq.e;

public final class MenuAttributeTransformer_Factory implements e<MenuAttributeTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MenuAttributeTransformer_Factory INSTANCE = new MenuAttributeTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static MenuAttributeTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MenuAttributeTransformer newInstance() {
        return new MenuAttributeTransformer();
    }

    public MenuAttributeTransformer get() {
        return newInstance();
    }
}
