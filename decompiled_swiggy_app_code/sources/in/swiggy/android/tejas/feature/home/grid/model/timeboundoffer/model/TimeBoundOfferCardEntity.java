package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: TimeBoundOfferCardEntity.kt */
public final class TimeBoundOfferCardEntity extends ListingCardEntity<TimeBoundOffer> {
    private final TimeBoundOffer data;
    private final OfferBannerType offerBannerType;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeBoundOfferCardEntity(TimeBoundOffer timeBoundOffer, AnalyticsData analyticsData, OfferBannerType offerBannerType2, int i11, i iVar) {
        this(timeBoundOffer, (i11 & 2) != 0 ? null : analyticsData, offerBannerType2);
    }

    public final OfferBannerType getOfferBannerType() {
        return this.offerBannerType;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeBoundOfferCardEntity(TimeBoundOffer timeBoundOffer, AnalyticsData analyticsData, OfferBannerType offerBannerType2) {
        super(analyticsData, (RequestContextMetadata) null, 2, (i) null);
        p.j(timeBoundOffer, CardTypeAdapterFactory.DATA);
        p.j(offerBannerType2, "offerBannerType");
        this.data = timeBoundOffer;
        this.offerBannerType = offerBannerType2;
    }

    public TimeBoundOffer getData() {
        return this.data;
    }
}
