package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: PudoServiceLineProvider.kt */
final class PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PudoServiceLineProvider f15219a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DashOrderDetails f15220b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6(PudoServiceLineProvider pudoServiceLineProvider, DashOrderDetails dashOrderDetails) {
        super(0);
        this.f15219a = pudoServiceLineProvider;
        this.f15220b = dashOrderDetails;
    }

    public final void invoke() {
        this.f15219a.a().G9(this.f15220b.getOrderId(), this.f15220b.getType());
    }
}
