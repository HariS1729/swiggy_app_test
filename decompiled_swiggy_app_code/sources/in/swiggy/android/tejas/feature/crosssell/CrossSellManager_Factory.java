package in.swiggy.android.tejas.feature.crosssell;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class CrossSellManager_Factory implements e<CrossSellManager> {
    private final Provider<ICrossSellResultsAPI> apiProvider;
    private final Provider<ITransformer<Response, CrossSellResponse>> crossSellTransformerProvider;
    private final Provider<IErrorChecker<Response>> errorCheckerLandingProvider;
    private final Provider<ITransformer<Response, Error>> errorTransformerLandingProvider;
    private final Provider<ITransformer<Throwable, Error>> exceptionTransformerProvider;

    public CrossSellManager_Factory(Provider<ICrossSellResultsAPI> provider, Provider<ITransformer<Response, CrossSellResponse>> provider2, Provider<ITransformer<Throwable, Error>> provider3, Provider<IErrorChecker<Response>> provider4, Provider<ITransformer<Response, Error>> provider5) {
        this.apiProvider = provider;
        this.crossSellTransformerProvider = provider2;
        this.exceptionTransformerProvider = provider3;
        this.errorCheckerLandingProvider = provider4;
        this.errorTransformerLandingProvider = provider5;
    }

    public static CrossSellManager_Factory create(Provider<ICrossSellResultsAPI> provider, Provider<ITransformer<Response, CrossSellResponse>> provider2, Provider<ITransformer<Throwable, Error>> provider3, Provider<IErrorChecker<Response>> provider4, Provider<ITransformer<Response, Error>> provider5) {
        return new CrossSellManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CrossSellManager newInstance(ICrossSellResultsAPI iCrossSellResultsAPI, ITransformer<Response, CrossSellResponse> iTransformer, ITransformer<Throwable, Error> iTransformer2, IErrorChecker<Response> iErrorChecker, ITransformer<Response, Error> iTransformer3) {
        return new CrossSellManager(iCrossSellResultsAPI, iTransformer, iTransformer2, iErrorChecker, iTransformer3);
    }

    public CrossSellManager get() {
        return newInstance(this.apiProvider.get(), this.crossSellTransformerProvider.get(), this.exceptionTransformerProvider.get(), this.errorCheckerLandingProvider.get(), this.errorTransformerLandingProvider.get());
    }
}
