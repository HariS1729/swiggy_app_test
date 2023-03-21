package in.swiggy.android.tejas.feature.home.grid.transformers.restaurants;

import com.swiggy.presentation.food.v2.SimilarRestaurantsInfoWithStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.GridSimilarRestaurantSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RestaurantsTransformerModule_ProvidesGridSimilarRestaurantsTransformerFactory implements e<ITransformer<SimilarRestaurantsInfoWithStyle, GridSimilarRestaurantSection>> {
    private final Provider<GridSimilarRestaurantsCardTransformer> gridSimilarRestaurantsCardTransformerProvider;

    public RestaurantsTransformerModule_ProvidesGridSimilarRestaurantsTransformerFactory(Provider<GridSimilarRestaurantsCardTransformer> provider) {
        this.gridSimilarRestaurantsCardTransformerProvider = provider;
    }

    public static RestaurantsTransformerModule_ProvidesGridSimilarRestaurantsTransformerFactory create(Provider<GridSimilarRestaurantsCardTransformer> provider) {
        return new RestaurantsTransformerModule_ProvidesGridSimilarRestaurantsTransformerFactory(provider);
    }

    public static ITransformer<SimilarRestaurantsInfoWithStyle, GridSimilarRestaurantSection> providesGridSimilarRestaurantsTransformer(GridSimilarRestaurantsCardTransformer gridSimilarRestaurantsCardTransformer) {
        return (ITransformer) i.e(RestaurantsTransformerModule.providesGridSimilarRestaurantsTransformer(gridSimilarRestaurantsCardTransformer));
    }

    public ITransformer<SimilarRestaurantsInfoWithStyle, GridSimilarRestaurantSection> get() {
        return providesGridSimilarRestaurantsTransformer(this.gridSimilarRestaurantsCardTransformerProvider.get());
    }
}
