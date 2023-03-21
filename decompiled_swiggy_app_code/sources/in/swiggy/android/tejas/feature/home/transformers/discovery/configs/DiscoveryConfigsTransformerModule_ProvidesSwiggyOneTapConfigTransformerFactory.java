package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.pageconfig.SwiggyOneEntryPoint;
import in.swiggy.android.tejas.feature.home.transformers.config.swiggyoneentrypoint.SwiggyOneEntryPointConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DiscoveryConfigsTransformerModule_ProvidesSwiggyOneTapConfigTransformerFactory implements e<ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>>> {
    private final Provider<SwiggyOneEntryPointConfigTransformer> swiggyOneTapConfigTransformerProvider;

    public DiscoveryConfigsTransformerModule_ProvidesSwiggyOneTapConfigTransformerFactory(Provider<SwiggyOneEntryPointConfigTransformer> provider) {
        this.swiggyOneTapConfigTransformerProvider = provider;
    }

    public static DiscoveryConfigsTransformerModule_ProvidesSwiggyOneTapConfigTransformerFactory create(Provider<SwiggyOneEntryPointConfigTransformer> provider) {
        return new DiscoveryConfigsTransformerModule_ProvidesSwiggyOneTapConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>> providesSwiggyOneTapConfigTransformer(SwiggyOneEntryPointConfigTransformer swiggyOneEntryPointConfigTransformer) {
        return (ITransformer) i.e(DiscoveryConfigsTransformerModule.providesSwiggyOneTapConfigTransformer(swiggyOneEntryPointConfigTransformer));
    }

    public ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>> get() {
        return providesSwiggyOneTapConfigTransformer(this.swiggyOneTapConfigTransformerProvider.get());
    }
}
