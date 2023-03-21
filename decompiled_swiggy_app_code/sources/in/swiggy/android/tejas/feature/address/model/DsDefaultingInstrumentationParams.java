package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DsDefaultingInstrumentationParams.kt */
public final class DsDefaultingInstrumentationParams {
    @SerializedName("Trace_id")
    private String TraceId;
    @SerializedName("address_after_n_percentile")
    private Integer addressAfterNPercentile;
    @SerializedName("final_address_list")
    private ArrayList<DsAddressModel> finalAddressList;
    @SerializedName("final_proximity_score")
    private Double finalProximityScore;
    @SerializedName("final_sort_score")
    private Double finalSortScore;
    @SerializedName("is_cache_response_used")
    private Boolean isCacheResponseUsed;
    @SerializedName("last_cache_sync_timestamp")
    private String lastCacheSyncTimestamp;
    @SerializedName("n_percentile_distance")
    private Double nPercentileDistance;
    @SerializedName("n_percentile_value")
    private Integer nPercentileValue;
    @SerializedName("proximity_weight")
    private Double proximityWeight;
    @SerializedName("total_address_before_n_percentile")
    private Integer totalAddressBeforeNPercentile;

    public DsDefaultingInstrumentationParams() {
        this((Double) null, (Integer) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (Double) null, (String) null, (Boolean) null, (String) null, (ArrayList) null, 2047, (i) null);
    }

    public DsDefaultingInstrumentationParams(Double d11, Integer num, Integer num2, Integer num3, Double d12, Double d13, Double d14, String str, Boolean bool, String str2, ArrayList<DsAddressModel> arrayList) {
        p.j(arrayList, "finalAddressList");
        this.nPercentileDistance = d11;
        this.totalAddressBeforeNPercentile = num;
        this.nPercentileValue = num2;
        this.addressAfterNPercentile = num3;
        this.proximityWeight = d12;
        this.finalProximityScore = d13;
        this.finalSortScore = d14;
        this.TraceId = str;
        this.isCacheResponseUsed = bool;
        this.lastCacheSyncTimestamp = str2;
        this.finalAddressList = arrayList;
    }

    public static /* synthetic */ DsDefaultingInstrumentationParams copy$default(DsDefaultingInstrumentationParams dsDefaultingInstrumentationParams, Double d11, Integer num, Integer num2, Integer num3, Double d12, Double d13, Double d14, String str, Boolean bool, String str2, ArrayList arrayList, int i11, Object obj) {
        DsDefaultingInstrumentationParams dsDefaultingInstrumentationParams2 = dsDefaultingInstrumentationParams;
        int i12 = i11;
        return dsDefaultingInstrumentationParams.copy((i12 & 1) != 0 ? dsDefaultingInstrumentationParams2.nPercentileDistance : d11, (i12 & 2) != 0 ? dsDefaultingInstrumentationParams2.totalAddressBeforeNPercentile : num, (i12 & 4) != 0 ? dsDefaultingInstrumentationParams2.nPercentileValue : num2, (i12 & 8) != 0 ? dsDefaultingInstrumentationParams2.addressAfterNPercentile : num3, (i12 & 16) != 0 ? dsDefaultingInstrumentationParams2.proximityWeight : d12, (i12 & 32) != 0 ? dsDefaultingInstrumentationParams2.finalProximityScore : d13, (i12 & 64) != 0 ? dsDefaultingInstrumentationParams2.finalSortScore : d14, (i12 & 128) != 0 ? dsDefaultingInstrumentationParams2.TraceId : str, (i12 & 256) != 0 ? dsDefaultingInstrumentationParams2.isCacheResponseUsed : bool, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? dsDefaultingInstrumentationParams2.lastCacheSyncTimestamp : str2, (i12 & 1024) != 0 ? dsDefaultingInstrumentationParams2.finalAddressList : arrayList);
    }

    public final Double component1() {
        return this.nPercentileDistance;
    }

    public final String component10() {
        return this.lastCacheSyncTimestamp;
    }

    public final ArrayList<DsAddressModel> component11() {
        return this.finalAddressList;
    }

    public final Integer component2() {
        return this.totalAddressBeforeNPercentile;
    }

    public final Integer component3() {
        return this.nPercentileValue;
    }

    public final Integer component4() {
        return this.addressAfterNPercentile;
    }

    public final Double component5() {
        return this.proximityWeight;
    }

    public final Double component6() {
        return this.finalProximityScore;
    }

    public final Double component7() {
        return this.finalSortScore;
    }

    public final String component8() {
        return this.TraceId;
    }

    public final Boolean component9() {
        return this.isCacheResponseUsed;
    }

