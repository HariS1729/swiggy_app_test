package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: FoodServiceLineProviderV2.kt */
final class FoodServiceLineProviderV2$addToPastOrder$vm$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FoodServiceLineProviderV2 f15195a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Order f15196b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f15197c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodServiceLineProviderV2$addToPastOrder$vm$2(FoodServiceLineProviderV2 foodServiceLineProviderV2, Order order, int i11) {
        super(0);
        this.f15195a = foodServiceLineProviderV2;
        this.f15196b = order;
        this.f15197c = i11;
    }

    public final void invoke() {
        this.f15195a.Z().invoke(this.f15196b, Integer.valueOf(this.f15197c));
        this.f15195a.f().j(this.f15195a.f().c("account", "click-reorder", this.f15196b.mOrderId, 9999));
    }
}
