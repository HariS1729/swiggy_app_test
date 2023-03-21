package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.menu.outletselector.IOutletSelectorApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvideOutletSelectorApiFactory implements e<IOutletSelectorApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvideOutletSelectorApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvideOutletSelectorApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvideOutletSelectorApiFactory(provider);
    }

    public static IOutletSelectorApi provideOutletSelectorApi(Retrofit retrofit) {
        return (IOutletSelectorApi) i.e(APIModule.provideOutletSelectorApi(retrofit));
    }

    public IOutletSelectorApi get() {
        return provideOutletSelectorApi(this.retrofitProvider.get());
    }
}
