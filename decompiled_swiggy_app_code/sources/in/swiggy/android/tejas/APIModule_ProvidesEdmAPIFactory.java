package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.edm.IEdmApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesEdmAPIFactory implements e<IEdmApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesEdmAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesEdmAPIFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesEdmAPIFactory(provider);
    }

    public static IEdmApi providesEdmAPI(Retrofit retrofit) {
        return (IEdmApi) i.e(APIModule.providesEdmAPI(retrofit));
    }

    public IEdmApi get() {
        return providesEdmAPI(this.retrofitProvider.get());
    }
}
