package ug0;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import go0.a;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import mb0.n1;

/* compiled from: ISwiggyLynxApplicationHelper.kt */
public interface e {
    void b(MenuItemInCart menuItemInCart, a aVar);

    void c(String str, AppCompatActivity appCompatActivity);

    void n(MenuItemInCart menuItemInCart, Restaurant restaurant, a aVar);

    void o(Activity activity);

    Address p(Bundle bundle);

    String q(Bundle bundle);

    boolean r(String str);

    void s(n1 n1Var, int i11, String str, String str2, double d11);

    void t(c cVar);

    void u(n1 n1Var);
}
