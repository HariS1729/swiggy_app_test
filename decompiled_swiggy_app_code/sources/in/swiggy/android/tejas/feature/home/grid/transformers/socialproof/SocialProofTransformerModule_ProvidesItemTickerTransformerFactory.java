package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.widgets.v2.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.ItemTicker;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2.ItemTickerTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class SocialProofTransformerModule_ProvidesItemTickerTransformerFactory implements e<ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker>> {
    private final Provider<ItemTickerTransformer> itemTickerTransformerProvider;

    public SocialProofTransformerModule_ProvidesItemTickerTransformerFactory(Provider<ItemTickerTransformer> provider) {
        this.itemTickerTransformerProvider = provider;
    }

    public static SocialProofTransformerModule_ProvidesItemTickerTransformerFactory create(Provider<ItemTickerTransformer> provider) {
        return new SocialProofTransformerModule_ProvidesItemTickerTransformerFactory(provider);
    }

    public static ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> providesItemTickerTransformer(ItemTickerTransformer itemTickerTransformer) {
        return (ITransformer) i.e(SocialProofTransformerModule.providesItemTickerTransformer(itemTickerTransformer));
    }

    public ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> get() {
        return providesItemTickerTransformer(this.itemTickerTransformerProvider.get());
    }
}
