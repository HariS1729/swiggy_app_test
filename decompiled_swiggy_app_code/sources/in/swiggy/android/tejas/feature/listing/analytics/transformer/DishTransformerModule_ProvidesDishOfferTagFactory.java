package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.sand.badges.v1.BadgesProto;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuOfferTagTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.ItemLevelOfferTags;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesDishOfferTagFactory implements e<ITransformer<BadgesProto.BadgeObject, ItemLevelOfferTags>> {
    private final Provider<MenuOfferTagTransformer> offerTagTransformerProvider;

    public DishTransformerModule_ProvidesDishOfferTagFactory(Provider<MenuOfferTagTransformer> provider) {
        this.offerTagTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesDishOfferTagFactory create(Provider<MenuOfferTagTransformer> provider) {
        return new DishTransformerModule_ProvidesDishOfferTagFactory(provider);
    }

    public static ITransformer<BadgesProto.BadgeObject, ItemLevelOfferTags> providesDishOfferTag(MenuOfferTagTransformer menuOfferTagTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesDishOfferTag(menuOfferTagTransformer));
    }

    public ITransformer<BadgesProto.BadgeObject, ItemLevelOfferTags> get() {
        return providesDishOfferTag(this.offerTagTransformerProvider.get());
    }
}
