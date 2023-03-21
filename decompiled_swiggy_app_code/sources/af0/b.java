package af0;

import in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.Variation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ICartModifier */
public interface b {
    void N(MenuItem menuItem, int i11, HashMap<String, List<Addon>> hashMap, Map<String, Variation> map, String str, double d11);

    void S(MenuItem menuItem);

    void U(MealItemInCart mealItemInCart);

    void c(MenuItemInCart menuItemInCart);

    void f(MenuItemInCart menuItemInCart);

    void o(MealItemInCart mealItemInCart);

    void q(MealItemInCart mealItemInCart);

    void r(MenuItem menuItem);

    void s(MealItemInCart mealItemInCart);

    void t(MenuItemInCart menuItemInCart);

    void u(MenuItem menuItem, int i11);
}
