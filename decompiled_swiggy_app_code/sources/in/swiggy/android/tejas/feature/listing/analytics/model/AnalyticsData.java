package in.swiggy.android.tejas.feature.listing.analytics.model;

import com.google.gson.annotations.SerializedName;
import in.juspay.hyper.constants.LogCategory;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AnalyticsData.kt */
public final class AnalyticsData implements Serializable {
    @SerializedName("attributionContext")
    private String attributionContext;
    @SerializedName("clickObjectName")
    private final String clickObjectName;
    @SerializedName("context")
    private final String context;
    @SerializedName("impressionObjectName")
    private final String impressionObjectName;
    @SerializedName("objectPosition")
    private Integer position;
    @SerializedName("screenName")
    private final String screenName;
    @SerializedName("objectValue")
    private final String value;

    public AnalyticsData(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        p.j(str, "screenName");
        this.screenName = str;
        this.value = str2;
        this.context = str3;
        this.impressionObjectName = str4;
        this.clickObjectName = str5;
        this.position = num;
        this.attributionContext = str6;
    }

    public static /* synthetic */ AnalyticsData copy$default(AnalyticsData analyticsData, String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsData.screenName;
        }
        if ((i11 & 2) != 0) {
            str2 = analyticsData.value;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = analyticsData.context;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = analyticsData.impressionObjectName;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            str5 = analyticsData.clickObjectName;
        }
        String str10 = str5;
        if ((i11 & 32) != 0) {
            num = analyticsData.position;
        }
        Integer num2 = num;
        if ((i11 & 64) != 0) {
            str6 = analyticsData.attributionContext;
        }
        return analyticsData.copy(str, str7, str8, str9, str10, num2, str6);
    }

    public final String component1() {
        return this.screenName;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.context;
    }

    public final String component4() {
        return this.impressionObjectName;
    }

    public final String component5() {
        return this.clickObjectName;
    }

    public final Integer component6() {
        return this.position;
    }

    public final String component7() {
        return this.attributionContext;
    }

    public final AnalyticsData copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        p.j(str, "screenName");
        return new AnalyticsData(str, str2, str3, str4, str5, num, str6);
    }

    public final AnalyticsData copyWithModifiedClickObjectName(String str) {
        p.j(str, "clickObjectName");
        return new AnalyticsData(this.screenName, this.value, this.context, this.impressionObjectName, str, this.position, (String) null, 64, (i) null);
    }

    public final AnalyticsData copyWithModifiedContext(String str) {
        p.j(str, LogCategory.CONTEXT);
        return new AnalyticsData(this.screenName, this.value, str, this.impressionObjectName, this.clickObjectName, this.position, (String) null, 64, (i) null);
    }

    public final AnalyticsData copyWithModifiedImpressionObjectName(String str) {
        p.j(str, "impressionObjectName");
        return new AnalyticsData(this.screenName, this.value, this.context, str, this.clickObjectName, this.position, (String) null, 64, (i) null);
    }

    public final AnalyticsData copyWithModifiedScreenName(String str) {
        p.j(str, "screenName");
        return new AnalyticsData(str, this.value, this.context, this.impressionObjectName, this.clickObjectName, this.position, (String) null, 64, (i) null);
    }

    public final AnalyticsData copyWithModifiedValue(String str) {
        p.j(str, "value");
        return new AnalyticsData(this.screenName, str, this.context, this.impressionObjectName, this.clickObjectName, this.position, (String) null, 64, (i) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsData)) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) obj;
        return p.e(this.screenName, analyticsData.screenName) && p.e(this.value, analyticsData.value) && p.e(this.context, analyticsData.context) && p.e(this.impressionObjectName, analyticsData.impressionObjectName) && p.e(this.clickObjectName, analyticsData.clickObjectName) && p.e(this.position, analyticsData.position) && p.e(this.attributionContext, analyticsData.attributionContext);
    }

    public final String getAttributionContext() {
        return this.attributionContext;
    }

    public final String getClickObjectName() {
        return this.clickObjectName;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getImpressionObjectName() {
        return this.impressionObjectName;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.screenName.hashCode() * 31;
        String str = this.value;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.context;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.impressionObjectName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickObjectName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.position;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.attributionContext;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return hashCode6 + i11;
    }

    public final void setAttributionContext(String str) {
        this.attributionContext = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public String toString() {
        return "AnalyticsData(screenName=" + this.screenName + ", value=" + this.value + ", context=" + this.context + ", impressionObjectName=" + this.impressionObjectName + ", clickObjectName=" + this.clickObjectName + ", position=" + this.position + ", attributionContext=" + this.attributionContext + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnalyticsData(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.String r14, int r15, kotlin.jvm.internal.i r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r1
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
