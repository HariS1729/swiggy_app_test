package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesSplashConfigTransformerFactory implements e<ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>>> {
    private final Provider<SplashConfigTransformer> splashConfigTransformerProvider;

    public ConfigTransformerModule_ProvidesSplashConfigTransformerFactory(Provider<SplashConfigTransformer> provider) {
        this.splashConfigTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesSplashConfigTransformerFactory create(Provider<SplashConfigTransformer> provider) {
        return new ConfigTransformerModule_ProvidesSplashConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>> providesSplashConfigTransformer(SplashConfigTransformer splashConfigTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesSplashConfigTransformer(splashConfigTransformer));
    }

    public ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>> get() {
        return providesSplashConfigTransformer(this.splashConfigTransformerProvider.get());
    }
}
