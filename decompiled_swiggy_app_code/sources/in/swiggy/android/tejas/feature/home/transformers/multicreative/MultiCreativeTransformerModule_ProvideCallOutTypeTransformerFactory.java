package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOutType;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvideCallOutTypeTransformerFactory implements e<ITransformer<MultiTypeCreativeInfoWithStyle.CalloutType, CallOutType>> {
    private final Provider<CallOutTypeTransformer> callOutTypeTransformerProvider;

    public MultiCreativeTransformerModule_ProvideCallOutTypeTransformerFactory(Provider<CallOutTypeTransformer> provider) {
        this.callOutTypeTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvideCallOutTypeTransformerFactory create(Provider<CallOutTypeTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvideCallOutTypeTransformerFactory(provider);
    }

    public static ITransformer<MultiTypeCreativeInfoWithStyle.CalloutType, CallOutType> provideCallOutTypeTransformer(CallOutTypeTransformer callOutTypeTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.provideCallOutTypeTransformer(callOutTypeTransformer));
    }

    public ITransformer<MultiTypeCreativeInfoWithStyle.CalloutType, CallOutType> get() {
        return provideCallOutTypeTransformer(this.callOutTypeTransformerProvider.get());
    }
}
