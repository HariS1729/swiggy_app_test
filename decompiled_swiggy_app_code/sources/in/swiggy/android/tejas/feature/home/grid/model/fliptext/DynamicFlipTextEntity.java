package in.swiggy.android.tejas.feature.home.grid.model.fliptext;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFlipTextEntity.kt */
public final class DynamicFlipTextEntity extends ListingCardEntity<DynamicFlipTextItem> {
    private final DynamicFlipTextItem data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicFlipTextEntity(DynamicFlipTextItem dynamicFlipTextItem) {
        super((AnalyticsData) null, (RequestContextMetadata) null, 3, (i) null);
        p.j(dynamicFlipTextItem, CardTypeAdapterFactory.DATA);
        this.data = dynamicFlipTextItem;
    }

    public DynamicFlipTextItem getData() {
        return this.data;
    }
}
