package in.swiggy.android.tejas.feature.home.grid.transformers.restaurants;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.presentation.food.v2.Restaurant;
import com.swiggy.presentation.food.v2.SimilarRestaurantsInfoWithStyle;
import i20.t;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.grid.model.GridSimilarRestaurantSection;
import in.swiggy.android.tejas.feature.listing.grid.model.WidgetType;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GridSimilarRestaurantsCardTransformer.kt */
public final class GridSimilarRestaurantsCardTransformer implements ITransformer<SimilarRestaurantsInfoWithStyle, GridSimilarRestaurantSection> {
    private final ITransformer<Analytics, AnalyticsData> analyticsTransformer;
    private final ITransformer<Restaurant, RestaurantEntity> restaurantTransformer;

    public GridSimilarRestaurantsCardTransformer(ITransformer<Restaurant, RestaurantEntity> iTransformer, ITransformer<Analytics, AnalyticsData> iTransformer2) {
        p.j(iTransformer, "restaurantTransformer");
        p.j(iTransformer2, "analyticsTransformer");
        this.restaurantTransformer = iTransformer;
        this.analyticsTransformer = iTransformer2;
    }

    public final ITransformer<Restaurant, RestaurantEntity> getRestaurantTransformer() {
        return this.restaurantTransformer;
    }

    public GridSimilarRestaurantSection transform(SimilarRestaurantsInfoWithStyle similarRestaurantsInfoWithStyle) {
        WidgetType widgetType;
        p.j(similarRestaurantsInfoWithStyle, t.V);
        ArrayList arrayList = new ArrayList();
        boolean z11 = similarRestaurantsInfoWithStyle.getWidgetType() == com.swiggy.presentation.food.v2.WidgetType.WIDGET_TYPE_BYO;
        List<Restaurant> restaurantsList = similarRestaurantsInfoWithStyle.getRestaurantsList();
        p.i(restaurantsList, "t.restaurantsList");
        for (Restaurant restaurant : restaurantsList) {
            ITransformer<Restaurant, RestaurantEntity> restaurantTransformer2 = getRestaurantTransformer();
            p.i(restaurant, "restaurant");
            RestaurantEntity transform = restaurantTransformer2.transform(restaurant);
            if (z11) {
                Analytics build = Analytics.newBuilder(restaurant.getAnalytics()).setScreenName("new-home-page").build();
                ITransformer<Analytics, AnalyticsData> iTransformer = this.analyticsTransformer;
                p.i(build, "newAnalytics");
                AnalyticsData transform2 = iTransformer.transform(build);
                if (transform != null) {
                    transform.setAnalyticsData(transform2);
                }
            }
            if (transform != null) {
                arrayList.add(transform);
            }
        }
        String theme = similarRestaurantsInfoWithStyle.getTheme();
        p.i(theme, "t.theme");
        String collectionId = similarRestaurantsInfoWithStyle.getCollectionId();
        p.i(collectionId, "t.collectionId");
        if (z11) {
            widgetType = WidgetType.WIDGET_TYPE_BYO;
        } else {
            widgetType = WidgetType.WIDGET_TYPE_SIMILAR_RESTAURANTS;
        }
        return new GridSimilarRestaurantSection(arrayList, theme, collectionId, widgetType);
    }
}
