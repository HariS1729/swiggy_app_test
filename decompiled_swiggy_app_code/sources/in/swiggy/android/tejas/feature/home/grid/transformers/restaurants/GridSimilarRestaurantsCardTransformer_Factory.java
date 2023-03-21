package in.swiggy.android.tejas.feature.home.grid.transformers.restaurants;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.presentation.food.v2.Restaurant;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class GridSimilarRestaurantsCardTransformer_Factory implements e<GridSimilarRestaurantsCardTransformer> {
    private final Provider<ITransformer<Analytics, AnalyticsData>> analyticsTransformerProvider;
    private final Provider<ITransformer<Restaurant, RestaurantEntity>> restaurantTransformerProvider;

    public GridSimilarRestaurantsCardTransformer_Factory(Provider<ITransformer<Restaurant, RestaurantEntity>> provider, Provider<ITransformer<Analytics, AnalyticsData>> provider2) {
        this.restaurantTransformerProvider = provider;
        this.analyticsTransformerProvider = provider2;
    }

    public static GridSimilarRestaurantsCardTransformer_Factory create(Provider<ITransformer<Restaurant, RestaurantEntity>> provider, Provider<ITransformer<Analytics, AnalyticsData>> provider2) {
        return new GridSimilarRestaurantsCardTransformer_Factory(provider, provider2);
    }

    public static GridSimilarRestaurantsCardTransformer newInstance(ITransformer<Restaurant, RestaurantEntity> iTransformer, ITransformer<Analytics, AnalyticsData> iTransformer2) {
        return new GridSimilarRestaurantsCardTransformer(iTransformer, iTransformer2);
    }

    public GridSimilarRestaurantsCardTransformer get() {
        return newInstance(this.restaurantTransformerProvider.get(), this.analyticsTransformerProvider.get());
    }
}
