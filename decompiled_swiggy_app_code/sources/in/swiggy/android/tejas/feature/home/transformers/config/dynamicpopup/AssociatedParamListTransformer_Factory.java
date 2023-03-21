package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import qq.e;

public final class AssociatedParamListTransformer_Factory implements e<AssociatedParamListTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AssociatedParamListTransformer_Factory INSTANCE = new AssociatedParamListTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static AssociatedParamListTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AssociatedParamListTransformer newInstance() {
        return new AssociatedParamListTransformer();
    }

    public AssociatedParamListTransformer get() {
        return newInstance();
    }
}
