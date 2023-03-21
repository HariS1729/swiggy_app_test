package in.swiggy.android.tejas.feature.launch.prelaunch;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class PreLaunchModule_ProvidesPreLaunchApiFactory implements e<IPreLaunchAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public PreLaunchModule_ProvidesPreLaunchApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static PreLaunchModule_ProvidesPreLaunchApiFactory create(Provider<Retrofit> provider) {
        return new PreLaunchModule_ProvidesPreLaunchApiFactory(provider);
    }

    public static IPreLaunchAPI providesPreLaunchApi(Retrofit retrofit) {
        return (IPreLaunchAPI) i.e(PreLaunchModule.providesPreLaunchApi(retrofit));
    }

    public IPreLaunchAPI get() {
        return providesPreLaunchApi(this.retrofitProvider.get());
    }
}
