package bf0;

import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData;
import in.swiggy.android.tejas.oldapi.models.cart.ReviewedCart;
import in.swiggy.android.tejas.oldapi.models.cart.UserFlowInfo;
import in.swiggy.android.tejas.oldapi.models.meals.MealItemInCart;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import java.util.List;

/* compiled from: ICart */
public interface a {
    int A();

    ReviewedCart B();

    int C(MenuItemInCart menuItemInCart);

    void D(MenuItem menuItem);

    void E(RestaurantMetaData restaurantMetaData);

    double F();

    void I(int i11);

    boolean J();

    void K(UserFlowInfo userFlowInfo);

    int L(MenuItem menuItem);

    List<MenuItemInCart> M();

    String O();

    int P();

    void Q(Long l11);

    List<MenuItemInCart> R(MenuItem menuItem);

    void T(String str);

    boolean V(String str);

    double W();

    boolean X(MealItemInCart mealItemInCart);

    int Y();

    MenuItemInCart Z(MenuItem menuItem);

    int a();

    double a0();

    int b(MenuItem menuItem);

    int b0();

    void c(MenuItemInCart menuItemInCart);

    String c0();

    int d();

    String e();

    MenuItemInCart e0(MenuItem menuItem);

    void f(MenuItemInCart menuItemInCart);

    String f0();

    void g(String str);

    Address getDeliveryAddress();

    String getRestaurantId();

    String getRestaurantName();

    void h(boolean z11);

    RestaurantMetaData i();

    boolean isEmpty();

    void j(Address address);

    boolean k();

    List<MealItemInCart> l();

    UserFlowInfo m();

    void n(MenuItem menuItem);

    void p(double d11);

    int v();

    boolean x(MenuItem menuItem);

    boolean y();

    void z();
}
