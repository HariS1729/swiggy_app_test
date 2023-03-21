package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.widgets.v2.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.GridTickerSection;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2.TickerSectionTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class SocialProofTransformerModule_ProvidesTickerSectionTransformerFactory implements e<ITransformer<TickerLayoutCard, GridTickerSection>> {
    private final Provider<TickerSectionTransformer> tickerSectionTransformerProvider;

    public SocialProofTransformerModule_ProvidesTickerSectionTransformerFactory(Provider<TickerSectionTransformer> provider) {
        this.tickerSectionTransformerProvider = provider;
    }

    public static SocialProofTransformerModule_ProvidesTickerSectionTransformerFactory create(Provider<TickerSectionTransformer> provider) {
        return new SocialProofTransformerModule_ProvidesTickerSectionTransformerFactory(provider);
    }

    public static ITransformer<TickerLayoutCard, GridTickerSection> providesTickerSectionTransformer(TickerSectionTransformer tickerSectionTransformer) {
        return (ITransformer) i.e(SocialProofTransformerModule.providesTickerSectionTransformer(tickerSectionTransformer));
    }

    public ITransformer<TickerLayoutCard, GridTickerSection> get() {
        return providesTickerSectionTransformer(this.tickerSectionTransformerProvider.get());
    }
}
