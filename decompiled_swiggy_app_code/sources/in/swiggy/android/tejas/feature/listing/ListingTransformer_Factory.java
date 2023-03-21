package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.GroupedCard;
import com.swiggy.gandalf.widgets.v2.PageOffset;
import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.feature.home.transformers.discovery.configs.HomeListingConfigFactory;
import in.swiggy.android.tejas.feature.listing.metadata.model.RequestContextMetadata;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class ListingTransformer_Factory implements e<ListingTransformer> {
    private final Provider<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> groupedResultTransformerProvider;
    private final Provider<HomeListingConfigFactory> homeListingConfigFactoryProvider;
    private final Provider<ITransformer<PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset>> pageOffsetTransformerProvider;
    private final Provider<ITransformer<Response, RequestContextMetadata>> requestMetadataTransformerProvider;
    private final Provider<ITransformer<Card, List<ListingCardEntity<?>>>> resultEntityFactoryProvider;

    public ListingTransformer_Factory(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider, Provider<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> provider2, Provider<ITransformer<PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset>> provider3, Provider<ITransformer<Response, RequestContextMetadata>> provider4, Provider<HomeListingConfigFactory> provider5) {
        this.resultEntityFactoryProvider = provider;
        this.groupedResultTransformerProvider = provider2;
        this.pageOffsetTransformerProvider = provider3;
        this.requestMetadataTransformerProvider = provider4;
        this.homeListingConfigFactoryProvider = provider5;
    }

    public static ListingTransformer_Factory create(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider, Provider<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> provider2, Provider<ITransformer<PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset>> provider3, Provider<ITransformer<Response, RequestContextMetadata>> provider4, Provider<HomeListingConfigFactory> provider5) {
        return new ListingTransformer_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ListingTransformer newInstance(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer, ITransformer<GroupedCard, List<ListingCardEntity<?>>> iTransformer2, ITransformer<PageOffset, in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset> iTransformer3, ITransformer<Response, RequestContextMetadata> iTransformer4, HomeListingConfigFactory homeListingConfigFactory) {
        return new ListingTransformer(iTransformer, iTransformer2, iTransformer3, iTransformer4, homeListingConfigFactory);
    }

    public ListingTransformer get() {
        return newInstance(this.resultEntityFactoryProvider.get(), this.groupedResultTransformerProvider.get(), this.pageOffsetTransformerProvider.get(), this.requestMetadataTransformerProvider.get(), this.homeListingConfigFactoryProvider.get());
    }
}
