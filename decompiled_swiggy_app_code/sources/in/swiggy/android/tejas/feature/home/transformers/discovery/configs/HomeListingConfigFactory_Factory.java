package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.ContextualTrigger;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.SwiggyOneEntryPoint;
import in.swiggy.android.tejas.feature.home.model.pageconfig.ThemeDrop;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class HomeListingConfigFactory_Factory implements e<HomeListingConfigFactory> {
    private final Provider<ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>>> contextualTriggerConfigTransformerProvider;
    private final Provider<ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>>> croutonConfigTransformerProvider;
    private final Provider<ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>>> oneEntryPointConfigTransformerProvider;
    private final Provider<ITransformer<SuccessResponse.PageConfigs, List<HomePopup>>> popupConfigTransformerProvider;
    private final Provider<ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>>> splashConfigTransformerProvider;
    private final Provider<ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>>> themeDropConfigTransformerProvider;

    public HomeListingConfigFactory_Factory(Provider<ITransformer<SuccessResponse.PageConfigs, List<HomePopup>>> provider, Provider<ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>>> provider2, Provider<ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>>> provider3, Provider<ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>>> provider4, Provider<ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>>> provider5, Provider<ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>>> provider6) {
        this.popupConfigTransformerProvider = provider;
        this.croutonConfigTransformerProvider = provider2;
        this.splashConfigTransformerProvider = provider3;
        this.themeDropConfigTransformerProvider = provider4;
        this.contextualTriggerConfigTransformerProvider = provider5;
        this.oneEntryPointConfigTransformerProvider = provider6;
    }

    public static HomeListingConfigFactory_Factory create(Provider<ITransformer<SuccessResponse.PageConfigs, List<HomePopup>>> provider, Provider<ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>>> provider2, Provider<ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>>> provider3, Provider<ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>>> provider4, Provider<ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>>> provider5, Provider<ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>>> provider6) {
        return new HomeListingConfigFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static HomeListingConfigFactory newInstance(ITransformer<SuccessResponse.PageConfigs, List<HomePopup>> iTransformer, ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>> iTransformer2, ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>> iTransformer3, ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>> iTransformer4, ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>> iTransformer5, ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>> iTransformer6) {
        return new HomeListingConfigFactory(iTransformer, iTransformer2, iTransformer3, iTransformer4, iTransformer5, iTransformer6);
    }

    public HomeListingConfigFactory get() {
        return newInstance(this.popupConfigTransformerProvider.get(), this.croutonConfigTransformerProvider.get(), this.splashConfigTransformerProvider.get(), this.themeDropConfigTransformerProvider.get(), this.contextualTriggerConfigTransformerProvider.get(), this.oneEntryPointConfigTransformerProvider.get());
    }
}
