package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.crouton.DiscoveryCroutonConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DiscoveryConfigsTransformerModule_ProvidesDiscoveryCroutonConfigTransformerFactory implements e<ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>>> {
    private final Provider<DiscoveryCroutonConfigTransformer> discoveryCroutonConfigTransformerProvider;

    public DiscoveryConfigsTransformerModule_ProvidesDiscoveryCroutonConfigTransformerFactory(Provider<DiscoveryCroutonConfigTransformer> provider) {
        this.discoveryCroutonConfigTransformerProvider = provider;
    }

    public static DiscoveryConfigsTransformerModule_ProvidesDiscoveryCroutonConfigTransformerFactory create(Provider<DiscoveryCroutonConfigTransformer> provider) {
        return new DiscoveryConfigsTransformerModule_ProvidesDiscoveryCroutonConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>> providesDiscoveryCroutonConfigTransformer(DiscoveryCroutonConfigTransformer discoveryCroutonConfigTransformer) {
        return (ITransformer) i.e(DiscoveryConfigsTransformerModule.providesDiscoveryCroutonConfigTransformer(discoveryCroutonConfigTransformer));
    }

    public ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>> get() {
        return providesDiscoveryCroutonConfigTransformer(this.discoveryCroutonConfigTransformerProvider.get());
    }
}
