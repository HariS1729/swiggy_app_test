package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.CustomisationCategory;
import in.swiggy.android.tejas.feature.listing.dish.transformer.CustomisationCategoryTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesCustomisationCategoryFactory implements e<ITransformer<CustomisationCategory, in.swiggy.android.tejas.oldapi.models.menu.CustomisationCategory>> {
    private final Provider<CustomisationCategoryTransformer> customisationCategoryTransformerProvider;

    public DishTransformerModule_ProvidesCustomisationCategoryFactory(Provider<CustomisationCategoryTransformer> provider) {
        this.customisationCategoryTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesCustomisationCategoryFactory create(Provider<CustomisationCategoryTransformer> provider) {
        return new DishTransformerModule_ProvidesCustomisationCategoryFactory(provider);
    }

    public static ITransformer<CustomisationCategory, in.swiggy.android.tejas.oldapi.models.menu.CustomisationCategory> providesCustomisationCategory(CustomisationCategoryTransformer customisationCategoryTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesCustomisationCategory(customisationCategoryTransformer));
    }

    public ITransformer<CustomisationCategory, in.swiggy.android.tejas.oldapi.models.menu.CustomisationCategory> get() {
        return providesCustomisationCategory(this.customisationCategoryTransformerProvider.get());
    }
}
