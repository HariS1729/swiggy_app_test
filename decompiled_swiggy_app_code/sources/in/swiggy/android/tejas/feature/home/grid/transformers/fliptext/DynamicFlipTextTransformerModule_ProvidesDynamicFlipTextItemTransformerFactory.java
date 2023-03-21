package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.MxNFlipTextCardInfo;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextItemTransformerFactory implements e<ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity>> {
    private final Provider<DynamicFlipTextItemTransformer> dynamicFlipTextItemTransformerProvider;

    public DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextItemTransformerFactory(Provider<DynamicFlipTextItemTransformer> provider) {
        this.dynamicFlipTextItemTransformerProvider = provider;
    }

    public static DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextItemTransformerFactory create(Provider<DynamicFlipTextItemTransformer> provider) {
        return new DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextItemTransformerFactory(provider);
    }

    public static ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> providesDynamicFlipTextItemTransformer(DynamicFlipTextItemTransformer dynamicFlipTextItemTransformer) {
        return (ITransformer) i.e(DynamicFlipTextTransformerModule.providesDynamicFlipTextItemTransformer(dynamicFlipTextItemTransformer));
    }

    public ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> get() {
        return providesDynamicFlipTextItemTransformer(this.dynamicFlipTextItemTransformerProvider.get());
    }
}
