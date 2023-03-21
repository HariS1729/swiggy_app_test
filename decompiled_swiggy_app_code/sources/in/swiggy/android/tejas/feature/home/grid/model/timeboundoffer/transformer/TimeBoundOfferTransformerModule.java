package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import com.swiggy.presentation.food.v2.OfferInfo;
import com.swiggy.presentation.food.v2.OfferWidgetBanner;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.GridTimeBoundOfferSection;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOffer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: TimeBoundOfferTransformerModule.kt */
public final class TimeBoundOfferTransformerModule {
    public static final TimeBoundOfferTransformerModule INSTANCE = new TimeBoundOfferTransformerModule();

    private TimeBoundOfferTransformerModule() {
    }

    public static final ITransformer<OfferWidgetBanner, GridTimeBoundOfferSection> providesGridTimeBoundOfferSection(GridTimeBoundOfferCardTransformer gridTimeBoundOfferCardTransformer) {
        p.j(gridTimeBoundOfferCardTransformer, "gridTimeBoundOfferCardTransformer");
        return gridTimeBoundOfferCardTransformer;
    }

    public static final ITransformer<OfferInfo, TimeBoundOffer> providesTimeBoundOffer(TimBoundOfferEntityTransformer timBoundOfferEntityTransformer) {
        p.j(timBoundOfferEntityTransformer, "timeBoundOfferEntityTransformer");
        return timBoundOfferEntityTransformer;
    }
}
