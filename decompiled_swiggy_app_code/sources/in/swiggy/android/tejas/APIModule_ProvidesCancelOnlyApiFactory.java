package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.cancellation.ICancelOnlyApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesCancelOnlyApiFactory implements e<ICancelOnlyApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesCancelOnlyApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesCancelOnlyApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesCancelOnlyApiFactory(provider);
    }

    public static ICancelOnlyApi providesCancelOnlyApi(Retrofit retrofit) {
        return (ICancelOnlyApi) i.e(APIModule.providesCancelOnlyApi(retrofit));
    }

    public ICancelOnlyApi get() {
        return providesCancelOnlyApi(this.retrofitProvider.get());
    }
}
