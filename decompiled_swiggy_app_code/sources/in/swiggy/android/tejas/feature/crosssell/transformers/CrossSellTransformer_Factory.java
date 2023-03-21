package in.swiggy.android.tejas.feature.crosssell.transformers;

import com.swiggy.gandalf.widgets.v2.Card;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;

public final class CrossSellTransformer_Factory implements e<CrossSellTransformer> {
    private final Provider<ITransformer<Card, List<ListingCardEntity<?>>>> resultEntityFactoryProvider;

    public CrossSellTransformer_Factory(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider) {
        this.resultEntityFactoryProvider = provider;
    }

    public static CrossSellTransformer_Factory create(Provider<ITransformer<Card, List<ListingCardEntity<?>>>> provider) {
        return new CrossSellTransformer_Factory(provider);
    }

    public static CrossSellTransformer newInstance(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer) {
        return new CrossSellTransformer(iTransformer);
    }

    public CrossSellTransformer get() {
        return newInstance(this.resultEntityFactoryProvider.get());
    }
}
