package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitProtobufApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: DiscoveryAPIModule.kt */
public final class DiscoveryAPIModule {
    public static final DiscoveryAPIModule INSTANCE = new DiscoveryAPIModule();

    private DiscoveryAPIModule() {
    }

    public static final IDiscoveryAPI providesAPI(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDiscoveryAPI.class);
        p.i(create, "retrofit.create(IDiscoveryAPI::class.java)");
        return (IDiscoveryAPI) create;
    }

    public static final IDiscoveryJsonApi providesJsonAPI(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDiscoveryJsonApi.class);
        p.i(create, "retrofit.create(IDiscoveryJsonApi::class.java)");
        return (IDiscoveryJsonApi) create;
    }
}
