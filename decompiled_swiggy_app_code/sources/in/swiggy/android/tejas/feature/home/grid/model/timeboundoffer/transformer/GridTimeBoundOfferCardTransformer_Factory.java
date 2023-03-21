package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import com.swiggy.presentation.food.v2.OfferInfo;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOffer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class GridTimeBoundOfferCardTransformer_Factory implements e<GridTimeBoundOfferCardTransformer> {
    private final Provider<ITransformer<OfferInfo, TimeBoundOffer>> timeBoundOfferEntityTransformerProvider;

    public GridTimeBoundOfferCardTransformer_Factory(Provider<ITransformer<OfferInfo, TimeBoundOffer>> provider) {
        this.timeBoundOfferEntityTransformerProvider = provider;
    }

    public static GridTimeBoundOfferCardTransformer_Factory create(Provider<ITransformer<OfferInfo, TimeBoundOffer>> provider) {
        return new GridTimeBoundOfferCardTransformer_Factory(provider);
    }

    public static GridTimeBoundOfferCardTransformer newInstance(ITransformer<OfferInfo, TimeBoundOffer> iTransformer) {
        return new GridTimeBoundOfferCardTransformer(iTransformer);
    }

    public GridTimeBoundOfferCardTransformer get() {
        return newInstance(this.timeBoundOfferEntityTransformerProvider.get());
    }
}
