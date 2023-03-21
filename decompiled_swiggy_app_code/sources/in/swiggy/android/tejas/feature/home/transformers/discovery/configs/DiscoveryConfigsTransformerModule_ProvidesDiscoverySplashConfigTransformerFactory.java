package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.splash.DiscoverySplashConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DiscoveryConfigsTransformerModule_ProvidesDiscoverySplashConfigTransformerFactory implements e<ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>>> {
    private final Provider<DiscoverySplashConfigTransformer> discoverySplashConfigTransformerProvider;

    public DiscoveryConfigsTransformerModule_ProvidesDiscoverySplashConfigTransformerFactory(Provider<DiscoverySplashConfigTransformer> provider) {
        this.discoverySplashConfigTransformerProvider = provider;
    }

    public static DiscoveryConfigsTransformerModule_ProvidesDiscoverySplashConfigTransformerFactory create(Provider<DiscoverySplashConfigTransformer> provider) {
        return new DiscoveryConfigsTransformerModule_ProvidesDiscoverySplashConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>> providesDiscoverySplashConfigTransformer(DiscoverySplashConfigTransformer discoverySplashConfigTransformer) {
        return (ITransformer) i.e(DiscoveryConfigsTransformerModule.providesDiscoverySplashConfigTransformer(discoverySplashConfigTransformer));
    }

    public ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>> get() {
        return providesDiscoverySplashConfigTransformer(this.discoverySplashConfigTransformerProvider.get());
    }
}
