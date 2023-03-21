package in.swiggy.android.tejas.feature.landing;

import fp0.c;
import kotlin.jvm.internal.p;
import os.a;
import retrofit2.Response;

/* compiled from: LandingResultAPI.kt */
public final class LandingResultAPI implements ILandingResultAPI {
    private final a appBuildDetails;
    private final ILandingAPI landingAPI;

    public LandingResultAPI(ILandingAPI iLandingAPI, a aVar) {
        p.j(iLandingAPI, "landingAPI");
        p.j(aVar, "appBuildDetails");
        this.landingAPI = iLandingAPI;
        this.appBuildDetails = aVar;
    }

    public Object getCollectionV3(String str, String str2, String str3, Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar) {
        if (this.appBuildDetails.j()) {
            return this.landingAPI.getCollectionV3(str, str2, str3, obj, cVar);
        }
        return this.landingAPI.getCollectionV3Json(str, str2, str3, obj, cVar);
    }

    public Object getFavorites(String str, String str2, Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar) {
        if (this.appBuildDetails.j()) {
            return this.landingAPI.getFavorites(str, str2, obj, cVar);
        }
        return this.landingAPI.getFavoritesJson(str, str2, obj, cVar);
    }

    public Object getFeatureCollection(String str, double d11, double d12, Integer num, String str2, Object obj, String str3, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar) {
        if (this.appBuildDetails.j()) {
            if (obj != null) {
                return this.landingAPI.getFeatureCollectionWithRequestBody(str, d11, d12, num, str2, obj, cVar);
            }
            return this.landingAPI.getFeatureCollection(str, d11, d12, num, str2, str3, cVar);
        } else if (obj != null) {
            return this.landingAPI.getFeatureCollectionJSONWithRequestBody(str, d11, d12, num, str2, obj, cVar);
        } else {
            return this.landingAPI.getFeatureCollectionJSON(str, d11, d12, num, str2, str3, cVar);
        }
    }

    public Object getHiddenRestaurants(String str, String str2, Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar) {
        if (this.appBuildDetails.j()) {
            return this.landingAPI.getHiddenRestos(str, str2, obj, cVar);
        }
        return this.landingAPI.getHiddenRestoJson(str, str2, obj, cVar);
    }
}
