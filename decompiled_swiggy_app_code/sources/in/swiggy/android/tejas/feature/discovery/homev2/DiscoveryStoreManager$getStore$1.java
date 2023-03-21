package in.swiggy.android.tejas.feature.discovery.homev2;

import dc.e;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager", f = "DiscoveryStoreManager.kt", l = {258}, m = "getStore")
/* compiled from: DiscoveryStoreManager.kt */
final class DiscoveryStoreManager$getStore$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStoreManager$getStore$1(DiscoveryStoreManager discoveryStoreManager, c<? super DiscoveryStoreManager$getStore$1> cVar) {
        super(cVar);
        this.this$0 = discoveryStoreManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getStore((IDiscoveryAPI) null, (DiscoveryRequestParams) null, (c<? super e<DiscoveryRequestParams, kotlinx.coroutines.flow.d<Response<ListingResponse>>>>) this);
    }
}
