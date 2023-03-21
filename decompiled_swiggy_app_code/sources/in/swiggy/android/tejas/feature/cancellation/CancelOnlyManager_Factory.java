package in.swiggy.android.tejas.feature.cancellation;

import javax.inject.Provider;
import qq.e;

public final class CancelOnlyManager_Factory implements e<CancelOnlyManager> {
    private final Provider<ICancelOnlyApi> apiProvider;

    public CancelOnlyManager_Factory(Provider<ICancelOnlyApi> provider) {
        this.apiProvider = provider;
    }

    public static CancelOnlyManager_Factory create(Provider<ICancelOnlyApi> provider) {
        return new CancelOnlyManager_Factory(provider);
    }

    public static CancelOnlyManager newInstance(ICancelOnlyApi iCancelOnlyApi) {
        return new CancelOnlyManager(iCancelOnlyApi);
    }

    public CancelOnlyManager get() {
        return newInstance(this.apiProvider.get());
    }
}
