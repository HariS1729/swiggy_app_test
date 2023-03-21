package in.swiggy.android.tejas;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesDashAPIFactory implements e<IDashAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesDashAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesDashAPIFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesDashAPIFactory(provider);
    }

    public static IDashAPI providesDashAPI(Retrofit retrofit) {
        return (IDashAPI) i.e(APIModule.providesDashAPI(retrofit));
    }

    public IDashAPI get() {
        return providesDashAPI(this.retrofitProvider.get());
    }
}
