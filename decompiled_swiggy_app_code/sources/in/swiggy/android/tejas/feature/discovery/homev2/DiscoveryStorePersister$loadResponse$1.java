package in.swiggy.android.tejas.feature.discovery.homev2;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStorePersister", f = "DiscoveryStorePersister.kt", l = {109, 111}, m = "loadResponse")
/* compiled from: DiscoveryStorePersister.kt */
final class DiscoveryStorePersister$loadResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStorePersister$loadResponse$1(DiscoveryStorePersister discoveryStorePersister, c<? super DiscoveryStorePersister$loadResponse$1> cVar) {
        super(cVar);
        this.this$0 = discoveryStorePersister;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadResponse((DiscoveryRequestParams) null, (c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>>) this);
    }
}
