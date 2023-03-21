package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.ContextualTrigger;
import in.swiggy.android.tejas.feature.home.transformers.config.ContextualTriggerConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DiscoveryConfigsTransformerModule_ProvidesContextualTriggerConfigTransformerFactory implements e<ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>>> {
    private final Provider<ContextualTriggerConfigTransformer> contextualTriggerConfigTransformerProvider;

    public DiscoveryConfigsTransformerModule_ProvidesContextualTriggerConfigTransformerFactory(Provider<ContextualTriggerConfigTransformer> provider) {
        this.contextualTriggerConfigTransformerProvider = provider;
    }

    public static DiscoveryConfigsTransformerModule_ProvidesContextualTriggerConfigTransformerFactory create(Provider<ContextualTriggerConfigTransformer> provider) {
        return new DiscoveryConfigsTransformerModule_ProvidesContextualTriggerConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>> providesContextualTriggerConfigTransformer(ContextualTriggerConfigTransformer contextualTriggerConfigTransformer) {
        return (ITransformer) i.e(DiscoveryConfigsTransformerModule.providesContextualTriggerConfigTransformer(contextualTriggerConfigTransformer));
    }

    public ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>> get() {
        return providesContextualTriggerConfigTransformer(this.contextualTriggerConfigTransformerProvider.get());
    }
}
