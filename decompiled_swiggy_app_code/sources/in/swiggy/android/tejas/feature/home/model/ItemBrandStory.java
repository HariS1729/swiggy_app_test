package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.p;

/* compiled from: ItemBrandStory.kt */
public final class ItemBrandStory {
    private final String adTrackingId;
    private final String averageRating;
    private final String costForTwo;
    private final CTA cta;
    private final String description;
    private final String entityId;
    private final String entityType;

    /* renamed from: id  reason: collision with root package name */
    private final String f20242id;
    private final String imageId;
    private final String name;
    private final String sla;

    public ItemBrandStory(String str, String str2, String str3, String str4, String str5, String str6, String str7, CTA cta2, String str8, String str9, String str10) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "imageId");
        p.j(str3, "description");
        p.j(str4, "name");
        p.j(str5, "sla");
        p.j(str6, "costForTwo");
        p.j(str7, "averageRating");
        p.j(cta2, "cta");
        p.j(str8, "adTrackingId");
        p.j(str9, "entityType");
        p.j(str10, "entityId");
        this.f20242id = str;
        this.imageId = str2;
        this.description = str3;
        this.name = str4;
        this.sla = str5;
        this.costForTwo = str6;
        this.averageRating = str7;
        this.cta = cta2;
        this.adTrackingId = str8;
        this.entityType = str9;
        this.entityId = str10;
    }

    public static /* synthetic */ ItemBrandStory copy$default(ItemBrandStory itemBrandStory, String str, String str2, String str3, String str4, String str5, String str6, String str7, CTA cta2, String str8, String str9, String str10, int i11, Object obj) {
        ItemBrandStory itemBrandStory2 = itemBrandStory;
        int i12 = i11;
        return itemBrandStory.copy((i12 & 1) != 0 ? itemBrandStory2.f20242id : str, (i12 & 2) != 0 ? itemBrandStory2.imageId : str2, (i12 & 4) != 0 ? itemBrandStory2.description : str3, (i12 & 8) != 0 ? itemBrandStory2.name : str4, (i12 & 16) != 0 ? itemBrandStory2.sla : str5, (i12 & 32) != 0 ? itemBrandStory2.costForTwo : str6, (i12 & 64) != 0 ? itemBrandStory2.averageRating : str7, (i12 & 128) != 0 ? itemBrandStory2.cta : cta2, (i12 & 256) != 0 ? itemBrandStory2.adTrackingId : str8, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? itemBrandStory2.entityType : str9, (i12 & 1024) != 0 ? itemBrandStory2.entityId : str10);
    }

    public final String component1() {
        return this.f20242id;
    }

    public final String component10() {
        return this.entityType;
    }

    public final String component11() {
        return this.entityId;
    }

    public final String component2() {
        return this.imageId;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.sla;
    }

    public final String component6() {
        return this.costForTwo;
    }

    public final String component7() {
        return this.averageRating;
    }

    public final CTA component8() {
        return this.cta;
    }

    public final String component9() {
        return this.adTrackingId;
    }

    public final ItemBrandStory copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, CTA cta2, String str8, String str9, String str10) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "imageId");
        String str11 = str3;
        p.j(str11, "description");
        String str12 = str4;
        p.j(str12, "name");
        String str13 = str5;
        p.j(str13, "sla");
        String str14 = str6;
        p.j(str14, "costForTwo");
        String str15 = str7;
        p.j(str15, "averageRating");
        CTA cta3 = cta2;
        p.j(cta3, "cta");
        String str16 = str8;
        p.j(str16, "adTrackingId");
        String str17 = str9;
        p.j(str17, "entityType");
        String str18 = str10;
        p.j(str18, "entityId");
        return new ItemBrandStory(str, str2, str11, str12, str13, str14, str15, cta3, str16, str17, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemBrandStory)) {
            return false;
        }
        ItemBrandStory itemBrandStory = (ItemBrandStory) obj;
        return p.e(this.f20242id, itemBrandStory.f20242id) && p.e(this.imageId, itemBrandStory.imageId) && p.e(this.description, itemBrandStory.description) && p.e(this.name, itemBrandStory.name) && p.e(this.sla, itemBrandStory.sla) && p.e(this.costForTwo, itemBrandStory.costForTwo) && p.e(this.averageRating, itemBrandStory.averageRating) && p.e(this.cta, itemBrandStory.cta) && p.e(this.adTrackingId, itemBrandStory.adTrackingId) && p.e(this.entityType, itemBrandStory.entityType) && p.e(this.entityId, itemBrandStory.entityId);
    }

    public final String getAdTrackingId() {
        return this.adTrackingId;
    }

    public final String getAverageRating() {
        return this.averageRating;
    }

    public final String getCostForTwo() {
        return this.costForTwo;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final String getId() {
        return this.f20242id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSla() {
        return this.sla;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f20242id.hashCode() * 31) + this.imageId.hashCode()) * 31) + this.description.hashCode()) * 31) + this.name.hashCode()) * 31) + this.sla.hashCode()) * 31) + this.costForTwo.hashCode()) * 31) + this.averageRating.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.adTrackingId.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.entityId.hashCode();
    }

    public String toString() {
        return "ItemBrandStory(id=" + this.f20242id + ", imageId=" + this.imageId + ", description=" + this.description + ", name=" + this.name + ", sla=" + this.sla + ", costForTwo=" + this.costForTwo + ", averageRating=" + this.averageRating + ", cta=" + this.cta + ", adTrackingId=" + this.adTrackingId + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ')';
    }
}
