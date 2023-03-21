package in.swiggy.android.tejas.feature.feedback;

import in.swiggy.android.tejas.IDashAPI;
import javax.inject.Provider;
import qq.e;

public final class DashRatingsManager_Factory implements e<DashRatingsManager> {
    private final Provider<IDashAPI> dashAPIProvider;

    public DashRatingsManager_Factory(Provider<IDashAPI> provider) {
        this.dashAPIProvider = provider;
    }

    public static DashRatingsManager_Factory create(Provider<IDashAPI> provider) {
        return new DashRatingsManager_Factory(provider);
    }

    public static DashRatingsManager newInstance(IDashAPI iDashAPI) {
        return new DashRatingsManager(iDashAPI);
    }

    public DashRatingsManager get() {
        return newInstance(this.dashAPIProvider.get());
    }
}
