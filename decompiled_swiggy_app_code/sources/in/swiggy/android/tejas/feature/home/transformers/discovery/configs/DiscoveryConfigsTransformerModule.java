package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.swiggy.android.tejas.feature.home.model.ContextualTrigger;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.SwiggyOneEntryPoint;
import in.swiggy.android.tejas.feature.home.model.pageconfig.ThemeDrop;
import in.swiggy.android.tejas.feature.home.transformers.config.ContextualTriggerConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.ThemeDropConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.swiggyoneentrypoint.SwiggyOneEntryPointConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.crouton.DiscoveryCroutonConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.splash.DiscoverySplashConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.video.DiscoveryPopupConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DiscoveryConfigsTransformerModule.kt */
public final class DiscoveryConfigsTransformerModule {
    public static final DiscoveryConfigsTransformerModule INSTANCE = new DiscoveryConfigsTransformerModule();

    private DiscoveryConfigsTransformerModule() {
    }

    public static final ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>> providesContextualTriggerConfigTransformer(ContextualTriggerConfigTransformer contextualTriggerConfigTransformer) {
        p.j(contextualTriggerConfigTransformer, "contextualTriggerConfigTransformer");
        return contextualTriggerConfigTransformer;
    }

    public static final ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>> providesDiscoveryCroutonConfigTransformer(DiscoveryCroutonConfigTransformer discoveryCroutonConfigTransformer) {
        p.j(discoveryCroutonConfigTransformer, "discoveryCroutonConfigTransformer");
        return discoveryCroutonConfigTransformer;
    }

    public static final ITransformer<SuccessResponse.PageConfigs, List<HomePopup>> providesDiscoveryPopupConfigTransformer(DiscoveryPopupConfigTransformer discoveryPopupConfigTransformer) {
        p.j(discoveryPopupConfigTransformer, "discoveryPopupConfigTransformer");
        return discoveryPopupConfigTransformer;
    }

    public static final ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>> providesDiscoverySplashConfigTransformer(DiscoverySplashConfigTransformer discoverySplashConfigTransformer) {
        p.j(discoverySplashConfigTransformer, "discoverySplashConfigTransformer");
        return discoverySplashConfigTransformer;
    }

    public static final ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>> providesSwiggyOneTapConfigTransformer(SwiggyOneEntryPointConfigTransformer swiggyOneEntryPointConfigTransformer) {
        p.j(swiggyOneEntryPointConfigTransformer, "swiggyOneTapConfigTransformer");
        return swiggyOneEntryPointConfigTransformer;
    }

    public static final ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>> providesThemeDropConfigTransformer(ThemeDropConfigTransformer themeDropConfigTransformer) {
        p.j(themeDropConfigTransformer, "themeDropConfigTransformer");
        return themeDropConfigTransformer;
    }
}
