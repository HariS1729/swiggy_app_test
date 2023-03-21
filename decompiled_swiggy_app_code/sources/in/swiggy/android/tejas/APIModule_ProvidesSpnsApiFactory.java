package in.swiggy.android.tejas;

import in.swiggy.android.tejas.apiinterface.ISpnsApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesSpnsApiFactory implements e<ISpnsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesSpnsApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesSpnsApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesSpnsApiFactory(provider);
    }

    public static ISpnsApi providesSpnsApi(Retrofit retrofit) {
        return (ISpnsApi) i.e(APIModule.providesSpnsApi(retrofit));
    }

    public ISpnsApi get() {
        return providesSpnsApi(this.retrofitProvider.get());
    }
}
