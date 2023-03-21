package in.swiggy.android.tejas.feature.discovery.homev2;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStorePersister$clearCacheIfExpired$2", f = "DiscoveryStorePersister.kt", l = {193}, m = "invokeSuspend")
/* compiled from: DiscoveryStorePersister.kt */
final class DiscoveryStorePersister$clearCacheIfExpired$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {
    int label;
    final /* synthetic */ DiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStorePersister$clearCacheIfExpired$2(DiscoveryStorePersister discoveryStorePersister, c<? super DiscoveryStorePersister$clearCacheIfExpired$2> cVar) {
        super(2, cVar);
        this.this$0 = discoveryStorePersister;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DiscoveryStorePersister$clearCacheIfExpired$2(this.this$0, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DiscoveryStorePersister$clearCacheIfExpired$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            SharedPrefFlushManager access$getDiscoveryStoreFlushManager$p = this.this$0.discoveryStoreFlushManager;
            this.label = 1;
            if (access$getDiscoveryStoreFlushManager$p.removeDayOldCache(this) == d11) {
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
