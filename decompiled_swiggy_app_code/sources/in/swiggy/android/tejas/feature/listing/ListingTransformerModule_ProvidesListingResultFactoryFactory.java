package in.swiggy.android.tejas.feature.listing;

import com.google.protobuf.Any;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ListingTransformerModule_ProvidesListingResultFactoryFactory implements e<ITransformer<Any, List<ListingCardEntity<?>>>> {
    private final Provider<ListingEntityFactory> listingEntityFactoryProvider;

    public ListingTransformerModule_ProvidesListingResultFactoryFactory(Provider<ListingEntityFactory> provider) {
        this.listingEntityFactoryProvider = provider;
    }

    public static ListingTransformerModule_ProvidesListingResultFactoryFactory create(Provider<ListingEntityFactory> provider) {
        return new ListingTransformerModule_ProvidesListingResultFactoryFactory(provider);
    }

    public static ITransformer<Any, List<ListingCardEntity<?>>> providesListingResultFactory(ListingEntityFactory listingEntityFactory) {
        return (ITransformer) i.e(ListingTransformerModule.providesListingResultFactory(listingEntityFactory));
    }

    public ITransformer<Any, List<ListingCardEntity<?>>> get() {
        return providesListingResultFactory(this.listingEntityFactoryProvider.get());
    }
}
