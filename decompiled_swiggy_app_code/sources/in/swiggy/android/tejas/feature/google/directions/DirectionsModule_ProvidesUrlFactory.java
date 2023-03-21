package in.swiggy.android.tejas.feature.google.directions;

import qq.e;
import qq.i;

public final class DirectionsModule_ProvidesUrlFactory implements e<String> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final DirectionsModule_ProvidesUrlFactory INSTANCE = new DirectionsModule_ProvidesUrlFactory();

        private InstanceHolder() {
        }
    }

    public static DirectionsModule_ProvidesUrlFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String providesUrl() {
        return (String) i.e(DirectionsModule.providesUrl());
    }

    public String get() {
        return providesUrl();
    }
}
