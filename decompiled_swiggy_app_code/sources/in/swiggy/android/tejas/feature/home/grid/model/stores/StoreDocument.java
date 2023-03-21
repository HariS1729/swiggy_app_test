package in.swiggy.android.tejas.feature.home.grid.model.stores;

import kotlin.jvm.internal.p;

/* compiled from: StoreDocument.kt */
public final class StoreDocument {
    private final String drugLicenseNumber;
    private final String fssaiLicenseNumber;
    private final String gstin;

    public StoreDocument(String str, String str2, String str3) {
        p.j(str, "fssaiLicenseNumber");
        p.j(str2, "drugLicenseNumber");
        p.j(str3, "gstin");
        this.fssaiLicenseNumber = str;
        this.drugLicenseNumber = str2;
        this.gstin = str3;
    }

    public static /* synthetic */ StoreDocument copy$default(StoreDocument storeDocument, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storeDocument.fssaiLicenseNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = storeDocument.drugLicenseNumber;
        }
        if ((i11 & 4) != 0) {
            str3 = storeDocument.gstin;
        }
        return storeDocument.copy(str, str2, str3);
    }

    public final String component1() {
        return this.fssaiLicenseNumber;
    }

    public final String component2() {
        return this.drugLicenseNumber;
    }

    public final String component3() {
        return this.gstin;
    }

    public final StoreDocument copy(String str, String str2, String str3) {
        p.j(str, "fssaiLicenseNumber");
        p.j(str2, "drugLicenseNumber");
        p.j(str3, "gstin");
        return new StoreDocument(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreDocument)) {
            return false;
        }
        StoreDocument storeDocument = (StoreDocument) obj;
        return p.e(this.fssaiLicenseNumber, storeDocument.fssaiLicenseNumber) && p.e(this.drugLicenseNumber, storeDocument.drugLicenseNumber) && p.e(this.gstin, storeDocument.gstin);
    }

    public final String getDrugLicenseNumber() {
        return this.drugLicenseNumber;
    }

    public final String getFssaiLicenseNumber() {
        return this.fssaiLicenseNumber;
    }

    public final String getGstin() {
        return this.gstin;
    }

    public int hashCode() {
        return (((this.fssaiLicenseNumber.hashCode() * 31) + this.drugLicenseNumber.hashCode()) * 31) + this.gstin.hashCode();
    }

    public String toString() {
        return "StoreDocument(fssaiLicenseNumber=" + this.fssaiLicenseNumber + ", drugLicenseNumber=" + this.drugLicenseNumber + ", gstin=" + this.gstin + ')';
    }
}
