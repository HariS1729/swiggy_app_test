package bf0;

import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuVariation;
import java.util.List;

/* compiled from: IInstamartCart.kt */
public interface b {
    void b();

    double c(MartMenuItem martMenuItem);

    List<LocalInstamartItem> d();

    int e(MartMenuVariation martMenuVariation);

    int f(MartMenuItem martMenuItem);

    boolean g();

    String getCouponCode();

    void h(GetIMCartData getIMCartData);

    String i();

    String j();

    int k();

    String n();

    void o(GetIMCartData getIMCartData);

    String p();

    double q();

    String r();

    Boolean s();

    String t();
}
