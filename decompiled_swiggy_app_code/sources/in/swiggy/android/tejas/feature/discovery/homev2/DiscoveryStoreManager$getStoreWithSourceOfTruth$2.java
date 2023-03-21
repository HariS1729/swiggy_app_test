package in.swiggy.android.tejas.feature.discovery.homev2;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStoreWithSourceOfTruth$2", f = "DiscoveryStoreManager.kt", l = {192, 192}, m = "invokeSuspend")
/* compiled from: DiscoveryStoreManager.kt */
final class DiscoveryStoreManager$getStoreWithSourceOfTruth$2 extends SuspendLambda implements p<DiscoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<? extends ListingResponse>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStoreManager$getStoreWithSourceOfTruth$2(DiscoveryStoreManager discoveryStoreManager, c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$2> cVar) {
        super(2, cVar);
        this.this$0 = discoveryStoreManager;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DiscoveryStoreManager$getStoreWithSourceOfTruth$2 discoveryStoreManager$getStoreWithSourceOfTruth$2 = new DiscoveryStoreManager$getStoreWithSourceOfTruth$2(this.this$0, cVar);
        discoveryStoreManager$getStoreWithSourceOfTruth$2.L$0 = obj;
        return discoveryStoreManager$getStoreWithSourceOfTruth$2;
    }

    public final Object invoke(DiscoveryRequestParams discoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>> cVar) {
        return ((DiscoveryStoreManager$getStoreWithSourceOfTruth$2) create(discoveryRequestParams, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        DiscoveryRequestParams discoveryRequestParams;
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            discoveryRequestParams = (DiscoveryRequestParams) this.L$0;
            IStorePersister access$getDiscoveryStorePersister$p = this.this$0.discoveryStorePersister;
            this.L$0 = discoveryRequestParams;
            this.label = 1;
            if (access$getDiscoveryStorePersister$p.clearCacheIfExpired(this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            discoveryRequestParams = (DiscoveryRequestParams) this.L$0;
            g.b(obj);
        } else if (i11 == 2) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        IStorePersister access$getDiscoveryStorePersister$p2 = this.this$0.discoveryStorePersister;
        this.L$0 = null;
        this.label = 2;
        obj = access$getDiscoveryStorePersister$p2.loadResponse(discoveryRequestParams, this);
        return obj == d11 ? d11 : obj;
    }
}
