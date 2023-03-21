package in.swiggy.android.tejas.feature.home.grid.model.restaurants;

import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GridRestaurantSection.kt */
public final class GridRestaurantSection extends GridWidgetItem {
    private final String collectionId;
    private final List<RestaurantEntity> info;
    private final String theme;

    public GridRestaurantSection(List<? extends RestaurantEntity> list, String str, String str2) {
        p.j(list, "info");
        p.j(str, "theme");
        p.j(str2, "collectionId");
        this.info = list;
        this.theme = str;
        this.collectionId = str2;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<RestaurantEntity> getInfo() {
        return this.info;
    }

    public int getItemsCount() {
        return this.info.size();
    }

    public final String getTheme() {
        return this.theme;
    }
}
