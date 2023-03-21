package in.swiggy.android.tejas.feature.launch.prelaunch;

import javax.inject.Provider;
import qq.e;

public final class PreLaunchManager_Factory implements e<PreLaunchManager> {
    private final Provider<IPreLaunchAPI> apiProvider;

    public PreLaunchManager_Factory(Provider<IPreLaunchAPI> provider) {
        this.apiProvider = provider;
    }

    public static PreLaunchManager_Factory create(Provider<IPreLaunchAPI> provider) {
        return new PreLaunchManager_Factory(provider);
    }

    public static PreLaunchManager newInstance(IPreLaunchAPI iPreLaunchAPI) {
        return new PreLaunchManager(iPreLaunchAPI);
    }

    public PreLaunchManager get() {
        return newInstance(this.apiProvider.get());
    }
}
