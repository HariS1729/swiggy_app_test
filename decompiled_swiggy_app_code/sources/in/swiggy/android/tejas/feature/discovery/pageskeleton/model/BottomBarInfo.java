package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarInfo.kt */
public final class BottomBarInfo implements Serializable {
    @SerializedName("accessibility")
    private final AccessibilityData accessibility;
    @SerializedName("cta")
    private final CTA cta;
    @SerializedName("items")
    private final List<BottomBarInfo> items;
    @SerializedName("selectedBackgroundColor")
    private final String selectedBackgroundColor;
    @SerializedName("selectedImageId")
    private final String selectedImageId;
    @SerializedName("selectedImageTint")
    private final String selectedImageTint;
    @SerializedName("selectedTextColor")
    private final String selectedTextColor;
    @SerializedName("subTitle")
    private final String subTitle;
    @SerializedName("title")
    private final String title;
    @SerializedName("type")
    private final BottomBarType type;
    @SerializedName("unselectedImageId")
    private final String unSelectedImageId;
    @SerializedName("unSelectedTextColor")
    private final String unSelectedTextColor;
    @SerializedName("unselectedBackgroundColor")
    private final String unselectedBackgroundColor;

    public BottomBarInfo(BottomBarType bottomBarType, String str, String str2, String str3, String str4, String str5, String str6, CTA cta2, List<BottomBarInfo> list, String str7, String str8, String str9, AccessibilityData accessibilityData) {
        p.j(cta2, "cta");
        this.type = bottomBarType;
        this.title = str;
        this.subTitle = str2;
        this.selectedTextColor = str3;
        this.unSelectedTextColor = str4;
        this.selectedImageId = str5;
        this.unSelectedImageId = str6;
        this.cta = cta2;
        this.items = list;
        this.unselectedBackgroundColor = str7;
        this.selectedBackgroundColor = str8;
        this.selectedImageTint = str9;
        this.accessibility = accessibilityData;
    }

    public static /* synthetic */ BottomBarInfo copy$default(BottomBarInfo bottomBarInfo, BottomBarType bottomBarType, String str, String str2, String str3, String str4, String str5, String str6, CTA cta2, List list, String str7, String str8, String str9, AccessibilityData accessibilityData, int i11, Object obj) {
        BottomBarInfo bottomBarInfo2 = bottomBarInfo;
        int i12 = i11;
        return bottomBarInfo.copy((i12 & 1) != 0 ? bottomBarInfo2.type : bottomBarType, (i12 & 2) != 0 ? bottomBarInfo2.title : str, (i12 & 4) != 0 ? bottomBarInfo2.subTitle : str2, (i12 & 8) != 0 ? bottomBarInfo2.selectedTextColor : str3, (i12 & 16) != 0 ? bottomBarInfo2.unSelectedTextColor : str4, (i12 & 32) != 0 ? bottomBarInfo2.selectedImageId : str5, (i12 & 64) != 0 ? bottomBarInfo2.unSelectedImageId : str6, (i12 & 128) != 0 ? bottomBarInfo2.cta : cta2, (i12 & 256) != 0 ? bottomBarInfo2.items : list, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? bottomBarInfo2.unselectedBackgroundColor : str7, (i12 & 1024) != 0 ? bottomBarInfo2.selectedBackgroundColor : str8, (i12 & 2048) != 0 ? bottomBarInfo2.selectedImageTint : str9, (i12 & 4096) != 0 ? bottomBarInfo2.accessibility : accessibilityData);
    }

    public final BottomBarType component1() {
        return this.type;
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
        return this.accessibility;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    public final String component4() {
        return this.selectedTextColor;
    }

    public final String component5() {
        return this.unSelectedTextColor;
    }

    public final String component6() {
        return this.selectedImageId;
    }

    public final String component7() {
        return this.unSelectedImageId;
    }

    public final CTA component8() {
        return this.cta;
    }

    public final List<BottomBarInfo> component9() {
        return this.items;
    }

    public final BottomBarInfo copy(BottomBarType bottomBarType, String str, String str2, String str3, String str4, String str5, String str6, CTA cta2, List<BottomBarInfo> list, String str7, String str8, String str9, AccessibilityData accessibilityData) {
        CTA cta3 = cta2;
        p.j(cta3, "cta");
        return new BottomBarInfo(bottomBarType, str, str2, str3, str4, str5, str6, cta3, list, str7, str8, str9, accessibilityData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarInfo)) {
            return false;
        }
        BottomBarInfo bottomBarInfo = (BottomBarInfo) obj;
        return this.type == bottomBarInfo.type && p.e(this.title, bottomBarInfo.title) && p.e(this.subTitle, bottomBarInfo.subTitle) && p.e(this.selectedTextColor, bottomBarInfo.selectedTextColor) && p.e(this.unSelectedTextColor, bottomBarInfo.unSelectedTextColor) && p.e(this.selectedImageId, bottomBarInfo.selectedImageId) && p.e(this.unSelectedImageId, bottomBarInfo.unSelectedImageId) && p.e(this.cta, bottomBarInfo.cta) && p.e(this.items, bottomBarInfo.items) && p.e(this.unselectedBackgroundColor, bottomBarInfo.unselectedBackgroundColor) && p.e(this.selectedBackgroundColor, bottomBarInfo.selectedBackgroundColor) && p.e(this.selectedImageTint, bottomBarInfo.selectedImageTint) && p.e(this.accessibility, bottomBarInfo.accessibility);
    }

    public final AccessibilityData getAccessibility() {
        return this.accessibility;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final List<BottomBarInfo> getItems() {
        return this.items;
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

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final BottomBarType getType() {
        return this.type;
    }

    public final String getUnSelectedImageId() {
        return this.unSelectedImageId;
    }

    public final String getUnSelectedTextColor() {
        return this.unSelectedTextColor;
    }

    public final String getUnselectedBackgroundColor() {
        return this.unselectedBackgroundColor;
    }

    public int hashCode() {
        BottomBarType bottomBarType = this.type;
        int i11 = 0;
        int hashCode = (bottomBarType == null ? 0 : bottomBarType.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedTextColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unSelectedTextColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.selectedImageId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.unSelectedImageId;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.cta.hashCode()) * 31;
        List<BottomBarInfo> list = this.items;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.unselectedBackgroundColor;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.selectedBackgroundColor;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.selectedImageTint;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        AccessibilityData accessibilityData = this.accessibility;
        if (accessibilityData != null) {
            i11 = accessibilityData.hashCode();
        }
        return hashCode11 + i11;
    }

    public String toString() {
        return "BottomBarInfo(type=" + this.type + ", title=" + this.title + ", subTitle=" + this.subTitle + ", selectedTextColor=" + this.selectedTextColor + ", unSelectedTextColor=" + this.unSelectedTextColor + ", selectedImageId=" + this.selectedImageId + ", unSelectedImageId=" + this.unSelectedImageId + ", cta=" + this.cta + ", items=" + this.items + ", unselectedBackgroundColor=" + this.unselectedBackgroundColor + ", selectedBackgroundColor=" + this.selectedBackgroundColor + ", selectedImageTint=" + this.selectedImageTint + ", accessibility=" + this.accessibility + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BottomBarInfo(in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarType r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, in.swiggy.android.tejas.feature.listing.cta.model.CTA r25, java.util.List r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData r30, int r31, kotlin.jvm.internal.i r32) {
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
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarInfo.<init>(in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.listing.cta.model.CTA, java.util.List, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData, int, kotlin.jvm.internal.i):void");
    }
}
