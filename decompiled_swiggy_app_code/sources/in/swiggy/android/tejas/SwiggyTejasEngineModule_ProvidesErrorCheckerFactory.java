package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import qq.e;
import qq.i;

public final class SwiggyTejasEngineModule_ProvidesErrorCheckerFactory implements e<IErrorChecker<SwiggyBaseResponse>> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final SwiggyTejasEngineModule_ProvidesErrorCheckerFactory INSTANCE = new SwiggyTejasEngineModule_ProvidesErrorCheckerFactory();

        private InstanceHolder() {
        }
    }

    public static SwiggyTejasEngineModule_ProvidesErrorCheckerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IErrorChecker<SwiggyBaseResponse> providesErrorChecker() {
        return (IErrorChecker) i.e(SwiggyTejasEngineModule.INSTANCE.providesErrorChecker());
    }

    public IErrorChecker<SwiggyBaseResponse> get() {
        return providesErrorChecker();
    }
}
