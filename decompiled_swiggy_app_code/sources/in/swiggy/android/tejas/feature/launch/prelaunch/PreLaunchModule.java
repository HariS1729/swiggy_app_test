package in.swiggy.android.tejas.feature.launch.prelaunch;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: PreLaunchModule.kt */
public final class PreLaunchModule {
    public static final PreLaunchModule INSTANCE = new PreLaunchModule();

    private PreLaunchModule() {
    }

    public static final IPreLaunchAPI providesPreLaunchApi(@RetrofitDevApi(apiType = ApiEndPointType.PROFILE_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IPreLaunchAPI.class);
        p.i(create, "retrofit.create(IPreLaunchAPI::class.java)");
        return (IPreLaunchAPI) create;
    }
}
