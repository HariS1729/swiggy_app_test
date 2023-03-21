package in.swiggy.android.tejas.feature.listing.accessibility.transformers;

import qq.e;

public final class AccessibilityTransformer_Factory implements e<AccessibilityTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AccessibilityTransformer_Factory INSTANCE = new AccessibilityTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static AccessibilityTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AccessibilityTransformer newInstance() {
        return new AccessibilityTransformer();
    }

    public AccessibilityTransformer get() {
        return newInstance();
    }
}
