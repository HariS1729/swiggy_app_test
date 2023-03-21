package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import qq.e;

public final class TextInfoTransformer_Factory implements e<TextInfoTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final TextInfoTransformer_Factory INSTANCE = new TextInfoTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static TextInfoTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TextInfoTransformer newInstance() {
        return new TextInfoTransformer();
    }

    public TextInfoTransformer get() {
        return newInstance();
    }
}
