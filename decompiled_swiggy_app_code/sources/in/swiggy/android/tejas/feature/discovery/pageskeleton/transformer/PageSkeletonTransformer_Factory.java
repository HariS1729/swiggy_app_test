package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.GroupedCard;
import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class PageSkeletonTransformer_Factory implements e<PageSkeletonTransformer> {
    private final Provider<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> groupedResultTransformerProvider;
    private final Provider<ITransformer<Response, RequestContextMetadata>> requestMetadataTransformerProvider;
    private final Provider<ITransformer<Card, List<ListingCardEntity<?>>>> resultEntityFactoryProvider;

    public PageSkeletonTransformer_Factory(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider, Provider<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> provider2, Provider<ITransformer<Response, RequestContextMetadata>> provider3) {
        this.resultEntityFactoryProvider = provider;
        this.groupedResultTransformerProvider = provider2;
        this.requestMetadataTransformerProvider = provider3;
    }

    public static PageSkeletonTransformer_Factory create(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider, Provider<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> provider2, Provider<ITransformer<Response, RequestContextMetadata>> provider3) {
        return new PageSkeletonTransformer_Factory(provider, provider2, provider3);
    }

    public static PageSkeletonTransformer newInstance(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer, ITransformer<GroupedCard, List<ListingCardEntity<?>>> iTransformer2, ITransformer<Response, RequestContextMetadata> iTransformer3) {
        return new PageSkeletonTransformer(iTransformer, iTransformer2, iTransformer3);
    }

    public PageSkeletonTransformer get() {
        return newInstance(this.resultEntityFactoryProvider.get(), this.groupedResultTransformerProvider.get(), this.requestMetadataTransformerProvider.get());
    }
}
