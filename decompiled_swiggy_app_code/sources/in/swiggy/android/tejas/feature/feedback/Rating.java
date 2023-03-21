package in.swiggy.android.tejas.feature.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Rating.kt */
public final class Rating implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR((i) null);
    @SerializedName("disposition_ids")
    private int[] dispositionIds;
    @SerializedName("rating")
    private Integer rating;
    @SerializedName("type")
    private String type;
    @SerializedName("type_id")
    private Integer typeId;

    /* compiled from: Rating.kt */
    public static final class CREATOR implements Parcelable.Creator<Rating> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(i iVar) {
            this();
        }

        public Rating createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new Rating(parcel);
        }

        public Rating[] newArray(int i11) {
            return new Rating[i11];
        }
    }

    public Rating() {
        this((Integer) null, (String) null, (Integer) null, (int[]) null, 15, (i) null);
    }

    public Rating(Integer num, String str, Integer num2, int[] iArr) {
        this.typeId = num;
        this.type = str;
        this.rating = num2;
        this.dispositionIds = iArr;
    }

    public static /* synthetic */ Rating copy$default(Rating rating2, Integer num, String str, Integer num2, int[] iArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = rating2.typeId;
        }
        if ((i11 & 2) != 0) {
            str = rating2.type;
        }
        if ((i11 & 4) != 0) {
            num2 = rating2.rating;
        }
        if ((i11 & 8) != 0) {
            iArr = rating2.dispositionIds;
        }
        return rating2.copy(num, str, num2, iArr);
    }

    public final Integer component1() {
        return this.typeId;
    }

    public final String component2() {
        return this.type;
    }

    public final Integer component3() {
        return this.rating;
    }

    public final int[] component4() {
        return this.dispositionIds;
    }

    public final Rating copy(Integer num, String str, Integer num2, int[] iArr) {
        return new Rating(num, str, num2, iArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating2 = (Rating) obj;
        return p.e(this.typeId, rating2.typeId) && p.e(this.type, rating2.type) && p.e(this.rating, rating2.rating) && p.e(this.dispositionIds, rating2.dispositionIds);
    }

    public final int[] getDispositionIds() {
        return this.dispositionIds;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        Integer num = this.typeId;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.rating;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        int[] iArr = this.dispositionIds;
        if (iArr != null) {
            i11 = Arrays.hashCode(iArr);
        }
        return hashCode3 + i11;
    }

    public final void setDispositionIds(int[] iArr) {
        this.dispositionIds = iArr;
    }

    public final void setRating(Integer num) {
        this.rating = num;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setTypeId(Integer num) {
        this.typeId = num;
    }

    public String toString() {
        return "Rating(typeId=" + this.typeId + ", type=" + this.type + ", rating=" + this.rating + ", dispositionIds=" + Arrays.toString(this.dispositionIds) + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "parcel");
        parcel.writeValue(this.typeId);
        parcel.writeString(this.type);
        parcel.writeValue(this.rating);
        parcel.writeIntArray(this.dispositionIds);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rating(Integer num, String str, Integer num2, int[] iArr, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : iArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rating(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.p.j(r6, r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r6.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L_0x0017
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            java.lang.String r2 = r6.readString()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r6.readValue(r0)
            boolean r4 = r0 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x002b
            r3 = r0
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x002b:
            int[] r6 = r6.createIntArray()
            r5.<init>(r1, r2, r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.feedback.Rating.<init>(android.os.Parcel):void");
    }
}
