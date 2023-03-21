package in.swiggy.android.tejas.feature.discovery.magiccart.model;

import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MagicCartModel.kt */
public final class MagicCartModel {
    private final List<MenuItem> menuItems;
    private final Restaurant restaurant;

    public MagicCartModel(Restaurant restaurant2, List<? extends MenuItem> list) {
        p.j(restaurant2, "restaurant");
        p.j(list, "menuItems");
        this.restaurant = restaurant2;
        this.menuItems = list;
    }

    public static /* synthetic */ MagicCartModel copy$default(MagicCartModel magicCartModel, Restaurant restaurant2, List<MenuItem> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            restaurant2 = magicCartModel.restaurant;
        }
        if ((i11 & 2) != 0) {
            list = magicCartModel.menuItems;
        }
        return magicCartModel.copy(restaurant2, list);
    }

    public final Restaurant component1() {
        return this.restaurant;
    }

    public final List<MenuItem> component2() {
        return this.menuItems;
    }

    public final MagicCartModel copy(Restaurant restaurant2, List<? extends MenuItem> list) {
        p.j(restaurant2, "restaurant");
        p.j(list, "menuItems");
        return new MagicCartModel(restaurant2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicCartModel)) {
            return false;
        }
        MagicCartModel magicCartModel = (MagicCartModel) obj;
        return p.e(this.restaurant, magicCartModel.restaurant) && p.e(this.menuItems, magicCartModel.menuItems);
    }

    public final List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public final Restaurant getRestaurant() {
        return this.restaurant;
    }

    public int hashCode() {
        return (this.restaurant.hashCode() * 31) + this.menuItems.hashCode();
    }

    public String toString() {
        return "MagicCartModel(restaurant=" + this.restaurant + ", menuItems=" + this.menuItems + ')';
    }
}
