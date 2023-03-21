package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopUpWidget;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesPopUpWidgetTransformerFactory implements e<ITransformer<PopUpWidget, HomePopUpWidget>> {
    private final Provider<PopUpWidgetTransformer> popUpWidgetTransformerProvider;

    public ConfigTransformerModule_ProvidesPopUpWidgetTransformerFactory(Provider<PopUpWidgetTransformer> provider) {
        this.popUpWidgetTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesPopUpWidgetTransformerFactory create(Provider<PopUpWidgetTransformer> provider) {
        return new ConfigTransformerModule_ProvidesPopUpWidgetTransformerFactory(provider);
    }

    public static ITransformer<PopUpWidget, HomePopUpWidget> providesPopUpWidgetTransformer(PopUpWidgetTransformer popUpWidgetTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesPopUpWidgetTransformer(popUpWidgetTransformer));
    }

    public ITransformer<PopUpWidget, HomePopUpWidget> get() {
        return providesPopUpWidgetTransformer(this.popUpWidgetTransformerProvider.get());
    }
}
