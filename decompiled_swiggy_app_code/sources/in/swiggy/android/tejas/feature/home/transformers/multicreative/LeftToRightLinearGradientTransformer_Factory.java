package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import qq.e;

public final class LeftToRightLinearGradientTransformer_Factory implements e<LeftToRightLinearGradientTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final LeftToRightLinearGradientTransformer_Factory INSTANCE = new LeftToRightLinearGradientTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static LeftToRightLinearGradientTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LeftToRightLinearGradientTransformer newInstance() {
        return new LeftToRightLinearGradientTransformer();
    }

    public LeftToRightLinearGradientTransformer get() {
        return newInstance();
    }
}
