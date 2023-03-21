package in.swiggy.android.tejas.feature.home.grid.model.remotelottie;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieEntity.kt */
public final class RemoteLottieEntity extends ListingCardEntity<RemoteLottieItem> {
    private final RemoteLottieItem data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteLottieEntity(RemoteLottieItem remoteLottieItem) {
        super(remoteLottieItem.getAnalytics(), (RequestContextMetadata) null, 2, (i) null);
        p.j(remoteLottieItem, CardTypeAdapterFactory.DATA);
        this.data = remoteLottieItem;
    }

    public RemoteLottieItem getData() {
        return this.data;
    }
}
