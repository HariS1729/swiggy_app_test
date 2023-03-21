package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.presentation.food.v2.Restaurant;
import com.swiggy.presentation.food.v2.Style;
import in.swiggy.android.tejas.feature.listing.grid.model.FavouriteItemStyle;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class FavouritesEntityTransformer_Factory implements e<FavouritesEntityTransformer> {
    private final Provider<ITransformer<Restaurant, RestaurantEntity>> restaurantTransformerProvider;
    private final Provider<ITransformer<Style, FavouriteItemStyle>> styleTransformerProvider;

    public FavouritesEntityTransformer_Factory(Provider<ITransformer<Restaurant, RestaurantEntity>> provider, Provider<ITransformer<Style, FavouriteItemStyle>> provider2) {
        this.restaurantTransformerProvider = provider;
        this.styleTransformerProvider = provider2;
    }

    public static FavouritesEntityTransformer_Factory create(Provider<ITransformer<Restaurant, RestaurantEntity>> provider, Provider<ITransformer<Style, FavouriteItemStyle>> provider2) {
        return new FavouritesEntityTransformer_Factory(provider, provider2);
    }

    public static FavouritesEntityTransformer newInstance(ITransformer<Restaurant, RestaurantEntity> iTransformer, ITransformer<Style, FavouriteItemStyle> iTransformer2) {
        return new FavouritesEntityTransformer(iTransformer, iTransformer2);
    }

    public FavouritesEntityTransformer get() {
        return newInstance(this.restaurantTransformerProvider.get(), this.styleTransformerProvider.get());
    }
}
