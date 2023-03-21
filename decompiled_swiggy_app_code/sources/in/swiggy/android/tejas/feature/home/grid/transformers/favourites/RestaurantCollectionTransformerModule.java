package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.presentation.food.v2.FavouriteRestaurantInfoWithStyle;
import com.swiggy.presentation.food.v2.RestaurantInfoWithStyle;
import com.swiggy.presentation.food.v2.Style;
import in.swiggy.android.tejas.feature.home.grid.model.favourite.GridFavouriteSection;
import in.swiggy.android.tejas.feature.home.grid.model.restaurants.GridRestaurantSection;
import in.swiggy.android.tejas.feature.home.grid.transformers.restaurant.RestaurantCollectionEntityTransformer;
import in.swiggy.android.tejas.feature.listing.grid.model.FavouriteItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RestaurantCollectionTransformerModule.kt */
public final class RestaurantCollectionTransformerModule {
    public static final RestaurantCollectionTransformerModule INSTANCE = new RestaurantCollectionTransformerModule();

    private RestaurantCollectionTransformerModule() {
    }

    public static final ITransformer<Style, FavouriteItemStyle> providesFavouriteItemStyleTransformer(FavouriteItemStyleTransformer favouriteItemStyleTransformer) {
        p.j(favouriteItemStyleTransformer, "favouriteItemStyleTransformer");
        return favouriteItemStyleTransformer;
    }

    public static final ITransformer<FavouriteRestaurantInfoWithStyle, GridFavouriteSection> providesFavouriteTransformer(FavouritesEntityTransformer favouritesEntityTransformer) {
        p.j(favouritesEntityTransformer, "favouritesEntityTransformer");
        return favouritesEntityTransformer;
    }

    public static final ITransformer<RestaurantInfoWithStyle, GridRestaurantSection> providesRestaurantCollectionTransformer(RestaurantCollectionEntityTransformer restaurantCollectionEntityTransformer) {
        p.j(restaurantCollectionEntityTransformer, "restaurantCollectionTransformer");
        return restaurantCollectionEntityTransformer;
    }
}
