package in.swiggy.android.tejas.feature.genericImage;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GenericImageDialogData.kt */
public final class GenericImageDialogData {
    public static final Companion Companion = new Companion((i) null);
    public static final int GENERIC_IMAGE_DIALOG_SHOWN_COUNT_DEFAULT = -1;
    @SerializedName("aspect_ratio")
    private final float aspectRatio;
    @SerializedName("bgColor")
    private String bgColor;
    @SerializedName("to_be_shown_count")
    private final int count;
    @SerializedName("cta")
    private CTA cta;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20218id;
    @SerializedName("image_id")
    private final String imageId;
    @SerializedName("infoData")
    private GenericImageDialogInfoData infoData;
    @SerializedName("visible")
    private final boolean isVisible;
    @SerializedName("minimum_horizontal_margin")
    private final float minimumHorizontalMargin;
    @SerializedName("minimum_vertical_margin")
    private final float minimumVerticalMargin;
    @SerializedName("width_ratio")
    private final float widthRatio;
    @SerializedName("y_position")
    private Integer yPosition;

    /* compiled from: GenericImageDialogData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public GenericImageDialogData() {
        this((String) null, false, 0.0f, 0.0f, 0.0f, 0.0f, (String) null, 0, (String) null, (CTA) null, (Integer) null, (GenericImageDialogInfoData) null, 4095, (i) null);
    }

    public GenericImageDialogData(String str, boolean z11, float f11, float f12, float f13, float f14, String str2, int i11, String str3, CTA cta2, Integer num, GenericImageDialogInfoData genericImageDialogInfoData) {
        p.j(str2, DistributedTracing.NR_ID_ATTRIBUTE);
        this.imageId = str;
        this.isVisible = z11;
        this.aspectRatio = f11;
        this.widthRatio = f12;
        this.minimumHorizontalMargin = f13;
        this.minimumVerticalMargin = f14;
        this.f20218id = str2;
        this.count = i11;
        this.bgColor = str3;
        this.cta = cta2;
        this.yPosition = num;
        this.infoData = genericImageDialogInfoData;
    }

    public static /* synthetic */ GenericImageDialogData copy$default(GenericImageDialogData genericImageDialogData, String str, boolean z11, float f11, float f12, float f13, float f14, String str2, int i11, String str3, CTA cta2, Integer num, GenericImageDialogInfoData genericImageDialogInfoData, int i12, Object obj) {
        GenericImageDialogData genericImageDialogData2 = genericImageDialogData;
        int i13 = i12;
        return genericImageDialogData.copy((i13 & 1) != 0 ? genericImageDialogData2.imageId : str, (i13 & 2) != 0 ? genericImageDialogData2.isVisible : z11, (i13 & 4) != 0 ? genericImageDialogData2.aspectRatio : f11, (i13 & 8) != 0 ? genericImageDialogData2.widthRatio : f12, (i13 & 16) != 0 ? genericImageDialogData2.minimumHorizontalMargin : f13, (i13 & 32) != 0 ? genericImageDialogData2.minimumVerticalMargin : f14, (i13 & 64) != 0 ? genericImageDialogData2.f20218id : str2, (i13 & 128) != 0 ? genericImageDialogData2.count : i11, (i13 & 256) != 0 ? genericImageDialogData2.bgColor : str3, (i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? genericImageDialogData2.cta : cta2, (i13 & 1024) != 0 ? genericImageDialogData2.yPosition : num, (i13 & 2048) != 0 ? genericImageDialogData2.infoData : genericImageDialogInfoData);
    }

    public final String component1() {
        return this.imageId;
    }

    public final CTA component10() {
        return this.cta;
    }

    public final Integer component11() {
        return this.yPosition;
    }

    public final GenericImageDialogInfoData component12() {
        return this.infoData;
    }

    public final boolean component2() {
        return this.isVisible;
    }

    public final float component3() {
        return this.aspectRatio;
    }

    public final float component4() {
        return this.widthRatio;
    }

    public final float component5() {
        return this.minimumHorizontalMargin;
    }

    public final float component6() {
        return this.minimumVerticalMargin;
    }

    public final String component7() {
        return this.f20218id;
    }

    public final int component8() {
        return this.count;
    }

    public final String component9() {
        return this.bgColor;
    }

    public final GenericImageDialogData copy(String str, boolean z11, float f11, float f12, float f13, float f14, String str2, int i11, String str3, CTA cta2, Integer num, GenericImageDialogInfoData genericImageDialogInfoData) {
        String str4 = str2;
        p.j(str4, DistributedTracing.NR_ID_ATTRIBUTE);
        return new GenericImageDialogData(str, z11, f11, f12, f13, f14, str4, i11, str3, cta2, num, genericImageDialogInfoData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericImageDialogData)) {
            return false;
        }
        GenericImageDialogData genericImageDialogData = (GenericImageDialogData) obj;
        return p.e(this.imageId, genericImageDialogData.imageId) && this.isVisible == genericImageDialogData.isVisible && p.e(Float.valueOf(this.aspectRatio), Float.valueOf(genericImageDialogData.aspectRatio)) && p.e(Float.valueOf(this.widthRatio), Float.valueOf(genericImageDialogData.widthRatio)) && p.e(Float.valueOf(this.minimumHorizontalMargin), Float.valueOf(genericImageDialogData.minimumHorizontalMargin)) && p.e(Float.valueOf(this.minimumVerticalMargin), Float.valueOf(genericImageDialogData.minimumVerticalMargin)) && p.e(this.f20218id, genericImageDialogData.f20218id) && this.count == genericImageDialogData.count && p.e(this.bgColor, genericImageDialogData.bgColor) && p.e(this.cta, genericImageDialogData.cta) && p.e(this.yPosition, genericImageDialogData.yPosition) && p.e(this.infoData, genericImageDialogData.infoData);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final int getCount() {
        return this.count;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getId() {
        return this.f20218id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final GenericImageDialogInfoData getInfoData() {
        return this.infoData;
    }

    public final float getMinimumHorizontalMargin() {
        return this.minimumHorizontalMargin;
    }

    public final float getMinimumVerticalMargin() {
        return this.minimumVerticalMargin;
    }

    public final float getWidthRatio() {
        return this.widthRatio;
    }

    public final Integer getYPosition() {
        return this.yPosition;
    }

    public int hashCode() {
        String str = this.imageId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z11 = this.isVisible;
        if (z11) {
            z11 = true;
        }
        int floatToIntBits = (((((((((((((hashCode + (z11 ? 1 : 0)) * 31) + Float.floatToIntBits(this.aspectRatio)) * 31) + Float.floatToIntBits(this.widthRatio)) * 31) + Float.floatToIntBits(this.minimumHorizontalMargin)) * 31) + Float.floatToIntBits(this.minimumVerticalMargin)) * 31) + this.f20218id.hashCode()) * 31) + this.count) * 31;
        String str2 = this.bgColor;
        int hashCode2 = (floatToIntBits + (str2 == null ? 0 : str2.hashCode())) * 31;
        CTA cta2 = this.cta;
        int hashCode3 = (hashCode2 + (cta2 == null ? 0 : cta2.hashCode())) * 31;
        Integer num = this.yPosition;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        GenericImageDialogInfoData genericImageDialogInfoData = this.infoData;
        if (genericImageDialogInfoData != null) {
            i11 = genericImageDialogInfoData.hashCode();
        }
        return hashCode4 + i11;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setCta(CTA cta2) {
        this.cta = cta2;
    }

    public final void setInfoData(GenericImageDialogInfoData genericImageDialogInfoData) {
        this.infoData = genericImageDialogInfoData;
    }

    public final void setYPosition(Integer num) {
        this.yPosition = num;
    }

    public String toString() {
        return "GenericImageDialogData(imageId=" + this.imageId + ", isVisible=" + this.isVisible + ", aspectRatio=" + this.aspectRatio + ", widthRatio=" + this.widthRatio + ", minimumHorizontalMargin=" + this.minimumHorizontalMargin + ", minimumVerticalMargin=" + this.minimumVerticalMargin + ", id=" + this.f20218id + ", count=" + this.count + ", bgColor=" + this.bgColor + ", cta=" + this.cta + ", yPosition=" + this.yPosition + ", infoData=" + this.infoData + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GenericImageDialogData(java.lang.String r15, boolean r16, float r17, float r18, float r19, float r20, java.lang.String r21, int r22, java.lang.String r23, in.swiggy.android.tejas.feature.listing.cta.model.CTA r24, java.lang.Integer r25, in.swiggy.android.tejas.feature.genericImage.GenericImageDialogInfoData r26, int r27, kotlin.jvm.internal.i r28) {
        /*
            r14 = this;
            r0 = r27
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r3 = 0
            goto L_0x0013
        L_0x0011:
            r3 = r16
        L_0x0013:
            r5 = r0 & 4
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x001c
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x001e
        L_0x001c:
            r5 = r17
        L_0x001e:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r6 = r18
        L_0x0025:
            r7 = r0 & 16
            r8 = 0
            if (r7 == 0) goto L_0x002c
            r7 = 0
            goto L_0x002e
        L_0x002c:
            r7 = r19
        L_0x002e:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r8 = r20
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003c
            java.lang.String r9 = ""
            goto L_0x003e
        L_0x003c:
            r9 = r21
        L_0x003e:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0044
            r10 = -1
            goto L_0x0046
        L_0x0044:
            r10 = r22
        L_0x0046:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004c
            r11 = r2
            goto L_0x004e
        L_0x004c:
            r11 = r23
        L_0x004e:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0054
            r12 = r2
            goto L_0x0056
        L_0x0054:
            r12 = r24
        L_0x0056:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0061
        L_0x005f:
            r4 = r25
        L_0x0061:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r2 = r26
        L_0x0068:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r4
            r27 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.genericImage.GenericImageDialogData.<init>(java.lang.String, boolean, float, float, float, float, java.lang.String, int, java.lang.String, in.swiggy.android.tejas.feature.listing.cta.model.CTA, java.lang.Integer, in.swiggy.android.tejas.feature.genericImage.GenericImageDialogInfoData, int, kotlin.jvm.internal.i):void");
    }
}
