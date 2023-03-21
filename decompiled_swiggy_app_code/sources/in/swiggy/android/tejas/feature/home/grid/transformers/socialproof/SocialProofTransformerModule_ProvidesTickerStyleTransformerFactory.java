package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.widgets.v2.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerStyle;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2.TickerStyleTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class SocialProofTransformerModule_ProvidesTickerStyleTransformerFactory implements e<ITransformer<TickerLayoutCard.ItemStyle, TickerStyle>> {
    private final Provider<TickerStyleTransformer> tickerStyleTransformerProvider;

    public SocialProofTransformerModule_ProvidesTickerStyleTransformerFactory(Provider<TickerStyleTransformer> provider) {
        this.tickerStyleTransformerProvider = provider;
    }

    public static SocialProofTransformerModule_ProvidesTickerStyleTransformerFactory create(Provider<TickerStyleTransformer> provider) {
        return new SocialProofTransformerModule_ProvidesTickerStyleTransformerFactory(provider);
    }

    public static ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> providesTickerStyleTransformer(TickerStyleTransformer tickerStyleTransformer) {
        return (ITransformer) i.e(SocialProofTransformerModule.providesTickerStyleTransformer(tickerStyleTransformer));
    }

    public ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> get() {
        return providesTickerStyleTransformer(this.tickerStyleTransformerProvider.get());
    }
}
