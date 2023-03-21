package in.swiggy.android.tejas.feature.home.model.pageconfig;

import com.swiggy.gandalf.widgets.v2.Analytics;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.grid.model.PopupInfo;
import in.swiggy.android.tejas.feature.listing.grid.model.WidgetTheme;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ThemeDrop.kt */
public final class ThemeDrop extends HomeConfig {
    private final AccessibilityData accessibility;
    private final String accountIcon;
    private final Analytics analytics;
    private final boolean autoApply;
    private final String backgroundImage;
    private final String footerImage;
    private final PopupInfo popupInfo;
    private final String themeId;
    private final WidgetTheme widgetTheme;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThemeDrop(AccessibilityData accessibilityData, String str, Analytics analytics2, boolean z11, String str2, String str3, String str4, WidgetTheme widgetTheme2, PopupInfo popupInfo2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : accessibilityData, str, (i11 & 4) != 0 ? null : analytics2, z11, str2, str3, str4, widgetTheme2, popupInfo2);
    }

    public static /* synthetic */ ThemeDrop copy$default(ThemeDrop themeDrop, AccessibilityData accessibilityData, String str, Analytics analytics2, boolean z11, String str2, String str3, String str4, WidgetTheme widgetTheme2, PopupInfo popupInfo2, int i11, Object obj) {
        ThemeDrop themeDrop2 = themeDrop;
        int i12 = i11;
        return themeDrop.copy((i12 & 1) != 0 ? themeDrop2.accessibility : accessibilityData, (i12 & 2) != 0 ? themeDrop2.accountIcon : str, (i12 & 4) != 0 ? themeDrop2.analytics : analytics2, (i12 & 8) != 0 ? themeDrop2.autoApply : z11, (i12 & 16) != 0 ? themeDrop2.backgroundImage : str2, (i12 & 32) != 0 ? themeDrop2.footerImage : str3, (i12 & 64) != 0 ? themeDrop2.themeId : str4, (i12 & 128) != 0 ? themeDrop2.widgetTheme : widgetTheme2, (i12 & 256) != 0 ? themeDrop2.popupInfo : popupInfo2);
    }

    public final AccessibilityData component1() {
        return this.accessibility;
    }

    public final String component2() {
        return this.accountIcon;
    }

    public final Analytics component3() {
        return this.analytics;
    }

    public final boolean component4() {
        return this.autoApply;
    }

    public final String component5() {
        return this.backgroundImage;
    }

    public final String component6() {
        return this.footerImage;
    }

    public final String component7() {
        return this.themeId;
    }

    public final WidgetTheme component8() {
        return this.widgetTheme;
    }

    public final PopupInfo component9() {
        return this.popupInfo;
    }

    public final ThemeDrop copy(AccessibilityData accessibilityData, String str, Analytics analytics2, boolean z11, String str2, String str3, String str4, WidgetTheme widgetTheme2, PopupInfo popupInfo2) {
        return new ThemeDrop(accessibilityData, str, analytics2, z11, str2, str3, str4, widgetTheme2, popupInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeDrop)) {
            return false;
        }
        ThemeDrop themeDrop = (ThemeDrop) obj;
        return p.e(this.accessibility, themeDrop.accessibility) && p.e(this.accountIcon, themeDrop.accountIcon) && p.e(this.analytics, themeDrop.analytics) && this.autoApply == themeDrop.autoApply && p.e(this.backgroundImage, themeDrop.backgroundImage) && p.e(this.footerImage, themeDrop.footerImage) && p.e(this.themeId, themeDrop.themeId) && p.e(this.widgetTheme, themeDrop.widgetTheme) && p.e(this.popupInfo, themeDrop.popupInfo);
    }

    public final AccessibilityData getAccessibility() {
        return this.accessibility;
    }

    public final String getAccountIcon() {
        return this.accountIcon;
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final boolean getAutoApply() {
        return this.autoApply;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getFooterImage() {
        return this.footerImage;
    }

    public final PopupInfo getPopupInfo() {
        return this.popupInfo;
    }

    public final String getThemeId() {
        return this.themeId;
    }

    public final WidgetTheme getWidgetTheme() {
        return this.widgetTheme;
    }

    public int hashCode() {
        AccessibilityData accessibilityData = this.accessibility;
        int i11 = 0;
        int hashCode = (accessibilityData == null ? 0 : accessibilityData.hashCode()) * 31;
        String str = this.accountIcon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Analytics analytics2 = this.analytics;
        int hashCode3 = (hashCode2 + (analytics2 == null ? 0 : analytics2.hashCode())) * 31;
        boolean z11 = this.autoApply;
        if (z11) {
            z11 = true;
        }
        int i12 = (hashCode3 + (z11 ? 1 : 0)) * 31;
        String str2 = this.backgroundImage;
        int hashCode4 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.footerImage;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.themeId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WidgetTheme widgetTheme2 = this.widgetTheme;
        int hashCode7 = (hashCode6 + (widgetTheme2 == null ? 0 : widgetTheme2.hashCode())) * 31;
        PopupInfo popupInfo2 = this.popupInfo;
        if (popupInfo2 != null) {
            i11 = popupInfo2.hashCode();
        }
        return hashCode7 + i11;
    }

    public String toString() {
        return "ThemeDrop(accessibility=" + this.accessibility + ", accountIcon=" + this.accountIcon + ", analytics=" + this.analytics + ", autoApply=" + this.autoApply + ", backgroundImage=" + this.backgroundImage + ", footerImage=" + this.footerImage + ", themeId=" + this.themeId + ", widgetTheme=" + this.widgetTheme + ", popupInfo=" + this.popupInfo + ')';
    }

    public ThemeDrop(AccessibilityData accessibilityData, String str, Analytics analytics2, boolean z11, String str2, String str3, String str4, WidgetTheme widgetTheme2, PopupInfo popupInfo2) {
        this.accessibility = accessibilityData;
        this.accountIcon = str;
        this.analytics = analytics2;
        this.autoApply = z11;
        this.backgroundImage = str2;
        this.footerImage = str3;
        this.themeId = str4;
        this.widgetTheme = widgetTheme2;
        this.popupInfo = popupInfo2;
    }
}
