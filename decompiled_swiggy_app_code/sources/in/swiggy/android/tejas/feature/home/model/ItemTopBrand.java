package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.p;

/* compiled from: ItemTopBrand.kt */
public final class ItemTopBrand {
    private final String adTrackingId;
    private final CTA cta;
    private final String entityId;
    private final String entityType;

    /* renamed from: id  reason: collision with root package name */
    private final String f20244id;
    private final String imageId;
    private final String sla;
    private final String title;

    public ItemTopBrand(String str, String str2, String str3, String str4, CTA cta2, String str5, String str6, String str7) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "sla");
        p.j(str4, "imageId");
        p.j(cta2, "cta");
        p.j(str5, "adTrackingId");
        p.j(str6, "entityType");
        p.j(str7, "entityId");
        this.f20244id = str;
        this.title = str2;
        this.sla = str3;
        this.imageId = str4;
        this.cta = cta2;
        this.adTrackingId = str5;
        this.entityType = str6;
        this.entityId = str7;
    }

    public static /* synthetic */ ItemTopBrand copy$default(ItemTopBrand itemTopBrand, String str, String str2, String str3, String str4, CTA cta2, String str5, String str6, String str7, int i11, Object obj) {
        ItemTopBrand itemTopBrand2 = itemTopBrand;
        int i12 = i11;
        return itemTopBrand.copy((i12 & 1) != 0 ? itemTopBrand2.f20244id : str, (i12 & 2) != 0 ? itemTopBrand2.title : str2, (i12 & 4) != 0 ? itemTopBrand2.sla : str3, (i12 & 8) != 0 ? itemTopBrand2.imageId : str4, (i12 & 16) != 0 ? itemTopBrand2.cta : cta2, (i12 & 32) != 0 ? itemTopBrand2.adTrackingId : str5, (i12 & 64) != 0 ? itemTopBrand2.entityType : str6, (i12 & 128) != 0 ? itemTopBrand2.entityId : str7);
    }

    public final String component1() {
        return this.f20244id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.sla;
    }

    public final String component4() {
        return this.imageId;
    }

    public final CTA component5() {
        return this.cta;
    }

    public final String component6() {
        return this.adTrackingId;
    }

    public final String component7() {
        return this.entityType;
    }

    public final String component8() {
        return this.entityId;
    }

    public final ItemTopBrand copy(String str, String str2, String str3, String str4, CTA cta2, String str5, String str6, String str7) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "sla");
        p.j(str4, "imageId");
        p.j(cta2, "cta");
        String str8 = str5;
        p.j(str8, "adTrackingId");
        String str9 = str6;
        p.j(str9, "entityType");
        String str10 = str7;
        p.j(str10, "entityId");
        return new ItemTopBrand(str, str2, str3, str4, cta2, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemTopBrand)) {
            return false;
        }
        ItemTopBrand itemTopBrand = (ItemTopBrand) obj;
        return p.e(this.f20244id, itemTopBrand.f20244id) && p.e(this.title, itemTopBrand.title) && p.e(this.sla, itemTopBrand.sla) && p.e(this.imageId, itemTopBrand.imageId) && p.e(this.cta, itemTopBrand.cta) && p.e(this.adTrackingId, itemTopBrand.adTrackingId) && p.e(this.entityType, itemTopBrand.entityType) && p.e(this.entityId, itemTopBrand.entityId);
    }

    public final String getAdTrackingId() {
        return this.adTrackingId;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final String getId() {
        return this.f20244id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getSla() {
        return this.sla;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((this.f20244id.hashCode() * 31) + this.title.hashCode()) * 31) + this.sla.hashCode()) * 31) + this.imageId.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.adTrackingId.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.entityId.hashCode();
    }

    public String toString() {
        return "ItemTopBrand(id=" + this.f20244id + ", title=" + this.title + ", sla=" + this.sla + ", imageId=" + this.imageId + ", cta=" + this.cta + ", adTrackingId=" + this.adTrackingId + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ')';
    }
}
