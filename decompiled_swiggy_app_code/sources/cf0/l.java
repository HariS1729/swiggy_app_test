package cf0;

import bp0.k;
import in.swiggy.android.repositories.cart.interfaces.ICartValidator$CartValidationFailType;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuDimensions;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuStoreDetails;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuVariation;
import kotlin.jvm.internal.p;
import lp0.a;
import ze0.b;

/* compiled from: InstamartCartValidator.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final b f18123a;

    /* renamed from: b  reason: collision with root package name */
    private final MartMenuStoreDetails f18124b;

    /* renamed from: c  reason: collision with root package name */
    private final MartMenuVariation f18125c;

    /* renamed from: d  reason: collision with root package name */
    private final a<k> f18126d;

    /* renamed from: e  reason: collision with root package name */
    private final lp0.l<ICartValidator$CartValidationFailType, k> f18127e;

    public l(b bVar, MartMenuStoreDetails martMenuStoreDetails, MartMenuVariation martMenuVariation, a<k> aVar, lp0.l<? super ICartValidator$CartValidationFailType, k> lVar) {
        p.j(bVar, "cart");
        p.j(martMenuStoreDetails, "storeDetails");
        p.j(martMenuVariation, "item");
        p.j(aVar, "onSuccess");
        p.j(lVar, "onFailed");
        this.f18123a = bVar;
        this.f18124b = martMenuStoreDetails;
        this.f18125c = martMenuVariation;
        this.f18126d = aVar;
        this.f18127e = lVar;
    }

    private final int a(MartMenuVariation martMenuVariation) {
        MartMenuDimensions dimensions = martMenuVariation.getDimensions();
        int heightInCm = dimensions.getHeightInCm() * dimensions.getWidthInCm() * dimensions.getLengthInCm();
        if (heightInCm != 0) {
            return heightInCm;
        }
        if (martMenuVariation.getDimensions().getVolumeInCc() != 0) {
            return martMenuVariation.getDimensions().getVolumeInCc();
        }
        return martMenuVariation.getWeightInGrams() * 2;
    }

    private final boolean b() {
        return ((long) (this.f18123a.B() + 1)) > this.f18124b.getMaxAllowedItemsInCart();
    }

    private final boolean c() {
        return ((long) (this.f18123a.x() + a(this.f18125c))) > this.f18124b.getMaxAllowedCartVolumeInCc();
    }

    private final boolean d() {
        return ((long) (this.f18123a.y() + this.f18125c.getWeightInGrams())) > this.f18124b.getMaxAllowedWeightInGrams();
    }

    private final boolean e() {
        return this.f18123a.e(this.f18125c) + 1 > this.f18125c.getCartAllowedQuantity().getTotal();
    }

    public void f() {
        lp0.l<ICartValidator$CartValidationFailType, k> lVar = this.f18127e;
        if (e()) {
            lVar.invoke(ICartValidator$CartValidationFailType.ITEM_LEVEL_QUANTITY_EXCEEDED);
        } else if (b()) {
            lVar.invoke(ICartValidator$CartValidationFailType.CART_LEVEL_QUANTITY_EXCEEDED);
        } else if (d()) {
            lVar.invoke(ICartValidator$CartValidationFailType.CART_WEIGHT_EXCEEDED);
        } else if (c()) {
            lVar.invoke(ICartValidator$CartValidationFailType.CART_VOLUME_EXCEEDED);
        } else {
            this.f18126d.invoke();
        }
    }
}
