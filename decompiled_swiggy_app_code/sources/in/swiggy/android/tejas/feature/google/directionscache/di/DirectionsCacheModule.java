package in.swiggy.android.tejas.feature.google.directionscache.di;

import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsGoogleApi;
import in.swiggy.android.tejas.feature.google.directionscache.api.IDirectionsSwiggyApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: DirectionsCacheModule.kt */
public final class DirectionsCacheModule {
    public static final DirectionsCacheModule INSTANCE = new DirectionsCacheModule();

    private DirectionsCacheModule() {
    }

    public final IDirectionsGoogleApi providesGoogleDirectionAPI(Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        return (IDirectionsGoogleApi) retrofit.create(IDirectionsGoogleApi.class);
    }

    public final IDirectionsSwiggyApi providesSwiggyDirectionsAPI(Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        return (IDirectionsSwiggyApi) retrofit.create(IDirectionsSwiggyApi.class);
    }
}
