package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsGoogleApi;
import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsSwiggyApi;
import in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer;
import in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import javax.inject.Provider;
import qq.e;

public final class DirectionsRemoteDataSource_Factory implements e<DirectionsRemoteDataSource> {
    private final Provider<IDirectionsGoogleApi> googleApiProvider;
    private final Provider<GoogleDirectionsTransformer> googleDirectionsTransformerProvider;
    private final Provider<IDirectionsSwiggyApi> swiggyApiProvider;
    private final Provider<SwiggyDirectionsTransformer> swiggyDirectionsTransformerProvider;
    private final Provider<UrlSigner> urlSignerProvider;

    public DirectionsRemoteDataSource_Factory(Provider<IDirectionsGoogleApi> provider, Provider<IDirectionsSwiggyApi> provider2, Provider<UrlSigner> provider3, Provider<GoogleDirectionsTransformer> provider4, Provider<SwiggyDirectionsTransformer> provider5) {
        this.googleApiProvider = provider;
        this.swiggyApiProvider = provider2;
        this.urlSignerProvider = provider3;
        this.googleDirectionsTransformerProvider = provider4;
        this.swiggyDirectionsTransformerProvider = provider5;
    }

    public static DirectionsRemoteDataSource_Factory create(Provider<IDirectionsGoogleApi> provider, Provider<IDirectionsSwiggyApi> provider2, Provider<UrlSigner> provider3, Provider<GoogleDirectionsTransformer> provider4, Provider<SwiggyDirectionsTransformer> provider5) {
        return new DirectionsRemoteDataSource_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DirectionsRemoteDataSource newInstance(IDirectionsGoogleApi iDirectionsGoogleApi, IDirectionsSwiggyApi iDirectionsSwiggyApi, UrlSigner urlSigner, GoogleDirectionsTransformer googleDirectionsTransformer, SwiggyDirectionsTransformer swiggyDirectionsTransformer) {
        return new DirectionsRemoteDataSource(iDirectionsGoogleApi, iDirectionsSwiggyApi, urlSigner, googleDirectionsTransformer, swiggyDirectionsTransformer);
    }

    public DirectionsRemoteDataSource get() {
        return newInstance(this.googleApiProvider.get(), this.swiggyApiProvider.get(), this.urlSignerProvider.get(), this.googleDirectionsTransformerProvider.get(), this.swiggyDirectionsTransformerProvider.get());
    }
}
