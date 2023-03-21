package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: DinersServiceLineProvider.kt */
final class DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DashOrderDetails f15159a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DinersServiceLineProvider f15160b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1(DashOrderDetails dashOrderDetails, DinersServiceLineProvider dinersServiceLineProvider) {
        super(0);
        this.f15159a = dashOrderDetails;
        this.f15160b = dinersServiceLineProvider;
    }

    public final void invoke() {
        if (this.f15159a.getStatus() == 17) {
            this.f15160b.a().O7(this.f15159a);
        } else {
            this.f15160b.a().i2(this.f15159a);
        }
    }
}
