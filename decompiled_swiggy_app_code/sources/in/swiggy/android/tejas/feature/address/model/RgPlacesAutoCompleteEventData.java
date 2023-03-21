package in.swiggy.android.tejas.feature.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: RgPlacesAutoCompleteEventData.kt */
public final class RgPlacesAutoCompleteEventData implements Parcelable {
    public static final Parcelable.Creator<RgPlacesAutoCompleteEventData> CREATOR = new Creator();
    @SerializedName("address-uid")
    public String addressUid;
    @SerializedName("formatted-address")
    public String formattedAddress;
    @SerializedName("formatted-address-source")
    public String formattedAddressSource;
    @SerializedName("instance_id")
    public String instanceId;
    @SerializedName("page-source")
    public String pageSource;
    @SerializedName("pin-moved-by-user")
    public String pinMovedByUser;
    @SerializedName("search-string")
    public String searchString;

    /* compiled from: RgPlacesAutoCompleteEventData.kt */
    public static final class Creator implements Parcelable.Creator<RgPlacesAutoCompleteEventData> {
        public final RgPlacesAutoCompleteEventData createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new RgPlacesAutoCompleteEventData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final RgPlacesAutoCompleteEventData[] newArray(int i11) {
            return new RgPlacesAutoCompleteEventData[i11];
        }
    }

    public RgPlacesAutoCompleteEventData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (i) null);
    }

    public RgPlacesAutoCompleteEventData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.instanceId = str;
        this.searchString = str2;
        this.formattedAddress = str3;
        this.pinMovedByUser = str4;
        this.formattedAddressSource = str5;
        this.addressUid = str6;
        this.pageSource = str7;
    }

    public static /* synthetic */ RgPlacesAutoCompleteEventData copy$default(RgPlacesAutoCompleteEventData rgPlacesAutoCompleteEventData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rgPlacesAutoCompleteEventData.instanceId;
        }
        if ((i11 & 2) != 0) {
            str2 = rgPlacesAutoCompleteEventData.searchString;
        }
        String str8 = str2;
        if ((i11 & 4) != 0) {
            str3 = rgPlacesAutoCompleteEventData.formattedAddress;
        }
        String str9 = str3;
        if ((i11 & 8) != 0) {
            str4 = rgPlacesAutoCompleteEventData.pinMovedByUser;
        }
        String str10 = str4;
        if ((i11 & 16) != 0) {
            str5 = rgPlacesAutoCompleteEventData.formattedAddressSource;
        }
        String str11 = str5;
        if ((i11 & 32) != 0) {
            str6 = rgPlacesAutoCompleteEventData.addressUid;
        }
        String str12 = str6;
        if ((i11 & 64) != 0) {
            str7 = rgPlacesAutoCompleteEventData.pageSource;
        }
        return rgPlacesAutoCompleteEventData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.instanceId;
    }

    public final String component2() {
        return this.searchString;
    }

    public final String component3() {
        return this.formattedAddress;
    }

    public final String component4() {
        return this.pinMovedByUser;
    }

    public final String component5() {
        return this.formattedAddressSource;
    }

    public final String component6() {
        return this.addressUid;
    }

    public final String component7() {
        return this.pageSource;
    }

    public final RgPlacesAutoCompleteEventData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new RgPlacesAutoCompleteEventData(str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RgPlacesAutoCompleteEventData)) {
            return false;
        }
        RgPlacesAutoCompleteEventData rgPlacesAutoCompleteEventData = (RgPlacesAutoCompleteEventData) obj;
        return p.e(this.instanceId, rgPlacesAutoCompleteEventData.instanceId) && p.e(this.searchString, rgPlacesAutoCompleteEventData.searchString) && p.e(this.formattedAddress, rgPlacesAutoCompleteEventData.formattedAddress) && p.e(this.pinMovedByUser, rgPlacesAutoCompleteEventData.pinMovedByUser) && p.e(this.formattedAddressSource, rgPlacesAutoCompleteEventData.formattedAddressSource) && p.e(this.addressUid, rgPlacesAutoCompleteEventData.addressUid) && p.e(this.pageSource, rgPlacesAutoCompleteEventData.pageSource);
    }

    public int hashCode() {
        String str = this.instanceId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.searchString;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.formattedAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pinMovedByUser;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.formattedAddressSource;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressUid;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pageSource;
        if (str7 != null) {
            i11 = str7.hashCode();
        }
        return hashCode6 + i11;
    }

    public String toString() {
        return "RgPlacesAutoCompleteEventData(instanceId=" + this.instanceId + ", searchString=" + this.searchString + ", formattedAddress=" + this.formattedAddress + ", pinMovedByUser=" + this.pinMovedByUser + ", formattedAddressSource=" + this.formattedAddressSource + ", addressUid=" + this.addressUid + ", pageSource=" + this.pageSource + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.instanceId);
        parcel.writeString(this.searchString);
        parcel.writeString(this.formattedAddress);
        parcel.writeString(this.pinMovedByUser);
        parcel.writeString(this.formattedAddressSource);
        parcel.writeString(this.addressUid);
        parcel.writeString(this.pageSource);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RgPlacesAutoCompleteEventData(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x0010
            r2 = r1
            goto L_0x0011
        L_0x0010:
            r2 = r8
        L_0x0011:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            java.lang.String r10 = "false"
        L_0x001d:
            r3 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002b
            r5 = r0
            goto L_0x002c
        L_0x002b:
            r5 = r12
        L_0x002c:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0032
            r14 = r0
            goto L_0x0033
        L_0x0032:
            r14 = r13
        L_0x0033:
            r7 = r6
            r8 = r15
            r9 = r2
            r10 = r1
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.address.model.RgPlacesAutoCompleteEventData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
