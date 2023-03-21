package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ItemBanner.kt */
public final class ItemBanner {
    private final String adTrackingId;
    private final CTA cta;
    private final List<DynamicData> data;
    private final String entityId;
    private final String entityType;

    /* renamed from: id  reason: collision with root package name */
    private final String f20241id;
    private final String imageId;

    public ItemBanner(String str, String str2, CTA cta2, List<DynamicData> list, String str3, String str4, String str5) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "imageId");
        p.j(cta2, "cta");
        p.j(str3, "adTrackingId");
        p.j(str4, "entityType");
        p.j(str5, "entityId");
        this.f20241id = str;
        this.imageId = str2;
        this.cta = cta2;
        this.data = list;
        this.adTrackingId = str3;
        this.entityType = str4;
        this.entityId = str5;
    }

    public static /* synthetic */ ItemBanner copy$default(ItemBanner itemBanner, String str, String str2, CTA cta2, List<DynamicData> list, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = itemBanner.f20241id;
        }
        if ((i11 & 2) != 0) {
            str2 = itemBanner.imageId;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            cta2 = itemBanner.cta;
        }
        CTA cta3 = cta2;
        if ((i11 & 8) != 0) {
            list = itemBanner.data;
        }
        List<DynamicData> list2 = list;
        if ((i11 & 16) != 0) {
            str3 = itemBanner.adTrackingId;
        }
        String str7 = str3;
        if ((i11 & 32) != 0) {
            str4 = itemBanner.entityType;
        }
        String str8 = str4;
        if ((i11 & 64) != 0) {
            str5 = itemBanner.entityId;
        }
        return itemBanner.copy(str, str6, cta3, list2, str7, str8, str5);
    }

    public final String component1() {
        return this.f20241id;
    }

    public final String component2() {
        return this.imageId;
    }

    public final CTA component3() {
        return this.cta;
    }

    public final List<DynamicData> component4() {
        return this.data;
    }

    public final String component5() {
        return this.adTrackingId;
    }

    public final String component6() {
        return this.entityType;
    }

    public final String component7() {
        return this.entityId;
    }

    public final ItemBanner copy(String str, String str2, CTA cta2, List<DynamicData> list, String str3, String str4, String str5) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "imageId");
        p.j(cta2, "cta");
        p.j(str3, "adTrackingId");
        p.j(str4, "entityType");
        String str6 = str5;
        p.j(str6, "entityId");
        return new ItemBanner(str, str2, cta2, list, str3, str4, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemBanner)) {
            return false;
        }
        ItemBanner itemBanner = (ItemBanner) obj;
        return p.e(this.f20241id, itemBanner.f20241id) && p.e(this.imageId, itemBanner.imageId) && p.e(this.cta, itemBanner.cta) && p.e(this.data, itemBanner.data) && p.e(this.adTrackingId, itemBanner.adTrackingId) && p.e(this.entityType, itemBanner.entityType) && p.e(this.entityId, itemBanner.entityId);
    }

    public final String getAdTrackingId() {
        return this.adTrackingId;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final List<DynamicData> getData() {
        return this.data;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final String getId() {
        return this.f20241id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public int hashCode() {
        int hashCode = ((((this.f20241id.hashCode() * 31) + this.imageId.hashCode()) * 31) + this.cta.hashCode()) * 31;
        List<DynamicData> list = this.data;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.adTrackingId.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.entityId.hashCode();
    }

    public String toString() {
        return "ItemBanner(id=" + this.f20241id + ", imageId=" + this.imageId + ", cta=" + this.cta + ", data=" + this.data + ", adTrackingId=" + this.adTrackingId + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ')';
    }
}
