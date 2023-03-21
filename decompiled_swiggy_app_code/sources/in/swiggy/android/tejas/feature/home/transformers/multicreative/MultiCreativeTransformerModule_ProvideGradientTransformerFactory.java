package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.LeftToRightLinearGradient;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvideGradientTransformerFactory implements e<ITransformer<LeftToRightLinearGradient, in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient>> {
    private final Provider<LeftToRightLinearGradientTransformer> gradientTransformerProvider;

    public MultiCreativeTransformerModule_ProvideGradientTransformerFactory(Provider<LeftToRightLinearGradientTransformer> provider) {
        this.gradientTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvideGradientTransformerFactory create(Provider<LeftToRightLinearGradientTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvideGradientTransformerFactory(provider);
    }

    public static ITransformer<LeftToRightLinearGradient, in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient> provideGradientTransformer(LeftToRightLinearGradientTransformer leftToRightLinearGradientTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.provideGradientTransformer(leftToRightLinearGradientTransformer));
    }

    public ITransformer<LeftToRightLinearGradient, in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient> get() {
        return provideGradientTransformer(this.gradientTransformerProvider.get());
    }
}
