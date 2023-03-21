package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DynamicFlipTextTransformerModule_ProvidesDynamicFliptextItemStyleTransformerFactory implements e<ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle>> {
    private final Provider<DynamicFliptextItemStyleTransformer> dynamicFliptextItemStyleTransformerProvider;

    public DynamicFlipTextTransformerModule_ProvidesDynamicFliptextItemStyleTransformerFactory(Provider<DynamicFliptextItemStyleTransformer> provider) {
        this.dynamicFliptextItemStyleTransformerProvider = provider;
    }

    public static DynamicFlipTextTransformerModule_ProvidesDynamicFliptextItemStyleTransformerFactory create(Provider<DynamicFliptextItemStyleTransformer> provider) {
        return new DynamicFlipTextTransformerModule_ProvidesDynamicFliptextItemStyleTransformerFactory(provider);
    }

    public static ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> providesDynamicFliptextItemStyleTransformer(DynamicFliptextItemStyleTransformer dynamicFliptextItemStyleTransformer) {
        return (ITransformer) i.e(DynamicFlipTextTransformerModule.providesDynamicFliptextItemStyleTransformer(dynamicFliptextItemStyleTransformer));
    }

    public ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> get() {
        return providesDynamicFliptextItemStyleTransformer(this.dynamicFliptextItemStyleTransformerProvider.get());
    }
}
