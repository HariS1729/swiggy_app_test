package in.swiggy.android.tejas.feature.home.model.pageconfig.splash;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: SplashConfig.kt */
public final class TextInfo {
    @SerializedName("subtitle")
    private final String subtitle;
    @SerializedName("subtitleColor")
    private final String subtitleColor;
    @SerializedName("title")
    private final String title;
    @SerializedName("titleColor")
    private final String titleColor;

    public TextInfo(String str, String str2, String str3, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.titleColor = str3;
        this.subtitleColor = str4;
    }

    public static /* synthetic */ TextInfo copy$default(TextInfo textInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textInfo.title;
        }
        if ((i11 & 2) != 0) {
            str2 = textInfo.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = textInfo.titleColor;
        }
        if ((i11 & 8) != 0) {
            str4 = textInfo.subtitleColor;
        }
        return textInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.titleColor;
    }

    public final String component4() {
        return this.subtitleColor;
    }

    public final TextInfo copy(String str, String str2, String str3, String str4) {
        return new TextInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextInfo)) {
            return false;
        }
        TextInfo textInfo = (TextInfo) obj;
        return p.e(this.title, textInfo.title) && p.e(this.subtitle, textInfo.subtitle) && p.e(this.titleColor, textInfo.titleColor) && p.e(this.subtitleColor, textInfo.subtitleColor);
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
        String str = this.title;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitleColor;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "TextInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", titleColor=" + this.titleColor + ", subtitleColor=" + this.subtitleColor + ')';
    }
}
