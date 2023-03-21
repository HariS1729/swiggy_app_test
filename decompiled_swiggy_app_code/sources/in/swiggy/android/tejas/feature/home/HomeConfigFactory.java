package in.swiggy.android.tejas.feature.home;

import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: HomeConfigFactory.kt */
public final class HomeConfigFactory {
    private static final String CROUTONS = "CROUTONS";
    public static final Companion Companion = new Companion((i) null);
    private static final String POP_UP = "POPUP";
    private static final String SPLASH_SCREEN = "SPLASH_SCREEN";
    private final ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>> croutonConfigTransformer;
    private final ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>> popupConfigTransformer;
    private final ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>> splashConfigTransformer;

    /* compiled from: HomeConfigFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public HomeConfigFactory(ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>> iTransformer, ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>> iTransformer2, ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>> iTransformer3) {
        p.j(iTransformer, "popupConfigTransformer");
        p.j(iTransformer2, "croutonConfigTransformer");
        p.j(iTransformer3, "splashConfigTransformer");
        this.popupConfigTransformer = iTransformer;
        this.croutonConfigTransformer = iTransformer2;
        this.splashConfigTransformer = iTransformer3;
    }

    public final List<HomeConfig> getConfigs(Map.Entry<String, SuccessReponseDto.PageConfigs> entry) {
        p.j(entry, PaymentConstants.Category.CONFIG);
        String key = entry.getKey();
        int hashCode = key.hashCode();
        if (hashCode != -1387150955) {
            if (hashCode != 76314764) {
                if (hashCode == 1928782148 && key.equals(SPLASH_SCREEN)) {
                    List<HomeConfig> transform = this.splashConfigTransformer.transform(entry.getValue());
                    return transform == null ? k.j() : transform;
                }
            } else if (key.equals(POP_UP)) {
                List<HomeConfig> transform2 = this.popupConfigTransformer.transform(entry.getValue());
                return transform2 == null ? k.j() : transform2;
            }
        } else if (key.equals(CROUTONS)) {
            List<HomeConfig> transform3 = this.croutonConfigTransformer.transform(entry.getValue());
            return transform3 == null ? k.j() : transform3;
        }
        return k.j();
    }
}
