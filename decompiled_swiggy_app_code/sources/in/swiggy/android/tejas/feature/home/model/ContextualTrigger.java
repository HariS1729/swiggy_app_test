package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ContextualTrigger.kt */
public final class ContextualTrigger extends HomeConfig {
    private final AccessibilityData accessibility;
    private final String collapsedTitle;
    private final String collapsedTitleColor;
    private final String crossTintColor;
    private final String deeplink;
    private final String fillColor;
    private final int hideAfterTime;

    /* renamed from: id  reason: collision with root package name */
    private final String f20239id;
    private final boolean isLottie;
    private final String mediaUrl;
    private final int showAfterTime;
    private final String strokeColor;
    private final String subtitle;
    private final String subtitleColor;
    private final String title;
    private final String titleColor;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextualTrigger(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, AccessibilityData accessibilityData, int i13, i iVar) {
        this(str, str2, str3, str4, i11, i12, str5, str6, z11, str7, str8, str9, str10, str11, str12, (i13 & 32768) != 0 ? null : accessibilityData);
    }

    public static /* synthetic */ ContextualTrigger copy$default(ContextualTrigger contextualTrigger, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, AccessibilityData accessibilityData, int i13, Object obj) {
        ContextualTrigger contextualTrigger2 = contextualTrigger;
        int i14 = i13;
        return contextualTrigger.copy((i14 & 1) != 0 ? contextualTrigger2.f20239id : str, (i14 & 2) != 0 ? contextualTrigger2.title : str2, (i14 & 4) != 0 ? contextualTrigger2.subtitle : str3, (i14 & 8) != 0 ? contextualTrigger2.collapsedTitle : str4, (i14 & 16) != 0 ? contextualTrigger2.hideAfterTime : i11, (i14 & 32) != 0 ? contextualTrigger2.showAfterTime : i12, (i14 & 64) != 0 ? contextualTrigger2.deeplink : str5, (i14 & 128) != 0 ? contextualTrigger2.mediaUrl : str6, (i14 & 256) != 0 ? contextualTrigger2.isLottie : z11, (i14 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? contextualTrigger2.strokeColor : str7, (i14 & 1024) != 0 ? contextualTrigger2.fillColor : str8, (i14 & 2048) != 0 ? contextualTrigger2.crossTintColor : str9, (i14 & 4096) != 0 ? contextualTrigger2.titleColor : str10, (i14 & 8192) != 0 ? contextualTrigger2.subtitleColor : str11, (i14 & 16384) != 0 ? contextualTrigger2.collapsedTitleColor : str12, (i14 & 32768) != 0 ? contextualTrigger2.accessibility : accessibilityData);
    }

    public final String component1() {
        return this.f20239id;
    }

    public final String component10() {
        return this.strokeColor;
    }

    public final String component11() {
        return this.fillColor;
    }

    public final String component12() {
        return this.crossTintColor;
    }

    public final String component13() {
        return this.titleColor;
    }

    public final String component14() {
        return this.subtitleColor;
    }

    public final String component15() {
        return this.collapsedTitleColor;
    }

    public final AccessibilityData component16() {
        return this.accessibility;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.collapsedTitle;
    }

    public final int component5() {
        return this.hideAfterTime;
    }

    public final int component6() {
        return this.showAfterTime;
    }

    public final String component7() {
        return this.deeplink;
    }

    public final String component8() {
        return this.mediaUrl;
    }

    public final boolean component9() {
        return this.isLottie;
    }

    public final ContextualTrigger copy(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, AccessibilityData accessibilityData) {
        String str13 = str;
        p.j(str13, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "subtitle");
        p.j(str4, "collapsedTitle");
        p.j(str5, "deeplink");
        p.j(str6, "mediaUrl");
        p.j(str7, "strokeColor");
        p.j(str8, "fillColor");
        p.j(str9, "crossTintColor");
        p.j(str10, "titleColor");
        p.j(str11, "subtitleColor");
        p.j(str12, "collapsedTitleColor");
        return new ContextualTrigger(str13, str2, str3, str4, i11, i12, str5, str6, z11, str7, str8, str9, str10, str11, str12, accessibilityData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextualTrigger)) {
            return false;
        }
        ContextualTrigger contextualTrigger = (ContextualTrigger) obj;
        return p.e(this.f20239id, contextualTrigger.f20239id) && p.e(this.title, contextualTrigger.title) && p.e(this.subtitle, contextualTrigger.subtitle) && p.e(this.collapsedTitle, contextualTrigger.collapsedTitle) && this.hideAfterTime == contextualTrigger.hideAfterTime && this.showAfterTime == contextualTrigger.showAfterTime && p.e(this.deeplink, contextualTrigger.deeplink) && p.e(this.mediaUrl, contextualTrigger.mediaUrl) && this.isLottie == contextualTrigger.isLottie && p.e(this.strokeColor, contextualTrigger.strokeColor) && p.e(this.fillColor, contextualTrigger.fillColor) && p.e(this.crossTintColor, contextualTrigger.crossTintColor) && p.e(this.titleColor, contextualTrigger.titleColor) && p.e(this.subtitleColor, contextualTrigger.subtitleColor) && p.e(this.collapsedTitleColor, contextualTrigger.collapsedTitleColor) && p.e(this.accessibility, contextualTrigger.accessibility);
    }

