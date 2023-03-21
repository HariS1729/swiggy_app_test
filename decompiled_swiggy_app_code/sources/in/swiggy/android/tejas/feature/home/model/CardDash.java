package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.relevance.model.Relevance;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CardDash.kt */
public final class CardDash extends ListingCard {
    @SerializedName("cta")
    private final CTA cta;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20237id;
    @SerializedName("imageId")
    private final String imageId;
    @SerializedName("subtitle")
    private final String subtitle;
    @SerializedName("title")
    private final String title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardDash(String str, String str2, String str3, String str4, CTA cta2) {
        super((Relevance) null, 1, (i) null);
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "subtitle");
        p.j(str4, "imageId");
        p.j(cta2, "cta");
        this.f20237id = str;
        this.title = str2;
        this.subtitle = str3;
        this.imageId = str4;
        this.cta = cta2;
    }

    public static /* synthetic */ CardDash copy$default(CardDash cardDash, String str, String str2, String str3, String str4, CTA cta2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardDash.f20237id;
        }
        if ((i11 & 2) != 0) {
            str2 = cardDash.title;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = cardDash.subtitle;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = cardDash.imageId;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            cta2 = cardDash.cta;
        }
        return cardDash.copy(str, str5, str6, str7, cta2);
    }

    public final String component1() {
        return this.f20237id;
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

    public final CardDash copy(String str, String str2, String str3, String str4, CTA cta2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "title");
        p.j(str3, "subtitle");
        p.j(str4, "imageId");
        p.j(cta2, "cta");
        return new CardDash(str, str2, str3, str4, cta2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDash)) {
            return false;
        }
        CardDash cardDash = (CardDash) obj;
        return p.e(this.f20237id, cardDash.f20237id) && p.e(this.title, cardDash.title) && p.e(this.subtitle, cardDash.subtitle) && p.e(this.imageId, cardDash.imageId) && p.e(this.cta, cardDash.cta);
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getId() {
        return this.f20237id;
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
        return (((((((this.f20237id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.imageId.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "CardDash(id=" + this.f20237id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", imageId=" + this.imageId + ", cta=" + this.cta + ')';
    }
}
