package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.ItemTicker;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1.ItemTickerTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class SocialProofTransformerModule_ProvidesItemTickerTransformerOldFactory implements e<ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker>> {
    private final Provider<ItemTickerTransformer> itemTickerTransformerProvider;

    public SocialProofTransformerModule_ProvidesItemTickerTransformerOldFactory(Provider<ItemTickerTransformer> provider) {
        this.itemTickerTransformerProvider = provider;
    }

    public static SocialProofTransformerModule_ProvidesItemTickerTransformerOldFactory create(Provider<ItemTickerTransformer> provider) {
        return new SocialProofTransformerModule_ProvidesItemTickerTransformerOldFactory(provider);
    }

    public static ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> providesItemTickerTransformerOld(ItemTickerTransformer itemTickerTransformer) {
        return (ITransformer) i.e(SocialProofTransformerModule.providesItemTickerTransformerOld(itemTickerTransformer));
    }

    public ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> get() {
        return providesItemTickerTransformerOld(this.itemTickerTransformerProvider.get());
    }
}
