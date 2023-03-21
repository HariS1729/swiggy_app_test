package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.NetworkExceptionTransformer;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class HomeModule_ProvidesExceptionTransformerFactory implements e<ITransformer<Throwable, Error>> {
    private final Provider<NetworkExceptionTransformer> homeExceptionTransformerProvider;

    public HomeModule_ProvidesExceptionTransformerFactory(Provider<NetworkExceptionTransformer> provider) {
        this.homeExceptionTransformerProvider = provider;
    }

    public static HomeModule_ProvidesExceptionTransformerFactory create(Provider<NetworkExceptionTransformer> provider) {
        return new HomeModule_ProvidesExceptionTransformerFactory(provider);
    }

    public static ITransformer<Throwable, Error> providesExceptionTransformer(NetworkExceptionTransformer networkExceptionTransformer) {
        return (ITransformer) i.e(HomeModule.INSTANCE.providesExceptionTransformer(networkExceptionTransformer));
    }

    public ITransformer<Throwable, Error> get() {
        return providesExceptionTransformer(this.homeExceptionTransformerProvider.get());
    }
}
