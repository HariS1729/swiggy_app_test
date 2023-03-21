package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.Cta;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.CtaInfoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesCtaInfoTransformerFactory implements e<ITransformer<Cta, CTAInfo>> {
    private final Provider<CtaInfoTransformer> ctaInfoTransformerProvider;

    public ConfigTransformerModule_ProvidesCtaInfoTransformerFactory(Provider<CtaInfoTransformer> provider) {
        this.ctaInfoTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesCtaInfoTransformerFactory create(Provider<CtaInfoTransformer> provider) {
        return new ConfigTransformerModule_ProvidesCtaInfoTransformerFactory(provider);
    }

    public static ITransformer<Cta, CTAInfo> providesCtaInfoTransformer(CtaInfoTransformer ctaInfoTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesCtaInfoTransformer(ctaInfoTransformer));
    }

    public ITransformer<Cta, CTAInfo> get() {
        return providesCtaInfoTransformer(this.ctaInfoTransformerProvider.get());
    }
}
