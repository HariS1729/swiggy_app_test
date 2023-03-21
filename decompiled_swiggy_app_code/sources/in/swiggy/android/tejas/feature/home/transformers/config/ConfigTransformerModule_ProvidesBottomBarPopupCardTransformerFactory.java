package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCard;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BottomBarPopupCardTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesBottomBarPopupCardTransformerFactory implements e<ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard>> {
    private final Provider<BottomBarPopupCardTransformer> bottomBarPopupCardTransformerProvider;

    public ConfigTransformerModule_ProvidesBottomBarPopupCardTransformerFactory(Provider<BottomBarPopupCardTransformer> provider) {
        this.bottomBarPopupCardTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesBottomBarPopupCardTransformerFactory create(Provider<BottomBarPopupCardTransformer> provider) {
        return new ConfigTransformerModule_ProvidesBottomBarPopupCardTransformerFactory(provider);
    }

    public static ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> providesBottomBarPopupCardTransformer(BottomBarPopupCardTransformer bottomBarPopupCardTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesBottomBarPopupCardTransformer(bottomBarPopupCardTransformer));
    }

    public ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> get() {
        return providesBottomBarPopupCardTransformer(this.bottomBarPopupCardTransformerProvider.get());
    }
}
