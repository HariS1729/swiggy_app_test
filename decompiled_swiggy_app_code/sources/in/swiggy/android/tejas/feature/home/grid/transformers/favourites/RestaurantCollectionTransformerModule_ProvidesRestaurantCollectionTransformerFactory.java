package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.presentation.food.v2.RestaurantInfoWithStyle;
import in.swiggy.android.tejas.feature.home.grid.model.restaurants.GridRestaurantSection;
import in.swiggy.android.tejas.feature.home.grid.transformers.restaurant.RestaurantCollectionEntityTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RestaurantCollectionTransformerModule_ProvidesRestaurantCollectionTransformerFactory implements e<ITransformer<RestaurantInfoWithStyle, GridRestaurantSection>> {
    private final Provider<RestaurantCollectionEntityTransformer> restaurantCollectionTransformerProvider;

    public RestaurantCollectionTransformerModule_ProvidesRestaurantCollectionTransformerFactory(Provider<RestaurantCollectionEntityTransformer> provider) {
        this.restaurantCollectionTransformerProvider = provider;
    }

    public static RestaurantCollectionTransformerModule_ProvidesRestaurantCollectionTransformerFactory create(Provider<RestaurantCollectionEntityTransformer> provider) {
        return new RestaurantCollectionTransformerModule_ProvidesRestaurantCollectionTransformerFactory(provider);
    }

    public static ITransformer<RestaurantInfoWithStyle, GridRestaurantSection> providesRestaurantCollectionTransformer(RestaurantCollectionEntityTransformer restaurantCollectionEntityTransformer) {
        return (ITransformer) i.e(RestaurantCollectionTransformerModule.providesRestaurantCollectionTransformer(restaurantCollectionEntityTransformer));
    }

    public ITransformer<RestaurantInfoWithStyle, GridRestaurantSection> get() {
        return providesRestaurantCollectionTransformer(this.restaurantCollectionTransformerProvider.get());
    }
}
