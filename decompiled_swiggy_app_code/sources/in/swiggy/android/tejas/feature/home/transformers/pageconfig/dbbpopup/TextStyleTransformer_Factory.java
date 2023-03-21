package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import qq.e;

public final class TextStyleTransformer_Factory implements e<TextStyleTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final TextStyleTransformer_Factory INSTANCE = new TextStyleTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static TextStyleTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TextStyleTransformer newInstance() {
        return new TextStyleTransformer();
    }

    public TextStyleTransformer get() {
        return newInstance();
    }
}
