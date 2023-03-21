package in.swiggy.android.tejas.feature.home.grid.model.favourite;

import in.swiggy.android.tejas.feature.listing.grid.model.FavouriteItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import in.swiggy.android.tejas.feature.listing.grid.model.WidgetType;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GridFavouriteSection.kt */
public final class GridFavouriteSection extends GridWidgetItem {
    private final String collectionId;
    private String collectionTags;
    private final FavouriteItemStyle favouriteItemStyle;
    private final List<RestaurantEntity> info;
    private final String theme;
    private final WidgetType widgetType;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GridFavouriteSection(List list, String str, String str2, WidgetType widgetType2, FavouriteItemStyle favouriteItemStyle2, String str3, int i11, i iVar) {
        this(list, str, str2, widgetType2, favouriteItemStyle2, (i11 & 32) != 0 ? null : str3);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionTags() {
        return this.collectionTags;
    }

    public final FavouriteItemStyle getFavouriteItemStyle() {
        return this.favouriteItemStyle;
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

    public final WidgetType getWidgetType() {
        return this.widgetType;
    }

    public final void setCollectionTags(String str) {
        this.collectionTags = str;
    }

    public GridFavouriteSection(List<? extends RestaurantEntity> list, String str, String str2, WidgetType widgetType2, FavouriteItemStyle favouriteItemStyle2, String str3) {
        p.j(list, "info");
        p.j(str, "theme");
        p.j(str2, "collectionId");
        p.j(widgetType2, "widgetType");
        this.info = list;
        this.theme = str;
        this.collectionId = str2;
        this.widgetType = widgetType2;
        this.favouriteItemStyle = favouriteItemStyle2;
        this.collectionTags = str3;
    }
}
