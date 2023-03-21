package in.swiggy.android.tejas.feature.home.transformers.config.video;

import qq.e;

public final class PopupPositionTransformer_Factory implements e<PopupPositionTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PopupPositionTransformer_Factory INSTANCE = new PopupPositionTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static PopupPositionTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PopupPositionTransformer newInstance() {
        return new PopupPositionTransformer();
    }

    public PopupPositionTransformer get() {
        return newInstance();
    }
}
