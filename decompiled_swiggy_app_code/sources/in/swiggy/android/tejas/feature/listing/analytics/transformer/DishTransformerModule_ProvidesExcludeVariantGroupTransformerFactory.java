package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.ExcludeVariantGroup;
import in.swiggy.android.tejas.oldapi.models.menu.GroupVariation;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesExcludeVariantGroupTransformerFactory implements e<ITransformer<ExcludeVariantGroup, GroupVariation>> {
    private final Provider<ExcludeVariantGroupTransformer> excludeVariantGroupTransformerProvider;

    public DishTransformerModule_ProvidesExcludeVariantGroupTransformerFactory(Provider<ExcludeVariantGroupTransformer> provider) {
        this.excludeVariantGroupTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesExcludeVariantGroupTransformerFactory create(Provider<ExcludeVariantGroupTransformer> provider) {
        return new DishTransformerModule_ProvidesExcludeVariantGroupTransformerFactory(provider);
    }

    public static ITransformer<ExcludeVariantGroup, GroupVariation> providesExcludeVariantGroupTransformer(ExcludeVariantGroupTransformer excludeVariantGroupTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesExcludeVariantGroupTransformer(excludeVariantGroupTransformer));
    }

    public ITransformer<ExcludeVariantGroup, GroupVariation> get() {
        return providesExcludeVariantGroupTransformer(this.excludeVariantGroupTransformerProvider.get());
    }
}
