package in.swiggy.android.tejas.feature.launch.model.network;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Disposition.kt */
public final class Disposition {
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f20261id;
    @SerializedName("possible_ratings")
    private int[] possibleRatings;
    @SerializedName("value")
    private String value;

    public Disposition() {
        this((Integer) null, (String) null, (int[]) null, 7, (i) null);
    }

    public Disposition(Integer num, String str, int[] iArr) {
        this.f20261id = num;
        this.value = str;
        this.possibleRatings = iArr;
    }

    public static /* synthetic */ Disposition copy$default(Disposition disposition, Integer num, String str, int[] iArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = disposition.f20261id;
        }
        if ((i11 & 2) != 0) {
            str = disposition.value;
        }
        if ((i11 & 4) != 0) {
            iArr = disposition.possibleRatings;
        }
        return disposition.copy(num, str, iArr);
    }

    public final Integer component1() {
        return this.f20261id;
    }

    public final String component2() {
        return this.value;
    }

    public final int[] component3() {
        return this.possibleRatings;
    }

    public final Disposition copy(Integer num, String str, int[] iArr) {
        return new Disposition(num, str, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Disposition)) {
            return false;
        }
        Disposition disposition = (Disposition) obj;
        return p.e(this.f20261id, disposition.f20261id) && p.e(this.value, disposition.value) && p.e(this.possibleRatings, disposition.possibleRatings);
    }

    public final Integer getId() {
        return this.f20261id;
    }

    public final int[] getPossibleRatings() {
        return this.possibleRatings;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.f20261id;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        int[] iArr = this.possibleRatings;
        if (iArr != null) {
            i11 = Arrays.hashCode(iArr);
        }
        return hashCode2 + i11;
    }

    public final void setId(Integer num) {
        this.f20261id = num;
    }

    public final void setPossibleRatings(int[] iArr) {
        this.possibleRatings = iArr;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "Disposition(id=" + this.f20261id + ", value=" + this.value + ", possibleRatings=" + Arrays.toString(this.possibleRatings) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Disposition(Integer num, String str, int[] iArr, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : iArr);
    }
}
