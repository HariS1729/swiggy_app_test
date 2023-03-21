package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.transformers.config.crouton.CroutonConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesCroutonConfigTransformerFactory implements e<ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>>> {
    private final Provider<CroutonConfigTransformer> croutonConfigTransformerProvider;

    public ConfigTransformerModule_ProvidesCroutonConfigTransformerFactory(Provider<CroutonConfigTransformer> provider) {
        this.croutonConfigTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesCroutonConfigTransformerFactory create(Provider<CroutonConfigTransformer> provider) {
        return new ConfigTransformerModule_ProvidesCroutonConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>> providesCroutonConfigTransformer(CroutonConfigTransformer croutonConfigTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesCroutonConfigTransformer(croutonConfigTransformer));
    }

    public ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>> get() {
        return providesCroutonConfigTransformer(this.croutonConfigTransformerProvider.get());
    }
}
