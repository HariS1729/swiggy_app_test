package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import com.swiggy.presentation.food.v2.OfferWidgetBanner;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.GridTimeBoundOfferSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class TimeBoundOfferTransformerModule_ProvidesGridTimeBoundOfferSectionFactory implements e<ITransformer<OfferWidgetBanner, GridTimeBoundOfferSection>> {
    private final Provider<GridTimeBoundOfferCardTransformer> gridTimeBoundOfferCardTransformerProvider;

    public TimeBoundOfferTransformerModule_ProvidesGridTimeBoundOfferSectionFactory(Provider<GridTimeBoundOfferCardTransformer> provider) {
        this.gridTimeBoundOfferCardTransformerProvider = provider;
    }

    public static TimeBoundOfferTransformerModule_ProvidesGridTimeBoundOfferSectionFactory create(Provider<GridTimeBoundOfferCardTransformer> provider) {
        return new TimeBoundOfferTransformerModule_ProvidesGridTimeBoundOfferSectionFactory(provider);
    }

    public static ITransformer<OfferWidgetBanner, GridTimeBoundOfferSection> providesGridTimeBoundOfferSection(GridTimeBoundOfferCardTransformer gridTimeBoundOfferCardTransformer) {
        return (ITransformer) i.e(TimeBoundOfferTransformerModule.providesGridTimeBoundOfferSection(gridTimeBoundOfferCardTransformer));
    }

    public ITransformer<OfferWidgetBanner, GridTimeBoundOfferSection> get() {
        return providesGridTimeBoundOfferSection(this.gridTimeBoundOfferCardTransformerProvider.get());
    }
}
