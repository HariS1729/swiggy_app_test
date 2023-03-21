package in.swiggy.android.tejas.feature.instamart;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class InstamartModule_ProvidesInstamartApiFactory implements e<IInstamartApi> {
    private final Provider<Retrofit> retrofitProvider;

    public InstamartModule_ProvidesInstamartApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static InstamartModule_ProvidesInstamartApiFactory create(Provider<Retrofit> provider) {
        return new InstamartModule_ProvidesInstamartApiFactory(provider);
    }

    public static IInstamartApi providesInstamartApi(Retrofit retrofit) {
        return (IInstamartApi) i.e(InstamartModule.INSTANCE.providesInstamartApi(retrofit));
    }

    public IInstamartApi get() {
        return providesInstamartApi(this.retrofitProvider.get());
    }
}
