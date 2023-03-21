package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.video.DiscoveryPopupConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DiscoveryConfigsTransformerModule_ProvidesDiscoveryPopupConfigTransformerFactory implements e<ITransformer<SuccessResponse.PageConfigs, List<HomePopup>>> {
    private final Provider<DiscoveryPopupConfigTransformer> discoveryPopupConfigTransformerProvider;

    public DiscoveryConfigsTransformerModule_ProvidesDiscoveryPopupConfigTransformerFactory(Provider<DiscoveryPopupConfigTransformer> provider) {
        this.discoveryPopupConfigTransformerProvider = provider;
    }

    public static DiscoveryConfigsTransformerModule_ProvidesDiscoveryPopupConfigTransformerFactory create(Provider<DiscoveryPopupConfigTransformer> provider) {
        return new DiscoveryConfigsTransformerModule_ProvidesDiscoveryPopupConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessResponse.PageConfigs, List<HomePopup>> providesDiscoveryPopupConfigTransformer(DiscoveryPopupConfigTransformer discoveryPopupConfigTransformer) {
        return (ITransformer) i.e(DiscoveryConfigsTransformerModule.providesDiscoveryPopupConfigTransformer(discoveryPopupConfigTransformer));
    }

    public ITransformer<SuccessResponse.PageConfigs, List<HomePopup>> get() {
        return providesDiscoveryPopupConfigTransformer(this.discoveryPopupConfigTransformerProvider.get());
    }
}
