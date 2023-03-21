package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodOrderServiceLineProvider.kt */
final class FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodOrderServiceLineProvider f15171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15172b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2(FoodOrderServiceLineProvider foodOrderServiceLineProvider, Order order) {
        super(0);
        this.f15171a = foodOrderServiceLineProvider;
        this.f15172b = order;
    }

    public final void invoke() {
        this.f15171a.a().I4(this.f15172b);
        this.f15171a.f().j(this.f15171a.f().c("account", "click-track", this.f15172b.mOrderId, 9999));
    }
}
