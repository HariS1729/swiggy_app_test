package in.swiggy.android.tejas.feature.discovery.homev2;

import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStorePersister", f = "DiscoveryStorePersister.kt", l = {184}, m = "deleteIfExpired")
/* compiled from: DiscoveryStorePersister.kt */
final class DiscoveryStorePersister$deleteIfExpired$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStorePersister$deleteIfExpired$1(DiscoveryStorePersister discoveryStorePersister, c<? super DiscoveryStorePersister$deleteIfExpired$1> cVar) {
        super(cVar);
        this.this$0 = discoveryStorePersister;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteIfExpired((StoreTTL) null, (DiscoveryRequestParams) null, (c<? super Boolean>) this);
    }
}
