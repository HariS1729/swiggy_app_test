package in.swiggy.android.tejas.feature.home.model.pageconfig;

import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: HomeCroutonData.kt */
public final class HomeCroutonData extends HomeCrouton {
    private final String croutonText;
    private final String croutonTitle;
    private final String imageId;
    private final Map<String, String> metaInfo;

    public HomeCroutonData(String str, String str2, String str3, Map<String, String> map) {
        p.j(str, "croutonTitle");
        p.j(str2, "croutonText");
        p.j(str3, "imageId");
        p.j(map, "metaInfo");
        this.croutonTitle = str;
        this.croutonText = str2;
        this.imageId = str3;
        this.metaInfo = map;
    }

    public static /* synthetic */ HomeCroutonData copy$default(HomeCroutonData homeCroutonData, String str, String str2, String str3, Map<String, String> map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = homeCroutonData.croutonTitle;
        }
        if ((i11 & 2) != 0) {
            str2 = homeCroutonData.croutonText;
        }
        if ((i11 & 4) != 0) {
            str3 = homeCroutonData.imageId;
        }
        if ((i11 & 8) != 0) {
            map = homeCroutonData.metaInfo;
        }
        return homeCroutonData.copy(str, str2, str3, map);
    }

    public final String component1() {
        return this.croutonTitle;
    }

    public final String component2() {
        return this.croutonText;
    }

    public final String component3() {
        return this.imageId;
    }

    public final Map<String, String> component4() {
        return this.metaInfo;
    }

    public final HomeCroutonData copy(String str, String str2, String str3, Map<String, String> map) {
        p.j(str, "croutonTitle");
        p.j(str2, "croutonText");
        p.j(str3, "imageId");
        p.j(map, "metaInfo");
        return new HomeCroutonData(str, str2, str3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeCroutonData)) {
            return false;
        }
        HomeCroutonData homeCroutonData = (HomeCroutonData) obj;
        return p.e(this.croutonTitle, homeCroutonData.croutonTitle) && p.e(this.croutonText, homeCroutonData.croutonText) && p.e(this.imageId, homeCroutonData.imageId) && p.e(this.metaInfo, homeCroutonData.metaInfo);
    }

    public final String getCroutonText() {
        return this.croutonText;
    }

    public final String getCroutonTitle() {
        return this.croutonTitle;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final Map<String, String> getMetaInfo() {
        return this.metaInfo;
    }

    public int hashCode() {
        return (((((this.croutonTitle.hashCode() * 31) + this.croutonText.hashCode()) * 31) + this.imageId.hashCode()) * 31) + this.metaInfo.hashCode();
    }

    public String toString() {
        return "HomeCroutonData(croutonTitle=" + this.croutonTitle + ", croutonText=" + this.croutonText + ", imageId=" + this.imageId + ", metaInfo=" + this.metaInfo + ')';
    }
}
