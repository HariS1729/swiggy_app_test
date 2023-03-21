package in.swiggy.android.tejas.feature.launch.aggregated;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: AggregatedLaunchModule.kt */
public final class AggregatedLaunchModule {
    public static final AggregatedLaunchModule INSTANCE = new AggregatedLaunchModule();

    private AggregatedLaunchModule() {
    }

    public static final IAggregatedLaunchAPI providesAggregatedLaunchApi(@RetrofitDevApi(apiType = ApiEndPointType.DISCOVERY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IAggregatedLaunchAPI.class);
        p.i(create, "retrofit.create(IAggregatedLaunchAPI::class.java)");
        return (IAggregatedLaunchAPI) create;
    }

    public static final IAggregatedCoroutineLaunchAPI providesAggregatedLaunchCoroutineApi(@RetrofitDevApi(apiType = ApiEndPointType.DISCOVERY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IAggregatedCoroutineLaunchAPI.class);
        p.i(create, "retrofit.create(IAggrega…ineLaunchAPI::class.java)");
        return (IAggregatedCoroutineLaunchAPI) create;
    }
}
