package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.OfferTag;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuOldOfferTagTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.ItemLevelOfferTags;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesOldDishOfferTagFactory implements e<ITransformer<OfferTag, ItemLevelOfferTags>> {
    private final Provider<MenuOldOfferTagTransformer> oldOfferTagTransformerProvider;

    public DishTransformerModule_ProvidesOldDishOfferTagFactory(Provider<MenuOldOfferTagTransformer> provider) {
        this.oldOfferTagTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesOldDishOfferTagFactory create(Provider<MenuOldOfferTagTransformer> provider) {
        return new DishTransformerModule_ProvidesOldDishOfferTagFactory(provider);
    }

    public static ITransformer<OfferTag, ItemLevelOfferTags> providesOldDishOfferTag(MenuOldOfferTagTransformer menuOldOfferTagTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesOldDishOfferTag(menuOldOfferTagTransformer));
    }

    public ITransformer<OfferTag, ItemLevelOfferTags> get() {
        return providesOldDishOfferTag(this.oldOfferTagTransformerProvider.get());
    }
}
