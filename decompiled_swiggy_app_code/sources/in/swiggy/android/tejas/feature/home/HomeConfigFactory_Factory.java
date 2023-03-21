package in.swiggy.android.tejas.feature.home;

import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class HomeConfigFactory_Factory implements e<HomeConfigFactory> {
    private final Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>>> croutonConfigTransformerProvider;
    private final Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>>> popupConfigTransformerProvider;
    private final Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>>> splashConfigTransformerProvider;

    public HomeConfigFactory_Factory(Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>>> provider, Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>>> provider2, Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>>> provider3) {
        this.popupConfigTransformerProvider = provider;
        this.croutonConfigTransformerProvider = provider2;
        this.splashConfigTransformerProvider = provider3;
    }

    public static HomeConfigFactory_Factory create(Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>>> provider, Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>>> provider2, Provider<ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>>> provider3) {
        return new HomeConfigFactory_Factory(provider, provider2, provider3);
    }

    public static HomeConfigFactory newInstance(ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>> iTransformer, ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>> iTransformer2, ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>> iTransformer3) {
        return new HomeConfigFactory(iTransformer, iTransformer2, iTransformer3);
    }

    public HomeConfigFactory get() {
        return newInstance(this.popupConfigTransformerProvider.get(), this.croutonConfigTransformerProvider.get(), this.splashConfigTransformerProvider.get());
    }
}
