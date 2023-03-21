package in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup;

import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarPopupCard.kt */
public final class BottomBarPopupCard {
    private final String assetId;
    private final String bannerId;
    private final CTAInfo cta;
    private final TextLine greeting;
    private final List<TextLine> textLines;
    private final BottomBarPopupCardType type;

    public BottomBarPopupCard(String str, String str2, TextLine textLine, CTAInfo cTAInfo, List<TextLine> list, BottomBarPopupCardType bottomBarPopupCardType) {
        p.j(str, "bannerId");
        p.j(str2, "assetId");
        p.j(textLine, "greeting");
        p.j(cTAInfo, "cta");
        p.j(list, "textLines");
        p.j(bottomBarPopupCardType, "type");
        this.bannerId = str;
        this.assetId = str2;
        this.greeting = textLine;
        this.cta = cTAInfo;
        this.textLines = list;
        this.type = bottomBarPopupCardType;
    }

    public static /* synthetic */ BottomBarPopupCard copy$default(BottomBarPopupCard bottomBarPopupCard, String str, String str2, TextLine textLine, CTAInfo cTAInfo, List<TextLine> list, BottomBarPopupCardType bottomBarPopupCardType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bottomBarPopupCard.bannerId;
        }
        if ((i11 & 2) != 0) {
            str2 = bottomBarPopupCard.assetId;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            textLine = bottomBarPopupCard.greeting;
        }
        TextLine textLine2 = textLine;
        if ((i11 & 8) != 0) {
            cTAInfo = bottomBarPopupCard.cta;
        }
        CTAInfo cTAInfo2 = cTAInfo;
        if ((i11 & 16) != 0) {
            list = bottomBarPopupCard.textLines;
        }
        List<TextLine> list2 = list;
        if ((i11 & 32) != 0) {
            bottomBarPopupCardType = bottomBarPopupCard.type;
        }
        return bottomBarPopupCard.copy(str, str3, textLine2, cTAInfo2, list2, bottomBarPopupCardType);
    }

    public final String component1() {
        return this.bannerId;
    }

    public final String component2() {
        return this.assetId;
    }

    public final TextLine component3() {
        return this.greeting;
    }

    public final CTAInfo component4() {
        return this.cta;
    }

    public final List<TextLine> component5() {
        return this.textLines;
    }

    public final BottomBarPopupCardType component6() {
        return this.type;
    }

    public final BottomBarPopupCard copy(String str, String str2, TextLine textLine, CTAInfo cTAInfo, List<TextLine> list, BottomBarPopupCardType bottomBarPopupCardType) {
        p.j(str, "bannerId");
        p.j(str2, "assetId");
        p.j(textLine, "greeting");
        p.j(cTAInfo, "cta");
        p.j(list, "textLines");
        p.j(bottomBarPopupCardType, "type");
        return new BottomBarPopupCard(str, str2, textLine, cTAInfo, list, bottomBarPopupCardType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarPopupCard)) {
            return false;
        }
        BottomBarPopupCard bottomBarPopupCard = (BottomBarPopupCard) obj;
        return p.e(this.bannerId, bottomBarPopupCard.bannerId) && p.e(this.assetId, bottomBarPopupCard.assetId) && p.e(this.greeting, bottomBarPopupCard.greeting) && p.e(this.cta, bottomBarPopupCard.cta) && p.e(this.textLines, bottomBarPopupCard.textLines) && this.type == bottomBarPopupCard.type;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final CTAInfo getCta() {
        return this.cta;
    }

    public final TextLine getGreeting() {
        return this.greeting;
    }

    public final List<TextLine> getTextLines() {
        return this.textLines;
    }

    public final BottomBarPopupCardType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.bannerId.hashCode() * 31) + this.assetId.hashCode()) * 31) + this.greeting.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.textLines.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "BottomBarPopupCard(bannerId=" + this.bannerId + ", assetId=" + this.assetId + ", greeting=" + this.greeting + ", cta=" + this.cta + ", textLines=" + this.textLines + ", type=" + this.type + ')';
    }
}
