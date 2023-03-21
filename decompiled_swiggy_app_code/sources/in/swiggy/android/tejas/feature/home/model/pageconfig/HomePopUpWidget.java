package in.swiggy.android.tejas.feature.home.model.pageconfig;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.home.model.DynamicData;
import in.swiggy.android.tejas.feature.home.model.FrequencyCapping;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;

/* compiled from: HomePopUpWidget.kt */
public final class HomePopUpWidget extends HomePopup {
    private final float aspectRatio;
    private final int autoCloseTime;
    private final boolean autoDismiss;
    private final boolean backgroundTransparency;
    private final BannerType bannerType;
    private final CardType cardType;
    private final CTA cta;
    private final boolean dismissible;
    @SerializedName("dynamicInfo")
    private final List<DynamicData> dynamicDataList;
    private final String entityId;
    private final String entityType;
    private final FrequencyCapping frequencyCapping;
    private final int horizontalMargin;
    private final boolean isFrequencyCappingEnabled;
    private final int maxCount;
    private String page;
    private final PopUpWidgetCrossButtonPosition position;
    private Long serverTimeStamp;
    private final String url;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomePopUpWidget(boolean z11, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, CardType cardType2, BannerType bannerType2, int i11, float f11, String str, int i12, boolean z12, CTA cta2, String str2, String str3, boolean z13, int i13, boolean z14, List list, FrequencyCapping frequencyCapping2, int i14, i iVar) {
        this(z11, popUpWidgetCrossButtonPosition, cardType2, bannerType2, i11, f11, str, i12, z12, cta2, str2, str3, z13, i13, z14, list, (i14 & PDButton.FLAG_PUSHBUTTON) != 0 ? null : frequencyCapping2);
    }

