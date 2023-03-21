package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopup;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BottomBarPopupTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesBottomBarPopupTransformerFactory implements e<ITransformer<CPPopupWidget, BottomBarPopup>> {
    private final Provider<BottomBarPopupTransformer> bottomBarPopupTransformerProvider;

    public ConfigTransformerModule_ProvidesBottomBarPopupTransformerFactory(Provider<BottomBarPopupTransformer> provider) {
        this.bottomBarPopupTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesBottomBarPopupTransformerFactory create(Provider<BottomBarPopupTransformer> provider) {
        return new ConfigTransformerModule_ProvidesBottomBarPopupTransformerFactory(provider);
    }

    public static ITransformer<CPPopupWidget, BottomBarPopup> providesBottomBarPopupTransformer(BottomBarPopupTransformer bottomBarPopupTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesBottomBarPopupTransformer(bottomBarPopupTransformer));
    }

    public ITransformer<CPPopupWidget, BottomBarPopup> get() {
        return providesBottomBarPopupTransformer(this.bottomBarPopupTransformerProvider.get());
    }
}
