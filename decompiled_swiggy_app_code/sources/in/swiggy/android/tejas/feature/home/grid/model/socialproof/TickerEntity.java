package in.swiggy.android.tejas.feature.home.grid.model.socialproof;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: TickerEntity.kt */
public final class TickerEntity extends ListingCardEntity<ItemTicker> {
    private final ItemTicker data;
    private final int noOfLines;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TickerEntity(ItemTicker itemTicker, int i11) {
        super((AnalyticsData) null, (RequestContextMetadata) null, 3, (i) null);
        p.j(itemTicker, CardTypeAdapterFactory.DATA);
        this.data = itemTicker;
        this.noOfLines = i11;
    }

    public ItemTicker getData() {
        return this.data;
    }

    public final int getNoOfLines() {
        return this.noOfLines;
    }
}
