package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodOrderServiceLineProvider.kt */
final class FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodOrderServiceLineProvider f15173a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15174b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3(FoodOrderServiceLineProvider foodOrderServiceLineProvider, Order order) {
        super(0);
        this.f15173a = foodOrderServiceLineProvider;
        this.f15174b = order;
    }

    public final void invoke() {
        this.f15173a.a().B1(this.f15174b);
        this.f15173a.f().j(this.f15173a.f().c("account", "click-help", this.f15174b.mOrderId, 9999));
    }
}
