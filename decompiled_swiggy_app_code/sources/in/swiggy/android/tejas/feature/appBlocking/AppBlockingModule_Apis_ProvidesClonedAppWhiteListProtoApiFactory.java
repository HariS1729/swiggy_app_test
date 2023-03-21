package in.swiggy.android.tejas.feature.appBlocking;

import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhiteListApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AppBlockingModule_Apis_ProvidesClonedAppWhiteListProtoApiFactory implements e<IClonedAppWhiteListApi> {
    private final Provider<Retrofit> retrofitProvider;

    public AppBlockingModule_Apis_ProvidesClonedAppWhiteListProtoApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AppBlockingModule_Apis_ProvidesClonedAppWhiteListProtoApiFactory create(Provider<Retrofit> provider) {
        return new AppBlockingModule_Apis_ProvidesClonedAppWhiteListProtoApiFactory(provider);
    }

    public static IClonedAppWhiteListApi providesClonedAppWhiteListProtoApi(Retrofit retrofit) {
        return (IClonedAppWhiteListApi) i.e(AppBlockingModule.Apis.providesClonedAppWhiteListProtoApi(retrofit));
    }

    public IClonedAppWhiteListApi get() {
        return providesClonedAppWhiteListProtoApi(this.retrofitProvider.get());
    }
}
