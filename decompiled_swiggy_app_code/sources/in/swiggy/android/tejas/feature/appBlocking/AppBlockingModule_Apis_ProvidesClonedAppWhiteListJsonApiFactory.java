package in.swiggy.android.tejas.feature.appBlocking;

import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhitelistJsonApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class AppBlockingModule_Apis_ProvidesClonedAppWhiteListJsonApiFactory implements e<IClonedAppWhitelistJsonApi> {
    private final Provider<Retrofit> retrofitProvider;

    public AppBlockingModule_Apis_ProvidesClonedAppWhiteListJsonApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static AppBlockingModule_Apis_ProvidesClonedAppWhiteListJsonApiFactory create(Provider<Retrofit> provider) {
        return new AppBlockingModule_Apis_ProvidesClonedAppWhiteListJsonApiFactory(provider);
    }

    public static IClonedAppWhitelistJsonApi providesClonedAppWhiteListJsonApi(Retrofit retrofit) {
        return (IClonedAppWhitelistJsonApi) i.e(AppBlockingModule.Apis.providesClonedAppWhiteListJsonApi(retrofit));
    }

    public IClonedAppWhitelistJsonApi get() {
        return providesClonedAppWhiteListJsonApi(this.retrofitProvider.get());
    }
}
