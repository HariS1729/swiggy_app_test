package in.swiggy.android.tejas.feature.discovery.homev2;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStoreWithSourceOfTruth$1", f = "DiscoveryStoreManager.kt", l = {188}, m = "invokeSuspend")
/* compiled from: DiscoveryStoreManager.kt */
final class DiscoveryStoreManager$getStoreWithSourceOfTruth$1 extends SuspendLambda implements p<DiscoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<? extends ListingResponse>>>, Object> {
    final /* synthetic */ IDiscoveryAPI $api;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStoreManager$getStoreWithSourceOfTruth$1(DiscoveryStoreManager discoveryStoreManager, IDiscoveryAPI iDiscoveryAPI, c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$1> cVar) {
        super(2, cVar);
        this.this$0 = discoveryStoreManager;
        this.$api = iDiscoveryAPI;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DiscoveryStoreManager$getStoreWithSourceOfTruth$1 discoveryStoreManager$getStoreWithSourceOfTruth$1 = new DiscoveryStoreManager$getStoreWithSourceOfTruth$1(this.this$0, this.$api, cVar);
        discoveryStoreManager$getStoreWithSourceOfTruth$1.L$0 = obj;
        return discoveryStoreManager$getStoreWithSourceOfTruth$1;
    }

    public final Object invoke(DiscoveryRequestParams discoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>> cVar) {
        return ((DiscoveryStoreManager$getStoreWithSourceOfTruth$1) create(discoveryRequestParams, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            DiscoveryStoreManager discoveryStoreManager = this.this$0;
            IDiscoveryAPI iDiscoveryAPI = this.$api;
            this.label = 1;
            obj = discoveryStoreManager.getActiveAPIResponse(iDiscoveryAPI, (DiscoveryRequestParams) this.L$0, (c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>>) this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
