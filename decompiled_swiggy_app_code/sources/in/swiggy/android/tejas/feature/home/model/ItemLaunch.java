package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.p;

/* compiled from: ItemLaunch.kt */
public final class ItemLaunch {
    @SerializedName("cta")
    private final CTA cta;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20243id;
    @SerializedName("imageId")
    private final String imageId;
    @SerializedName("subtitle")
    private final String subtitle;
    @SerializedName("title")
    private final String title;

    public ItemLaunch(String str, String str2, String str3, String str4, CTA cta2) {
        p.j(str2, "title");
        p.j(str3, "subtitle");
        p.j(str4, "imageId");
        p.j(cta2, "cta");
        this.f20243id = str;
        this.title = str2;
        this.subtitle = str3;
        this.imageId = str4;
        this.cta = cta2;
    }

    public static /* synthetic */ ItemLaunch copy$default(ItemLaunch itemLaunch, String str, String str2, String str3, String str4, CTA cta2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = itemLaunch.f20243id;
        }
        if ((i11 & 2) != 0) {
            str2 = itemLaunch.title;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = itemLaunch.subtitle;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = itemLaunch.imageId;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            cta2 = itemLaunch.cta;
        }
        return itemLaunch.copy(str, str5, str6, str7, cta2);
    }

    public final String component1() {
        return this.f20243id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.imageId;
    }

    public final CTA component5() {
        return this.cta;
    }

    public final ItemLaunch copy(String str, String str2, String str3, String str4, CTA cta2) {
        p.j(str2, "title");
        p.j(str3, "subtitle");
        p.j(str4, "imageId");
        p.j(cta2, "cta");
        return new ItemLaunch(str, str2, str3, str4, cta2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemLaunch)) {
            return false;
        }
        ItemLaunch itemLaunch = (ItemLaunch) obj;
        return p.e(this.f20243id, itemLaunch.f20243id) && p.e(this.title, itemLaunch.title) && p.e(this.subtitle, itemLaunch.subtitle) && p.e(this.imageId, itemLaunch.imageId) && p.e(this.cta, itemLaunch.cta);
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getId() {
        return this.f20243id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.f20243id;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.imageId.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "ItemLaunch(id=" + this.f20243id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", imageId=" + this.imageId + ", cta=" + this.cta + ')';
    }
}
