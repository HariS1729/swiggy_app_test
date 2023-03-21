package cf0;

import af0.c;
import bf0.a;
import bf0.b;
import in.swiggy.android.tejas.oldapi.models.cart.CartType;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.oldapi.models.reorder.ReorderCardData;

/* compiled from: ICartService */
public interface i extends c {
    a B();

    void D(ReorderCardData reorderCardData);

    int E();

    void F();

    void G(Order order);

    void I(String str);

    void a();

    void b();

    void d();

    void e();

    CartType getCartType();

    b getInstamartCart();

    void i(String str);

    a v(CartType cartType);

    Boolean y();
}
