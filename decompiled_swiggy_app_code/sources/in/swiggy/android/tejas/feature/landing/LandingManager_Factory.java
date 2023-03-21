package in.swiggy.android.tejas.feature.landing;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class LandingManager_Factory implements e<LandingManager> {
    private final Provider<ILandingResultAPI> apiProvider;
    private final Provider<IErrorChecker<Response>> errorCheckerLandingProvider;
    private final Provider<ITransformer<Response, Error>> errorTransformerLandingProvider;
    private final Provider<ITransformer<Throwable, Error>> exceptionTransformerProvider;
    private final Provider<ITransformer<Response, ListingResponse>> landingTransformerProvider;

    public LandingManager_Factory(Provider<ILandingResultAPI> provider, Provider<ITransformer<Response, ListingResponse>> provider2, Provider<ITransformer<Throwable, Error>> provider3, Provider<IErrorChecker<Response>> provider4, Provider<ITransformer<Response, Error>> provider5) {
        this.apiProvider = provider;
        this.landingTransformerProvider = provider2;
        this.exceptionTransformerProvider = provider3;
        this.errorCheckerLandingProvider = provider4;
        this.errorTransformerLandingProvider = provider5;
    }

    public static LandingManager_Factory create(Provider<ILandingResultAPI> provider, Provider<ITransformer<Response, ListingResponse>> provider2, Provider<ITransformer<Throwable, Error>> provider3, Provider<IErrorChecker<Response>> provider4, Provider<ITransformer<Response, Error>> provider5) {
        return new LandingManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static LandingManager newInstance(ILandingResultAPI iLandingResultAPI, ITransformer<Response, ListingResponse> iTransformer, ITransformer<Throwable, Error> iTransformer2, IErrorChecker<Response> iErrorChecker, ITransformer<Response, Error> iTransformer3) {
        return new LandingManager(iLandingResultAPI, iTransformer, iTransformer2, iErrorChecker, iTransformer3);
    }

    public LandingManager get() {
        return newInstance(this.apiProvider.get(), this.landingTransformerProvider.get(), this.exceptionTransformerProvider.get(), this.errorCheckerLandingProvider.get(), this.errorTransformerLandingProvider.get());
    }
}
