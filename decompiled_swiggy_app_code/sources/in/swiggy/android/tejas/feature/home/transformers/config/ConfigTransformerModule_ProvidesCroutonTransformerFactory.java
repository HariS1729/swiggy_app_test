package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.Crouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.feature.home.transformers.config.crouton.CroutonMetaInfoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesCroutonTransformerFactory implements e<ITransformer<Crouton, HomeCroutonData>> {
    private final Provider<CroutonMetaInfoTransformer> croutonMetaInfoTransformerProvider;

    public ConfigTransformerModule_ProvidesCroutonTransformerFactory(Provider<CroutonMetaInfoTransformer> provider) {
        this.croutonMetaInfoTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesCroutonTransformerFactory create(Provider<CroutonMetaInfoTransformer> provider) {
        return new ConfigTransformerModule_ProvidesCroutonTransformerFactory(provider);
    }

    public static ITransformer<Crouton, HomeCroutonData> providesCroutonTransformer(CroutonMetaInfoTransformer croutonMetaInfoTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesCroutonTransformer(croutonMetaInfoTransformer));
    }

    public ITransformer<Crouton, HomeCroutonData> get() {
        return providesCroutonTransformer(this.croutonMetaInfoTransformerProvider.get());
    }
}
