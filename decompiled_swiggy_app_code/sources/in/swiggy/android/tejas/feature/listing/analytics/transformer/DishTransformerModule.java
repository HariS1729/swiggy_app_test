package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.AddonChoice;
import com.swiggy.presentation.food.v2.AddonCombination;
import com.swiggy.presentation.food.v2.AddonGroup;
import com.swiggy.presentation.food.v2.CustomisationCategory;
import com.swiggy.presentation.food.v2.Dish;
import com.swiggy.presentation.food.v2.DishAttribute;
import com.swiggy.presentation.food.v2.DishCustomisation;
import com.swiggy.presentation.food.v2.DishInfo;
import com.swiggy.presentation.food.v2.ExcludeVariantGroup;
import com.swiggy.presentation.food.v2.ItemInfoTag;
import com.swiggy.presentation.food.v2.OfferTag;
import com.swiggy.presentation.food.v2.Variant;
import com.swiggy.presentation.food.v2.VariantGroup;
import com.swiggy.presentation.food.v2.VariantIdentifier;
import com.swiggy.presentation.food.v2.VariantPricing;
import com.swiggy.presentation.food.v2.VariantVariation;
import com.swiggy.presentation.food.v2.VariantsV2;
import com.swiggy.sand.badges.v1.BadgesProto;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemEntity;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemV2Entity;
import in.swiggy.android.tejas.feature.listing.dish.transformer.AddOnIdentifierTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.AddonGroupTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.AddonTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.CombinationalPricingTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.CustomisationCategoryTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.DishCustomisationTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuCategoryTagListTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuEntityV2Transformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuItemTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuOfferTagListTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuOfferTagTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuOldOfferTagTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantGroupTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantVariationTransformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariantsV2Transformer;
import in.swiggy.android.tejas.feature.listing.dish.transformer.VariationIdentifierTransformer;
import in.swiggy.android.tejas.feature.menu.health.model.Info;
import in.swiggy.android.tejas.feature.menu.health.model.MenuSpecialItemCategoryTags;
import in.swiggy.android.tejas.feature.menu.health.transformer.MenuItemInfoTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.AddOnIdentifier;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.oldapi.models.menu.CombinationalPricingModel;
import in.swiggy.android.tejas.oldapi.models.menu.GroupVariation;
import in.swiggy.android.tejas.oldapi.models.menu.ItemLevelOfferTags;
import in.swiggy.android.tejas.oldapi.models.menu.MenuAttributes;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.Variants;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import in.swiggy.android.tejas.oldapi.models.menu.VariationIdentifier;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DishTransformerModule.kt */
public final class DishTransformerModule {
    public static final DishTransformerModule INSTANCE = new DishTransformerModule();

    private DishTransformerModule() {
    }

    public static final ITransformer<AddonGroup, in.swiggy.android.tejas.oldapi.models.menu.AddonGroup> providesAddOnGroupTransformer(AddonGroupTransformer addonGroupTransformer) {
        p.j(addonGroupTransformer, "addonGroupTransformer");
        return addonGroupTransformer;
    }

    public static final ITransformer<AddonCombination, AddOnIdentifier> providesAddOnIdentifierTransformer(AddOnIdentifierTransformer addOnIdentifierTransformer) {
        p.j(addOnIdentifierTransformer, "addOnIdentifierTransformer");
        return addOnIdentifierTransformer;
    }

    public static final ITransformer<AddonChoice, Addon> providesAddOnTransformer(AddonTransformer addonTransformer) {
        p.j(addonTransformer, "addonTransformer");
        return addonTransformer;
    }

    public static final ITransformer<DishInfo, List<MenuSpecialItemCategoryTags>> providesCategoryTagList(MenuCategoryTagListTransformer menuCategoryTagListTransformer) {
        p.j(menuCategoryTagListTransformer, "menuCategoryTagListTransformer");
        return menuCategoryTagListTransformer;
    }

    public static final ITransformer<VariantPricing, CombinationalPricingModel> providesCombinationPricingTransformer(CombinationalPricingTransformer combinationalPricingTransformer) {
        p.j(combinationalPricingTransformer, "combinationalPricingTransformer");
        return combinationalPricingTransformer;
    }

    public static final ITransformer<CustomisationCategory, in.swiggy.android.tejas.oldapi.models.menu.CustomisationCategory> providesCustomisationCategory(CustomisationCategoryTransformer customisationCategoryTransformer) {
        p.j(customisationCategoryTransformer, "customisationCategoryTransformer");
        return customisationCategoryTransformer;
    }

