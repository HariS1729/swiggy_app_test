package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import com.swiggy.gandalf.widgets.v2.SkeletonAPISuccessResponse;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class SkeletonJsonResponse {
    @SerializedName("cardInfoList")
    private final List<CardInfo> cardInfoList;
    @SerializedName("enable_food_prefetch")
    private final Boolean enableFoodPrefetch;
    @SerializedName("statusMessage")
    private final String statusMessage;
    @SerializedName("version")
    private final SkeletonAPISuccessResponse.UXVersion version;

    public SkeletonJsonResponse(List<CardInfo> list, String str, SkeletonAPISuccessResponse.UXVersion uXVersion, Boolean bool) {
        p.j(str, "statusMessage");
        p.j(uXVersion, Constants.VERSION);
        this.cardInfoList = list;
        this.statusMessage = str;
        this.version = uXVersion;
        this.enableFoodPrefetch = bool;
    }

    public static /* synthetic */ SkeletonJsonResponse copy$default(SkeletonJsonResponse skeletonJsonResponse, List<CardInfo> list, String str, SkeletonAPISuccessResponse.UXVersion uXVersion, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = skeletonJsonResponse.cardInfoList;
        }
        if ((i11 & 2) != 0) {
            str = skeletonJsonResponse.statusMessage;
        }
        if ((i11 & 4) != 0) {
            uXVersion = skeletonJsonResponse.version;
        }
        if ((i11 & 8) != 0) {
            bool = skeletonJsonResponse.enableFoodPrefetch;
        }
        return skeletonJsonResponse.copy(list, str, uXVersion, bool);
    }

    public final List<CardInfo> component1() {
        return this.cardInfoList;
    }

    public final String component2() {
        return this.statusMessage;
    }

    public final SkeletonAPISuccessResponse.UXVersion component3() {
        return this.version;
    }

    public final Boolean component4() {
        return this.enableFoodPrefetch;
    }

    public final SkeletonJsonResponse copy(List<CardInfo> list, String str, SkeletonAPISuccessResponse.UXVersion uXVersion, Boolean bool) {
        p.j(str, "statusMessage");
        p.j(uXVersion, Constants.VERSION);
        return new SkeletonJsonResponse(list, str, uXVersion, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkeletonJsonResponse)) {
            return false;
        }
        SkeletonJsonResponse skeletonJsonResponse = (SkeletonJsonResponse) obj;
        return p.e(this.cardInfoList, skeletonJsonResponse.cardInfoList) && p.e(this.statusMessage, skeletonJsonResponse.statusMessage) && this.version == skeletonJsonResponse.version && p.e(this.enableFoodPrefetch, skeletonJsonResponse.enableFoodPrefetch);
    }

    public final List<CardInfo> getCardInfoList() {
        return this.cardInfoList;
    }

    public final Boolean getEnableFoodPrefetch() {
        return this.enableFoodPrefetch;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final SkeletonAPISuccessResponse.UXVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        List<CardInfo> list = this.cardInfoList;
        int i11 = 0;
        int hashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.statusMessage.hashCode()) * 31) + this.version.hashCode()) * 31;
        Boolean bool = this.enableFoodPrefetch;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "SkeletonJsonResponse(cardInfoList=" + this.cardInfoList + ", statusMessage=" + this.statusMessage + ", version=" + this.version + ", enableFoodPrefetch=" + this.enableFoodPrefetch + ')';
    }
}
