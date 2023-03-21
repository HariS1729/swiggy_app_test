package in.swiggy.android.tejas.feature.google.directions;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directions.transformer.GoogleDirectionsTransformer;
import in.swiggy.android.tejas.feature.google.directions.transformer.SwiggyDirectionsTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: DirectionsModule.kt */
public final class DirectionsModule {
    public static final String GOOGLE_API_END_POINT = "https://maps.googleapis.com";
    public static final DirectionsModule INSTANCE = new DirectionsModule();

    private DirectionsModule() {
    }

    public static final IDirectionsAPI providesDirectionAPI(Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDirectionsAPI.class);
        p.i(create, "retrofit.create(IDirectionsAPI::class.java)");
        return (IDirectionsAPI) create;
    }

    public static final ITransformer<GoogleDirectionsResponse, ArrayList<ArrayList<LatLng>>> providesGoogleDirectionsTransformer(GoogleDirectionsTransformer googleDirectionsTransformer) {
        p.j(googleDirectionsTransformer, "googleDirectionsTransformer");
        return googleDirectionsTransformer;
    }

    public static final IDirectionsSwiggyApi providesSwiggyDirectionAPI(Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDirectionsSwiggyApi.class);
        p.i(create, "retrofit.create(IDirectionsSwiggyApi::class.java)");
        return (IDirectionsSwiggyApi) create;
    }

    public static final ITransformer<SwiggyDirectionsResponse, ArrayList<ArrayList<LatLng>>> providesSwiggyDirectionsTransformer(SwiggyDirectionsTransformer swiggyDirectionsTransformer) {
        p.j(swiggyDirectionsTransformer, "swiggyDirectionsTransformer");
        return swiggyDirectionsTransformer;
    }

    public static final String providesUrl() {
        return GOOGLE_API_END_POINT;
    }
}
