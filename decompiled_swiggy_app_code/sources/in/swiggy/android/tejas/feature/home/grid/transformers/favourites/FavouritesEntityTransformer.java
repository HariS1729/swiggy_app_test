package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.presentation.food.v2.FavouriteRestaurantInfoWithStyle;
import com.swiggy.presentation.food.v2.Restaurant;
import com.swiggy.presentation.food.v2.Style;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.favourite.GridFavouriteSection;
import in.swiggy.android.tejas.feature.listing.grid.model.FavouriteItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.WidgetType;
import in.swiggy.android.tejas.feature.listing.restaurant.model.CollectionMetadata;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: FavouritesEntityTransformer.kt */
public final class FavouritesEntityTransformer implements ITransformer<FavouriteRestaurantInfoWithStyle, GridFavouriteSection> {
    private final ITransformer<Restaurant, RestaurantEntity> restaurantTransformer;
    private final ITransformer<Style, FavouriteItemStyle> styleTransformer;

    public FavouritesEntityTransformer(ITransformer<Restaurant, RestaurantEntity> iTransformer, ITransformer<Style, FavouriteItemStyle> iTransformer2) {
        p.j(iTransformer, "restaurantTransformer");
        p.j(iTransformer2, "styleTransformer");
        this.restaurantTransformer = iTransformer;
        this.styleTransformer = iTransformer2;
    }

    public final ITransformer<Restaurant, RestaurantEntity> getRestaurantTransformer() {
        return this.restaurantTransformer;
    }

    public final WidgetType validRemoteWidgetType(com.swiggy.presentation.food.v2.WidgetType widgetType) {
        String str;
        Class<FavouritesEntityTransformer> cls = FavouritesEntityTransformer.class;
        p.j(widgetType, "remoteRemoteWidgetType");
        if (p.e(widgetType.name(), com.swiggy.presentation.food.v2.WidgetType.WIDGET_TYPE_INVALID.name()) || p.e(widgetType.name(), com.swiggy.presentation.food.v2.WidgetType.UNRECOGNIZED.name())) {
            return WidgetType.valueOf(WidgetType.WIDGET_TYPE_FAVOURITES.name());
        }
        try {
            return WidgetType.valueOf(widgetType.name());
        } catch (Throwable th2) {
            if (!cls.isAnonymousClass()) {
                str = cls.getSimpleName();
                if (str.length() > 23) {
                    p.i(str, "name");
                    str = str.substring(0, 23);
                    p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                p.i(str, "{\n            val name =… first 23 chars\n        }");
            } else {
                String name = cls.getName();
                if (name.length() > 23) {
                    p.i(name, "name");
                    name = name.substring(name.length() - 23, name.length());
                    p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                p.i(str, "{\n            val name =…/ last 23 chars\n        }");
            }
            u.h(str, th2);
            return WidgetType.valueOf(WidgetType.WIDGET_TYPE_FAVOURITES.name());
        }
    }

    public GridFavouriteSection transform(FavouriteRestaurantInfoWithStyle favouriteRestaurantInfoWithStyle) {
        p.j(favouriteRestaurantInfoWithStyle, t.V);
        if (p.e(favouriteRestaurantInfoWithStyle, FavouriteRestaurantInfoWithStyle.getDefaultInstance())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.swiggy.presentation.food.v2.WidgetType widgetType = favouriteRestaurantInfoWithStyle.getWidgetType();
        p.i(widgetType, "t.widgetType");
        WidgetType validRemoteWidgetType = validRemoteWidgetType(widgetType);
        ITransformer<Style, FavouriteItemStyle> iTransformer = this.styleTransformer;
        Style style = favouriteRestaurantInfoWithStyle.getStyle();
        p.i(style, "t.style");
        FavouriteItemStyle transform = iTransformer.transform(style);
        List<Restaurant> restaurantsList = favouriteRestaurantInfoWithStyle.getRestaurantsList();
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
            RestaurantEntity transform2 = restaurantTransformer2.transform(restaurant);
            if (transform2 != null) {
                String collectionId = favouriteRestaurantInfoWithStyle.getCollectionId();
                p.i(collectionId, "t.collectionId");
                String theme = favouriteRestaurantInfoWithStyle.getTheme();
                p.i(theme, "t.theme");
                transform2.setCollectionMetadata(new CollectionMetadata(collectionId, i11, theme));
                arrayList.add(transform2);
            }
            i11 = i12;
        }
        String theme2 = favouriteRestaurantInfoWithStyle.getTheme();
        p.i(theme2, "t.theme");
        String collectionId2 = favouriteRestaurantInfoWithStyle.getCollectionId();
        p.i(collectionId2, "t.collectionId");
        return new GridFavouriteSection(arrayList, theme2, collectionId2, validRemoteWidgetType, transform, (String) null, 32, (i) null);
    }
}
