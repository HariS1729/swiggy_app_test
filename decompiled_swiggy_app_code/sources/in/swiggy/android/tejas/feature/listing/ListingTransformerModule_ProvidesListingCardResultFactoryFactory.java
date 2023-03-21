package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Card;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ListingTransformerModule_ProvidesListingCardResultFactoryFactory implements e<ITransformer<Card, List<ListingCardEntity<?>>>> {
    private final Provider<ListingCardEntityFactory> listingEntityFactoryProvider;

    public ListingTransformerModule_ProvidesListingCardResultFactoryFactory(Provider<ListingCardEntityFactory> provider) {
        this.listingEntityFactoryProvider = provider;
    }

    public static ListingTransformerModule_ProvidesListingCardResultFactoryFactory create(Provider<ListingCardEntityFactory> provider) {
        return new ListingTransformerModule_ProvidesListingCardResultFactoryFactory(provider);
    }

    public static ITransformer<Card, List<ListingCardEntity<?>>> providesListingCardResultFactory(ListingCardEntityFactory listingCardEntityFactory) {
        return (ITransformer) i.e(ListingTransformerModule.providesListingCardResultFactory(listingCardEntityFactory));
    }

    public ITransformer<Card, List<ListingCardEntity<?>>> get() {
        return providesListingCardResultFactory(this.listingEntityFactoryProvider.get());
    }
}
