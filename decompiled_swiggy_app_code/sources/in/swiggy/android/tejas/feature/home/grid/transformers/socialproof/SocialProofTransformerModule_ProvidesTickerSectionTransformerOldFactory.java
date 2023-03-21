package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.GridTickerSection;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1.TickerSectionTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class SocialProofTransformerModule_ProvidesTickerSectionTransformerOldFactory implements e<ITransformer<TickerLayoutCard, GridTickerSection>> {
    private final Provider<TickerSectionTransformer> tickerSectionTransformerProvider;

    public SocialProofTransformerModule_ProvidesTickerSectionTransformerOldFactory(Provider<TickerSectionTransformer> provider) {
        this.tickerSectionTransformerProvider = provider;
    }

    public static SocialProofTransformerModule_ProvidesTickerSectionTransformerOldFactory create(Provider<TickerSectionTransformer> provider) {
        return new SocialProofTransformerModule_ProvidesTickerSectionTransformerOldFactory(provider);
    }

    public static ITransformer<TickerLayoutCard, GridTickerSection> providesTickerSectionTransformerOld(TickerSectionTransformer tickerSectionTransformer) {
        return (ITransformer) i.e(SocialProofTransformerModule.providesTickerSectionTransformerOld(tickerSectionTransformer));
    }

    public ITransformer<TickerLayoutCard, GridTickerSection> get() {
        return providesTickerSectionTransformerOld(this.tickerSectionTransformerProvider.get());
    }
}
