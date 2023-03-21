package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.LotteCardInfo;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextLottieTransformerFactory implements e<ITransformer<LotteCardInfo, RemoteLottieItem>> {
    private final Provider<DynamicFlipTextLottieTransformer> dynamicFlipTextLottieTransformerProvider;

    public DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextLottieTransformerFactory(Provider<DynamicFlipTextLottieTransformer> provider) {
        this.dynamicFlipTextLottieTransformerProvider = provider;
    }

    public static DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextLottieTransformerFactory create(Provider<DynamicFlipTextLottieTransformer> provider) {
        return new DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextLottieTransformerFactory(provider);
    }

    public static ITransformer<LotteCardInfo, RemoteLottieItem> providesDynamicFlipTextLottieTransformer(DynamicFlipTextLottieTransformer dynamicFlipTextLottieTransformer) {
        return (ITransformer) i.e(DynamicFlipTextTransformerModule.providesDynamicFlipTextLottieTransformer(dynamicFlipTextLottieTransformer));
    }

    public ITransformer<LotteCardInfo, RemoteLottieItem> get() {
        return providesDynamicFlipTextLottieTransformer(this.dynamicFlipTextLottieTransformerProvider.get());
    }
}
