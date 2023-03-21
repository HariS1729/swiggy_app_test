package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.VariantPricing;
import in.swiggy.android.tejas.feature.listing.dish.transformer.CombinationalPricingTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.CombinationalPricingModel;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesCombinationPricingTransformerFactory implements e<ITransformer<VariantPricing, CombinationalPricingModel>> {
    private final Provider<CombinationalPricingTransformer> combinationalPricingTransformerProvider;

    public DishTransformerModule_ProvidesCombinationPricingTransformerFactory(Provider<CombinationalPricingTransformer> provider) {
        this.combinationalPricingTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesCombinationPricingTransformerFactory create(Provider<CombinationalPricingTransformer> provider) {
        return new DishTransformerModule_ProvidesCombinationPricingTransformerFactory(provider);
    }

    public static ITransformer<VariantPricing, CombinationalPricingModel> providesCombinationPricingTransformer(CombinationalPricingTransformer combinationalPricingTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesCombinationPricingTransformer(combinationalPricingTransformer));
    }

    public ITransformer<VariantPricing, CombinationalPricingModel> get() {
        return providesCombinationPricingTransformer(this.combinationalPricingTransformerProvider.get());
    }
}
