package in.swiggy.android.tejas.feature.dataplatform;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.feature.dataplatform.api.IMessageApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: DataPlatformModule.kt */
public final class DataPlatformModule {
    public static final DataPlatformModule INSTANCE = new DataPlatformModule();

    private DataPlatformModule() {
    }

    public static final IMessageApi providesMessageApi(@RetrofitDevApi(apiType = ApiEndPointType.ANALYTICS_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IMessageApi.class);
        p.i(create, "retrofit.create(IMessageApi::class.java)");
        return (IMessageApi) create;
    }
}
