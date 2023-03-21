package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOut;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvideCallOutTransformerFactory implements e<ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut>> {
    private final Provider<CallOutTransformer> callOutTransformerProvider;

    public MultiCreativeTransformerModule_ProvideCallOutTransformerFactory(Provider<CallOutTransformer> provider) {
        this.callOutTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvideCallOutTransformerFactory create(Provider<CallOutTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvideCallOutTransformerFactory(provider);
    }

    public static ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> provideCallOutTransformer(CallOutTransformer callOutTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.provideCallOutTransformer(callOutTransformer));
    }

    public ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> get() {
        return provideCallOutTransformer(this.callOutTransformerProvider.get());
    }
}
