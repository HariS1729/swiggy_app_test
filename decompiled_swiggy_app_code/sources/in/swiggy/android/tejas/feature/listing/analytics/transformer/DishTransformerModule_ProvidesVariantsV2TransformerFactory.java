package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.VariantsV2;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantsV2Transformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesVariantsV2TransformerFactory implements e<ITransformer<VariantsV2, in.swiggy.android.tejas.oldapi.models.menu.VariantsV2>> {
    private final Provider<VariantsV2Transformer> variantsV2TransformerProvider;

    public DishTransformerModule_ProvidesVariantsV2TransformerFactory(Provider<VariantsV2Transformer> provider) {
        this.variantsV2TransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesVariantsV2TransformerFactory create(Provider<VariantsV2Transformer> provider) {
        return new DishTransformerModule_ProvidesVariantsV2TransformerFactory(provider);
    }

    public static ITransformer<VariantsV2, in.swiggy.android.tejas.oldapi.models.menu.VariantsV2> providesVariantsV2Transformer(VariantsV2Transformer variantsV2Transformer) {
        return (ITransformer) i.e(DishTransformerModule.providesVariantsV2Transformer(variantsV2Transformer));
    }

    public ITransformer<VariantsV2, in.swiggy.android.tejas.oldapi.models.menu.VariantsV2> get() {
        return providesVariantsV2Transformer(this.variantsV2TransformerProvider.get());
    }
}
