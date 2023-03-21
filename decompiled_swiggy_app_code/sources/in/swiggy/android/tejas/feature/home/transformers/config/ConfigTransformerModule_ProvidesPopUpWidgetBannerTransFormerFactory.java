package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.BannerType;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetBannerTypeTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesPopUpWidgetBannerTransFormerFactory implements e<ITransformer<PopUpWidget.BannerType, BannerType>> {
    private final Provider<PopUpWidgetBannerTypeTransformer> popUpWidgetBannerTypeTransformerProvider;

    public ConfigTransformerModule_ProvidesPopUpWidgetBannerTransFormerFactory(Provider<PopUpWidgetBannerTypeTransformer> provider) {
        this.popUpWidgetBannerTypeTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesPopUpWidgetBannerTransFormerFactory create(Provider<PopUpWidgetBannerTypeTransformer> provider) {
        return new ConfigTransformerModule_ProvidesPopUpWidgetBannerTransFormerFactory(provider);
    }

    public static ITransformer<PopUpWidget.BannerType, BannerType> providesPopUpWidgetBannerTransFormer(PopUpWidgetBannerTypeTransformer popUpWidgetBannerTypeTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesPopUpWidgetBannerTransFormer(popUpWidgetBannerTypeTransformer));
    }

    public ITransformer<PopUpWidget.BannerType, BannerType> get() {
        return providesPopUpWidgetBannerTransFormer(this.popUpWidgetBannerTypeTransformerProvider.get());
    }
}
