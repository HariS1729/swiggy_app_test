package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.VariantGroup;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantGroupTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesVariantGroupTransformerFactory implements e<ITransformer<VariantGroup, in.swiggy.android.tejas.oldapi.models.menu.VariantGroup>> {
    private final Provider<VariantGroupTransformer> variantGroupTransformerProvider;

    public DishTransformerModule_ProvidesVariantGroupTransformerFactory(Provider<VariantGroupTransformer> provider) {
        this.variantGroupTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesVariantGroupTransformerFactory create(Provider<VariantGroupTransformer> provider) {
        return new DishTransformerModule_ProvidesVariantGroupTransformerFactory(provider);
    }

    public static ITransformer<VariantGroup, in.swiggy.android.tejas.oldapi.models.menu.VariantGroup> providesVariantGroupTransformer(VariantGroupTransformer variantGroupTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesVariantGroupTransformer(variantGroupTransformer));
    }

    public ITransformer<VariantGroup, in.swiggy.android.tejas.oldapi.models.menu.VariantGroup> get() {
        return providesVariantGroupTransformer(this.variantGroupTransformerProvider.get());
    }
}
