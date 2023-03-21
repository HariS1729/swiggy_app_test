package in.swiggy.android.tejas.feature.home.model.multicreative;

import kotlin.jvm.internal.p;

/* compiled from: LeftToRightLinearGradient.kt */
public final class LeftToRightLinearGradient {
    private final String endColorHexCode;
    private final String startColorHexCode;

    public LeftToRightLinearGradient(String str, String str2) {
        p.j(str, "startColorHexCode");
        p.j(str2, "endColorHexCode");
        this.startColorHexCode = str;
        this.endColorHexCode = str2;
    }

    public final String getEndColorHexCode() {
        return this.endColorHexCode;
    }

    public final String getStartColorHexCode() {
        return this.startColorHexCode;
    }
}
