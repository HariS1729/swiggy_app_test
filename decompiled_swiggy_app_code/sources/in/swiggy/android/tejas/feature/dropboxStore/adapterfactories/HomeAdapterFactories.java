package in.swiggy.android.tejas.feature.dropboxStore.adapterfactories;

import com.google.gson.TypeAdapterFactory;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.dropboxStore.typeadapters.RuntimeTypeAdapterFactory;
import in.swiggy.android.tejas.feature.home.grid.model.favourite.GridFavouriteSection;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextSection;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.GridRemoteLottieSection;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.feature.home.grid.model.restaurants.GridRestaurantSection;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.GridTickerSection;
import in.swiggy.android.tejas.feature.home.grid.model.stores.GridStoresSection;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.GridTimeBoundOfferSection;
import in.swiggy.android.tejas.feature.home.model.BaseCardRestaurantCollection;
import in.swiggy.android.tejas.feature.home.model.CardDash;
import in.swiggy.android.tejas.feature.home.model.CardFYISmall;
import in.swiggy.android.tejas.feature.home.model.ContextualTrigger;
import in.swiggy.android.tejas.feature.home.model.ListingCard;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.SwiggyOneEntryPoint;
import in.swiggy.android.tejas.feature.home.model.pageconfig.ThemeDrop;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.SplashConfig;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.CollectionHeaderEntity;
import in.swiggy.android.tejas.feature.listing.collection.model.RestaurantCollectionHeaderEntity;
import in.swiggy.android.tejas.feature.listing.cta.model.ActionEntity;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemEntity;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemV2Entity;
import in.swiggy.android.tejas.feature.listing.grid.model.GridBannerSection;
import in.swiggy.android.tejas.feature.listing.grid.model.GridEntity;
import in.swiggy.android.tejas.feature.listing.grid.model.GridImageSection;
import in.swiggy.android.tejas.feature.listing.grid.model.GridMediaSection;
import in.swiggy.android.tejas.feature.listing.grid.model.GridSimilarRestaurantSection;
import in.swiggy.android.tejas.feature.listing.grid.model.GridType;
import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v2.textbox.GridTextBoxSection;
import in.swiggy.android.tejas.feature.listing.label.model.LabelEntity;
import in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity;
import in.swiggy.android.tejas.feature.listing.navigation.model.NestedNavigationEntity;
import in.swiggy.android.tejas.feature.listing.navigation.model.TabEntity;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantHeaderEntity;
import in.swiggy.android.tejas.feature.listing.spellcorrection.model.SpellCorrectionEntity;
import in.swiggy.android.tejas.feature.menu.offer.model.GridLoudOfferSection;
import in.swiggy.android.tejas.oldapi.models.restaurant.BrandPagesSection;
import kotlin.jvm.internal.p;

/* compiled from: HomeAdapterFactories.kt */
public final class HomeAdapterFactories {
    public static final HomeAdapterFactories INSTANCE = new HomeAdapterFactories();

    private HomeAdapterFactories() {
    }

    public final TypeAdapterFactory getErrorFactory() {
        RuntimeTypeAdapterFactory<Error> registerSubtype = RuntimeTypeAdapterFactory.of(Error.class).registerSubtype(Error.BlackZoneError.class).registerSubtype(Error.DescriptiveError.class).registerSubtype(Error.ExpiredTokenError.class).registerSubtype(Error.InternalError.class).registerSubtype(Error.LocationNotServiceableError.class).registerSubtype(Error.NoNetworkError.class).registerSubtype(Error.ThrottleError.class).registerSubtype(Error.UnhandledError.class).registerSubtype(Error.UnhandledExceptionError.class);
        p.i(registerSubtype, "of(Error::class.java)\n  …ceptionError::class.java)");
        return registerSubtype;
    }

    public final TypeAdapterFactory getGridTypeFactory() {
        RuntimeTypeAdapterFactory<GridType> registerSubtype = RuntimeTypeAdapterFactory.of(GridType.class).registerSubtype(GridType.Unmodified.class).registerSubtype(GridType.ExplodedFirst.class).registerSubtype(GridType.ExplodedLast.class).registerSubtype(GridType.ExplodedNormal.class);
        p.i(registerSubtype, "of(GridType::class.java)…plodedNormal::class.java)");
        return registerSubtype;
    }

    public final TypeAdapterFactory getGridWidgetFactory() {
        RuntimeTypeAdapterFactory<GridWidgetItem> registerSubtype = RuntimeTypeAdapterFactory.of(GridWidgetItem.class).registerSubtype(BrandPagesSection.class).registerSubtype(DynamicFlipTextSection.class).registerSubtype(GridBannerSection.class).registerSubtype(GridFavouriteSection.class).registerSubtype(GridImageSection.class).registerSubtype(GridLoudOfferSection.class).registerSubtype(GridMediaSection.class).registerSubtype(GridRemoteLottieSection.class).registerSubtype(GridRestaurantSection.class).registerSubtype(GridSimilarRestaurantSection.class).registerSubtype(GridStoresSection.class).registerSubtype(GridTextBoxSection.class).registerSubtype(GridTickerSection.class).registerSubtype(GridTimeBoundOfferSection.class);
        p.i(registerSubtype, "of(GridWidgetItem::class…OfferSection::class.java)");
        return registerSubtype;
    }

    public final TypeAdapterFactory getHomeAdapterFactory() {
        RuntimeTypeAdapterFactory<ListingCard> registerSubtype = RuntimeTypeAdapterFactory.of(ListingCard.class).registerSubtype(ActionEntity.class).registerSubtype(BaseCardRestaurantCollection.class).registerSubtype(CardDash.class).registerSubtype(CardFYISmall.class).registerSubtype(CollectionHeaderEntity.class).registerSubtype(GridEntity.class).registerSubtype(LabelEntity.class).registerSubtype(ListingCardEntity.class).registerSubtype(MenuItemEntity.class).registerSubtype(MenuItemV2Entity.class).registerSubtype(NavigationEntity.class).registerSubtype(NestedNavigationEntity.class).registerSubtype(RemoteLottieEntity.class).registerSubtype(RestaurantCollectionHeaderEntity.class).registerSubtype(RestaurantEntity.class).registerSubtype(RestaurantHeaderEntity.class).registerSubtype(SpellCorrectionEntity.class).registerSubtype(TabEntity.class);
        p.i(registerSubtype, "of(ListingCard::class.ja…pe(TabEntity::class.java)");
        return registerSubtype;
    }

    public final TypeAdapterFactory getHomeConfigFactory() {
        RuntimeTypeAdapterFactory<HomeConfig> registerSubtype = RuntimeTypeAdapterFactory.of(HomeConfig.class).registerSubtype(HomeCrouton.class).registerSubtype(HomeCroutonData.class).registerSubtype(HomePopup.class).registerSubtype(HomeVideoPopup.class).registerSubtype(HomePopUpWidget.class).registerSubtype(SplashConfig.class).registerSubtype(ThemeDrop.class).registerSubtype(ContextualTrigger.class).registerSubtype(SwiggyOneEntryPoint.class).registerSubtype(BottomBarPopup.class);
        p.i(registerSubtype, "of(HomeConfig::class.jav…ttomBarPopup::class.java)");
        return registerSubtype;
    }
}
