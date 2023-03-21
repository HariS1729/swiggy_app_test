package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AddAddressData.kt */
public final class AddAddressData {
    @SerializedName("address_id")
    private String addressId;
    @SerializedName("delivery_valid")
    private boolean deliveryValid;
    @SerializedName("estimated_sla")
    private Integer estimatedSla;
    @SerializedName("estimated_sla_max")
    private Integer maxEstimatedSla;
    @SerializedName("estimated_sla_min")
    private Integer minEstimatedSla;
    @SerializedName("recalculation_required")
    private boolean recalculationRequired;

    public AddAddressData() {
        this((String) null, false, (Integer) null, (Integer) null, (Integer) null, false, 63, (i) null);
    }

    public AddAddressData(String str, boolean z11, Integer num, Integer num2, Integer num3, boolean z12) {
        this.addressId = str;
        this.deliveryValid = z11;
        this.estimatedSla = num;
        this.minEstimatedSla = num2;
        this.maxEstimatedSla = num3;
        this.recalculationRequired = z12;
    }

    public static /* synthetic */ AddAddressData copy$default(AddAddressData addAddressData, String str, boolean z11, Integer num, Integer num2, Integer num3, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addAddressData.addressId;
        }
        if ((i11 & 2) != 0) {
            z11 = addAddressData.deliveryValid;
        }
        boolean z13 = z11;
        if ((i11 & 4) != 0) {
            num = addAddressData.estimatedSla;
        }
        Integer num4 = num;
        if ((i11 & 8) != 0) {
            num2 = addAddressData.minEstimatedSla;
        }
        Integer num5 = num2;
        if ((i11 & 16) != 0) {
            num3 = addAddressData.maxEstimatedSla;
        }
        Integer num6 = num3;
        if ((i11 & 32) != 0) {
            z12 = addAddressData.recalculationRequired;
        }
        return addAddressData.copy(str, z13, num4, num5, num6, z12);
    }

    public final String component1() {
        return this.addressId;
    }

    public final boolean component2() {
        return this.deliveryValid;
    }

    public final Integer component3() {
        return this.estimatedSla;
    }

    public final Integer component4() {
        return this.minEstimatedSla;
    }

    public final Integer component5() {
        return this.maxEstimatedSla;
    }

    public final boolean component6() {
        return this.recalculationRequired;
    }

    public final AddAddressData copy(String str, boolean z11, Integer num, Integer num2, Integer num3, boolean z12) {
        return new AddAddressData(str, z11, num, num2, num3, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddAddressData)) {
            return false;
        }
        AddAddressData addAddressData = (AddAddressData) obj;
        return p.e(this.addressId, addAddressData.addressId) && this.deliveryValid == addAddressData.deliveryValid && p.e(this.estimatedSla, addAddressData.estimatedSla) && p.e(this.minEstimatedSla, addAddressData.minEstimatedSla) && p.e(this.maxEstimatedSla, addAddressData.maxEstimatedSla) && this.recalculationRequired == addAddressData.recalculationRequired;
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final boolean getDeliveryValid() {
        return this.deliveryValid;
    }

    public final Integer getEstimatedSla() {
        return this.estimatedSla;
    }

    public final Integer getMaxEstimatedSla() {
        return this.maxEstimatedSla;
    }

    public final Integer getMinEstimatedSla() {
        return this.minEstimatedSla;
    }

    public final boolean getRecalculationRequired() {
        return this.recalculationRequired;
    }

    public int hashCode() {
        String str = this.addressId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z11 = this.deliveryValid;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int i12 = (hashCode + (z11 ? 1 : 0)) * 31;
        Integer num = this.estimatedSla;
        int hashCode2 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minEstimatedSla;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxEstimatedSla;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        int i13 = (hashCode3 + i11) * 31;
        boolean z13 = this.recalculationRequired;
        if (!z13) {
            z12 = z13;
        }
        return i13 + (z12 ? 1 : 0);
    }

    public final void setAddressId(String str) {
        this.addressId = str;
    }

    public final void setDeliveryValid(boolean z11) {
        this.deliveryValid = z11;
    }

    public final void setEstimatedSla(Integer num) {
        this.estimatedSla = num;
    }

    public final void setMaxEstimatedSla(Integer num) {
        this.maxEstimatedSla = num;
    }

    public final void setMinEstimatedSla(Integer num) {
        this.minEstimatedSla = num;
    }

    public final void setRecalculationRequired(boolean z11) {
        this.recalculationRequired = z11;
    }

    public String toString() {
        return "AddAddressData(addressId=" + this.addressId + ", deliveryValid=" + this.deliveryValid + ", estimatedSla=" + this.estimatedSla + ", minEstimatedSla=" + this.minEstimatedSla + ", maxEstimatedSla=" + this.maxEstimatedSla + ", recalculationRequired=" + this.recalculationRequired + ')';
    }

    public final Address updateAddress(Address address) {
        p.j(address, "address");
        address.setId(this.addressId);
        address.setDeliveryValid(this.deliveryValid);
        address.setEstimatedSla(this.estimatedSla);
        address.setMinEstimatedSla(this.minEstimatedSla);
        address.setMaxEstimatedSla(this.maxEstimatedSla);
        address.setRecalculationRequired(this.recalculationRequired);
        return address;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AddAddressData(java.lang.String r5, boolean r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, boolean r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000f
            r6 = 0
            r1 = 0
            goto L_0x0010
        L_0x000f:
            r1 = r6
        L_0x0010:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r7
        L_0x0017:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r8
        L_0x001e:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r0 = r9
        L_0x0024:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002b
            r10 = 1
            r11 = 1
            goto L_0x002c
        L_0x002b:
            r11 = r10
        L_0x002c:
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.address.model.AddAddressData.<init>(java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, int, kotlin.jvm.internal.i):void");
    }
}
