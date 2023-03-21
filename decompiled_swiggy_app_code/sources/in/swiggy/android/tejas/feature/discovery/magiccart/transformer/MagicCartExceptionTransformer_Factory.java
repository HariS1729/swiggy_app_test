package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import qq.e;

public final class MagicCartExceptionTransformer_Factory<M> implements e<MagicCartExceptionTransformer<M>> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MagicCartExceptionTransformer_Factory INSTANCE = new MagicCartExceptionTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static <M> MagicCartExceptionTransformer_Factory<M> create() {
        return InstanceHolder.INSTANCE;
    }

    public static <M> MagicCartExceptionTransformer<M> newInstance() {
        return new MagicCartExceptionTransformer<>();
    }

    public MagicCartExceptionTransformer<M> get() {
        return newInstance();
    }
}
