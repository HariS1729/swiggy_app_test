package in.swiggy.android.tejas.feature.home.model.pageconfig.splash;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: SplashConfig.kt */
public final class CTAInfo {
    @SerializedName("link")
    private final String link;
    @SerializedName("metaInfo")
    private final MetaInfo metaInfo;
    @SerializedName("text")
    private final String text;
    @SerializedName("type")
    private final String type;

    public CTAInfo(String str, String str2, String str3, MetaInfo metaInfo2) {
        this.link = str;
        this.text = str2;
        this.type = str3;
        this.metaInfo = metaInfo2;
    }

    public static /* synthetic */ CTAInfo copy$default(CTAInfo cTAInfo, String str, String str2, String str3, MetaInfo metaInfo2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cTAInfo.link;
        }
        if ((i11 & 2) != 0) {
            str2 = cTAInfo.text;
        }
        if ((i11 & 4) != 0) {
            str3 = cTAInfo.type;
        }
        if ((i11 & 8) != 0) {
            metaInfo2 = cTAInfo.metaInfo;
        }
        return cTAInfo.copy(str, str2, str3, metaInfo2);
    }

    public final String component1() {
        return this.link;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.type;
    }

    public final MetaInfo component4() {
        return this.metaInfo;
    }

    public final CTAInfo copy(String str, String str2, String str3, MetaInfo metaInfo2) {
        return new CTAInfo(str, str2, str3, metaInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTAInfo)) {
            return false;
        }
        CTAInfo cTAInfo = (CTAInfo) obj;
        return p.e(this.link, cTAInfo.link) && p.e(this.text, cTAInfo.text) && p.e(this.type, cTAInfo.type) && p.e(this.metaInfo, cTAInfo.metaInfo);
    }

    public final String getLink() {
        return this.link;
    }

    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.link;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MetaInfo metaInfo2 = this.metaInfo;
        if (metaInfo2 != null) {
            i11 = metaInfo2.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "CTAInfo(link=" + this.link + ", text=" + this.text + ", type=" + this.type + ", metaInfo=" + this.metaInfo + ')';
    }
}
