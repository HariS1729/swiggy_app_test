package in.swiggy.android.tejas.feature.home.model.pageconfig.splash;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: SplashConfig.kt */
public final class MetaInfo {
    @SerializedName("ctaBgColor")
    private final String ctaBgColor;
    @SerializedName("ctaTextColor")
    private final String ctaTextColor;

    public MetaInfo(String str, String str2) {
        this.ctaTextColor = str;
        this.ctaBgColor = str2;
    }

    public static /* synthetic */ MetaInfo copy$default(MetaInfo metaInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = metaInfo.ctaTextColor;
        }
        if ((i11 & 2) != 0) {
            str2 = metaInfo.ctaBgColor;
        }
        return metaInfo.copy(str, str2);
    }

    public final String component1() {
        return this.ctaTextColor;
    }

    public final String component2() {
        return this.ctaBgColor;
    }

    public final MetaInfo copy(String str, String str2) {
        return new MetaInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaInfo)) {
            return false;
        }
        MetaInfo metaInfo = (MetaInfo) obj;
        return p.e(this.ctaTextColor, metaInfo.ctaTextColor) && p.e(this.ctaBgColor, metaInfo.ctaBgColor);
    }

    public final String getCtaBgColor() {
        return this.ctaBgColor;
    }

    public final String getCtaTextColor() {
        return this.ctaTextColor;
    }

    public int hashCode() {
        String str = this.ctaTextColor;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ctaBgColor;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "MetaInfo(ctaTextColor=" + this.ctaTextColor + ", ctaBgColor=" + this.ctaBgColor + ')';
    }
}
