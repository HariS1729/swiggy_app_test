package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.Variant;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.Variants;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesVariantTransformerFactory implements e<ITransformer<Variant, Variants>> {
    private final Provider<VariantTransformer> variantTransformerProvider;

    public DishTransformerModule_ProvidesVariantTransformerFactory(Provider<VariantTransformer> provider) {
        this.variantTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesVariantTransformerFactory create(Provider<VariantTransformer> provider) {
        return new DishTransformerModule_ProvidesVariantTransformerFactory(provider);
    }

    public static ITransformer<Variant, Variants> providesVariantTransformer(VariantTransformer variantTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesVariantTransformer(variantTransformer));
    }

    public ITransformer<Variant, Variants> get() {
        return providesVariantTransformer(this.variantTransformerProvider.get());
    }
}
