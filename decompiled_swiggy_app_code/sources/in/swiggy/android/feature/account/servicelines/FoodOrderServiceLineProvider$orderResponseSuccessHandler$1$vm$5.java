package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderhelp.OrderHelpTransformer;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.p;

/* compiled from: FoodOrderServiceLineProvider.kt */
final class FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodOrderServiceLineProvider f15177a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f15179c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5(FoodOrderServiceLineProvider foodOrderServiceLineProvider, Order order, int i11) {
        super(0);
        this.f15177a = foodOrderServiceLineProvider;
        this.f15178b = order;
        this.f15179c = i11;
    }

    public final void invoke() {
        p F = this.f15177a.f15165o;
        Order order = this.f15178b;
        kotlin.jvm.internal.p.i(order, OrderHelpTransformer.ISSUE_TYPE_ORDER);
        F.invoke(order, Integer.valueOf(this.f15179c));
        this.f15177a.f().j(this.f15177a.f().c("account", "click-reorder", this.f15178b.mOrderId, 9999));
    }
}
