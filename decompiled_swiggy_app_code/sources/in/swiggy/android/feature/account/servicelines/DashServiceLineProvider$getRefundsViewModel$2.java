package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: DashServiceLineProvider.kt */
final class DashServiceLineProvider$getRefundsViewModel$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DashServiceLineProvider f15141a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DashOrderDetails f15142b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DashServiceLineProvider$getRefundsViewModel$2(DashServiceLineProvider dashServiceLineProvider, DashOrderDetails dashOrderDetails) {
        super(0);
        this.f15141a = dashServiceLineProvider;
        this.f15142b = dashOrderDetails;
    }

    public final void invoke() {
        this.f15141a.a().n3(this.f15142b);
    }
}
