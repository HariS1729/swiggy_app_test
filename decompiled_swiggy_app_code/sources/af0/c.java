package af0;

import ao0.d;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import io.reactivex.processors.PublishProcessor;

/* compiled from: ICartSubscriptionsProvider */
public interface c {
    d<MenuItemInCart> H();

    PublishProcessor<Boolean> J();

    d<MenuItemInCart> K(String str);

    void g(a aVar);

    void k(d dVar);

    d<LocalInstamartItem> n(String str);

    d<Integer> p();

    d<MenuItemInCart> w();

    void x(d dVar);

    void z(a aVar);
}
