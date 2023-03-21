package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.menu.outletselector.IOldOutletSelectorApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvideOldOutletSelectorApiFactory implements e<IOldOutletSelectorApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvideOldOutletSelectorApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvideOldOutletSelectorApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvideOldOutletSelectorApiFactory(provider);
    }

    public static IOldOutletSelectorApi provideOldOutletSelectorApi(Retrofit retrofit) {
        return (IOldOutletSelectorApi) i.e(APIModule.provideOldOutletSelectorApi(retrofit));
    }

    public IOldOutletSelectorApi get() {
        return provideOldOutletSelectorApi(this.retrofitProvider.get());
    }
}
