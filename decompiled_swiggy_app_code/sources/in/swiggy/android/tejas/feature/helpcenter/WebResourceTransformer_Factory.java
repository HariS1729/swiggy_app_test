package in.swiggy.android.tejas.feature.helpcenter;

import qq.e;

public final class WebResourceTransformer_Factory implements e<WebResourceTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final WebResourceTransformer_Factory INSTANCE = new WebResourceTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static WebResourceTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WebResourceTransformer newInstance() {
        return new WebResourceTransformer();
    }

    public WebResourceTransformer get() {
        return newInstance();
    }
}
