package in.swiggy.android.tejas.feature.home.model.multicreative;

import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.p;

/* compiled from: CallOut.kt */
public final class CallOut {
    private final LeftToRightLinearGradient backgroundGradient;
    private final String text;
    private final String textColor;
    private final CallOutType type;

    public CallOut(String str, String str2, CallOutType callOutType, LeftToRightLinearGradient leftToRightLinearGradient) {
        p.j(str, "text");
        p.j(str2, MenuConstants.MENU_OFFER_TEXT_COLOR);
        p.j(callOutType, "type");
        p.j(leftToRightLinearGradient, "backgroundGradient");
        this.text = str;
        this.textColor = str2;
        this.type = callOutType;
        this.backgroundGradient = leftToRightLinearGradient;
    }

    public final LeftToRightLinearGradient getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final CallOutType getType() {
        return this.type;
    }
}