    public static /* synthetic */ HomePopUpWidget copy$default(HomePopUpWidget homePopUpWidget, boolean z11, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, CardType cardType2, BannerType bannerType2, int i11, float f11, String str, int i12, boolean z12, CTA cta2, String str2, String str3, boolean z13, int i13, boolean z14, List list, FrequencyCapping frequencyCapping2, int i14, Object obj) {
        HomePopUpWidget homePopUpWidget2 = homePopUpWidget;
        int i15 = i14;
        return homePopUpWidget.copy((i15 & 1) != 0 ? homePopUpWidget2.backgroundTransparency : z11, (i15 & 2) != 0 ? homePopUpWidget2.position : popUpWidgetCrossButtonPosition, (i15 & 4) != 0 ? homePopUpWidget2.cardType : cardType2, (i15 & 8) != 0 ? homePopUpWidget2.bannerType : bannerType2, (i15 & 16) != 0 ? homePopUpWidget2.horizontalMargin : i11, (i15 & 32) != 0 ? homePopUpWidget2.aspectRatio : f11, (i15 & 64) != 0 ? homePopUpWidget2.url : str, (i15 & 128) != 0 ? homePopUpWidget2.maxCount : i12, (i15 & 256) != 0 ? homePopUpWidget2.dismissible : z12, (i15 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? homePopUpWidget2.cta : cta2, (i15 & 1024) != 0 ? homePopUpWidget2.entityId : str2, (i15 & 2048) != 0 ? homePopUpWidget2.entityType : str3, (i15 & 4096) != 0 ? homePopUpWidget2.isFrequencyCappingEnabled : z13, (i15 & 8192) != 0 ? homePopUpWidget2.autoCloseTime : i13, (i15 & 16384) != 0 ? homePopUpWidget2.autoDismiss : z14, (i15 & 32768) != 0 ? homePopUpWidget2.dynamicDataList : list, (i15 & PDButton.FLAG_PUSHBUTTON) != 0 ? homePopUpWidget2.frequencyCapping : frequencyCapping2);
    }

    public final boolean component1() {
        return this.backgroundTransparency;
    }

    public final CTA component10() {
        return this.cta;
    }

    public final String component11() {
        return this.entityId;
    }

    public final String component12() {
        return this.entityType;
    }

    public final boolean component13() {
        return this.isFrequencyCappingEnabled;
    }

    public final int component14() {
        return this.autoCloseTime;
    }

    public final boolean component15() {
        return this.autoDismiss;
    }

    public final List<DynamicData> component16() {
        return this.dynamicDataList;
    }

    public final FrequencyCapping component17() {
        return this.frequencyCapping;
    }

    public final PopUpWidgetCrossButtonPosition component2() {
        return this.position;
    }

    public final CardType component3() {
        return this.cardType;
    }

    public final BannerType component4() {
        return this.bannerType;
    }

    public final int component5() {
        return this.horizontalMargin;
    }

    public final float component6() {
        return this.aspectRatio;
    }

    public final String component7() {
        return this.url;
    }

    public final int component8() {
        return this.maxCount;
    }

    public final boolean component9() {
        return this.dismissible;
    }

    public final HomePopUpWidget copy(boolean z11, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, CardType cardType2, BannerType bannerType2, int i11, float f11, String str, int i12, boolean z12, CTA cta2, String str2, String str3, boolean z13, int i13, boolean z14, List<DynamicData> list, FrequencyCapping frequencyCapping2) {
        boolean z15 = z11;
        p.j(popUpWidgetCrossButtonPosition, "position");
        p.j(cardType2, "cardType");
        p.j(bannerType2, "bannerType");
        p.j(str, "url");
        p.j(str2, "entityId");
        p.j(str3, "entityType");
        p.j(list, "dynamicDataList");
        return new HomePopUpWidget(z11, popUpWidgetCrossButtonPosition, cardType2, bannerType2, i11, f11, str, i12, z12, cta2, str2, str3, z13, i13, z14, list, frequencyCapping2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePopUpWidget)) {
            return false;
        }
        HomePopUpWidget homePopUpWidget = (HomePopUpWidget) obj;
        return this.backgroundTransparency == homePopUpWidget.backgroundTransparency && this.position == homePopUpWidget.position && this.cardType == homePopUpWidget.cardType && this.bannerType == homePopUpWidget.bannerType && this.horizontalMargin == homePopUpWidget.horizontalMargin && p.e(Float.valueOf(this.aspectRatio), Float.valueOf(homePopUpWidget.aspectRatio)) && p.e(this.url, homePopUpWidget.url) && this.maxCount == homePopUpWidget.maxCount && this.dismissible == homePopUpWidget.dismissible && p.e(this.cta, homePopUpWidget.cta) && p.e(this.entityId, homePopUpWidget.entityId) && p.e(this.entityType, homePopUpWidget.entityType) && this.isFrequencyCappingEnabled == homePopUpWidget.isFrequencyCappingEnabled && this.autoCloseTime == homePopUpWidget.autoCloseTime && this.autoDismiss == homePopUpWidget.autoDismiss && p.e(this.dynamicDataList, homePopUpWidget.dynamicDataList) && p.e(this.frequencyCapping, homePopUpWidget.frequencyCapping);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getAutoCloseTime() {
        return this.autoCloseTime;
    }

    public final boolean getAutoDismiss() {
        return this.autoDismiss;
    }

    public final boolean getBackgroundTransparency() {
        return this.backgroundTransparency;
    }

    public final BannerType getBannerType() {
        return this.bannerType;
    }

    public final CardType getCardType() {
        return this.cardType;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final boolean getDismissible() {
        return this.dismissible;
    }

    public final List<DynamicData> getDynamicDataList() {
        return this.dynamicDataList;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final FrequencyCapping getFrequencyCapping() {
        return this.frequencyCapping;
    }

    public final int getHorizontalMargin() {
        return this.horizontalMargin;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final String getPage() {
        return this.page;
    }

    public final PopUpWidgetCrossButtonPosition getPosition() {
        return this.position;
    }

    public final Long getServerTimeStamp() {
        return this.serverTimeStamp;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        boolean z11 = this.backgroundTransparency;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int hashCode = (((((((((((((((z11 ? 1 : 0) * true) + this.position.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.bannerType.hashCode()) * 31) + this.horizontalMargin) * 31) + Float.floatToIntBits(this.aspectRatio)) * 31) + this.url.hashCode()) * 31) + this.maxCount) * 31;
        boolean z13 = this.dismissible;
        if (z13) {
            z13 = true;
        }
        int i11 = (hashCode + (z13 ? 1 : 0)) * 31;
        CTA cta2 = this.cta;
        int i12 = 0;
        int hashCode2 = (((((i11 + (cta2 == null ? 0 : cta2.hashCode())) * 31) + this.entityId.hashCode()) * 31) + this.entityType.hashCode()) * 31;
        boolean z14 = this.isFrequencyCappingEnabled;
        if (z14) {
            z14 = true;
        }
        int i13 = (((hashCode2 + (z14 ? 1 : 0)) * 31) + this.autoCloseTime) * 31;
        boolean z15 = this.autoDismiss;
        if (!z15) {
            z12 = z15;
        }
        int hashCode3 = (((i13 + (z12 ? 1 : 0)) * 31) + this.dynamicDataList.hashCode()) * 31;
        FrequencyCapping frequencyCapping2 = this.frequencyCapping;
        if (frequencyCapping2 != null) {
            i12 = frequencyCapping2.hashCode();
        }
        return hashCode3 + i12;
    }

    public final boolean isFrequencyCappingEnabled() {
        return this.isFrequencyCappingEnabled;
    }

    public final void setPage(String str) {
        p.j(str, "<set-?>");
        this.page = str;
    }

    public final void setServerTimeStamp(Long l11) {
        this.serverTimeStamp = l11;
    }

    public String toString() {
        return "HomePopUpWidget(backgroundTransparency=" + this.backgroundTransparency + ", position=" + this.position + ", cardType=" + this.cardType + ", bannerType=" + this.bannerType + ", horizontalMargin=" + this.horizontalMargin + ", aspectRatio=" + this.aspectRatio + ", url=" + this.url + ", maxCount=" + this.maxCount + ", dismissible=" + this.dismissible + ", cta=" + this.cta + ", entityId=" + this.entityId + ", entityType=" + this.entityType + ", isFrequencyCappingEnabled=" + this.isFrequencyCappingEnabled + ", autoCloseTime=" + this.autoCloseTime + ", autoDismiss=" + this.autoDismiss + ", dynamicDataList=" + this.dynamicDataList + ", frequencyCapping=" + this.frequencyCapping + ')';
    }

    public HomePopUpWidget(boolean z11, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, CardType cardType2, BannerType bannerType2, int i11, float f11, String str, int i12, boolean z12, CTA cta2, String str2, String str3, boolean z13, int i13, boolean z14, List<DynamicData> list, FrequencyCapping frequencyCapping2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        List<DynamicData> list2 = list;
        p.j(popUpWidgetCrossButtonPosition, "position");
        p.j(cardType2, "cardType");
        p.j(bannerType2, "bannerType");
        p.j(str4, "url");
        p.j(str5, "entityId");
        p.j(str6, "entityType");
        p.j(list2, "dynamicDataList");
        this.backgroundTransparency = z11;
        this.position = popUpWidgetCrossButtonPosition;
        this.cardType = cardType2;
        this.bannerType = bannerType2;
        this.horizontalMargin = i11;
        this.aspectRatio = f11;
        this.url = str4;
        this.maxCount = i12;
        this.dismissible = z12;
        this.cta = cta2;
        this.entityId = str5;
        this.entityType = str6;
        this.isFrequencyCappingEnabled = z13;
        this.autoCloseTime = i13;
        this.autoDismiss = z14;
        this.dynamicDataList = list2;
        this.frequencyCapping = frequencyCapping2;
        this.page = "";
    }
}
