package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderhelp.OrderHelpTransformer;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: FoodOrderServiceLineProvider.kt */
final class FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodOrderServiceLineProvider f15180a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15181b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6(FoodOrderServiceLineProvider foodOrderServiceLineProvider, Order order) {
        super(0);
        this.f15180a = foodOrderServiceLineProvider;
        this.f15181b = order;
    }

    public final void invoke() {
        l E = this.f15180a.f15166p;
        Order order = this.f15181b;
        p.i(order, OrderHelpTransformer.ISSUE_TYPE_ORDER);
        E.invoke(order);
    }
}
