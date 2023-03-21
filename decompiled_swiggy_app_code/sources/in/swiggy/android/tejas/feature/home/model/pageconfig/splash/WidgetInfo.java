package in.swiggy.android.tejas.feature.home.model.pageconfig.splash;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: SplashConfig.kt */
public final class WidgetInfo {
    @SerializedName("action")
    private final CTAInfo ctaInfo;
    @SerializedName("text")
    private final TextInfo textInfo;

    public WidgetInfo(TextInfo textInfo2, CTAInfo cTAInfo) {
        this.textInfo = textInfo2;
        this.ctaInfo = cTAInfo;
    }

    public static /* synthetic */ WidgetInfo copy$default(WidgetInfo widgetInfo, TextInfo textInfo2, CTAInfo cTAInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textInfo2 = widgetInfo.textInfo;
        }
        if ((i11 & 2) != 0) {
            cTAInfo = widgetInfo.ctaInfo;
        }
        return widgetInfo.copy(textInfo2, cTAInfo);
    }

    public final TextInfo component1() {
        return this.textInfo;
    }

    public final CTAInfo component2() {
        return this.ctaInfo;
    }

    public final WidgetInfo copy(TextInfo textInfo2, CTAInfo cTAInfo) {
        return new WidgetInfo(textInfo2, cTAInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetInfo)) {
            return false;
        }
        WidgetInfo widgetInfo = (WidgetInfo) obj;
        return p.e(this.textInfo, widgetInfo.textInfo) && p.e(this.ctaInfo, widgetInfo.ctaInfo);
    }

    public final CTAInfo getCtaInfo() {
        return this.ctaInfo;
    }

    public final TextInfo getTextInfo() {
        return this.textInfo;
    }

    public int hashCode() {
        TextInfo textInfo2 = this.textInfo;
        int i11 = 0;
        int hashCode = (textInfo2 == null ? 0 : textInfo2.hashCode()) * 31;
        CTAInfo cTAInfo = this.ctaInfo;
        if (cTAInfo != null) {
            i11 = cTAInfo.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "WidgetInfo(textInfo=" + this.textInfo + ", ctaInfo=" + this.ctaInfo + ')';
    }
}