    public final AccessibilityData getAccessibility() {
        return this.accessibility;
    }

    public final String getCollapsedTitle() {
        return this.collapsedTitle;
    }

    public final String getCollapsedTitleColor() {
        return this.collapsedTitleColor;
    }

    public final String getCrossTintColor() {
        return this.crossTintColor;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getFillColor() {
        return this.fillColor;
    }

    public final int getHideAfterTime() {
        return this.hideAfterTime;
    }

    public final String getId() {
        return this.f20239id;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final int getShowAfterTime() {
        return this.showAfterTime;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f20239id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.collapsedTitle.hashCode()) * 31) + this.hideAfterTime) * 31) + this.showAfterTime) * 31) + this.deeplink.hashCode()) * 31) + this.mediaUrl.hashCode()) * 31;
        boolean z11 = this.isLottie;
        if (z11) {
            z11 = true;
        }
        int hashCode2 = (((((((((((((hashCode + (z11 ? 1 : 0)) * 31) + this.strokeColor.hashCode()) * 31) + this.fillColor.hashCode()) * 31) + this.crossTintColor.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.subtitleColor.hashCode()) * 31) + this.collapsedTitleColor.hashCode()) * 31;
        AccessibilityData accessibilityData = this.accessibility;
        return hashCode2 + (accessibilityData == null ? 0 : accessibilityData.hashCode());
    }

    public final boolean isLottie() {
        return this.isLottie;
    }

    public String toString() {
        return "ContextualTrigger(id=" + this.f20239id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", collapsedTitle=" + this.collapsedTitle + ", hideAfterTime=" + this.hideAfterTime + ", showAfterTime=" + this.showAfterTime + ", deeplink=" + this.deeplink + ", mediaUrl=" + this.mediaUrl + ", isLottie=" + this.isLottie + ", strokeColor=" + this.strokeColor + ", fillColor=" + this.fillColor + ", crossTintColor=" + this.crossTintColor + ", titleColor=" + this.titleColor + ", subtitleColor=" + this.subtitleColor + ", collapsedTitleColor=" + this.collapsedTitleColor + ", accessibility=" + this.accessibility + ')';
    }

    public ContextualTrigger(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, boolean z11, String str7, String str8, String str9, String str10, String str11, String str12, AccessibilityData accessibilityData) {
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        String str23 = str12;
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str13, "title");
        p.j(str14, "subtitle");
        p.j(str15, "collapsedTitle");
        p.j(str16, "deeplink");
        p.j(str17, "mediaUrl");
        p.j(str18, "strokeColor");
        p.j(str19, "fillColor");
        p.j(str20, "crossTintColor");
        p.j(str21, "titleColor");
        p.j(str22, "subtitleColor");
        p.j(str23, "collapsedTitleColor");
        this.f20239id = str;
        this.title = str13;
        this.subtitle = str14;
        this.collapsedTitle = str15;
        this.hideAfterTime = i11;
        this.showAfterTime = i12;
        this.deeplink = str16;
        this.mediaUrl = str17;
        this.isLottie = z11;
        this.strokeColor = str18;
        this.fillColor = str19;
        this.crossTintColor = str20;
        this.titleColor = str21;
        this.subtitleColor = str22;
        this.collapsedTitleColor = str23;
        this.accessibility = accessibilityData;
    }
}
