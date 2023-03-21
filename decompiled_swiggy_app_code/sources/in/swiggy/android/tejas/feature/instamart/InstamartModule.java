package in.swiggy.android.tejas.feature.instamart;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: InstamartModule.kt */
public final class InstamartModule {
    public static final InstamartModule INSTANCE = new InstamartModule();

    private InstamartModule() {
    }

    public final IInstamartApi providesInstamartApi(@RetrofitDevApi(apiType = ApiEndPointType.DASH_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IInstamartApi.class);
        p.i(create, "retrofit.create(IInstamartApi::class.java)");
        return (IInstamartApi) create;
    }
}
