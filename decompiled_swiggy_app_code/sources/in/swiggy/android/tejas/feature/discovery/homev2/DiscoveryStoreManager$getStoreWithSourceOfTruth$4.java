package in.swiggy.android.tejas.feature.discovery.homev2;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStoreWithSourceOfTruth$4", f = "DiscoveryStoreManager.kt", l = {206}, m = "invokeSuspend")
/* compiled from: DiscoveryStoreManager.kt */
final class DiscoveryStoreManager$getStoreWithSourceOfTruth$4 extends SuspendLambda implements p<DiscoveryRequestParams, c<? super k>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStoreManager$getStoreWithSourceOfTruth$4(DiscoveryStoreManager discoveryStoreManager, c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$4> cVar) {
        super(2, cVar);
        this.this$0 = discoveryStoreManager;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DiscoveryStoreManager$getStoreWithSourceOfTruth$4 discoveryStoreManager$getStoreWithSourceOfTruth$4 = new DiscoveryStoreManager$getStoreWithSourceOfTruth$4(this.this$0, cVar);
        discoveryStoreManager$getStoreWithSourceOfTruth$4.L$0 = obj;
        return discoveryStoreManager$getStoreWithSourceOfTruth$4;
    }

    public final Object invoke(DiscoveryRequestParams discoveryRequestParams, c<? super k> cVar) {
        return ((DiscoveryStoreManager$getStoreWithSourceOfTruth$4) create(discoveryRequestParams, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            IStorePersister access$getDiscoveryStorePersister$p = this.this$0.discoveryStorePersister;
            this.label = 1;
            if (access$getDiscoveryStorePersister$p.deleteResponse((DiscoveryRequestParams) this.L$0, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
