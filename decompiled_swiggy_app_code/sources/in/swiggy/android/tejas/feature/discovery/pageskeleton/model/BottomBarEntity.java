package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarEntity.kt */
public final class BottomBarEntity extends ListingCardEntity<BottomBarInfo> {
    private final BottomBarInfo data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomBarEntity(BottomBarInfo bottomBarInfo) {
        super((AnalyticsData) null, (RequestContextMetadata) null, 3, (i) null);
        p.j(bottomBarInfo, CardTypeAdapterFactory.DATA);
        this.data = bottomBarInfo;
    }

    public static /* synthetic */ BottomBarEntity copy$default(BottomBarEntity bottomBarEntity, BottomBarInfo bottomBarInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bottomBarInfo = bottomBarEntity.getData();
        }
        return bottomBarEntity.copy(bottomBarInfo);
    }

    public final BottomBarInfo component1() {
        return getData();
    }

    public final BottomBarEntity copy(BottomBarInfo bottomBarInfo) {
        p.j(bottomBarInfo, CardTypeAdapterFactory.DATA);
        return new BottomBarEntity(bottomBarInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BottomBarEntity) && p.e(getData(), ((BottomBarEntity) obj).getData());
    }

    public BottomBarInfo getData() {
        return this.data;
    }

    public int hashCode() {
        return getData().hashCode();
    }

    public String toString() {
        return "BottomBarEntity(data=" + getData() + ')';
    }
}
