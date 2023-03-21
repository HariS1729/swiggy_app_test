package in.swiggy.android.tejas.feature.discovery.homev2;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStorePersister$deleteAllResponse$2", f = "DiscoveryStorePersister.kt", l = {}, m = "invokeSuspend")
/* compiled from: DiscoveryStorePersister.kt */
final class DiscoveryStorePersister$deleteAllResponse$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {
    int label;
    final /* synthetic */ DiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStorePersister$deleteAllResponse$2(DiscoveryStorePersister discoveryStorePersister, c<? super DiscoveryStorePersister$deleteAllResponse$2> cVar) {
        super(2, cVar);
        this.this$0 = discoveryStorePersister;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DiscoveryStorePersister$deleteAllResponse$2(this.this$0, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DiscoveryStorePersister$deleteAllResponse$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.label == 0) {
            g.b(obj);
            this.this$0.discoveryStoreFlushManager.clearCache();
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
