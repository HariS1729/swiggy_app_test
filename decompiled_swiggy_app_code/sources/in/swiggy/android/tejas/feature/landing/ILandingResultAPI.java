package in.swiggy.android.tejas.feature.landing;

import fp0.c;
import retrofit2.Response;

/* compiled from: ILandingResultAPI.kt */
public interface ILandingResultAPI {

    /* compiled from: ILandingResultAPI.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFeatureCollection$default(ILandingResultAPI iLandingResultAPI, String str, double d11, double d12, Integer num, String str2, Object obj, String str3, c cVar, int i11, Object obj2) {
            if (obj2 == null) {
                return iLandingResultAPI.getFeatureCollection(str, d11, d12, num, str2, (i11 & 32) != 0 ? null : obj, str3, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeatureCollection");
        }
    }

    Object getCollectionV3(String str, String str2, String str3, Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    Object getFavorites(String str, String str2, Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    Object getFeatureCollection(String str, double d11, double d12, Integer num, String str2, Object obj, String str3, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);

    Object getHiddenRestaurants(String str, String str2, Object obj, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);
}
