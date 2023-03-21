package in.swiggy.android.tejas.feature.instamart;

import javax.inject.Provider;
import qq.e;

public final class InstamartManager_Factory implements e<InstamartManager> {
    private final Provider<IInstamartApi> instamartApiProvider;

    public InstamartManager_Factory(Provider<IInstamartApi> provider) {
        this.instamartApiProvider = provider;
    }

    public static InstamartManager_Factory create(Provider<IInstamartApi> provider) {
        return new InstamartManager_Factory(provider);
    }

    public static InstamartManager newInstance(IInstamartApi iInstamartApi) {
        return new InstamartManager(iInstamartApi);
    }

    public InstamartManager get() {
        return newInstance(this.instamartApiProvider.get());
    }
}
