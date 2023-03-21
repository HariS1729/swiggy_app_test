package in.swiggy.android.feature.account.servicelines;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import r10.d0;

/* compiled from: ServiceLineProvider.kt */
final class ServiceLineProvider$pastOrdersServiceLineViewModel$2 extends Lambda implements a<d0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ServiceLineProvider f15234a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<ServiceLineProvider, k> f15235b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ServiceLineProvider$pastOrdersServiceLineViewModel$2(ServiceLineProvider serviceLineProvider, l<? super ServiceLineProvider, k> lVar) {
        super(0);
        this.f15234a = serviceLineProvider;
        this.f15235b = lVar;
    }

    /* renamed from: a */
    public final d0 invoke() {
        String p11 = this.f15234a.p();
        boolean s11 = this.f15234a.s();
        final l<ServiceLineProvider, k> lVar = this.f15235b;
        final ServiceLineProvider serviceLineProvider = this.f15234a;
        return new d0(p11, s11, new a<k>() {
            public final void invoke() {
                lVar.invoke(serviceLineProvider);
            }
        });
    }
}
