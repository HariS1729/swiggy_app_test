package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextLine;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.TextLineTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesTextLineTransformerFactory implements e<ITransformer<CPPopupWidget.RenderableInfo, TextLine>> {
    private final Provider<TextLineTransformer> textLineTransformerProvider;

    public ConfigTransformerModule_ProvidesTextLineTransformerFactory(Provider<TextLineTransformer> provider) {
        this.textLineTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesTextLineTransformerFactory create(Provider<TextLineTransformer> provider) {
        return new ConfigTransformerModule_ProvidesTextLineTransformerFactory(provider);
    }

    public static ITransformer<CPPopupWidget.RenderableInfo, TextLine> providesTextLineTransformer(TextLineTransformer textLineTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesTextLineTransformer(textLineTransformer));
    }

    public ITransformer<CPPopupWidget.RenderableInfo, TextLine> get() {
        return providesTextLineTransformer(this.textLineTransformerProvider.get());
    }
}