    public final DsDefaultingInstrumentationParams copy(Double d11, Integer num, Integer num2, Integer num3, Double d12, Double d13, Double d14, String str, Boolean bool, String str2, ArrayList<DsAddressModel> arrayList) {
        ArrayList<DsAddressModel> arrayList2 = arrayList;
        p.j(arrayList2, "finalAddressList");
        return new DsDefaultingInstrumentationParams(d11, num, num2, num3, d12, d13, d14, str, bool, str2, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DsDefaultingInstrumentationParams)) {
            return false;
        }
        DsDefaultingInstrumentationParams dsDefaultingInstrumentationParams = (DsDefaultingInstrumentationParams) obj;
        return p.e(this.nPercentileDistance, dsDefaultingInstrumentationParams.nPercentileDistance) && p.e(this.totalAddressBeforeNPercentile, dsDefaultingInstrumentationParams.totalAddressBeforeNPercentile) && p.e(this.nPercentileValue, dsDefaultingInstrumentationParams.nPercentileValue) && p.e(this.addressAfterNPercentile, dsDefaultingInstrumentationParams.addressAfterNPercentile) && p.e(this.proximityWeight, dsDefaultingInstrumentationParams.proximityWeight) && p.e(this.finalProximityScore, dsDefaultingInstrumentationParams.finalProximityScore) && p.e(this.finalSortScore, dsDefaultingInstrumentationParams.finalSortScore) && p.e(this.TraceId, dsDefaultingInstrumentationParams.TraceId) && p.e(this.isCacheResponseUsed, dsDefaultingInstrumentationParams.isCacheResponseUsed) && p.e(this.lastCacheSyncTimestamp, dsDefaultingInstrumentationParams.lastCacheSyncTimestamp) && p.e(this.finalAddressList, dsDefaultingInstrumentationParams.finalAddressList);
    }

    public final Integer getAddressAfterNPercentile() {
        return this.addressAfterNPercentile;
    }

    public final ArrayList<DsAddressModel> getFinalAddressList() {
        return this.finalAddressList;
    }

    public final Double getFinalProximityScore() {
        return this.finalProximityScore;
    }

    public final Double getFinalSortScore() {
        return this.finalSortScore;
    }

    public final String getLastCacheSyncTimestamp() {
        return this.lastCacheSyncTimestamp;
    }

    public final Double getNPercentileDistance() {
        return this.nPercentileDistance;
    }

    public final Integer getNPercentileValue() {
        return this.nPercentileValue;
    }

    public final Double getProximityWeight() {
        return this.proximityWeight;
    }

    public final Integer getTotalAddressBeforeNPercentile() {
        return this.totalAddressBeforeNPercentile;
    }

    public final String getTraceId() {
        return this.TraceId;
    }

    public int hashCode() {
        Double d11 = this.nPercentileDistance;
        int i11 = 0;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Integer num = this.totalAddressBeforeNPercentile;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nPercentileValue;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.addressAfterNPercentile;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d12 = this.proximityWeight;
        int hashCode5 = (hashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.finalProximityScore;
        int hashCode6 = (hashCode5 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.finalSortScore;
        int hashCode7 = (hashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.TraceId;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCacheResponseUsed;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.lastCacheSyncTimestamp;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode9 + i11) * 31) + this.finalAddressList.hashCode();
    }

    public final Boolean isCacheResponseUsed() {
        return this.isCacheResponseUsed;
    }

    public final void setAddressAfterNPercentile(Integer num) {
        this.addressAfterNPercentile = num;
    }

    public final void setCacheResponseUsed(Boolean bool) {
        this.isCacheResponseUsed = bool;
    }

    public final void setFinalAddressList(ArrayList<DsAddressModel> arrayList) {
        p.j(arrayList, "<set-?>");
        this.finalAddressList = arrayList;
    }

    public final void setFinalProximityScore(Double d11) {
        this.finalProximityScore = d11;
    }

    public final void setFinalSortScore(Double d11) {
        this.finalSortScore = d11;
    }

    public final void setLastCacheSyncTimestamp(String str) {
        this.lastCacheSyncTimestamp = str;
    }

    public final void setNPercentileDistance(Double d11) {
        this.nPercentileDistance = d11;
    }

    public final void setNPercentileValue(Integer num) {
        this.nPercentileValue = num;
    }

    public final void setProximityWeight(Double d11) {
        this.proximityWeight = d11;
    }

    public final void setTotalAddressBeforeNPercentile(Integer num) {
        this.totalAddressBeforeNPercentile = num;
    }

    public final void setTraceId(String str) {
        this.TraceId = str;
    }

    public String toString() {
        return "DsDefaultingInstrumentationParams(nPercentileDistance=" + this.nPercentileDistance + ", totalAddressBeforeNPercentile=" + this.totalAddressBeforeNPercentile + ", nPercentileValue=" + this.nPercentileValue + ", addressAfterNPercentile=" + this.addressAfterNPercentile + ", proximityWeight=" + this.proximityWeight + ", finalProximityScore=" + this.finalProximityScore + ", finalSortScore=" + this.finalSortScore + ", TraceId=" + this.TraceId + ", isCacheResponseUsed=" + this.isCacheResponseUsed + ", lastCacheSyncTimestamp=" + this.lastCacheSyncTimestamp + ", finalAddressList=" + this.finalAddressList + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DsDefaultingInstrumentationParams(java.lang.Double r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.Double r16, java.lang.Double r17, java.lang.Double r18, java.lang.String r19, java.lang.Boolean r20, java.lang.String r21, java.util.ArrayList r22, int r23, kotlin.jvm.internal.i r24) {
        /*
            r11 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            if (r1 == 0) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r12
        L_0x000f:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0019
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L_0x001a
        L_0x0019:
            r3 = r13
        L_0x001a:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0023
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L_0x0024
        L_0x0023:
            r5 = r14
        L_0x0024:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x002d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x002e
        L_0x002d:
            r4 = r15
        L_0x002e:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0034
            r6 = r2
            goto L_0x0036
        L_0x0034:
            r6 = r16
        L_0x0036:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003c
            r7 = r2
            goto L_0x003e
        L_0x003c:
            r7 = r17
        L_0x003e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r18
        L_0x0045:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x004c
            java.lang.String r8 = ""
            goto L_0x004e
        L_0x004c:
            r8 = r19
        L_0x004e:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0055
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            goto L_0x0057
        L_0x0055:
            r9 = r20
        L_0x0057:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x005d
            r10 = 0
            goto L_0x005f
        L_0x005d:
            r10 = r21
        L_0x005f:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0069
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x006b
        L_0x0069:
            r0 = r22
        L_0x006b:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r5
            r16 = r4
            r17 = r6
            r18 = r7
            r19 = r2
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.address.model.DsDefaultingInstrumentationParams.<init>(java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.i):void");
    }
}
