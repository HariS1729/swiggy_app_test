package in.swiggy.android.tejas.feature.genericImage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GenericImageDialogInfoData.kt */
public final class GenericImageDialogInfoData implements Parcelable {
    public static final Parcelable.Creator<GenericImageDialogInfoData> CREATOR = new Creator();
    @SerializedName("animate")
    private boolean animate;
    @SerializedName("icon")
    private String icon;
    @SerializedName("text")
    private String text;
    @SerializedName("pivotPosition")
    private Integer yPosition;

    /* compiled from: GenericImageDialogInfoData.kt */
    public static final class Creator implements Parcelable.Creator<GenericImageDialogInfoData> {
        public final GenericImageDialogInfoData createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new GenericImageDialogInfoData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final GenericImageDialogInfoData[] newArray(int i11) {
            return new GenericImageDialogInfoData[i11];
        }
    }

    public GenericImageDialogInfoData(String str, String str2, boolean z11, Integer num) {
        this.text = str;
        this.icon = str2;
        this.animate = z11;
        this.yPosition = num;
    }

    public static /* synthetic */ GenericImageDialogInfoData copy$default(GenericImageDialogInfoData genericImageDialogInfoData, String str, String str2, boolean z11, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = genericImageDialogInfoData.text;
        }
        if ((i11 & 2) != 0) {
            str2 = genericImageDialogInfoData.icon;
        }
        if ((i11 & 4) != 0) {
            z11 = genericImageDialogInfoData.animate;
        }
        if ((i11 & 8) != 0) {
            num = genericImageDialogInfoData.yPosition;
        }
        return genericImageDialogInfoData.copy(str, str2, z11, num);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.icon;
    }

    public final boolean component3() {
        return this.animate;
    }

    public final Integer component4() {
        return this.yPosition;
    }

    public final GenericImageDialogInfoData copy(String str, String str2, boolean z11, Integer num) {
        return new GenericImageDialogInfoData(str, str2, z11, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericImageDialogInfoData)) {
            return false;
        }
        GenericImageDialogInfoData genericImageDialogInfoData = (GenericImageDialogInfoData) obj;
        return p.e(this.text, genericImageDialogInfoData.text) && p.e(this.icon, genericImageDialogInfoData.icon) && this.animate == genericImageDialogInfoData.animate && p.e(this.yPosition, genericImageDialogInfoData.yPosition);
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getYPosition() {
        return this.yPosition;
    }

    public int hashCode() {
        String str = this.text;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z11 = this.animate;
        if (z11) {
            z11 = true;
        }
        int i12 = (hashCode2 + (z11 ? 1 : 0)) * 31;
        Integer num = this.yPosition;
        if (num != null) {
            i11 = num.hashCode();
        }
        return i12 + i11;
    }

    public final void setAnimate(boolean z11) {
        this.animate = z11;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setYPosition(Integer num) {
        this.yPosition = num;
    }

    public String toString() {
        return "GenericImageDialogInfoData(text=" + this.text + ", icon=" + this.icon + ", animate=" + this.animate + ", yPosition=" + this.yPosition + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        p.j(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.icon);
        parcel.writeInt(this.animate ? 1 : 0);
        Integer num = this.yPosition;
        if (num == null) {
            i12 = 0;
        } else {
            parcel.writeInt(1);
            i12 = num.intValue();
        }
        parcel.writeInt(i12);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GenericImageDialogInfoData(String str, String str2, boolean z11, Integer num, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, z11, num);
    }
}
