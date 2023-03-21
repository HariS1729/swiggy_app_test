package in.swiggy.android.tejas.feature.google.directions;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.signers.UrlSigner;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import javax.inject.Provider;
import qq.e;

public final class DirectionsManager_Factory implements e<DirectionsManager> {
    private final Provider<String> baseUrlProvider;
    private final Provider<IDirectionsAPI> directionsApiProvider;
    private final Provider<ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>>> googleResponseTransformerProvider;
    private final Provider<IDirectionsSwiggyApi> swiggyDirectionsApiProvider;
    private final Provider<ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>>> swiggyResponseTransformerProvider;
    private final Provider<UrlSigner> urlSignerProvider;

    public DirectionsManager_Factory(Provider<String> provider, Provider<IDirectionsAPI> provider2, Provider<IDirectionsSwiggyApi> provider3, Provider<UrlSigner> provider4, Provider<ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>>> provider5, Provider<ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>>> provider6) {
        this.baseUrlProvider = provider;
        this.directionsApiProvider = provider2;
        this.swiggyDirectionsApiProvider = provider3;
        this.urlSignerProvider = provider4;
        this.googleResponseTransformerProvider = provider5;
        this.swiggyResponseTransformerProvider = provider6;
    }

    public static DirectionsManager_Factory create(Provider<String> provider, Provider<IDirectionsAPI> provider2, Provider<IDirectionsSwiggyApi> provider3, Provider<UrlSigner> provider4, Provider<ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>>> provider5, Provider<ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>>> provider6) {
        return new DirectionsManager_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DirectionsManager newInstance(String str, IDirectionsAPI iDirectionsAPI, IDirectionsSwiggyApi iDirectionsSwiggyApi, UrlSigner urlSigner, ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> iTransformer, ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> iTransformer2) {
        return new DirectionsManager(str, iDirectionsAPI, iDirectionsSwiggyApi, urlSigner, iTransformer, iTransformer2);
    }

    public DirectionsManager get() {
        return newInstance(this.baseUrlProvider.get(), this.directionsApiProvider.get(), this.swiggyDirectionsApiProvider.get(), this.urlSignerProvider.get(), this.googleResponseTransformerProvider.get(), this.swiggyResponseTransformerProvider.get());
    }
}
