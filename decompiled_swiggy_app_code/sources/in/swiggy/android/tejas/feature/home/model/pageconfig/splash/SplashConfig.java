package in.swiggy.android.tejas.feature.home.model.pageconfig.splash;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.home.model.FrequencyCapping;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SplashConfig.kt */
public final class SplashConfig extends HomeConfig {
    @SerializedName("entityType")
    private final String entityType;
    @SerializedName("frequencyCapping")
    private final FrequencyCapping frequencyCapping;
    @SerializedName("maxViews")
    private final int maxViews;
    @SerializedName("screenHoldTime")
    private final int screenHoldTime;
    @SerializedName("id")
    private final String widgetId;
    @SerializedName("textInfo")
    private final WidgetInfo widgetInfo;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplashConfig(String str, WidgetInfo widgetInfo2, int i11, int i12, String str2, FrequencyCapping frequencyCapping2, int i13, i iVar) {
        this(str, widgetInfo2, i11, i12, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : frequencyCapping2);
    }

    public static /* synthetic */ SplashConfig copy$default(SplashConfig splashConfig, String str, WidgetInfo widgetInfo2, int i11, int i12, String str2, FrequencyCapping frequencyCapping2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = splashConfig.widgetId;
        }
        if ((i13 & 2) != 0) {
            widgetInfo2 = splashConfig.widgetInfo;
        }
        WidgetInfo widgetInfo3 = widgetInfo2;
        if ((i13 & 4) != 0) {
            i11 = splashConfig.screenHoldTime;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = splashConfig.maxViews;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            str2 = splashConfig.entityType;
        }
        String str3 = str2;
        if ((i13 & 32) != 0) {
            frequencyCapping2 = splashConfig.frequencyCapping;
        }
        return splashConfig.copy(str, widgetInfo3, i14, i15, str3, frequencyCapping2);
    }

    public final String component1() {
        return this.widgetId;
    }

    public final WidgetInfo component2() {
        return this.widgetInfo;
    }

    public final int component3() {
        return this.screenHoldTime;
    }

    public final int component4() {
        return this.maxViews;
    }

    public final String component5() {
        return this.entityType;
    }

    public final FrequencyCapping component6() {
        return this.frequencyCapping;
    }

    public final SplashConfig copy(String str, WidgetInfo widgetInfo2, int i11, int i12, String str2, FrequencyCapping frequencyCapping2) {
        p.j(str, "widgetId");
        return new SplashConfig(str, widgetInfo2, i11, i12, str2, frequencyCapping2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashConfig)) {
            return false;
        }
        SplashConfig splashConfig = (SplashConfig) obj;
        return p.e(this.widgetId, splashConfig.widgetId) && p.e(this.widgetInfo, splashConfig.widgetInfo) && this.screenHoldTime == splashConfig.screenHoldTime && this.maxViews == splashConfig.maxViews && p.e(this.entityType, splashConfig.entityType) && p.e(this.frequencyCapping, splashConfig.frequencyCapping);
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final FrequencyCapping getFrequencyCapping() {
        return this.frequencyCapping;
    }

    public final int getMaxViews() {
        return this.maxViews;
    }

    public final int getScreenHoldTime() {
        return this.screenHoldTime;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final WidgetInfo getWidgetInfo() {
        return this.widgetInfo;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        WidgetInfo widgetInfo2 = this.widgetInfo;
        int i11 = 0;
        int hashCode2 = (((((hashCode + (widgetInfo2 == null ? 0 : widgetInfo2.hashCode())) * 31) + this.screenHoldTime) * 31) + this.maxViews) * 31;
        String str = this.entityType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        FrequencyCapping frequencyCapping2 = this.frequencyCapping;
        if (frequencyCapping2 != null) {
            i11 = frequencyCapping2.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "SplashConfig(widgetId=" + this.widgetId + ", widgetInfo=" + this.widgetInfo + ", screenHoldTime=" + this.screenHoldTime + ", maxViews=" + this.maxViews + ", entityType=" + this.entityType + ", frequencyCapping=" + this.frequencyCapping + ')';
    }

    public SplashConfig(String str, WidgetInfo widgetInfo2, int i11, int i12, String str2, FrequencyCapping frequencyCapping2) {
        p.j(str, "widgetId");
        this.widgetId = str;
        this.widgetInfo = widgetInfo2;
        this.screenHoldTime = i11;
        this.maxViews = i12;
        this.entityType = str2;
        this.frequencyCapping = frequencyCapping2;
    }
}
