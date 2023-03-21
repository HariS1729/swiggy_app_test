package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: PudoServiceLineProvider.kt */
final class PudoServiceLineProvider$getRefundsViewModel$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PudoServiceLineProvider f15210a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DashOrderDetails f15211b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PudoServiceLineProvider$getRefundsViewModel$2(PudoServiceLineProvider pudoServiceLineProvider, DashOrderDetails dashOrderDetails) {
        super(0);
        this.f15210a = pudoServiceLineProvider;
        this.f15211b = dashOrderDetails;
    }

    public final void invoke() {
        this.f15210a.a().n3(this.f15211b);
    }
}
