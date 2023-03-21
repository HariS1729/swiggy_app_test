package in.swiggy.android.tejas.feature.google.directions;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.transformer.SwiggyDirectionsTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DirectionsModule_ProvidesSwiggyDirectionsTransformerFactory implements e<ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>>> {
    private final Provider<SwiggyDirectionsTransformer> swiggyDirectionsTransformerProvider;

    public DirectionsModule_ProvidesSwiggyDirectionsTransformerFactory(Provider<SwiggyDirectionsTransformer> provider) {
        this.swiggyDirectionsTransformerProvider = provider;
    }

    public static DirectionsModule_ProvidesSwiggyDirectionsTransformerFactory create(Provider<SwiggyDirectionsTransformer> provider) {
        return new DirectionsModule_ProvidesSwiggyDirectionsTransformerFactory(provider);
    }

    public static ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> providesSwiggyDirectionsTransformer(SwiggyDirectionsTransformer swiggyDirectionsTransformer) {
        return (ITransformer) i.e(DirectionsModule.providesSwiggyDirectionsTransformer(swiggyDirectionsTransformer));
    }

    public ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> get() {
        return providesSwiggyDirectionsTransformer(this.swiggyDirectionsTransformerProvider.get());
    }
}
