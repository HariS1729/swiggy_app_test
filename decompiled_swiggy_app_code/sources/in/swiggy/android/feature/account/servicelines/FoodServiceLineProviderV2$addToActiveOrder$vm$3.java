package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodServiceLineProviderV2.kt */
final class FoodServiceLineProviderV2$addToActiveOrder$vm$3 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodServiceLineProviderV2 f15191a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15192b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodServiceLineProviderV2$addToActiveOrder$vm$3(FoodServiceLineProviderV2 foodServiceLineProviderV2, Order order) {
        super(0);
        this.f15191a = foodServiceLineProviderV2;
        this.f15192b = order;
    }

    public final void invoke() {
        this.f15191a.a().B1(this.f15192b);
        this.f15191a.f().j(this.f15191a.f().c("account", "click-help", this.f15192b.mOrderId, 9999));
    }
}
