package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: DashServiceLineProvider.kt */
final class DashServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DashOrderDetails f15152a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DashServiceLineProvider f15153b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DashServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7(DashOrderDetails dashOrderDetails, DashServiceLineProvider dashServiceLineProvider) {
        super(0);
        this.f15152a = dashOrderDetails;
        this.f15153b = dashServiceLineProvider;
    }

    public final void invoke() {
        if (this.f15152a.getType() == 5) {
            this.f15153b.a().a7(this.f15152a.getOrderId());
        } else {
            this.f15153b.a().V7(this.f15152a.getOrderId());
        }
    }
}
