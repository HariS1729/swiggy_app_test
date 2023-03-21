package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodOrderServiceLineProvider.kt */
final class FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodOrderServiceLineProvider f15169a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15170b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1(FoodOrderServiceLineProvider foodOrderServiceLineProvider, Order order) {
        super(0);
        this.f15169a = foodOrderServiceLineProvider;
        this.f15170b = order;
    }

    public final void invoke() {
        this.f15169a.a().e1(this.f15170b);
    }
}
