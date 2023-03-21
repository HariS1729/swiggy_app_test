package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Card;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class ListingGroupTransformer_Factory implements e<ListingGroupTransformer> {
    private final Provider<ITransformer<Card, List<ListingCardEntity<?>>>> resultEntityFactoryProvider;

    public ListingGroupTransformer_Factory(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider) {
        this.resultEntityFactoryProvider = provider;
    }

    public static ListingGroupTransformer_Factory create(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider) {
        return new ListingGroupTransformer_Factory(provider);
    }

    public static ListingGroupTransformer newInstance(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer) {
        return new ListingGroupTransformer(iTransformer);
    }

    public ListingGroupTransformer get() {
        return newInstance(this.resultEntityFactoryProvider.get());
    }
}
