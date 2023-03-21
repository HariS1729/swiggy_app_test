package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.presentation.food.v2.FavouriteRestaurantInfoWithStyle;
import in.swiggy.android.tejas.feature.home.grid.model.favourite.GridFavouriteSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RestaurantCollectionTransformerModule_ProvidesFavouriteTransformerFactory implements e<ITransformer<FavouriteRestaurantInfoWithStyle, GridFavouriteSection>> {
    private final Provider<FavouritesEntityTransformer> favouritesEntityTransformerProvider;

    public RestaurantCollectionTransformerModule_ProvidesFavouriteTransformerFactory(Provider<FavouritesEntityTransformer> provider) {
        this.favouritesEntityTransformerProvider = provider;
    }

    public static RestaurantCollectionTransformerModule_ProvidesFavouriteTransformerFactory create(Provider<FavouritesEntityTransformer> provider) {
        return new RestaurantCollectionTransformerModule_ProvidesFavouriteTransformerFactory(provider);
    }

    public static ITransformer<FavouriteRestaurantInfoWithStyle, GridFavouriteSection> providesFavouriteTransformer(FavouritesEntityTransformer favouritesEntityTransformer) {
        return (ITransformer) i.e(RestaurantCollectionTransformerModule.providesFavouriteTransformer(favouritesEntityTransformer));
    }

    public ITransformer<FavouriteRestaurantInfoWithStyle, GridFavouriteSection> get() {
        return providesFavouriteTransformer(this.favouritesEntityTransformerProvider.get());
    }
}
