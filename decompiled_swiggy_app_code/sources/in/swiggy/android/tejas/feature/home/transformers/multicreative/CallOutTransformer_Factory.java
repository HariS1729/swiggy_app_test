package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import javax.inject.Provider;
import qq.e;

public final class CallOutTransformer_Factory implements e<CallOutTransformer> {
    private final Provider<CallOutTypeTransformer> callOutTypeTransformerProvider;
    private final Provider<LeftToRightLinearGradientTransformer> gradientTransformerProvider;

    public CallOutTransformer_Factory(Provider<CallOutTypeTransformer> provider, Provider<LeftToRightLinearGradientTransformer> provider2) {
        this.callOutTypeTransformerProvider = provider;
        this.gradientTransformerProvider = provider2;
    }

    public static CallOutTransformer_Factory create(Provider<CallOutTypeTransformer> provider, Provider<LeftToRightLinearGradientTransformer> provider2) {
        return new CallOutTransformer_Factory(provider, provider2);
    }

    public static CallOutTransformer newInstance(CallOutTypeTransformer callOutTypeTransformer, LeftToRightLinearGradientTransformer leftToRightLinearGradientTransformer) {
        return new CallOutTransformer(callOutTypeTransformer, leftToRightLinearGradientTransformer);
    }

    public CallOutTransformer get() {
        return newInstance(this.callOutTypeTransformerProvider.get(), this.gradientTransformerProvider.get());
    }
}
