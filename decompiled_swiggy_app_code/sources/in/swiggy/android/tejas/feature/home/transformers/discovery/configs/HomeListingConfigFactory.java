package in.swiggy.android.tejas.feature.home.transformers.discovery.configs;

import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.home.model.ContextualTrigger;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.SwiggyOneEntryPoint;
import in.swiggy.android.tejas.feature.home.model.pageconfig.ThemeDrop;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: HomeListingConfigFactory.kt */
public final class HomeListingConfigFactory {
    private static final String ACTION_BUTTON = "ACTION_BUTTON";
    private static final String CONTEXTUAL_TRIGGER = "CONTEXTUAL_TRIGGER";
    private static final String CROUTONS = "CROUTONS";
    public static final Companion Companion = new Companion((i) null);
    private static final String POP_UP = "POPUP";
    private static final String SPLASH_SCREEN = "SPLASH_SCREEN";
    private static final String THEME_DROP = "THEME_DROP";
    private final ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>> contextualTriggerConfigTransformer;
    private final ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>> croutonConfigTransformer;
    private final ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>> oneEntryPointConfigTransformer;
    private final ITransformer<SuccessResponse.PageConfigs, List<HomePopup>> popupConfigTransformer;
    private final ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>> splashConfigTransformer;
    private final ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>> themeDropConfigTransformer;

    /* compiled from: HomeListingConfigFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public HomeListingConfigFactory(ITransformer<SuccessResponse.PageConfigs, List<HomePopup>> iTransformer, ITransformer<SuccessResponse.PageConfigs, List<HomeCrouton>> iTransformer2, ITransformer<SuccessResponse.PageConfigs, List<HomeConfig>> iTransformer3, ITransformer<SuccessResponse.PageConfigs, List<ThemeDrop>> iTransformer4, ITransformer<SuccessResponse.PageConfigs, List<ContextualTrigger>> iTransformer5, ITransformer<SuccessResponse.PageConfigs, List<SwiggyOneEntryPoint>> iTransformer6) {
        p.j(iTransformer, "popupConfigTransformer");
        p.j(iTransformer2, "croutonConfigTransformer");
        p.j(iTransformer3, "splashConfigTransformer");
        p.j(iTransformer4, "themeDropConfigTransformer");
        p.j(iTransformer5, "contextualTriggerConfigTransformer");
        p.j(iTransformer6, "oneEntryPointConfigTransformer");
        this.popupConfigTransformer = iTransformer;
        this.croutonConfigTransformer = iTransformer2;
        this.splashConfigTransformer = iTransformer3;
        this.themeDropConfigTransformer = iTransformer4;
        this.contextualTriggerConfigTransformer = iTransformer5;
        this.oneEntryPointConfigTransformer = iTransformer6;
    }

    public final List<HomeConfig> getConfigs(Map.Entry<String, SuccessResponse.PageConfigs> entry) {
        p.j(entry, PaymentConstants.Category.CONFIG);
        String key = entry.getKey();
        switch (key.hashCode()) {
            case -1789010597:
                if (key.equals(ACTION_BUTTON)) {
                    List<HomeConfig> transform = this.oneEntryPointConfigTransformer.transform(entry.getValue());
                    if (transform == null) {
                        return k.j();
                    }
                    return transform;
                }
                break;
            case -1387150955:
                if (key.equals(CROUTONS)) {
                    List<HomeConfig> transform2 = this.croutonConfigTransformer.transform(entry.getValue());
                    if (transform2 == null) {
                        return k.j();
                    }
                    return transform2;
                }
                break;
            case -465924438:
                if (key.equals(CONTEXTUAL_TRIGGER)) {
                    List<HomeConfig> transform3 = this.contextualTriggerConfigTransformer.transform(entry.getValue());
                    if (transform3 == null) {
                        return k.j();
                    }
                    return transform3;
                }
                break;
            case 76314764:
                if (key.equals(POP_UP)) {
                    List<HomeConfig> transform4 = this.popupConfigTransformer.transform(entry.getValue());
                    if (transform4 == null) {
                        return k.j();
                    }
                    return transform4;
                }
                break;
            case 1063420869:
                if (key.equals(THEME_DROP)) {
                    List<HomeConfig> transform5 = this.themeDropConfigTransformer.transform(entry.getValue());
                    if (transform5 == null) {
                        return k.j();
                    }
                    return transform5;
                }
                break;
            case 1928782148:
                if (key.equals(SPLASH_SCREEN)) {
                    List<HomeConfig> transform6 = this.splashConfigTransformer.transform(entry.getValue());
                    if (transform6 == null) {
                        return k.j();
                    }
                    return transform6;
                }
                break;
        }
        return k.j();
    }
}
