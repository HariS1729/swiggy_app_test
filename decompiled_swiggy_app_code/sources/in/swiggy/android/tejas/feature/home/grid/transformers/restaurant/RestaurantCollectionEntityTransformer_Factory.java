package in.swiggy.android.tejas.feature.home.grid.transformers.restaurant;

import com.swiggy.presentation.food.v2.Restaurant;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class RestaurantCollectionEntityTransformer_Factory implements e<RestaurantCollectionEntityTransformer> {
    private final Provider<ITransformer<Restaurant, RestaurantEntity>> restaurantTransformerProvider;

    public RestaurantCollectionEntityTransformer_Factory(Provider<ITransformer<Restaurant, RestaurantEntity>> provider) {
        this.restaurantTransformerProvider = provider;
    }

    public static RestaurantCollectionEntityTransformer_Factory create(Provider<ITransformer<Restaurant, RestaurantEntity>> provider) {
        return new RestaurantCollectionEntityTransformer_Factory(provider);
    }

    public static RestaurantCollectionEntityTransformer newInstance(ITransformer<Restaurant, RestaurantEntity> iTransformer) {
        return new RestaurantCollectionEntityTransformer(iTransformer);
    }

    public RestaurantCollectionEntityTransformer get() {
        return newInstance(this.restaurantTransformerProvider.get());
    }
}
