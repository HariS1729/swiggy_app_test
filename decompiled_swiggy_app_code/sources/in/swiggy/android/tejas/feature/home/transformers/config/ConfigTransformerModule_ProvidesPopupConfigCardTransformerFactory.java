package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesPopupConfigCardTransformerFactory implements e<ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>>> {
    private final Provider<PopupConfigTransformer> popupConfigTransformerProvider;

    public ConfigTransformerModule_ProvidesPopupConfigCardTransformerFactory(Provider<PopupConfigTransformer> provider) {
        this.popupConfigTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesPopupConfigCardTransformerFactory create(Provider<PopupConfigTransformer> provider) {
        return new ConfigTransformerModule_ProvidesPopupConfigCardTransformerFactory(provider);
    }

    public static ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>> providesPopupConfigCardTransformer(PopupConfigTransformer popupConfigTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesPopupConfigCardTransformer(popupConfigTransformer));
    }

    public ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>> get() {
        return providesPopupConfigCardTransformer(this.popupConfigTransformerProvider.get());
    }
}
