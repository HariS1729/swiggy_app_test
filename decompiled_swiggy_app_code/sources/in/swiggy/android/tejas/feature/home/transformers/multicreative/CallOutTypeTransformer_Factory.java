package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import qq.e;

public final class CallOutTypeTransformer_Factory implements e<CallOutTypeTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CallOutTypeTransformer_Factory INSTANCE = new CallOutTypeTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CallOutTypeTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CallOutTypeTransformer newInstance() {
        return new CallOutTypeTransformer();
    }

    public CallOutTypeTransformer get() {
        return newInstance();
    }
}
