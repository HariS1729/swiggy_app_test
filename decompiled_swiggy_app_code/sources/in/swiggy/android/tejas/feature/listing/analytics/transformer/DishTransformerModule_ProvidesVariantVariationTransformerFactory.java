package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.VariantVariation;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantVariationTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesVariantVariationTransformerFactory implements e<ITransformer<VariantVariation, Variation>> {
    private final Provider<VariantVariationTransformer> variantVariationTransformerProvider;

    public DishTransformerModule_ProvidesVariantVariationTransformerFactory(Provider<VariantVariationTransformer> provider) {
        this.variantVariationTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesVariantVariationTransformerFactory create(Provider<VariantVariationTransformer> provider) {
        return new DishTransformerModule_ProvidesVariantVariationTransformerFactory(provider);
    }

    public static ITransformer<VariantVariation, Variation> providesVariantVariationTransformer(VariantVariationTransformer variantVariationTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesVariantVariationTransformer(variantVariationTransformer));
    }

    public ITransformer<VariantVariation, Variation> get() {
        return providesVariantVariationTransformer(this.variantVariationTransformerProvider.get());
    }
}
