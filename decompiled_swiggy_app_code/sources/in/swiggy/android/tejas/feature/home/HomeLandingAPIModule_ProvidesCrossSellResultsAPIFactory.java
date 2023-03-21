package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.crosssell.CrossSellResultsAPI;
import in.swiggy.android.tejas.feature.crosssell.ICrossSellResultsAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class HomeLandingAPIModule_ProvidesCrossSellResultsAPIFactory implements e<ICrossSellResultsAPI> {
    private final Provider<CrossSellResultsAPI> crossSellResultsAPIProvider;

    public HomeLandingAPIModule_ProvidesCrossSellResultsAPIFactory(Provider<CrossSellResultsAPI> provider) {
        this.crossSellResultsAPIProvider = provider;
    }

    public static HomeLandingAPIModule_ProvidesCrossSellResultsAPIFactory create(Provider<CrossSellResultsAPI> provider) {
        return new HomeLandingAPIModule_ProvidesCrossSellResultsAPIFactory(provider);
    }

    public static ICrossSellResultsAPI providesCrossSellResultsAPI(CrossSellResultsAPI crossSellResultsAPI) {
        return (ICrossSellResultsAPI) i.e(HomeLandingAPIModule.providesCrossSellResultsAPI(crossSellResultsAPI));
    }

    public ICrossSellResultsAPI get() {
        return providesCrossSellResultsAPI(this.crossSellResultsAPIProvider.get());
    }
}
