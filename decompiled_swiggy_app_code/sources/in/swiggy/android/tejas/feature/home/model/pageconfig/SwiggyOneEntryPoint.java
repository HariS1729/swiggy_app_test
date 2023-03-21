package in.swiggy.android.tejas.feature.home.model.pageconfig;

import com.swiggy.gandalf.widgets.v2.Cta;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyOneEntryPoint.kt */
public final class SwiggyOneEntryPoint extends HomeConfig {
    private final String bgImage;
    private final Cta cta;
    private final String iconImage;
    private final String text;
    private final String textColor;

    public SwiggyOneEntryPoint(String str, String str2, String str3, String str4, Cta cta2) {
        p.j(cta2, "cta");
        this.iconImage = str;
        this.bgImage = str2;
        this.text = str3;
        this.textColor = str4;
        this.cta = cta2;
    }

    public static /* synthetic */ SwiggyOneEntryPoint copy$default(SwiggyOneEntryPoint swiggyOneEntryPoint, String str, String str2, String str3, String str4, Cta cta2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = swiggyOneEntryPoint.iconImage;
        }
        if ((i11 & 2) != 0) {
            str2 = swiggyOneEntryPoint.bgImage;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = swiggyOneEntryPoint.text;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = swiggyOneEntryPoint.textColor;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            cta2 = swiggyOneEntryPoint.cta;
        }
        return swiggyOneEntryPoint.copy(str, str5, str6, str7, cta2);
    }

    public final String component1() {
        return this.iconImage;
    }

    public final String component2() {
        return this.bgImage;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.textColor;
    }

    public final Cta component5() {
        return this.cta;
    }

    public final SwiggyOneEntryPoint copy(String str, String str2, String str3, String str4, Cta cta2) {
        p.j(cta2, "cta");
        return new SwiggyOneEntryPoint(str, str2, str3, str4, cta2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwiggyOneEntryPoint)) {
            return false;
        }
        SwiggyOneEntryPoint swiggyOneEntryPoint = (SwiggyOneEntryPoint) obj;
        return p.e(this.iconImage, swiggyOneEntryPoint.iconImage) && p.e(this.bgImage, swiggyOneEntryPoint.bgImage) && p.e(this.text, swiggyOneEntryPoint.text) && p.e(this.textColor, swiggyOneEntryPoint.textColor) && p.e(this.cta, swiggyOneEntryPoint.cta);
    }

    public final String getBgImage() {
        return this.bgImage;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final String getIconImage() {
        return this.iconImage;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.iconImage;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bgImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return ((hashCode3 + i11) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "SwiggyOneEntryPoint(iconImage=" + this.iconImage + ", bgImage=" + this.bgImage + ", text=" + this.text + ", textColor=" + this.textColor + ", cta=" + this.cta + ')';
    }
}
