package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.Cta;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.MetaInfo;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.MetaInfoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesMetaInfoTransformerFactory implements e<ITransformer<Cta.CtaMeta, MetaInfo>> {
    private final Provider<MetaInfoTransformer> metaInfoTransformerProvider;

    public ConfigTransformerModule_ProvidesMetaInfoTransformerFactory(Provider<MetaInfoTransformer> provider) {
        this.metaInfoTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesMetaInfoTransformerFactory create(Provider<MetaInfoTransformer> provider) {
        return new ConfigTransformerModule_ProvidesMetaInfoTransformerFactory(provider);
    }

    public static ITransformer<Cta.CtaMeta, MetaInfo> providesMetaInfoTransformer(MetaInfoTransformer metaInfoTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesMetaInfoTransformer(metaInfoTransformer));
    }

    public ITransformer<Cta.CtaMeta, MetaInfo> get() {
        return providesMetaInfoTransformer(this.metaInfoTransformerProvider.get());
    }
}
