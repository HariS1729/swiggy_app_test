package in.swiggy.android.tejas.feature.home.grid.model.socialproof;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ItemTicker.kt */
public final class ItemTicker {
    private final CTA cta;

    /* renamed from: id  reason: collision with root package name */
    private final String f20233id;
    private final String imageId;
    private final String title;

    public ItemTicker(String str, String str2, String str3, CTA cta2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "imageId");
        this.f20233id = str;
        this.title = str2;
        this.imageId = str3;
        this.cta = cta2;
    }

    public static /* synthetic */ ItemTicker copy$default(ItemTicker itemTicker, String str, String str2, String str3, CTA cta2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = itemTicker.f20233id;
        }
        if ((i11 & 2) != 0) {
            str2 = itemTicker.title;
        }
        if ((i11 & 4) != 0) {
            str3 = itemTicker.imageId;
        }
        if ((i11 & 8) != 0) {
            cta2 = itemTicker.cta;
        }
        return itemTicker.copy(str, str2, str3, cta2);
    }

    public final String component1() {
        return this.f20233id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.imageId;
    }

    public final CTA component4() {
        return this.cta;
    }

    public final ItemTicker copy(String str, String str2, String str3, CTA cta2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "imageId");
        return new ItemTicker(str, str2, str3, cta2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemTicker)) {
            return false;
        }
        ItemTicker itemTicker = (ItemTicker) obj;
        return p.e(this.f20233id, itemTicker.f20233id) && p.e(this.title, itemTicker.title) && p.e(this.imageId, itemTicker.imageId) && p.e(this.cta, itemTicker.cta);
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getId() {
        return this.f20233id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.f20233id.hashCode() * 31) + this.title.hashCode()) * 31) + this.imageId.hashCode()) * 31;
        CTA cta2 = this.cta;
        return hashCode + (cta2 == null ? 0 : cta2.hashCode());
    }

    public String toString() {
        return "ItemTicker(id=" + this.f20233id + ", title=" + this.title + ", imageId=" + this.imageId + ", cta=" + this.cta + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ItemTicker(String str, String str2, String str3, CTA cta2, int i11, i iVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : cta2);
    }
}
