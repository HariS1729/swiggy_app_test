package in.swiggy.android.tejas.feature.home;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class HomeModule_ProvidesHomeTransformersFactory implements e<Map<String, ITransformer<?, ?>>> {
    private final Provider<ITransformer<Throwable, Error>> homeExceptionTransformerProvider;

    public HomeModule_ProvidesHomeTransformersFactory(Provider<ITransformer<Throwable, Error>> provider) {
        this.homeExceptionTransformerProvider = provider;
    }

    public static HomeModule_ProvidesHomeTransformersFactory create(Provider<ITransformer<Throwable, Error>> provider) {
        return new HomeModule_ProvidesHomeTransformersFactory(provider);
    }

    public static Map<String, ITransformer<?, ?>> providesHomeTransformers(ITransformer<Throwable, Error> iTransformer) {
        return (Map) i.e(HomeModule.INSTANCE.providesHomeTransformers(iTransformer));
    }

    public Map<String, ITransformer<?, ?>> get() {
        return providesHomeTransformers(this.homeExceptionTransformerProvider.get());
    }
}
