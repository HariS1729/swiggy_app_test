package in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup;

import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.p;

/* compiled from: TextStyle.kt */
public final class TextStyle {
    private final String textColor;

    public TextStyle(String str) {
        p.j(str, MenuConstants.MENU_OFFER_TEXT_COLOR);
        this.textColor = str;
    }

    public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textStyle.textColor;
        }
        return textStyle.copy(str);
    }

    public final String component1() {
        return this.textColor;
    }

    public final TextStyle copy(String str) {
        p.j(str, MenuConstants.MENU_OFFER_TEXT_COLOR);
        return new TextStyle(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextStyle) && p.e(this.textColor, ((TextStyle) obj).textColor);
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.textColor.hashCode();
    }

    public String toString() {
        return "TextStyle(textColor=" + this.textColor + ')';
    }
}
