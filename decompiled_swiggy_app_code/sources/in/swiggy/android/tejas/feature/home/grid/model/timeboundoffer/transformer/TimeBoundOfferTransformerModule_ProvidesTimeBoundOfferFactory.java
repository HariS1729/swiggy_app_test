package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import com.swiggy.presentation.food.v2.OfferInfo;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOffer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class TimeBoundOfferTransformerModule_ProvidesTimeBoundOfferFactory implements e<ITransformer<OfferInfo, TimeBoundOffer>> {
    private final Provider<TimBoundOfferEntityTransformer> timeBoundOfferEntityTransformerProvider;

    public TimeBoundOfferTransformerModule_ProvidesTimeBoundOfferFactory(Provider<TimBoundOfferEntityTransformer> provider) {
        this.timeBoundOfferEntityTransformerProvider = provider;
    }

    public static TimeBoundOfferTransformerModule_ProvidesTimeBoundOfferFactory create(Provider<TimBoundOfferEntityTransformer> provider) {
        return new TimeBoundOfferTransformerModule_ProvidesTimeBoundOfferFactory(provider);
    }

    public static ITransformer<OfferInfo, TimeBoundOffer> providesTimeBoundOffer(TimBoundOfferEntityTransformer timBoundOfferEntityTransformer) {
        return (ITransformer) i.e(TimeBoundOfferTransformerModule.providesTimeBoundOffer(timBoundOfferEntityTransformer));
    }

    public ITransformer<OfferInfo, TimeBoundOffer> get() {
        return providesTimeBoundOffer(this.timeBoundOfferEntityTransformerProvider.get());
    }
}
