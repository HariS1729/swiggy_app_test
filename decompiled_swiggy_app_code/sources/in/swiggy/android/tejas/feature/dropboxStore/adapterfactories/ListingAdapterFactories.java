package in.swiggy.android.tejas.feature.dropboxStore.adapterfactories;

import com.google.gson.TypeAdapterFactory;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarEntity;
import in.swiggy.android.tejas.feature.dropboxStore.typeadapters.RuntimeTypeAdapterFactory;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextEntity;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerEntity;
import in.swiggy.android.tejas.feature.home.grid.model.stores.StoresEntity;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOfferCardEntity;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeEntity;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.CollectionHeaderEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.ExpandableCtaEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.RestaurantCollectionCtaEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.RestaurantCollectionHeaderEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.RestaurantHeaderItemCollectionEntity;
import in.swiggy.android.tejas.feature.listing.cta.model.ActionEntity;
import in.swiggy.android.tejas.feature.listing.didyoumean.model.DidYouMeanEntity;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemEntity;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemV2Entity;
import in.swiggy.android.tejas.feature.listing.facets.model.CardFacetEntity;
import in.swiggy.android.tejas.feature.listing.facets.model.FacetEntity;
import in.swiggy.android.tejas.feature.listing.faq.model.FaqEntity;
import in.swiggy.android.tejas.feature.listing.fliptext.model.FlipTextEntity;
import in.swiggy.android.tejas.feature.listing.grid.model.GridEntity;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v2.textbox.TextBoxEntity;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuItemEntity;
import in.swiggy.android.tejas.feature.listing.instamartheader.model.InstamartHeaderEntity;
import in.swiggy.android.tejas.feature.listing.label.model.LabelEntity;
import in.swiggy.android.tejas.feature.listing.mastheadsearch.model.MastHeadEntity;
import in.swiggy.android.tejas.feature.listing.mastheadsearch.model.MastHeadSearchEntity;
import in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity;
import in.swiggy.android.tejas.feature.listing.navigation.model.NestedNavigationEntity;
import in.swiggy.android.tejas.feature.listing.navigation.model.TabEntity;
import in.swiggy.android.tejas.feature.listing.pageheader.model.PageHeaderEntity;
import in.swiggy.android.tejas.feature.listing.presearchquery.model.PreSearchQueryListEntity;
import in.swiggy.android.tejas.feature.listing.recentsearch.model.RecentSearchesEntity;
import in.swiggy.android.tejas.feature.listing.redirect.model.RedirectionEntity;
import in.swiggy.android.tejas.feature.listing.removefilter.model.RemoveFilterEntity;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantHeaderEntity;
import in.swiggy.android.tejas.feature.listing.rig.model.RIGEntity;
import in.swiggy.android.tejas.feature.listing.searchbar.model.SearchBarEntity;
import in.swiggy.android.tejas.feature.listing.spellcorrection.model.SpellCorrectionEntity;
import in.swiggy.android.tejas.feature.listing.unserviceability.model.UnserviceableBannerEntity;
import in.swiggy.android.tejas.feature.menu.carousel.model.MenuCarouselV2Entity;
import in.swiggy.android.tejas.feature.menu.crossSell.model.MenuCrossSellEntity;
import in.swiggy.android.tejas.feature.menu.edvocarousel.model.MenuEdvoCarouselEntity;
import in.swiggy.android.tejas.feature.menu.header.model.MenuCollectionHeaderEntity;
import in.swiggy.android.tejas.feature.menu.health.model.CrossSellMenuItemEntity;
import in.swiggy.android.tejas.feature.menu.health.model.MenuHealthItemEntity;
import in.swiggy.android.tejas.feature.menu.itemcategory.models.MenuCategoryItemEntity;
import in.swiggy.android.tejas.feature.menu.nestedCategory.model.MenuNestedCategoryEntity;
import in.swiggy.android.tejas.feature.menu.nestedCategory.model.MenuNestedCategoryHeaderEntity;
import in.swiggy.android.tejas.feature.menu.nestedCategory.model.MenuNestedCategoryItemEntity;
import in.swiggy.android.tejas.feature.menu.offer.model.LoudOfferCardEntity;
import in.swiggy.android.tejas.feature.menu.reorder.model.MenuReorderEntity;
import in.swiggy.android.tejas.feature.menu.restaddress.model.RestaurantAddressEntity;
import in.swiggy.android.tejas.feature.menu.restlicense.model.RestaurantLicenseInfoEntity;
import in.swiggy.android.tejas.feature.menu.swiggyone.SwiggyOneInfoEntity;
import in.swiggy.android.tejas.feature.menu.vegfilter.model.MenuVegFilterEntity;
import in.swiggy.android.tejas.feature.order.history.model.OrderDetailEntity;
import in.swiggy.android.tejas.feature.restaurant.model.CollectionMastHeadEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SortFilterEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SuperPlanValidityEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SuperPlanWidgetEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SuperSavingEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SuperTabEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SuperV2MastHeadEntity;
import in.swiggy.android.tejas.feature.restaurant.model.SwiggyOnePotentialSavingsEntity;
import kotlin.jvm.internal.p;

