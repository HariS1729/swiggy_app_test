package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import qq.e;

public final class CreativeTransformer_Factory implements e<CreativeTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CreativeTransformer_Factory INSTANCE = new CreativeTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CreativeTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CreativeTransformer newInstance() {
        return new CreativeTransformer();
    }

    public CreativeTransformer get() {
        return newInstance();
    }
}
