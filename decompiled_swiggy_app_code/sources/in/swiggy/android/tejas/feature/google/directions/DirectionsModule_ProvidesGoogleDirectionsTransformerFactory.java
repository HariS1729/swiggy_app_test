package in.swiggy.android.tejas.feature.google.directions;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.transformer.GoogleDirectionsTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DirectionsModule_ProvidesGoogleDirectionsTransformerFactory implements e<ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>>> {
    private final Provider<GoogleDirectionsTransformer> googleDirectionsTransformerProvider;

    public DirectionsModule_ProvidesGoogleDirectionsTransformerFactory(Provider<GoogleDirectionsTransformer> provider) {
        this.googleDirectionsTransformerProvider = provider;
    }

    public static DirectionsModule_ProvidesGoogleDirectionsTransformerFactory create(Provider<GoogleDirectionsTransformer> provider) {
        return new DirectionsModule_ProvidesGoogleDirectionsTransformerFactory(provider);
    }

    public static ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> providesGoogleDirectionsTransformer(GoogleDirectionsTransformer googleDirectionsTransformer) {
        return (ITransformer) i.e(DirectionsModule.providesGoogleDirectionsTransformer(googleDirectionsTransformer));
    }

    public ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> get() {
        return providesGoogleDirectionsTransformer(this.googleDirectionsTransformerProvider.get());
    }
}
