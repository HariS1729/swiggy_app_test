package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.VariantIdentifier;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariationIdentifierTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.VariationIdentifier;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesVariationIdentifierTransformerFactory implements e<ITransformer<VariantIdentifier, VariationIdentifier>> {
    private final Provider<VariationIdentifierTransformer> variationIdentifierTransformerProvider;

    public DishTransformerModule_ProvidesVariationIdentifierTransformerFactory(Provider<VariationIdentifierTransformer> provider) {
        this.variationIdentifierTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesVariationIdentifierTransformerFactory create(Provider<VariationIdentifierTransformer> provider) {
        return new DishTransformerModule_ProvidesVariationIdentifierTransformerFactory(provider);
    }

    public static ITransformer<VariantIdentifier, VariationIdentifier> providesVariationIdentifierTransformer(VariationIdentifierTransformer variationIdentifierTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesVariationIdentifierTransformer(variationIdentifierTransformer));
    }

    public ITransformer<VariantIdentifier, VariationIdentifier> get() {
        return providesVariationIdentifierTransformer(this.variationIdentifierTransformerProvider.get());
    }
}