    public static final ITransformer<DishCustomisation, in.swiggy.android.tejas.oldapi.models.menu.DishCustomisation> providesDishCustomisation(DishCustomisationTransformer dishCustomisationTransformer) {
        p.j(dishCustomisationTransformer, "dishCustomisationTransformer");
        return dishCustomisationTransformer;
    }

    public static final ITransformer<BadgesProto.BadgeObject, ItemLevelOfferTags> providesDishOfferTag(MenuOfferTagTransformer menuOfferTagTransformer) {
        p.j(menuOfferTagTransformer, "offerTagTransformer");
        return menuOfferTagTransformer;
    }

    public static final ITransformer<DishInfo, List<ItemLevelOfferTags>> providesDishOfferTagList(MenuOfferTagListTransformer menuOfferTagListTransformer) {
        p.j(menuOfferTagListTransformer, "menuOfferTagListTransformer");
        return menuOfferTagListTransformer;
    }

    public static final ITransformer<ExcludeVariantGroup, GroupVariation> providesExcludeVariantGroupTransformer(ExcludeVariantGroupTransformer excludeVariantGroupTransformer) {
        p.j(excludeVariantGroupTransformer, "excludeVariantGroupTransformer");
        return excludeVariantGroupTransformer;
    }

    public static final ITransformer<DishAttribute, MenuAttributes> providesMenuAttributeTransformer(MenuAttributeTransformer menuAttributeTransformer) {
        p.j(menuAttributeTransformer, "menuAttributeTransformer");
        return menuAttributeTransformer;
    }

    public static final ITransformer<Dish, MenuItemEntity> providesMenuEntityTransformer(MenuEntityTransformer menuEntityTransformer) {
        p.j(menuEntityTransformer, "menuEntityTransformer");
        return menuEntityTransformer;
    }

    public static final ITransformer<Dish, MenuItemV2Entity> providesMenuEntityV2Transformer(MenuEntityV2Transformer menuEntityV2Transformer) {
        p.j(menuEntityV2Transformer, "menuEntityV2Transformer");
        return menuEntityV2Transformer;
    }

    public static final ITransformer<ItemInfoTag, Info> providesMenuItemInfoTag(MenuItemInfoTransformer menuItemInfoTransformer) {
        p.j(menuItemInfoTransformer, "menuItemInfoTransformer");
        return menuItemInfoTransformer;
    }

    public static final ITransformer<DishInfo, MenuItem> providesMenuItemTransformer(MenuItemTransformer menuItemTransformer) {
        p.j(menuItemTransformer, "menuItemTransformer");
        return menuItemTransformer;
    }

    public static final ITransformer<OfferTag, ItemLevelOfferTags> providesOldDishOfferTag(MenuOldOfferTagTransformer menuOldOfferTagTransformer) {
        p.j(menuOldOfferTagTransformer, "oldOfferTagTransformer");
        return menuOldOfferTagTransformer;
    }

    public static final ITransformer<VariantGroup, in.swiggy.android.tejas.oldapi.models.menu.VariantGroup> providesVariantGroupTransformer(VariantGroupTransformer variantGroupTransformer) {
        p.j(variantGroupTransformer, "variantGroupTransformer");
        return variantGroupTransformer;
    }

    public static final ITransformer<Variant, Variants> providesVariantTransformer(VariantTransformer variantTransformer) {
        p.j(variantTransformer, "variantTransformer");
        return variantTransformer;
    }

    public static final ITransformer<VariantVariation, Variation> providesVariantVariationTransformer(VariantVariationTransformer variantVariationTransformer) {
        p.j(variantVariationTransformer, "variantVariationTransformer");
        return variantVariationTransformer;
    }

    public static final ITransformer<VariantsV2, in.swiggy.android.tejas.oldapi.models.menu.VariantsV2> providesVariantsV2Transformer(VariantsV2Transformer variantsV2Transformer) {
        p.j(variantsV2Transformer, "variantsV2Transformer");
        return variantsV2Transformer;
    }

    public static final ITransformer<VariantIdentifier, VariationIdentifier> providesVariationIdentifierTransformer(VariationIdentifierTransformer variationIdentifierTransformer) {
        p.j(variationIdentifierTransformer, "variationIdentifierTransformer");
        return variationIdentifierTransformer;
    }
}
