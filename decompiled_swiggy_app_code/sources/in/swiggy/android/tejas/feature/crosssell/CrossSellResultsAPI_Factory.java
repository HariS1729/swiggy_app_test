package in.swiggy.android.tejas.feature.crosssell;

import javax.inject.Provider;
import os.a;
import qq.e;

public final class CrossSellResultsAPI_Factory implements e<CrossSellResultsAPI> {
    private final Provider<a> appBuildDetailsProvider;
    private final Provider<ICrossSellAPI> crossSellAPIProvider;

    public CrossSellResultsAPI_Factory(Provider<ICrossSellAPI> provider, Provider<a> provider2) {
        this.crossSellAPIProvider = provider;
        this.appBuildDetailsProvider = provider2;
    }

    public static CrossSellResultsAPI_Factory create(Provider<ICrossSellAPI> provider, Provider<a> provider2) {
        return new CrossSellResultsAPI_Factory(provider, provider2);
    }

    public static CrossSellResultsAPI newInstance(ICrossSellAPI iCrossSellAPI, a aVar) {
        return new CrossSellResultsAPI(iCrossSellAPI, aVar);
    }

    public CrossSellResultsAPI get() {
        return newInstance(this.crossSellAPIProvider.get(), this.appBuildDetailsProvider.get());
    }
}
