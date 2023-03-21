package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodServiceLineProviderV2.kt */
final class FoodServiceLineProviderV2$addToPastOrder$vm$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodServiceLineProviderV2 f15193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15194b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodServiceLineProviderV2$addToPastOrder$vm$1(FoodServiceLineProviderV2 foodServiceLineProviderV2, Order order) {
        super(0);
        this.f15193a = foodServiceLineProviderV2;
        this.f15194b = order;
    }

    public final void invoke() {
        this.f15193a.a().e9(this.f15194b.mOrderId);
    }
}
