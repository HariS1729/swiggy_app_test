package in.swiggy.android.tejas.feature.home.grid.transformers.restaurants;

import com.swiggy.presentation.food.v2.SimilarRestaurantsInfoWithStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.GridSimilarRestaurantSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RestaurantsTransformerModule.kt */
public final class RestaurantsTransformerModule {
    public static final RestaurantsTransformerModule INSTANCE = new RestaurantsTransformerModule();

    private RestaurantsTransformerModule() {
    }

    public static final ITransformer<SimilarRestaurantsInfoWithStyle, GridSimilarRestaurantSection> providesGridSimilarRestaurantsTransformer(GridSimilarRestaurantsCardTransformer gridSimilarRestaurantsCardTransformer) {
        p.j(gridSimilarRestaurantsCardTransformer, "gridSimilarRestaurantsCardTransformer");
        return gridSimilarRestaurantsCardTransformer;
    }
}
