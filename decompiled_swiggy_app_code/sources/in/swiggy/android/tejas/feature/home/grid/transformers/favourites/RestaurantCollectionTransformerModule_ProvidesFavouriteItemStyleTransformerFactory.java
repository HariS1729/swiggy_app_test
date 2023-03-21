package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.presentation.food.v2.Style;
import in.swiggy.android.tejas.feature.listing.grid.model.FavouriteItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RestaurantCollectionTransformerModule_ProvidesFavouriteItemStyleTransformerFactory implements e<ITransformer<Style, FavouriteItemStyle>> {
    private final Provider<FavouriteItemStyleTransformer> favouriteItemStyleTransformerProvider;

    public RestaurantCollectionTransformerModule_ProvidesFavouriteItemStyleTransformerFactory(Provider<FavouriteItemStyleTransformer> provider) {
        this.favouriteItemStyleTransformerProvider = provider;
    }

    public static RestaurantCollectionTransformerModule_ProvidesFavouriteItemStyleTransformerFactory create(Provider<FavouriteItemStyleTransformer> provider) {
        return new RestaurantCollectionTransformerModule_ProvidesFavouriteItemStyleTransformerFactory(provider);
    }

    public static ITransformer<Style, FavouriteItemStyle> providesFavouriteItemStyleTransformer(FavouriteItemStyleTransformer favouriteItemStyleTransformer) {
        return (ITransformer) i.e(RestaurantCollectionTransformerModule.providesFavouriteItemStyleTransformer(favouriteItemStyleTransformer));
    }

    public ITransformer<Style, FavouriteItemStyle> get() {
        return providesFavouriteItemStyleTransformer(this.favouriteItemStyleTransformerProvider.get());
    }
}
