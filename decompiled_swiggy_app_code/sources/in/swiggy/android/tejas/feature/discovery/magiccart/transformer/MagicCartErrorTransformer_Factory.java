package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import qq.e;

public final class MagicCartErrorTransformer_Factory implements e<MagicCartErrorTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MagicCartErrorTransformer_Factory INSTANCE = new MagicCartErrorTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static MagicCartErrorTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MagicCartErrorTransformer newInstance() {
        return new MagicCartErrorTransformer();
    }

    public MagicCartErrorTransformer get() {
        return newInstance();
    }
}
