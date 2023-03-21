package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.LottieCard;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvidesLottieCardTransformerFactory implements e<ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard>> {
    private final Provider<LottieCardTransformer> lottieCardTransformerProvider;

    public MultiCreativeTransformerModule_ProvidesLottieCardTransformerFactory(Provider<LottieCardTransformer> provider) {
        this.lottieCardTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvidesLottieCardTransformerFactory create(Provider<LottieCardTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvidesLottieCardTransformerFactory(provider);
    }

    public static ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> providesLottieCardTransformer(LottieCardTransformer lottieCardTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.providesLottieCardTransformer(lottieCardTransformer));
    }

    public ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> get() {
        return providesLottieCardTransformer(this.lottieCardTransformerProvider.get());
    }
}
