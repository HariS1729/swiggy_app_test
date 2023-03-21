package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodServiceLineProviderV2.kt */
final class FoodServiceLineProviderV2$addToActiveOrder$vm$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodServiceLineProviderV2 f15189a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15190b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodServiceLineProviderV2$addToActiveOrder$vm$2(FoodServiceLineProviderV2 foodServiceLineProviderV2, Order order) {
        super(0);
        this.f15189a = foodServiceLineProviderV2;
        this.f15190b = order;
    }

    public final void invoke() {
        this.f15189a.a().I4(this.f15190b);
        this.f15189a.f().j(this.f15189a.f().c("account", "click-track", this.f15190b.mOrderId, 9999));
    }
}
