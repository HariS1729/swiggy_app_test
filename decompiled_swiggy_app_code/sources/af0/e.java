package af0;

import bp0.k;
import in.swiggy.android.repositories.cart.interfaces.ICartValidator$CartValidationFailType;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuItem;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuVariation;
import lp0.l;

/* compiled from: IInstamartCartModifier.kt */
public interface e {
    void l(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation);

    void m(MartMenuItem martMenuItem, MartMenuVariation martMenuVariation, l<? super ICartValidator$CartValidationFailType, k> lVar);
}
