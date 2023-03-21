package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2;

import com.swiggy.gandalf.widgets.v2.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.ItemTicker;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class TickerSectionTransformer_Factory implements e<TickerSectionTransformer> {
    private final Provider<ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker>> itemTransformerProvider;
    private final Provider<ITransformer<TickerLayoutCard.ItemStyle, TickerStyle>> styleTransformerProvider;

    public TickerSectionTransformer_Factory(Provider<ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker>> provider, Provider<ITransformer<TickerLayoutCard.ItemStyle, TickerStyle>> provider2) {
        this.itemTransformerProvider = provider;
        this.styleTransformerProvider = provider2;
    }

    public static TickerSectionTransformer_Factory create(Provider<ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker>> provider, Provider<ITransformer<TickerLayoutCard.ItemStyle, TickerStyle>> provider2) {
        return new TickerSectionTransformer_Factory(provider, provider2);
    }

    public static TickerSectionTransformer newInstance(ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> iTransformer, ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> iTransformer2) {
        return new TickerSectionTransformer(iTransformer, iTransformer2);
    }

    public TickerSectionTransformer get() {
        return newInstance(this.itemTransformerProvider.get(), this.styleTransformerProvider.get());
    }
}
