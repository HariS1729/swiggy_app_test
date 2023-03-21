package in.swiggy.android.tejas.feature.home.model;

import in.swiggy.android.tejas.feature.listing.relevance.model.Relevance;
import kotlin.jvm.internal.i;

/* compiled from: ListingCard.kt */
public abstract class ListingCard {
    private Relevance relevance;

    public ListingCard() {
        this((Relevance) null, 1, (i) null);
    }

    public ListingCard(Relevance relevance2) {
        this.relevance = relevance2;
    }

    public final Relevance getRelevance() {
        return this.relevance;
    }

    public final void setRelevance(Relevance relevance2) {
        this.relevance = relevance2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingCard(Relevance relevance2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : relevance2);
    }
}
