package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerStyle;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1.TickerStyleTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class SocialProofTransformerModule_ProvidesTickerStyleTransformerOldFactory implements e<ITransformer<TickerLayoutCard.ItemStyle, TickerStyle>> {
    private final Provider<TickerStyleTransformer> tickerStyleTransformerProvider;

    public SocialProofTransformerModule_ProvidesTickerStyleTransformerOldFactory(Provider<TickerStyleTransformer> provider) {
        this.tickerStyleTransformerProvider = provider;
    }

    public static SocialProofTransformerModule_ProvidesTickerStyleTransformerOldFactory create(Provider<TickerStyleTransformer> provider) {
        return new SocialProofTransformerModule_ProvidesTickerStyleTransformerOldFactory(provider);
    }

    public static ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> providesTickerStyleTransformerOld(TickerStyleTransformer tickerStyleTransformer) {
        return (ITransformer) i.e(SocialProofTransformerModule.providesTickerStyleTransformerOld(tickerStyleTransformer));
    }

    public ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> get() {
        return providesTickerStyleTransformerOld(this.tickerStyleTransformerProvider.get());
    }
}
