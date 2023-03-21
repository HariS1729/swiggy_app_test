package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import com.swiggy.gandalf.widgets.v2.BottomBar;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class Option {
    @SerializedName("accessibility")
    private final AccessibilityData accessibilityData;
    @SerializedName("cta")
    private final Cta cta;
    @SerializedName("options")
    private final List<Option> options;
    @SerializedName("selectedBackgroundColor")
    private final String selectedBackgroundColor;
    @SerializedName("selectedImageId")
    private final String selectedImageId;
    @SerializedName("selectedImageTint")
    private final String selectedImageTint;
    @SerializedName("selectedTextColor")
    private final String selectedTextColor;
    @SerializedName("subtitle")
    private final String subtitle;
    @SerializedName("title")
    private final String title;
    @SerializedName("type")
    private final BottomBar.Options.Type type;
    @SerializedName("unSelectedImageId")
    private final String unSelectedImageId;
    @SerializedName("unselectedBackgroundColor")
    private final String unselectedBackgroundColor;
    @SerializedName("unselectedTextColor")
    private final String unselectedTextColor;

    public Option(Cta cta2, String str, String str2, String str3, BottomBar.Options.Type type2, String str4, List<Option> list, String str5, String str6, String str7, String str8, String str9, AccessibilityData accessibilityData2) {
        p.j(cta2, "cta");
        p.j(type2, "type");
        this.cta = cta2;
        this.selectedTextColor = str;
        this.subtitle = str2;
        this.title = str3;
        this.type = type2;
        this.unselectedTextColor = str4;
        this.options = list;
        this.selectedImageId = str5;
        this.unSelectedImageId = str6;
        this.unselectedBackgroundColor = str7;
        this.selectedBackgroundColor = str8;
        this.selectedImageTint = str9;
        this.accessibilityData = accessibilityData2;
    }

    public static /* synthetic */ Option copy$default(Option option, Cta cta2, String str, String str2, String str3, BottomBar.Options.Type type2, String str4, List list, String str5, String str6, String str7, String str8, String str9, AccessibilityData accessibilityData2, int i11, Object obj) {
        Option option2 = option;
        int i12 = i11;
        return option.copy((i12 & 1) != 0 ? option2.cta : cta2, (i12 & 2) != 0 ? option2.selectedTextColor : str, (i12 & 4) != 0 ? option2.subtitle : str2, (i12 & 8) != 0 ? option2.title : str3, (i12 & 16) != 0 ? option2.type : type2, (i12 & 32) != 0 ? option2.unselectedTextColor : str4, (i12 & 64) != 0 ? option2.options : list, (i12 & 128) != 0 ? option2.selectedImageId : str5, (i12 & 256) != 0 ? option2.unSelectedImageId : str6, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? option2.unselectedBackgroundColor : str7, (i12 & 1024) != 0 ? option2.selectedBackgroundColor : str8, (i12 & 2048) != 0 ? option2.selectedImageTint : str9, (i12 & 4096) != 0 ? option2.accessibilityData : accessibilityData2);
    }

    public final Cta component1() {
        return this.cta;
    }

    public final String component10() {
        return this.unselectedBackgroundColor;
    }

    public final String component11() {
        return this.selectedBackgroundColor;
    }

    public final String component12() {
        return this.selectedImageTint;
    }

    public final AccessibilityData component13() {
        return this.accessibilityData;
    }

    public final String component2() {
        return this.selectedTextColor;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.title;
    }

    public final BottomBar.Options.Type component5() {
        return this.type;
    }

    public final String component6() {
        return this.unselectedTextColor;
    }

    public final List<Option> component7() {
        return this.options;
    }

    public final String component8() {
        return this.selectedImageId;
    }

    public final String component9() {
        return this.unSelectedImageId;
    }

    public final Option copy(Cta cta2, String str, String str2, String str3, BottomBar.Options.Type type2, String str4, List<Option> list, String str5, String str6, String str7, String str8, String str9, AccessibilityData accessibilityData2) {
        Cta cta3 = cta2;
        p.j(cta3, "cta");
        BottomBar.Options.Type type3 = type2;
        p.j(type3, "type");
        return new Option(cta3, str, str2, str3, type3, str4, list, str5, str6, str7, str8, str9, accessibilityData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return p.e(this.cta, option.cta) && p.e(this.selectedTextColor, option.selectedTextColor) && p.e(this.subtitle, option.subtitle) && p.e(this.title, option.title) && this.type == option.type && p.e(this.unselectedTextColor, option.unselectedTextColor) && p.e(this.options, option.options) && p.e(this.selectedImageId, option.selectedImageId) && p.e(this.unSelectedImageId, option.unSelectedImageId) && p.e(this.unselectedBackgroundColor, option.unselectedBackgroundColor) && p.e(this.selectedBackgroundColor, option.selectedBackgroundColor) && p.e(this.selectedImageTint, option.selectedImageTint) && p.e(this.accessibilityData, option.accessibilityData);
    }

    public final AccessibilityData getAccessibilityData() {
        return this.accessibilityData;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final List<Option> getOptions() {
        return this.options;
    }

    public final String getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    public final String getSelectedImageId() {
        return this.selectedImageId;
    }

    public final String getSelectedImageTint() {
        return this.selectedImageTint;
    }

    public final String getSelectedTextColor() {
        return this.selectedTextColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final BottomBar.Options.Type getType() {
        return this.type;
    }

    public final String getUnSelectedImageId() {
        return this.unSelectedImageId;
    }

    public final String getUnselectedBackgroundColor() {
        return this.unselectedBackgroundColor;
    }

    public final String getUnselectedTextColor() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        int hashCode = this.cta.hashCode() * 31;
        String str = this.selectedTextColor;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str4 = this.unselectedTextColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Option> list = this.options;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.selectedImageId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.unSelectedImageId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.unselectedBackgroundColor;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.selectedBackgroundColor;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.selectedImageTint;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        AccessibilityData accessibilityData2 = this.accessibilityData;
        if (accessibilityData2 != null) {
            i11 = accessibilityData2.hashCode();
        }
        return hashCode11 + i11;
    }

    public String toString() {
        return "Option(cta=" + this.cta + ", selectedTextColor=" + this.selectedTextColor + ", subtitle=" + this.subtitle + ", title=" + this.title + ", type=" + this.type + ", unselectedTextColor=" + this.unselectedTextColor + ", options=" + this.options + ", selectedImageId=" + this.selectedImageId + ", unSelectedImageId=" + this.unSelectedImageId + ", unselectedBackgroundColor=" + this.unselectedBackgroundColor + ", selectedBackgroundColor=" + this.selectedBackgroundColor + ", selectedImageTint=" + this.selectedImageTint + ", accessibilityData=" + this.accessibilityData + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Option(in.swiggy.android.tejas.feature.discovery.pageskeleton.model.Cta r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.swiggy.gandalf.widgets.v2.BottomBar.Options.Type r22, java.lang.String r23, java.util.List r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData r30, int r31, kotlin.jvm.internal.i r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 512(0x200, float:7.175E-43)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r13 = r2
            goto L_0x000c
        L_0x000a:
            r13 = r27
        L_0x000c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0012
            r14 = r2
            goto L_0x0014
        L_0x0012:
            r14 = r28
        L_0x0014:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x001a
            r15 = r2
            goto L_0x001c
        L_0x001a:
            r15 = r29
        L_0x001c:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r16 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.pageskeleton.model.Option.<init>(in.swiggy.android.tejas.feature.discovery.pageskeleton.model.Cta, java.lang.String, java.lang.String, java.lang.String, com.swiggy.gandalf.widgets.v2.BottomBar$Options$Type, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData, int, kotlin.jvm.internal.i):void");
    }
}
