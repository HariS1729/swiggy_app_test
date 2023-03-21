package in.swiggy.android.tejas.feature.launch.model.consumable;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Disposition.kt */
public final class Disposition implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR((i) null);

    /* renamed from: id  reason: collision with root package name */
    private final int f20260id;
    private final int[] possibleRatings;
    private final String value;

    /* compiled from: Disposition.kt */
    public static final class CREATOR implements Parcelable.Creator<Disposition> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(i iVar) {
            this();
        }

        public Disposition createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new Disposition(parcel);
        }

        public Disposition[] newArray(int i11) {
            return new Disposition[i11];
        }
    }

    public Disposition(int i11, String str, int[] iArr) {
        p.j(str, "value");
        p.j(iArr, "possibleRatings");
        this.f20260id = i11;
        this.value = str;
        this.possibleRatings = iArr;
    }

    public static /* synthetic */ Disposition copy$default(Disposition disposition, int i11, String str, int[] iArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = disposition.f20260id;
        }
        if ((i12 & 2) != 0) {
            str = disposition.value;
        }
        if ((i12 & 4) != 0) {
            iArr = disposition.possibleRatings;
        }
        return disposition.copy(i11, str, iArr);
    }

    public final int component1() {
        return this.f20260id;
    }

    public final String component2() {
        return this.value;
    }

    public final int[] component3() {
        return this.possibleRatings;
    }

    public final Disposition copy(int i11, String str, int[] iArr) {
        p.j(str, "value");
        p.j(iArr, "possibleRatings");
        return new Disposition(i11, str, iArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(Disposition.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.launch.model.consumable.Disposition");
        Disposition disposition = (Disposition) obj;
        return this.f20260id == disposition.f20260id && p.e(this.value, disposition.value) && Arrays.equals(this.possibleRatings, disposition.possibleRatings);
    }

    public final int getId() {
        return this.f20260id;
    }

    public final int[] getPossibleRatings() {
        return this.possibleRatings;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.f20260id * 31) + this.value.hashCode()) * 31) + Arrays.hashCode(this.possibleRatings);
    }

    public String toString() {
        return "Disposition(id=" + this.f20260id + ", value=" + this.value + ", possibleRatings=" + Arrays.toString(this.possibleRatings) + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "parcel");
        parcel.writeInt(this.f20260id);
        parcel.writeString(this.value);
        parcel.writeIntArray(this.possibleRatings);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Disposition(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.p.j(r4, r0)
            int r0 = r4.readInt()
            java.lang.String r1 = r4.readString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int[] r4 = r4.createIntArray()
            if (r4 != 0) goto L_0x001e
            r4 = 0
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            int[] r4 = kotlin.collections.ArraysKt___ArraysKt.f0(r4)
        L_0x001e:
            java.lang.String r2 = "parcel.createIntArray() …Array<Int>().toIntArray()"
            kotlin.jvm.internal.p.i(r4, r2)
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.model.consumable.Disposition.<init>(android.os.Parcel):void");
    }
}
