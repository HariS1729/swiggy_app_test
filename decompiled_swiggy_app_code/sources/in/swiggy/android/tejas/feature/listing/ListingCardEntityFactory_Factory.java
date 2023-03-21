package in.swiggy.android.tejas.feature.listing;

import com.google.protobuf.Any;
import com.swiggy.gandalf.widgets.v2.Relevance;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class ListingCardEntityFactory_Factory implements e<ListingCardEntityFactory> {
    private final Provider<ITransformer<Any, List<ListingCardEntity<?>>>> listingEntityFactoryProvider;
    private final Provider<ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance>> relevanceTransformerProvider;

    public ListingCardEntityFactory_Factory(Provider<ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance>> provider, Provider<ITransformer<Any, List<ListingCardEntity<?>>>> provider2) {
        this.relevanceTransformerProvider = provider;
        this.listingEntityFactoryProvider = provider2;
    }

    public static ListingCardEntityFactory_Factory create(Provider<ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance>> provider, Provider<ITransformer<Any, List<ListingCardEntity<?>>>> provider2) {
        return new ListingCardEntityFactory_Factory(provider, provider2);
    }

    public static ListingCardEntityFactory newInstance(ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance> iTransformer, ITransformer<Any, List<ListingCardEntity<?>>> iTransformer2) {
        return new ListingCardEntityFactory(iTransformer, iTransformer2);
    }

    public ListingCardEntityFactory get() {
        return newInstance(this.relevanceTransformerProvider.get(), this.listingEntityFactoryProvider.get());
    }
}
