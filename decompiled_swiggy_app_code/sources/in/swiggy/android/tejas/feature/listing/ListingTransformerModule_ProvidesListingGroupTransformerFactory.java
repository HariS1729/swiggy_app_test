package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.GroupedCard;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ListingTransformerModule_ProvidesListingGroupTransformerFactory implements e<ITransformer<GroupedCard, List<ListingCardEntity<?>>>> {
    private final Provider<ListingGroupTransformer> listingGroupTransformerProvider;

    public ListingTransformerModule_ProvidesListingGroupTransformerFactory(Provider<ListingGroupTransformer> provider) {
        this.listingGroupTransformerProvider = provider;
    }

    public static ListingTransformerModule_ProvidesListingGroupTransformerFactory create(Provider<ListingGroupTransformer> provider) {
        return new ListingTransformerModule_ProvidesListingGroupTransformerFactory(provider);
    }

    public static ITransformer<GroupedCard, List<ListingCardEntity<?>>> providesListingGroupTransformer(ListingGroupTransformer listingGroupTransformer) {
        return (ITransformer) i.e(ListingTransformerModule.providesListingGroupTransformer(listingGroupTransformer));
    }

    public ITransformer<GroupedCard, List<ListingCardEntity<?>>> get() {
        return providesListingGroupTransformer(this.listingGroupTransformerProvider.get());
    }
}
