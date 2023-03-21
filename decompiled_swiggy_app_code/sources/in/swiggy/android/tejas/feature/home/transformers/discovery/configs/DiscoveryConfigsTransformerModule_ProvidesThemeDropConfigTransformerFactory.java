package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.pageconfig.ThemeDrop;
import in.swiggy.android.tejas.feature.home.transformers.config.ThemeDropConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DiscoveryConfigsTransformerModule_ProvidesThemeDropConfigTransformerFactory implements e<ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>>> {
    private final Provider<ThemeDropConfigTransformer> themeDropConfigTransformerProvider;

    public DiscoveryConfigsTransformerModule_ProvidesThemeDropConfigTransformerFactory(Provider<ThemeDropConfigTransformer> provider) {
        this.themeDropConfigTransformerProvider = provider;
    }

    public static DiscoveryConfigsTransformerModule_ProvidesThemeDropConfigTransformerFactory create(Provider<ThemeDropConfigTransformer> provider) {
        return new DiscoveryConfigsTransformerModule_ProvidesThemeDropConfigTransformerFactory(provider);
    }

    public static ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>> providesThemeDropConfigTransformer(ThemeDropConfigTransformer themeDropConfigTransformer) {
        return (ITransformer) i.e(DiscoveryConfigsTransformerModule.providesThemeDropConfigTransformer(themeDropConfigTransformer));
    }

    public ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>> get() {
        return providesThemeDropConfigTransformer(this.themeDropConfigTransformerProvider.get());
    }
}
