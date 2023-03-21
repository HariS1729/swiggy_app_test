package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetPositionTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesPopUpWidgetPositionTransformerFactory implements e<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> {
    private final Provider<PopUpWidgetPositionTransformer> positionTransformerProvider;

    public ConfigTransformerModule_ProvidesPopUpWidgetPositionTransformerFactory(Provider<PopUpWidgetPositionTransformer> provider) {
        this.positionTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesPopUpWidgetPositionTransformerFactory create(Provider<PopUpWidgetPositionTransformer> provider) {
        return new ConfigTransformerModule_ProvidesPopUpWidgetPositionTransformerFactory(provider);
    }

    public static ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> providesPopUpWidgetPositionTransformer(PopUpWidgetPositionTransformer popUpWidgetPositionTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesPopUpWidgetPositionTransformer(popUpWidgetPositionTransformer));
    }

    public ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> get() {
        return providesPopUpWidgetPositionTransformer(this.positionTransformerProvider.get());
    }
}
