package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.feature.crosssell.CrossSellResultsAPI;
import in.swiggy.android.tejas.feature.crosssell.ICrossSellAPI;
import in.swiggy.android.tejas.feature.crosssell.ICrossSellResultsAPI;
import in.swiggy.android.tejas.feature.landing.ILandingAPI;
import in.swiggy.android.tejas.feature.landing.ILandingResultAPI;
import in.swiggy.android.tejas.feature.landing.LandingResultAPI;
import in.swiggy.android.tejas.feature.relevance.IRelevanceAPI;
import in.swiggy.android.tejas.feature.relevance.IRelevanceResultsAPI;
import in.swiggy.android.tejas.feature.relevance.RelevanceResultsAPI;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitProtobufApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: HomeLandingAPIModule.kt */
public final class HomeLandingAPIModule {
    public static final HomeLandingAPIModule INSTANCE = new HomeLandingAPIModule();

    private HomeLandingAPIModule() {
    }

    public static final ICrossSellAPI providesCrossSellAPI(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(ICrossSellAPI.class);
        p.i(create, "retrofit.create(ICrossSellAPI::class.java)");
        return (ICrossSellAPI) create;
    }

    public static final ICrossSellResultsAPI providesCrossSellResultsAPI(CrossSellResultsAPI crossSellResultsAPI) {
        p.j(crossSellResultsAPI, "crossSellResultsAPI");
        return crossSellResultsAPI;
    }

    public static final ILandingAPI providesLandingAPI(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(ILandingAPI.class);
        p.i(create, "retrofit.create(ILandingAPI::class.java)");
        return (ILandingAPI) create;
    }

    public static final ILandingResultAPI providesLandingResultAPI(LandingResultAPI landingResultAPI) {
        p.j(landingResultAPI, "landingResultAPI");
        return landingResultAPI;
    }

    public static final IRelevanceAPI providesRelevanceAPI(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IRelevanceAPI.class);
        p.i(create, "retrofit.create(IRelevanceAPI::class.java)");
        return (IRelevanceAPI) create;
    }

    public static final IRelevanceResultsAPI providesRelevanceResultAPI(RelevanceResultsAPI relevanceResultsAPI) {
        p.j(relevanceResultsAPI, "relevanceResultsAPI");
        return relevanceResultsAPI;
    }
}
