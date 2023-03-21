package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.oldapi.models.restaurant.RibbonData;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: RibbonConfig.kt */
public final class RibbonConfig {
    @SerializedName("config")
    private final Map<String, RibbonData> config;

    public RibbonConfig(Map<String, ? extends RibbonData> map) {
        p.j(map, PaymentConstants.Category.CONFIG);
        this.config = map;
    }

    public static /* synthetic */ RibbonConfig copy$default(RibbonConfig ribbonConfig, Map<String, RibbonData> map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = ribbonConfig.config;
        }
        return ribbonConfig.copy(map);
    }

    public final Map<String, RibbonData> component1() {
        return this.config;
    }

    public final RibbonConfig copy(Map<String, ? extends RibbonData> map) {
        p.j(map, PaymentConstants.Category.CONFIG);
        return new RibbonConfig(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RibbonConfig) && p.e(this.config, ((RibbonConfig) obj).config);
    }

    public final Map<String, RibbonData> getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public String toString() {
        return "RibbonConfig(config=" + this.config + ')';
    }
}
