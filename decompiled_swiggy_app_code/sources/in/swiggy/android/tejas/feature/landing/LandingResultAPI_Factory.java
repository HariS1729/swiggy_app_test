package in.swiggy.android.tejas.feature.landing;

import javax.inject.Provider;
import os.a;
import qq.e;

public final class LandingResultAPI_Factory implements e<LandingResultAPI> {
    private final Provider<a> appBuildDetailsProvider;
    private final Provider<ILandingAPI> landingAPIProvider;

    public LandingResultAPI_Factory(Provider<ILandingAPI> provider, Provider<a> provider2) {
        this.landingAPIProvider = provider;
        this.appBuildDetailsProvider = provider2;
    }

    public static LandingResultAPI_Factory create(Provider<ILandingAPI> provider, Provider<a> provider2) {
        return new LandingResultAPI_Factory(provider, provider2);
    }

    public static LandingResultAPI newInstance(ILandingAPI iLandingAPI, a aVar) {
        return new LandingResultAPI(iLandingAPI, aVar);
    }

    public LandingResultAPI get() {
        return newInstance(this.landingAPIProvider.get(), this.appBuildDetailsProvider.get());
    }
}
