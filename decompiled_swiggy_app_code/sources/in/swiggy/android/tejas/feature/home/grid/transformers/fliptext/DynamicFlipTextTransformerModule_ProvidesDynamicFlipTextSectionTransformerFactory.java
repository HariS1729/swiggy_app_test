package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.MxNFlipTextCardInfo;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextSectionTransformerFactory implements e<ITransformer<MxNFlipTextCardInfo, DynamicFlipTextSection>> {
    private final Provider<DynamicFlipTextSectionTransformer> dynamicFlipTextSectionTransformerProvider;

    public DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextSectionTransformerFactory(Provider<DynamicFlipTextSectionTransformer> provider) {
        this.dynamicFlipTextSectionTransformerProvider = provider;
    }

    public static DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextSectionTransformerFactory create(Provider<DynamicFlipTextSectionTransformer> provider) {
        return new DynamicFlipTextTransformerModule_ProvidesDynamicFlipTextSectionTransformerFactory(provider);
    }

    public static ITransformer<MxNFlipTextCardInfo, DynamicFlipTextSection> providesDynamicFlipTextSectionTransformer(DynamicFlipTextSectionTransformer dynamicFlipTextSectionTransformer) {
        return (ITransformer) i.e(DynamicFlipTextTransformerModule.providesDynamicFlipTextSectionTransformer(dynamicFlipTextSectionTransformer));
    }

    public ITransformer<MxNFlipTextCardInfo, DynamicFlipTextSection> get() {
        return providesDynamicFlipTextSectionTransformer(this.dynamicFlipTextSectionTransformerProvider.get());
    }
}
