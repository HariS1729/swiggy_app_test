package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.RichText;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.TextInfo;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.TextInfoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesTextInfoTransformerFactory implements e<ITransformer<RichText, TextInfo>> {
    private final Provider<TextInfoTransformer> textInfoTransformerProvider;

    public ConfigTransformerModule_ProvidesTextInfoTransformerFactory(Provider<TextInfoTransformer> provider) {
        this.textInfoTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesTextInfoTransformerFactory create(Provider<TextInfoTransformer> provider) {
        return new ConfigTransformerModule_ProvidesTextInfoTransformerFactory(provider);
    }

    public static ITransformer<RichText, TextInfo> providesTextInfoTransformer(TextInfoTransformer textInfoTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesTextInfoTransformer(textInfoTransformer));
    }

    public ITransformer<RichText, TextInfo> get() {
        return providesTextInfoTransformer(this.textInfoTransformerProvider.get());
    }
}
