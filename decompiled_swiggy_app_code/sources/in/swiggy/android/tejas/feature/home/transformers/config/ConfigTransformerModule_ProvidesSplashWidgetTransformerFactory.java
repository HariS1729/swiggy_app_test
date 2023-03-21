package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.TextBanner;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.WidgetInfo;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.SplashWidgetTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesSplashWidgetTransformerFactory implements e<ITransformer<TextBanner, WidgetInfo>> {
    private final Provider<SplashWidgetTransformer> splashWidgetTransformerProvider;

    public ConfigTransformerModule_ProvidesSplashWidgetTransformerFactory(Provider<SplashWidgetTransformer> provider) {
        this.splashWidgetTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesSplashWidgetTransformerFactory create(Provider<SplashWidgetTransformer> provider) {
        return new ConfigTransformerModule_ProvidesSplashWidgetTransformerFactory(provider);
    }

    public static ITransformer<TextBanner, WidgetInfo> providesSplashWidgetTransformer(SplashWidgetTransformer splashWidgetTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesSplashWidgetTransformer(splashWidgetTransformer));
    }

    public ITransformer<TextBanner, WidgetInfo> get() {
        return providesSplashWidgetTransformer(this.splashWidgetTransformerProvider.get());
    }
}
