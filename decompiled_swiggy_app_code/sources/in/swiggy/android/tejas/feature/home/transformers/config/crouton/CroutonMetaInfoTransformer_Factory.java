package in.swiggy.android.tejas.feature.home.transformers.config.crouton;

import qq.e;

public final class CroutonMetaInfoTransformer_Factory implements e<CroutonMetaInfoTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CroutonMetaInfoTransformer_Factory INSTANCE = new CroutonMetaInfoTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CroutonMetaInfoTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CroutonMetaInfoTransformer newInstance() {
        return new CroutonMetaInfoTransformer();
    }

    public CroutonMetaInfoTransformer get() {
        return newInstance();
    }
}
