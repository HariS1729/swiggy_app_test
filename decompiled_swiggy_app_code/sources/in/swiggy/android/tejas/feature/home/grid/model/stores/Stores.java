package in.swiggy.android.tejas.feature.home.grid.model.stores;

import bs.a;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import kotlin.jvm.internal.p;

/* compiled from: Stores.kt */
public final class Stores {
    private final boolean active;
    private final String address;
    private final String description;
    private final DiscountInfo discountInfo;

    /* renamed from: id  reason: collision with root package name */
    private final String f20234id;
    private final String imageId;
    private final boolean isPartner;
    private final boolean isVerified;
    private final String latLong;
    private final String locality;
    private final String name;
    private final StoreOrderability orderability;
    private final String phoneNumbers;
    private final StoreDocument storeDocument;
    private final long storeId;

    public Stores(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, boolean z12, boolean z13, StoreDocument storeDocument2, StoreOrderability storeOrderability, DiscountInfo discountInfo2) {
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "name");
        p.j(str9, "address");
        p.j(str10, "phoneNumbers");
        p.j(str11, GooglePlace.LOCALITY);
        p.j(str12, "latLong");
        p.j(str13, "description");
        p.j(str14, "imageId");
        this.f20234id = str;
        this.storeId = j;
        this.name = str2;
        this.address = str9;
        this.phoneNumbers = str10;
        this.locality = str11;
        this.latLong = str12;
        this.description = str13;
        this.imageId = str14;
        this.isPartner = z11;
        this.active = z12;
        this.isVerified = z13;
        this.storeDocument = storeDocument2;
        this.orderability = storeOrderability;
        this.discountInfo = discountInfo2;
    }

    public static /* synthetic */ Stores copy$default(Stores stores, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, boolean z12, boolean z13, StoreDocument storeDocument2, StoreOrderability storeOrderability, DiscountInfo discountInfo2, int i11, Object obj) {
        Stores stores2 = stores;
        int i12 = i11;
        return stores.copy((i12 & 1) != 0 ? stores2.f20234id : str, (i12 & 2) != 0 ? stores2.storeId : j, (i12 & 4) != 0 ? stores2.name : str2, (i12 & 8) != 0 ? stores2.address : str3, (i12 & 16) != 0 ? stores2.phoneNumbers : str4, (i12 & 32) != 0 ? stores2.locality : str5, (i12 & 64) != 0 ? stores2.latLong : str6, (i12 & 128) != 0 ? stores2.description : str7, (i12 & 256) != 0 ? stores2.imageId : str8, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? stores2.isPartner : z11, (i12 & 1024) != 0 ? stores2.active : z12, (i12 & 2048) != 0 ? stores2.isVerified : z13, (i12 & 4096) != 0 ? stores2.storeDocument : storeDocument2, (i12 & 8192) != 0 ? stores2.orderability : storeOrderability, (i12 & 16384) != 0 ? stores2.discountInfo : discountInfo2);
    }

    public final String component1() {
        return this.f20234id;
    }

    public final boolean component10() {
        return this.isPartner;
    }

    public final boolean component11() {
        return this.active;
    }

    public final boolean component12() {
        return this.isVerified;
    }

    public final StoreDocument component13() {
        return this.storeDocument;
    }

    public final StoreOrderability component14() {
        return this.orderability;
    }

    public final DiscountInfo component15() {
        return this.discountInfo;
    }

    public final long component2() {
        return this.storeId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.phoneNumbers;
    }

    public final String component6() {
        return this.locality;
    }

    public final String component7() {
        return this.latLong;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.imageId;
    }

    public final Stores copy(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, boolean z12, boolean z13, StoreDocument storeDocument2, StoreOrderability storeOrderability, DiscountInfo discountInfo2) {
        String str9 = str;
        p.j(str9, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "name");
        p.j(str3, "address");
        p.j(str4, "phoneNumbers");
        p.j(str5, GooglePlace.LOCALITY);
        p.j(str6, "latLong");
        p.j(str7, "description");
        p.j(str8, "imageId");
        return new Stores(str9, j, str2, str3, str4, str5, str6, str7, str8, z11, z12, z13, storeDocument2, storeOrderability, discountInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stores)) {
            return false;
        }
        Stores stores = (Stores) obj;
        return p.e(this.f20234id, stores.f20234id) && this.storeId == stores.storeId && p.e(this.name, stores.name) && p.e(this.address, stores.address) && p.e(this.phoneNumbers, stores.phoneNumbers) && p.e(this.locality, stores.locality) && p.e(this.latLong, stores.latLong) && p.e(this.description, stores.description) && p.e(this.imageId, stores.imageId) && this.isPartner == stores.isPartner && this.active == stores.active && this.isVerified == stores.isVerified && p.e(this.storeDocument, stores.storeDocument) && p.e(this.orderability, stores.orderability) && p.e(this.discountInfo, stores.discountInfo);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DiscountInfo getDiscountInfo() {
        return this.discountInfo;
    }

    public final String getId() {
        return this.f20234id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getLatLong() {
        return this.latLong;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getName() {
        return this.name;
    }

    public final StoreOrderability getOrderability() {
        return this.orderability;
    }

    public final String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public final StoreDocument getStoreDocument() {
        return this.storeDocument;
    }

    public final long getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f20234id.hashCode() * 31) + a.a(this.storeId)) * 31) + this.name.hashCode()) * 31) + this.address.hashCode()) * 31) + this.phoneNumbers.hashCode()) * 31) + this.locality.hashCode()) * 31) + this.latLong.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageId.hashCode()) * 31;
        boolean z11 = this.isPartner;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        boolean z13 = this.active;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.isVerified;
        if (!z14) {
            z12 = z14;
        }
        int i13 = (i12 + (z12 ? 1 : 0)) * 31;
        StoreDocument storeDocument2 = this.storeDocument;
        int i14 = 0;
        int hashCode2 = (i13 + (storeDocument2 == null ? 0 : storeDocument2.hashCode())) * 31;
        StoreOrderability storeOrderability = this.orderability;
        int hashCode3 = (hashCode2 + (storeOrderability == null ? 0 : storeOrderability.hashCode())) * 31;
        DiscountInfo discountInfo2 = this.discountInfo;
        if (discountInfo2 != null) {
            i14 = discountInfo2.hashCode();
        }
        return hashCode3 + i14;
    }

    public final boolean isPartner() {
        return this.isPartner;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        return "Stores(id=" + this.f20234id + ", storeId=" + this.storeId + ", name=" + this.name + ", address=" + this.address + ", phoneNumbers=" + this.phoneNumbers + ", locality=" + this.locality + ", latLong=" + this.latLong + ", description=" + this.description + ", imageId=" + this.imageId + ", isPartner=" + this.isPartner + ", active=" + this.active + ", isVerified=" + this.isVerified + ", storeDocument=" + this.storeDocument + ", orderability=" + this.orderability + ", discountInfo=" + this.discountInfo + ')';
    }
}