/* compiled from: ListingAdapterFactories.kt */
public final class ListingAdapterFactories {
    public static final ListingAdapterFactories INSTANCE = new ListingAdapterFactories();

    private ListingAdapterFactories() {
    }

    public final TypeAdapterFactory getListingAdapterFactory() {
        RuntimeTypeAdapterFactory<ListingCardEntity> registerSubtype = RuntimeTypeAdapterFactory.of(ListingCardEntity.class).registerSubtype(ActionEntity.class).registerSubtype(BottomBarEntity.class).registerSubtype(CardFacetEntity.class).registerSubtype(CollectionHeaderEntity.class).registerSubtype(CollectionMastHeadEntity.class).registerSubtype(DidYouMeanEntity.class).registerSubtype(DynamicFlipTextEntity.class).registerSubtype(ExpandableCtaEntity.class).registerSubtype(FacetEntity.class).registerSubtype(FaqEntity.class).registerSubtype(FlipTextEntity.class).registerSubtype(GridEntity.class).registerSubtype(InstamartHeaderEntity.class).registerSubtype(LabelEntity.class).registerSubtype(LoudOfferCardEntity.class).registerSubtype(MartMenuItemEntity.class).registerSubtype(MastHeadEntity.class).registerSubtype(MastHeadSearchEntity.class).registerSubtype(MenuCarouselV2Entity.class).registerSubtype(MenuCategoryItemEntity.class).registerSubtype(MenuCollectionHeaderEntity.class).registerSubtype(MenuEdvoCarouselEntity.class).registerSubtype(MenuHealthItemEntity.class).registerSubtype(MenuItemEntity.class).registerSubtype(MenuItemV2Entity.class).registerSubtype(MenuNestedCategoryEntity.class).registerSubtype(MenuNestedCategoryHeaderEntity.class).registerSubtype(MenuNestedCategoryItemEntity.class).registerSubtype(MenuReorderEntity.class).registerSubtype(MenuVegFilterEntity.class).registerSubtype(MultiCreativeEntity.class).registerSubtype(MenuCrossSellEntity.class).registerSubtype(NavigationEntity.class).registerSubtype(NestedNavigationEntity.class).registerSubtype(OrderDetailEntity.class).registerSubtype(PageHeaderEntity.class).registerSubtype(PreSearchQueryListEntity.class).registerSubtype(RIGEntity.class).registerSubtype(RecentSearchesEntity.class).registerSubtype(RedirectionEntity.class).registerSubtype(RemoteLottieEntity.class).registerSubtype(RemoveFilterEntity.class).registerSubtype(RestaurantAddressEntity.class).registerSubtype(RestaurantCollectionCtaEntity.class).registerSubtype(RestaurantCollectionHeaderEntity.class).registerSubtype(RestaurantEntity.class).registerSubtype(RestaurantHeaderEntity.class).registerSubtype(RestaurantHeaderItemCollectionEntity.class).registerSubtype(RestaurantLicenseInfoEntity.class).registerSubtype(SearchBarEntity.class).registerSubtype(SortFilterEntity.class).registerSubtype(SpellCorrectionEntity.class).registerSubtype(StoresEntity.class).registerSubtype(SuperPlanValidityEntity.class).registerSubtype(SuperPlanWidgetEntity.class).registerSubtype(SuperSavingEntity.class).registerSubtype(SuperTabEntity.class).registerSubtype(SuperV2MastHeadEntity.class).registerSubtype(SwiggyOneInfoEntity.class).registerSubtype(TabEntity.class).registerSubtype(TextBoxEntity.class).registerSubtype(TickerEntity.class).registerSubtype(TimeBoundOfferCardEntity.class).registerSubtype(UnserviceableBannerEntity.class).registerSubtype(SwiggyOnePotentialSavingsEntity.class);
        p.i(registerSubtype, "of(ListingCardEntity::cl…avingsEntity::class.java)");
        return registerSubtype;
    }

    public final TypeAdapterFactory getMenuHealthItemFactory() {
        RuntimeTypeAdapterFactory<MenuHealthItemEntity> registerSubtype = RuntimeTypeAdapterFactory.of(MenuHealthItemEntity.class).registerSubtype(CrossSellMenuItemEntity.class);
        p.i(registerSubtype, "of(MenuHealthItemEntity:…nuItemEntity::class.java)");
        return registerSubtype;
    }
}
