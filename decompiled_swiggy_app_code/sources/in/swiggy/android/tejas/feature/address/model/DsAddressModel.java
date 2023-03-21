package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DsDefaultingInstrumentationParams.kt */
public final class DsAddressModel {
    @SerializedName("Sort_score")
    private Double SortScore;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private String f20213id;
    @SerializedName("order-share-weighted-sum")
    private Double orderShareWeightedSum;
    @SerializedName("proximity_score")
    private Double proximityScore;

    public DsAddressModel() {
        this((String) null, (Double) null, (Double) null, (Double) null, 15, (i) null);
    }

    public DsAddressModel(String str, Double d11, Double d12, Double d13) {
        this.f20213id = str;
        this.orderShareWeightedSum = d11;
        this.proximityScore = d12;
        this.SortScore = d13;
    }

    public static /* synthetic */ DsAddressModel copy$default(DsAddressModel dsAddressModel, String str, Double d11, Double d12, Double d13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dsAddressModel.f20213id;
        }
        if ((i11 & 2) != 0) {
            d11 = dsAddressModel.orderShareWeightedSum;
        }
        if ((i11 & 4) != 0) {
            d12 = dsAddressModel.proximityScore;
        }
        if ((i11 & 8) != 0) {
            d13 = dsAddressModel.SortScore;
        }
        return dsAddressModel.copy(str, d11, d12, d13);
    }

    public final String component1() {
        return this.f20213id;
    }

    public final Double component2() {
        return this.orderShareWeightedSum;
    }

    public final Double component3() {
        return this.proximityScore;
    }

    public final Double component4() {
        return this.SortScore;
    }

    public final DsAddressModel copy(String str, Double d11, Double d12, Double d13) {
        return new DsAddressModel(str, d11, d12, d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DsAddressModel)) {
            return false;
        }
        DsAddressModel dsAddressModel = (DsAddressModel) obj;
        return p.e(this.f20213id, dsAddressModel.f20213id) && p.e(this.orderShareWeightedSum, dsAddressModel.orderShareWeightedSum) && p.e(this.proximityScore, dsAddressModel.proximityScore) && p.e(this.SortScore, dsAddressModel.SortScore);
    }

    public final String getId() {
        return this.f20213id;
    }

    public final Double getOrderShareWeightedSum() {
        return this.orderShareWeightedSum;
    }

    public final Double getProximityScore() {
        return this.proximityScore;
    }

    public final Double getSortScore() {
        return this.SortScore;
    }

    public int hashCode() {
        String str = this.f20213id;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.orderShareWeightedSum;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.proximityScore;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.SortScore;
        if (d13 != null) {
            i11 = d13.hashCode();
        }
        return hashCode3 + i11;
    }

    public final void setId(String str) {
        this.f20213id = str;
    }

    public final void setOrderShareWeightedSum(Double d11) {
        this.orderShareWeightedSum = d11;
    }

    public final void setProximityScore(Double d11) {
        this.proximityScore = d11;
    }

    public final void setSortScore(Double d11) {
        this.SortScore = d11;
    }

    public String toString() {
        return "DsAddressModel(id=" + this.f20213id + ", orderShareWeightedSum=" + this.orderShareWeightedSum + ", proximityScore=" + this.proximityScore + ", SortScore=" + this.SortScore + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DsAddressModel(String str, Double d11, Double d12, Double d13, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? Double.valueOf(0.0d) : d11, (i11 & 4) != 0 ? Double.valueOf(0.0d) : d12, (i11 & 8) != 0 ? Double.valueOf(0.0d) : d13);
    }
}
