package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.CardType;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetCardTypeTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesPopUpWidgetCardTypeTransformerFactory implements e<ITransformer<PopUpWidget.CardType, CardType>> {
    private final Provider<PopUpWidgetCardTypeTransformer> popUpWidgetCardTypeTransformerProvider;

    public ConfigTransformerModule_ProvidesPopUpWidgetCardTypeTransformerFactory(Provider<PopUpWidgetCardTypeTransformer> provider) {
        this.popUpWidgetCardTypeTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesPopUpWidgetCardTypeTransformerFactory create(Provider<PopUpWidgetCardTypeTransformer> provider) {
        return new ConfigTransformerModule_ProvidesPopUpWidgetCardTypeTransformerFactory(provider);
    }

    public static ITransformer<PopUpWidget.CardType, CardType> providesPopUpWidgetCardTypeTransformer(PopUpWidgetCardTypeTransformer popUpWidgetCardTypeTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesPopUpWidgetCardTypeTransformer(popUpWidgetCardTypeTransformer));
    }

    public ITransformer<PopUpWidget.CardType, CardType> get() {
        return providesPopUpWidgetCardTypeTransformer(this.popUpWidgetCardTypeTransformerProvider.get());
    }
}
