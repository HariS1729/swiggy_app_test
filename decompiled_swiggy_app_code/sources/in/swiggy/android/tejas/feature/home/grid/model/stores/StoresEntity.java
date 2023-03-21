package in.swiggy.android.tejas.feature.home.grid.model.stores;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: StoresEntity.kt */
public final class StoresEntity extends ListingCardEntity<Stores> {
    private final CTA cta;
    private final Stores data;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoresEntity(Stores stores, AnalyticsData analyticsData, CTA cta2, int i11, i iVar) {
        this(stores, (i11 & 2) != 0 ? null : analyticsData, (i11 & 4) != 0 ? null : cta2);
    }

    public final CTA getCta() {
        return this.cta;
    }

    public Stores getData() {
        return this.data;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoresEntity(Stores stores, AnalyticsData analyticsData, CTA cta2) {
        super(analyticsData, (RequestContextMetadata) null, 2, (i) null);
        p.j(stores, CardTypeAdapterFactory.DATA);
        this.data = stores;
        this.cta = cta2;
    }
}
