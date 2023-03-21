package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: PudoServiceLineProvider.kt */
final class PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PudoServiceLineProvider f15221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DashOrderDetails f15222b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7(PudoServiceLineProvider pudoServiceLineProvider, DashOrderDetails dashOrderDetails) {
        super(0);
        this.f15221a = pudoServiceLineProvider;
        this.f15222b = dashOrderDetails;
    }

    public final void invoke() {
        this.f15221a.a().V7(this.f15222b.getOrderId());
    }
}
