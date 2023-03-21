package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BusinessLineInfo;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BusinessLineInfoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesBusinessLineInfoTransformerFactory implements e<ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo>> {
    private final Provider<BusinessLineInfoTransformer> businessLineInfoTransformerProvider;

    public ConfigTransformerModule_ProvidesBusinessLineInfoTransformerFactory(Provider<BusinessLineInfoTransformer> provider) {
        this.businessLineInfoTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesBusinessLineInfoTransformerFactory create(Provider<BusinessLineInfoTransformer> provider) {
        return new ConfigTransformerModule_ProvidesBusinessLineInfoTransformerFactory(provider);
    }

    public static ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> providesBusinessLineInfoTransformer(BusinessLineInfoTransformer businessLineInfoTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesBusinessLineInfoTransformer(businessLineInfoTransformer));
    }

    public ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> get() {
        return providesBusinessLineInfoTransformer(this.businessLineInfoTransformerProvider.get());
    }
}
