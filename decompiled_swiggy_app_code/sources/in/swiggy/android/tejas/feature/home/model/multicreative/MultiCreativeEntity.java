package in.swiggy.android.tejas.feature.home.model.multicreative;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: MultiCreativeEntity.kt */
public final class MultiCreativeEntity extends ListingCardEntity<MultiCreativeWidget> {
    private final MultiCreativeWidget data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiCreativeEntity(MultiCreativeWidget multiCreativeWidget) {
        super((AnalyticsData) null, (RequestContextMetadata) null, 3, (i) null);
        p.j(multiCreativeWidget, CardTypeAdapterFactory.DATA);
        this.data = multiCreativeWidget;
    }

    public MultiCreativeWidget getData() {
        return this.data;
    }
}
