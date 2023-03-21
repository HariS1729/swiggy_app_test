package in.swiggy.android.tejas.feature.home.grid.transformers.restaurant;

import com.swiggy.presentation.food.v2.Restaurant;
import com.swiggy.presentation.food.v2.RestaurantInfoWithStyle;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.restaurants.GridRestaurantSection;
import in.swiggy.android.tejas.feature.listing.restaurant.model.CollectionMetadata;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: RestaurantCollectionEntityTransformer.kt */
public final class RestaurantCollectionEntityTransformer implements ITransformer<RestaurantInfoWithStyle, GridRestaurantSection> {
    private final ITransformer<Restaurant, RestaurantEntity> restaurantTransformer;

    public RestaurantCollectionEntityTransformer(ITransformer<Restaurant, RestaurantEntity> iTransformer) {
        p.j(iTransformer, "restaurantTransformer");
        this.restaurantTransformer = iTransformer;
    }

    public final ITransformer<Restaurant, RestaurantEntity> getRestaurantTransformer() {
        return this.restaurantTransformer;
    }

    public GridRestaurantSection transform(RestaurantInfoWithStyle restaurantInfoWithStyle) {
        p.j(restaurantInfoWithStyle, t.V);
        if (p.e(restaurantInfoWithStyle, RestaurantInfoWithStyle.getDefaultInstance())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Restaurant> restaurantsList = restaurantInfoWithStyle.getRestaurantsList();
        p.i(restaurantsList, "t.restaurantsList");
        int i11 = 0;
        for (T next : restaurantsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                k.t();
            }
            Restaurant restaurant = (Restaurant) next;
            ITransformer<Restaurant, RestaurantEntity> restaurantTransformer2 = getRestaurantTransformer();
            p.i(restaurant, "rest");
            RestaurantEntity transform = restaurantTransformer2.transform(restaurant);
            if (transform != null) {
                String collectionId = restaurantInfoWithStyle.getCollectionId();
                p.i(collectionId, "t.collectionId");
                String theme = restaurantInfoWithStyle.getTheme();
                p.i(theme, "t.theme");
                transform.setCollectionMetadata(new CollectionMetadata(collectionId, i11, theme));
                arrayList.add(transform);
            }
            i11 = i12;
        }
        String theme2 = restaurantInfoWithStyle.getTheme();
        p.i(theme2, "t.theme");
        String collectionId2 = restaurantInfoWithStyle.getCollectionId();
        p.i(collectionId2, "t.collectionId");
        return new GridRestaurantSection(arrayList, theme2, collectionId2);
    }
}
