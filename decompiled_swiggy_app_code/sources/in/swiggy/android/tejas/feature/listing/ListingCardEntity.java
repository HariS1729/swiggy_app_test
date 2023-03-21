package in.swiggy.android.tejas.feature.listing;

import in.swiggy.android.tejas.feature.home.model.ListingCard;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.listing.relevance.model.Relevance;
import kotlin.jvm.internal.i;

/* compiled from: ListingCardEntity.kt */
public abstract class ListingCardEntity<T> extends ListingCard {
    private AnalyticsData analyticsData;
    private RequestContextMetadata contextMetadata;

    public ListingCardEntity() {
        this((AnalyticsData) null, (RequestContextMetadata) null, 3, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingCardEntity(AnalyticsData analyticsData2, RequestContextMetadata requestContextMetadata, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : analyticsData2, (i11 & 2) != 0 ? null : requestContextMetadata);
    }

    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    public final RequestContextMetadata getContextMetadata() {
        return this.contextMetadata;
    }

    public abstract T getData();

    public final void setAnalyticsData(AnalyticsData analyticsData2) {
        this.analyticsData = analyticsData2;
    }

    public final void setContextMetadata(RequestContextMetadata requestContextMetadata) {
        this.contextMetadata = requestContextMetadata;
    }

    public ListingCardEntity(AnalyticsData analyticsData2, RequestContextMetadata requestContextMetadata) {
        super((Relevance) null, 1, (i) null);
        this.analyticsData = analyticsData2;
        this.contextMetadata = requestContextMetadata;
    }
}
