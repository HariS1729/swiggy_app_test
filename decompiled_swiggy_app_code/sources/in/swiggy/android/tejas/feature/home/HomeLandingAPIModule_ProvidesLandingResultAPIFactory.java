package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.landing.ILandingResultAPI;
import in.swiggy.android.tejas.feature.landing.LandingResultAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class HomeLandingAPIModule_ProvidesLandingResultAPIFactory implements e<ILandingResultAPI> {
    private final Provider<LandingResultAPI> landingResultAPIProvider;

    public HomeLandingAPIModule_ProvidesLandingResultAPIFactory(Provider<LandingResultAPI> provider) {
        this.landingResultAPIProvider = provider;
    }

    public static HomeLandingAPIModule_ProvidesLandingResultAPIFactory create(Provider<LandingResultAPI> provider) {
        return new HomeLandingAPIModule_ProvidesLandingResultAPIFactory(provider);
    }

    public static ILandingResultAPI providesLandingResultAPI(LandingResultAPI landingResultAPI) {
        return (ILandingResultAPI) i.e(HomeLandingAPIModule.providesLandingResultAPI(landingResultAPI));
    }

    public ILandingResultAPI get() {
        return providesLandingResultAPI(this.landingResultAPIProvider.get());
    }
}
