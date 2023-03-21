package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextStyle;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.TextStyleTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesTextStyleTransformerFactory implements e<ITransformer<CPPopupWidget.TextStyle, TextStyle>> {
    private final Provider<TextStyleTransformer> textStyleTransformerProvider;

    public ConfigTransformerModule_ProvidesTextStyleTransformerFactory(Provider<TextStyleTransformer> provider) {
        this.textStyleTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesTextStyleTransformerFactory create(Provider<TextStyleTransformer> provider) {
        return new ConfigTransformerModule_ProvidesTextStyleTransformerFactory(provider);
    }

    public static ITransformer<CPPopupWidget.TextStyle, TextStyle> providesTextStyleTransformer(TextStyleTransformer textStyleTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesTextStyleTransformer(textStyleTransformer));
    }

    public ITransformer<CPPopupWidget.TextStyle, TextStyle> get() {
        return providesTextStyleTransformer(this.textStyleTransformerProvider.get());
    }
}
