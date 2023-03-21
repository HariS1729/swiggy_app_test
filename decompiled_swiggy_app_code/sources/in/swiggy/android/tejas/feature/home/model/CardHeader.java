package in.swiggy.android.tejas.feature.home.model;

import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.listing.grid.model.Padding;
import in.swiggy.android.tejas.feature.listing.label.model.LabelFont;
import kotlin.jvm.internal.p;

/* compiled from: CardHeader.kt */
public final class CardHeader {
    private final Padding headerPadding;
    private final String imageId;
    private final String leadingText;
    private final String subtitle;
    private final String subtitleColor;
    private final Integer subtitleSize;
    private final Integer subtitleTopPadding;
    private final String title;
    private final String titleColor;
    private final LabelFont titleFontName;
    private final Integer titleSize;

    public CardHeader(String str, String str2, String str3, Padding padding, Integer num, String str4, Integer num2, String str5, String str6, LabelFont labelFont, Integer num3) {
        p.j(str, "title");
        p.j(str2, "subtitle");
        this.title = str;
        this.subtitle = str2;
        this.imageId = str3;
        this.headerPadding = padding;
        this.titleSize = num;
        this.leadingText = str4;
        this.subtitleSize = num2;
        this.titleColor = str5;
        this.subtitleColor = str6;
        this.titleFontName = labelFont;
        this.subtitleTopPadding = num3;
    }

    public static /* synthetic */ CardHeader copy$default(CardHeader cardHeader, String str, String str2, String str3, Padding padding, Integer num, String str4, Integer num2, String str5, String str6, LabelFont labelFont, Integer num3, int i11, Object obj) {
        CardHeader cardHeader2 = cardHeader;
        int i12 = i11;
        return cardHeader.copy((i12 & 1) != 0 ? cardHeader2.title : str, (i12 & 2) != 0 ? cardHeader2.subtitle : str2, (i12 & 4) != 0 ? cardHeader2.imageId : str3, (i12 & 8) != 0 ? cardHeader2.headerPadding : padding, (i12 & 16) != 0 ? cardHeader2.titleSize : num, (i12 & 32) != 0 ? cardHeader2.leadingText : str4, (i12 & 64) != 0 ? cardHeader2.subtitleSize : num2, (i12 & 128) != 0 ? cardHeader2.titleColor : str5, (i12 & 256) != 0 ? cardHeader2.subtitleColor : str6, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? cardHeader2.titleFontName : labelFont, (i12 & 1024) != 0 ? cardHeader2.subtitleTopPadding : num3);
    }

    public final String component1() {
        return this.title;
    }

    public final LabelFont component10() {
        return this.titleFontName;
    }

    public final Integer component11() {
        return this.subtitleTopPadding;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.imageId;
    }

    public final Padding component4() {
        return this.headerPadding;
    }

    public final Integer component5() {
        return this.titleSize;
    }

    public final String component6() {
        return this.leadingText;
    }

    public final Integer component7() {
        return this.subtitleSize;
    }

    public final String component8() {
        return this.titleColor;
    }

    public final String component9() {
        return this.subtitleColor;
    }

    public final CardHeader copy(String str, String str2, String str3, Padding padding, Integer num, String str4, Integer num2, String str5, String str6, LabelFont labelFont, Integer num3) {
        p.j(str, "title");
        p.j(str2, "subtitle");
        return new CardHeader(str, str2, str3, padding, num, str4, num2, str5, str6, labelFont, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardHeader)) {
            return false;
        }
        CardHeader cardHeader = (CardHeader) obj;
        return p.e(this.title, cardHeader.title) && p.e(this.subtitle, cardHeader.subtitle) && p.e(this.imageId, cardHeader.imageId) && p.e(this.headerPadding, cardHeader.headerPadding) && p.e(this.titleSize, cardHeader.titleSize) && p.e(this.leadingText, cardHeader.leadingText) && p.e(this.subtitleSize, cardHeader.subtitleSize) && p.e(this.titleColor, cardHeader.titleColor) && p.e(this.subtitleColor, cardHeader.subtitleColor) && this.titleFontName == cardHeader.titleFontName && p.e(this.subtitleTopPadding, cardHeader.subtitleTopPadding);
    }

    public final Padding getHeaderPadding() {
        return this.headerPadding;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getLeadingText() {
        return this.leadingText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    public final Integer getSubtitleSize() {
        return this.subtitleSize;
    }

    public final Integer getSubtitleTopPadding() {
        return this.subtitleTopPadding;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final LabelFont getTitleFontName() {
        return this.titleFontName;
    }

    public final Integer getTitleSize() {
        return this.titleSize;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
        String str = this.imageId;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Padding padding = this.headerPadding;
        int hashCode3 = (hashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        Integer num = this.titleSize;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.leadingText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.subtitleSize;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.titleColor;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitleColor;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LabelFont labelFont = this.titleFontName;
        int hashCode9 = (hashCode8 + (labelFont == null ? 0 : labelFont.hashCode())) * 31;
        Integer num3 = this.subtitleTopPadding;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return hashCode9 + i11;
    }

    public String toString() {
        return "CardHeader(title=" + this.title + ", subtitle=" + this.subtitle + ", imageId=" + this.imageId + ", headerPadding=" + this.headerPadding + ", titleSize=" + this.titleSize + ", leadingText=" + this.leadingText + ", subtitleSize=" + this.subtitleSize + ", titleColor=" + this.titleColor + ", subtitleColor=" + this.subtitleColor + ", titleFontName=" + this.titleFontName + ", subtitleTopPadding=" + this.subtitleTopPadding + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardHeader(java.lang.String r16, java.lang.String r17, java.lang.String r18, in.swiggy.android.tejas.feature.listing.grid.model.Padding r19, java.lang.Integer r20, java.lang.String r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, in.swiggy.android.tejas.feature.listing.label.model.LabelFont r25, java.lang.Integer r26, int r27, kotlin.jvm.internal.i r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r18
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r19
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r20
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r21
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r22
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r23
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r24
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r25
        L_0x0043:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r26
        L_0x004b:
            r3 = r15
            r4 = r16
            r5 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.home.model.CardHeader.<init>(java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.listing.grid.model.Padding, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.listing.label.model.LabelFont, java.lang.Integer, int, kotlin.jvm.internal.i):void");
    }
}
