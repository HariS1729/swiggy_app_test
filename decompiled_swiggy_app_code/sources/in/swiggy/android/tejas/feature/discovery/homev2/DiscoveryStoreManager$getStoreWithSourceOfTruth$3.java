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
import kotlin.jvm.internal.p;
import lp0.q;
import os.u;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreManager$getStoreWithSourceOfTruth$3", f = "DiscoveryStoreManager.kt", l = {198}, m = "invokeSuspend")
/* compiled from: DiscoveryStoreManager.kt */
final class DiscoveryStoreManager$getStoreWithSourceOfTruth$3 extends SuspendLambda implements q<DiscoveryRequestParams, kotlinx.coroutines.flow.d<? extends Response<? extends ListingResponse>>, c<? super k>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStoreManager$getStoreWithSourceOfTruth$3(DiscoveryStoreManager discoveryStoreManager, c<? super DiscoveryStoreManager$getStoreWithSourceOfTruth$3> cVar) {
        super(3, cVar);
        this.this$0 = discoveryStoreManager;
    }

    public final Object invoke(DiscoveryRequestParams discoveryRequestParams, kotlinx.coroutines.flow.d<? extends Response<ListingResponse>> dVar, c<? super k> cVar) {
        DiscoveryStoreManager$getStoreWithSourceOfTruth$3 discoveryStoreManager$getStoreWithSourceOfTruth$3 = new DiscoveryStoreManager$getStoreWithSourceOfTruth$3(this.this$0, cVar);
        discoveryStoreManager$getStoreWithSourceOfTruth$3.L$0 = discoveryRequestParams;
        discoveryStoreManager$getStoreWithSourceOfTruth$3.L$1 = dVar;
        return discoveryStoreManager$getStoreWithSourceOfTruth$3.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Class<DiscoveryStoreManager> cls = DiscoveryStoreManager.class;
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            DiscoveryRequestParams discoveryRequestParams = (DiscoveryRequestParams) this.L$0;
            kotlinx.coroutines.flow.d dVar = (kotlinx.coroutines.flow.d) this.L$1;
            IStorePersister access$getDiscoveryStorePersister$p = this.this$0.discoveryStorePersister;
            this.L$0 = null;
            this.label = 1;
            if (access$getDiscoveryStorePersister$p.insertResponse(discoveryRequestParams, dVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Exception e11) {
                if (!this.this$0.getClass().isAnonymousClass()) {
                    str = cls.getSimpleName();
                    if (str.length() > 23) {
                        p.i(str, "name");
                        str = str.substring(0, 23);
                        p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    p.i(str, "{\n            val name =… first 23 chars\n        }");
                } else {
                    String name = cls.getName();
                    if (name.length() > 23) {
                        p.i(name, "name");
                        name = name.substring(name.length() - 23, name.length());
                        p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    p.i(str, "{\n            val name =…/ last 23 chars\n        }");
                }
                u.h(str, e11);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
